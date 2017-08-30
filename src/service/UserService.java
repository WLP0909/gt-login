package service;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WLP on 2017/8/3.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //登录验证用户信息
    public User login(String userName){
        User u  = userMapper.isExist(userName);
        return u;
    }

    //查询所有用户信息
    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public int usersNum(){
        return userMapper.usersNum();
    }
}
