package com.lsh.bokeadmin.entry;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableId;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * bokes
 * 
 * @author bianj
 * @version 1.0.0 2021-03-31
 */
public class Bokes implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6860943679883810999L;

    /* This code was generated by TableGo tools, mark 1 begin. */
    @TableId
    private int bokeId;

    private String title;

    private String bokeCont;

    private Timestamp createTime;

    private Integer cateId;

    private Timestamp updateTime;

    private Integer userId;

    private Integer likeNum;

    private Integer replyNum;

    private Integer lookNum;

    private Integer labelId;
    
    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    public int getBokeId() {
        return this.bokeId;
    }

    public void setBokeId(int bokeId) {
        this.bokeId = bokeId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBokeCont() {
        return this.bokeCont;
    }

    public void setBokeCont(String bokeCont) {
        this.bokeCont = bokeCont;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLikeNum() {
        return this.likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getReplyNum() {
        return this.replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Integer getLookNum() {
        return this.lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getLabelId() {
        return this.labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /* This code was generated by TableGo tools, mark 2 end. */

    /* This code was generated by TableGo tools, mark 3 begin. */

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    /* This code was generated by TableGo tools, mark 3 end. */
}