package com.nowcoder.service;

import com.nowcoder.dao.UserDAO;
import com.nowcoder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shirley on 2017/7/13.
 */
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public User getUser(int id){
       return  userDAO.selectById(id);

    }

}
