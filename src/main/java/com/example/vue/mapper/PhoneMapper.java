package com.example.vue.mapper;

import com.example.vue.entries.Phone;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2019/11/30 17:28
 */
@Mapper
public interface PhoneMapper {

    @Select("select * from phone")
    List<Phone> getAll();

    int insertSelective(Phone phone);

    @Delete(("delete from phone where id = #{id}"))
    int remove(int id);
}
