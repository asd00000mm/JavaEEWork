package pers.lyz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.lyz.dao.GoodsDAO;
import pers.lyz.dao.UserDAO;
import pers.lyz.model.Goods;
import pers.lyz.model.User;
import pers.lyz.service.GoodsService;
import pers.lyz.service.UserService;

import java.util.List;

/**
 * @author asd00000mm
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(User user) {
        return userDAO.login(user);
    }
}