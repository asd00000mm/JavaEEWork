package pers.lyz.dao;

import org.apache.ibatis.annotations.Param;
import pers.lyz.model.Goods;
import pers.lyz.model.User;

import java.util.List;

/**
 *
 */
public interface UserDAO {

    /**
     * 登录
     *
     * @return {@link User}
     */
    User login(User user);


}