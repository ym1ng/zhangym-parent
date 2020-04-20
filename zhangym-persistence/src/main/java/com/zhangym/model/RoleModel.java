package com.zhangym.model;

import java.util.List;

/**
 * @author zym
 * @create 2020-04-14 9:51
 **/
public class RoleModel {
    private String roleName;
    private String roleCode;
    private List<String> menuCodes;

    public RoleModel() {
    }

    public RoleModel(String roleName, String roleCode, List<String> menuCodes) {
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.menuCodes = menuCodes;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getMenuCodes() {
        return menuCodes;
    }

    public void setMenuCodes(List<String> menuCodes) {
        this.menuCodes = menuCodes;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        return "RoleModel{" +
                ", roleName='" + roleName + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", menuCodes=" + menuCodes +
                '}';
    }


}
