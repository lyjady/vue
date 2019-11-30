package com.example.vue.service.impl;

import com.example.vue.entries.Phone;
import com.example.vue.mapper.PhoneMapper;
import com.example.vue.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2019/11/30 17:36
 */
@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public List<Phone> getAll() {
        return phoneMapper.getAll();
    }

    @Override
    public int insertSelective(Phone phone) {
        return phoneMapper.insertSelective(phone);
    }

    @Override
    public int remove(int id) {
        return phoneMapper.remove(id);
    }
}
