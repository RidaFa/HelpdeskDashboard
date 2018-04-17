package com.HelpdeskDashboard.Entitie;

import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {
    private Long UserID;
    private String Username;
    private String Userpassword;
    private int Userstatus;
    private int Usersite;
    private String Lastlogon;
    private String Lastpasswordchange;
    private String passwordConfirm;
    private Set<Role> roles;

    public User(Long userID, String username, String userpassword, int userstatus, int usersite, String lastlogon, String lastpasswordchange, String passwordConfirm, Set<Role> roles) {
        UserID = userID;
        Username = username;
        Userpassword = userpassword;
        Userstatus = userstatus;
        Usersite = usersite;
        Lastlogon = lastlogon;
        Lastpasswordchange = lastpasswordchange;
        this.passwordConfirm = passwordConfirm;
        this.roles = roles;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserpassword() {
        return Userpassword;
    }

    public void setUserpassword(String userpassword) {
        Userpassword = userpassword;
    }

    public int getUserstatus() {
        return Userstatus;
    }

    public void setUserstatus(int userstatus) {
        Userstatus = userstatus;
    }

    public int getUsersite() {
        return Usersite;
    }

    public void setUsersite(int usersite) {
        Usersite = usersite;
    }

    public String getLastlogon() {
        return Lastlogon;
    }

    public void setLastlogon(String lastlogon) {
        Lastlogon = lastlogon;
    }

    public String getLastpasswordchange() {
        return Lastpasswordchange;
    }

    public void setLastpasswordchange(String lastpasswordchange) {
        Lastpasswordchange = lastpasswordchange;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
