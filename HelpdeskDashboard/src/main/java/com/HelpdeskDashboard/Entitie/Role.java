package com.HelpdeskDashboard.Entitie;

import java.util.Set;

public class Role {

    private int RoleID;
    private String Rolename;
    private Set<User> users;

    public Role(int roleID, String rolename, Set<User> users) {
        this.RoleID = roleID;
        this.Rolename = rolename;
        this.users = users;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public String getRolename() {
        return Rolename;
    }

    public void setRolename(String rolename) {
        Rolename = rolename;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
