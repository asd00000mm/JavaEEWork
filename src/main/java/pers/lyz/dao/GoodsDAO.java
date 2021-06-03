package pers.lyz.dao;

import org.apache.ibatis.annotations.Param;
import pers.lyz.model.Goods;

import java.util.List;

/**
 *
 */
public interface GoodsDAO {

    /**
     * 分页查询
     * 也可以通过id模糊查询
     *
     * @return {@link Goods}
     */
    List<Goods> findByTj(@Param("gId") String gId);

    /**
     * 新增
     *
     * @param goods
     */
    void insert(@Param("g") Goods goods);

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

}