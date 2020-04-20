package com.zhangym.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhangym.entity.InfoToUser;
import com.zhangym.mapper.InfoToUserMapper;
import com.zhangym.service.IInfoToUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户电话关系表 服务实现类
 * </p>
 */
@Service
public class InfoToUserServiceImpl extends ServiceImpl<InfoToUserMapper, InfoToUser> implements IInfoToUserService {

}
