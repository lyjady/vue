package com.example.vue.mapper;

import com.example.vue.entries.VueShopUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @author LinYongJin
* @date 2020/1/8 22:24
*/
@Mapper
public interface VueShopUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VueShopUser record);

    int insertSelective(VueShopUser record);

    VueShopUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VueShopUser record);

    int updateByPrimaryKey(VueShopUser record);

    VueShopUser findUser(VueShopUser user);
}