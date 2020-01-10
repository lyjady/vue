package com.example.vue.service.impl;

import com.example.vue.entries.VueShopUser;
import com.example.vue.mapper.VueShopUserMapper;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LinYongJin
 * @date 2020/1/8 22:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private VueShopUserMapper userMapper;

    @Override
    public VueShopUser findUser(VueShopUser user) {
        return userMapper.findUser(user);
    }
}
