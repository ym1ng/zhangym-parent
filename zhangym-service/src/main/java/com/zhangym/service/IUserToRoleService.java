package com.zhangym.service;

 import com.baomidou.mybatisplus.service.IService;
 import com.zhangym.entity.UserToRole;


/**
 * <p>
 *  服务类
 * </p>
 */
public interface IUserToRoleService extends IService<UserToRole> {

    /**
     * 根据用户ID查询人员角色
     * @param userNo 用户ID
     * @return  结果
     */
    UserToRole selectByUserNo(String userNo);

}
