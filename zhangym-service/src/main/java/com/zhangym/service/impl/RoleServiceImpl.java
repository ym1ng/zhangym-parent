package com.zhangym.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zhangym.base.BusinessException;
import com.zhangym.base.Constant;
import com.zhangym.base.PublicResultConstant;
import com.zhangym.entity.Role;
import com.zhangym.entity.UserToRole;
import com.zhangym.mapper.RoleMapper;
import com.zhangym.model.RoleModel;
import com.zhangym.service.IMenuService;
import com.zhangym.service.IRoleService;
import com.zhangym.service.IUserToRoleService;
import com.zhangym.util.ComUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {


//    @Autowired
//    private IRoleToMenuService roleToMenuService;
//
//    @Autowired
//    private IUserToRoleService userToRoleService;
//
//    @Autowired
//    private IMenuService menuService;
//    @Override
//    public boolean addRoleAndPermission(RoleModel roleModel) throws Exception{
//        Role role = new Role();
//        BeanUtils.copyProperties(roleModel,role);
//        boolean result = this.insert(role);
//        if (! result) {
//            throw  new BusinessException(PublicResultConstant.UPDATE_ROLEINFO_ERROR);
//        }
//        result = roleToMenuService.saveAll(role.getRoleCode(), roleModel.getMenuCodes());
//        return result;
//    }
//
//    @Override
//    public boolean updateRoleInfo(RoleModel roleModel) throws Exception{
//        if (roleModel.getRoleCode().equals(
//                this.selectOne(new EntityWrapper<Role>().eq("role_name", Constant.RoleType.SYS_ASMIN_ROLE)).getRoleCode())){
//            throw  new BusinessException(PublicResultConstant.UPDATE_SYSADMIN_INFO_ERROR);
//        }
//        Role role = this.selectById(roleModel.getRoleCode());
//        if (ComUtil.isEmpty(role)) {
//            return false;
//        }
//        BeanUtils.copyProperties(roleModel,role);
//        boolean result = this.updateById(role);
//        if (! result) {
//            throw  new BusinessException(PublicResultConstant.UPDATE_ROLEINFO_ERROR);
//        }
//        result = roleToMenuService.delete(new EntityWrapper<RoleToMenu>().eq("role_code",roleModel.getRoleCode()));
//        if (! result) {
//            throw  new BusinessException("删除权限信息失败");
//        }
//        result = roleToMenuService.saveAll(role.getRoleCode(), roleModel.getMenuCodes());
//        if (! result) {
//            throw  new BusinessException("更新权限信息失败");
//        }
//        return result;
//
//    }
//
//    @Override
//    public void getRoleIsAdminByUserNo(String userNo) throws Exception {
//        UserToRole userToRole = userToRoleService.selectByUserNo(userNo);
//        Role role = this.selectById(userToRole.getRoleCode());
//        if(role.getRoleName().equals(Constant.RoleType.SYS_ASMIN_ROLE)){
//            throw new BusinessException(PublicResultConstant.UPDATE_SYSADMIN_INFO_ERROR);
//        }
//    }
//
//    @Override
//    public Map<String, Object> selectByRoleCode(String roleCode) throws Exception {
//        Role role = this.selectById(roleCode);
//        if(ComUtil.isEmpty(role)){
//            throw new BusinessException(PublicResultConstant.INVALID_ROLE);
//        }
//        Map<String, Object> result = new HashMap<>();
//        result.put("role", role);
//        //权限信息
//        result.put("nodes", this.getMenuByRoleCode(role.getRoleCode()));
//        return result;
//    }
//
//    @Override
//    public void deleteByRoleCode(String roleCode) throws Exception {
//        if (ComUtil.isEmpty(this.selectById(roleCode))) {
//            throw new BusinessException("角色不存在");
//        }
//        if(!ComUtil.isEmpty(userToRoleService.selectList(new EntityWrapper<UserToRole>().eq("role_code",roleCode)))){
//            throw new BusinessException("角色存在相关用户,请先删除相关角色的用户");
//        }
//        this.delete(new EntityWrapper<Role>().eq("role_code",roleCode));
//    }
//
//
//    @Override
//    public Map<String, Object> getMenuByRoleCode(String roleCode) {
//        Map<String,Object> retMap   =new HashMap<>();
//        List<Menu> menuList = menuService.findMenuByRoleCode(roleCode);
//        List<Menu> buttonList = new ArrayList<Menu>();
//        List<Menu> retMenuList = menuService.treeMenuList(Constant.ROOT_MENU, menuList);
//        for (Menu buttonMenu : menuList) {
//            if(buttonMenu.getMenuType() == Constant.TYPE_BUTTON){
//                buttonList.add(buttonMenu);
//            }
//        }
//        retMap.put("menuList",retMenuList);
//        retMap.put("buttonList",buttonList);
//        return retMap;
//    }
}
