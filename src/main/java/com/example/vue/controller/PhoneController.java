package com.example.vue.controller;

import com.example.vue.entries.Phone;
import com.example.vue.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author LinYongJin
 * @date 2019/11/30 16:22
 */
@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping("/getAll")
    public List<Phone> getAll() {
        return phoneService.getAll();
    }

    @RequestMapping("/add")
    public int add(@RequestBody(required = false) Phone phone) {
        phone.setTime(new Date());
        return phoneService.insertSelective(phone);
    }

    @RequestMapping("/remove")
    public int remove(int id) {
        return phoneService.remove(id);
    }
}
