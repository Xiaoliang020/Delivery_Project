package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {

    /**
     * Get user by openid
     * @param openid
     * @return
     */
    @Select("select * from sky_take_out.user where openid = #{openid}")
    User getByOpenId(String openid);

    /**
     * Insert new user
     * @param user
     */
    void insert(User user);

    @Select("select * from sky_take_out.user where id = #{id}")
    User getById(Long userId);

    /**
     * Get user count
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
