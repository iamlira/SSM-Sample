package org.service.impl;


import org.dao.UserDAO;
import org.pojo.User;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public User queryByUser(User user) {
        return userDAO.queryByUser(user);
    }
}
