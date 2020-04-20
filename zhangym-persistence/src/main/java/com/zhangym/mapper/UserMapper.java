package com.zhangym.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zhangym.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>

 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 等同于编写一个普通 list 查询，mybatis-plus 自动替你分页
     * @param page
     * @param info
     * @param status
     * @param startTime
     * @param endTime
     * @return
     */
    List<User> selectPageByConditionUser(Page<User> page, @Param("info") String info,
                                         @Param("status") Integer[] status, @Param("startTime") String startTime, @Param("endTime") String endTime);


}
