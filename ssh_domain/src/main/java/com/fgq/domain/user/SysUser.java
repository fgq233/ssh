package com.fgq.domain.user;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户
 */
@SuppressWarnings("unused")
@Table(name = "SYS_USER")
@Entity
@DynamicInsert
@DynamicUpdate
public class SysUser {

    @Id
    @SequenceGenerator(name = "seq_sysuser", sequenceName = "SEQ_SYS_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sysuser")
    private Long id;

    //用户名
    @Column(name = "LOGIN_NAME")
    private String userName;

    //用户名
    @Column(name = "LOGIN_PWD")
    private String passWord;

    //组织id
    @Column(name = "DEFAULT_ORGAN_ID")
    private Long defaultOrganId;

    //默认组织名称
    @Formula("(SELECT ORGAN.ORGAN_NAME FROM SYS_ORGAN O WHERE O.ID = DEFAULT_ORGAN_ID)")
    private String defaultOrganName;

    //默认组织代码
    @Formula("(SELECT ORGAN.ORGAN_CODE FROM SYS_ORGAN O WHERE O.ID = DEFAULT_ORGAN_ID)")
    private String defaultOrganCode;


    //创建时间
    @Column(name = "CJSJ")
    private Date cjsj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getDefaultOrganId() {
        return defaultOrganId;
    }

    public void setDefaultOrganId(Long defaultOrganId) {
        this.defaultOrganId = defaultOrganId;
    }

    public String getDefaultOrganName() {
        return defaultOrganName;
    }

    public void setDefaultOrganName(String defaultOrganName) {
        this.defaultOrganName = defaultOrganName;
    }

    public String getDefaultOrganCode() {
        return defaultOrganCode;
    }

    public void setDefaultOrganCode(String defaultOrganCode) {
        this.defaultOrganCode = defaultOrganCode;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}
