package pers.lyz.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import pers.lyz.dao.GoodsDAO;
import pers.lyz.model.Goods;
import pers.lyz.service.GoodsService;

import java.util.List;

/**
 * @author asd00000mm
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<Goods> findByTj(int pageNum, int pageSize, String gid) {
        PageHelper.startPage(pageNum, pageSize);
        return goodsDAO.findByTj(gid);
    }

    @Override
    public void insert(Goods goods) {
        goodsDAO.insert(goods);
    }

    @Override
    public void update(Goods goods) {
        goodsDAO.update(goods);
    }

    @Override
    public void deleteById(String id) {
        goodsDAO.deleteById(id);
    }

    @Override
    public void deleteSelect(List<String> list) {
        for (String s : list) {
            goodsDAO.deleteById(s);
        }
    }

}