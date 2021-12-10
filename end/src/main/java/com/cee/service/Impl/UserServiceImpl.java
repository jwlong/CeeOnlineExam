package com.cee.service.Impl;
import com.cee.common.result.helpers.JwtHelper;
import com.cee.dao.UserMapper;
import com.cee.model.User;
import com.cee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList(User user) {
        return userMapper.getUserList(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteById(user);
    }

    @Override
    public Map<String, Object> loginUser(User user) {
        User userInfo = new User();
        userInfo.setId(1L);
        Map<String, Object> map = new HashMap<>();
        String name = userInfo.getUsername();
        map.put("name",name);

        //jwt生成token字符串
        String token = JwtHelper.createToken(userInfo.getId(), name);
        map.put("token",token);

        return map;
    }
}
