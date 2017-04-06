package com.hotusm.mp.bean.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @author luqibao
 * @date 2017/4/5
 */
@TableName("white_list")
public class WhiteList {

    private Long id;
    @TableField("white_type")
    private String whiteType;
    private String cell;
    @TableField("is_del")
    private int isDel;
    @TableField("create_time")
    private int createTime;
    @TableField("update_time")
    private int updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhiteType() {
        return whiteType;
    }

    public void setWhiteType(String whiteType) {
        this.whiteType = whiteType;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "WhiteList{" +
                "id=" + id
                +" ";
    }
}
