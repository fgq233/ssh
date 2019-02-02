package com.fgq.service.user;

import com.fgq.domain.organ.SysOrgan;
import com.fgq.domain.user.SysUser;

import java.util.List;

public interface IUserService {

    List<SysUser> findAll();

    void addUser(SysUser sysUser);

}
