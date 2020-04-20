package com.zhangym.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhangym.entity.OperationLog;
import com.zhangym.mapper.OperationLogMapper;
import com.zhangym.service.IOperationLogService;
import org.springframework.stereotype.Service;

/**
 * 操作日志 服务实现类
 * @author zym
 * @create 2020-04-14 8:58
 **/
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
