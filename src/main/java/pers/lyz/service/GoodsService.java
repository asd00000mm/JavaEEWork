package pers.lyz.service;

import pers.lyz.model.Goods;

import java.util.List;

/**
 *
 * @author asd00000mm
 */
public interface GoodsService {

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link Goods}
     */
    List<Goods> findByTj(int pageNum, int pageSize,String gid);

    /**
     * 新增
     *
     * @param goods
     */
    void insert(Goods goods);

    /**
     * 修改
     *
     * @param goods
     */
    void update(Goods goods);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(String id);

    /**
     * 通过ID删除多个
     * @param list
     */
    void deleteSelect(List<String> list);
}