package com.bdscams.amstest.entity;

public class Role_rgt_menu_rel {
    private Long id;

    private Long roleId;

    private Long menuRgtId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuRgtId() {
        return menuRgtId;
    }

    public void setMenuRgtId(Long menuRgtId) {
        this.menuRgtId = menuRgtId;
    }
}