package com.fgq.dao.demo;


import com.fgq.dao.base.BaseDao;
import com.fgq.domain.user.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<SysUser> implements IUserDao {


}
