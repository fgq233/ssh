package com.fgq.domain.user;

import com.fgq.domain.user.SysUser;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.*;

/**
 * 用户
 */

public class UserEx {

    private String desc;

    private SysUser user;

    private List<SysUser> userList = new ArrayList<SysUser>();

    private Map<String,String> userMap = new HashMap<String, String>();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }

    public Map<String, String> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, String> userMap) {
        this.userMap = userMap;
    }
}
