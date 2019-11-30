package com.example.vue.service;

import com.example.vue.entries.Phone;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2019/11/30 17:36
 */
public interface PhoneService {

    List<Phone> getAll();

    int insertSelective(Phone phone);

    int remove(int id);
}
