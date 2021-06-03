package pers.lyz.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.lyz.model.Goods;
import pers.lyz.model.Msg;
import pers.lyz.service.GoodsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author asd00000mm
 */
@RestController
@RequestMapping("/goodss")
@Api(tags = "")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    private Map<String,Object> map=new ConcurrentHashMap<>();

    @RequestMapping("/findByTj")
    @ApiOperation("分页查询")
    public Msg findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                      @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize,String gid) {
        List<Goods> list= goodsService.findByTj(pageNum, pageSize,gid);
        PageInfo pageInfo=new PageInfo(list);
        Msg msg = new Msg();
        msg.setCount(pageInfo.getTotal());
        msg.add("list",list);
        return msg;
    }

    @PostMapping("/insert")
    @ApiOperation("新增")
    public Map<String, Object> insert(@RequestBody Goods goods) {
        map.clear();
        try {
            goodsService.insert(goods);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",0);
        }
        return map;
    }

   @PostMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody Goods goods) {
        map.clear();
        try {
            goodsService.update(goods);
            map.put("msg",1);
        } catch (Exception e) {
           e.printStackTrace();
           map.put("msg",0);
        }
        return map;
   }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @RequestBody Goods goods) {
        goodsService.deleteById(goods.getgId());
    }

    @RequestMapping("/deleteSelect")
    @ApiOperation("通过ID删除多个")
    public Map<String,Object> deleteSelect(String gId){
        map.clear();
        try {
            List<String> list = new ArrayList<>();
            String[] strs = gId.split(",");
            for (String str : strs) {
                list.add(str);
            }
            goodsService.deleteSelect(list);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }


}
