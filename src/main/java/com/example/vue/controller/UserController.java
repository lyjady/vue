package com.example.vue.controller;

import com.example.vue.entries.Response;
import com.example.vue.entries.VueShopUser;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/1/8 22:25
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Response<VueShopUser> findUser(@RequestBody VueShopUser user) {
        System.out.println(user);
        Response<VueShopUser> response = new Response<>();
        VueShopUser admin = userService.findUser(user);
        if (admin != null) {
            response.setMessage("登录成功");
            response.setStatus(200);
            response.setData(admin);
        } else {
            response.setMessage("登录失败");
            response.setStatus(404);
            response.setData(null);
        }
        return response;
    }
}
