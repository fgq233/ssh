package com.fgq.service.user;

import com.fgq.dao.demo.IOrganDao;
import com.fgq.dao.demo.IUserDao;
import com.fgq.domain.organ.SysOrgan;
import com.fgq.domain.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService  implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public List<SysUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(SysUser sysUser) {
        userDao.save(sysUser);
    }
}
