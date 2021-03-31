package com.lsh.bokeadmin.entry;

import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 评论(comments)
 * 
 * @author bianj
 * @version 1.0.0 2021-03-31
 */
public class Comments implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3925726664304864906L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    private Integer commId;

    private String commTont;

    private Date commTime;

    private Integer commLikeNum;

    private Integer userId;

    private Integer bokeId;

    private Integer parentCommId;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    public Integer getCommId() {
        return this.commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public String getCommTont() {
        return this.commTont;
    }

    public void setCommTont(String commTont) {
        this.commTont = commTont;
    }

    public Date getCommTime() {
        return this.commTime;
    }

    public void setCommTime(Date commTime) {
        this.commTime = commTime;
    }

    public Integer getCommLikeNum() {
        return this.commLikeNum;
    }

    public void setCommLikeNum(Integer commLikeNum) {
        this.commLikeNum = commLikeNum;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBokeId() {
        return this.bokeId;
    }

    public void setBokeId(Integer bokeId) {
        this.bokeId = bokeId;
    }

    public Integer getParentCommId() {
        return this.parentCommId;
    }

    public void setParentCommId(Integer parentCommId) {
        this.parentCommId = parentCommId;
    }

    /* This code was generated by TableGo tools, mark 2 end. */

    /* This code was generated by TableGo tools, mark 3 begin. */

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    /* This code was generated by TableGo tools, mark 3 end. */
}