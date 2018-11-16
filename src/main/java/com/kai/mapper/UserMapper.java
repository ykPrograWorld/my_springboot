package com.kai.mapper;

import com.kai.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: kai
 * @Date: Created in 下午 10:14 2018/11/16
 */
@Mapper
public interface UserMapper {

    @Select("select id,email,nick_name,reg_time,user_name from user where id = #{id}")
    User getUserById(@Param("id") Integer id);
}
