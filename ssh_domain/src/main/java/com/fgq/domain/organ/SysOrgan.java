package com.fgq.domain.organ;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户
 */
@SuppressWarnings("unused")
@Table(name = "SYS_ORGAN")
@Entity
@DynamicInsert
@DynamicUpdate
public class SysOrgan {

    @Id
    @SequenceGenerator(name = "seq_sysorgan", sequenceName = "SEQ_SYS_ORGAN", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sysorgan")
    private Long id;

    @Column(name = "ORGAN_NAME")
    private String organName;


    @Column(name = "CJSJ")
    private Date cjsj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}
