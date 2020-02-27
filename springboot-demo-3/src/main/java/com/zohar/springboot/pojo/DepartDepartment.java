package com.zohar.springboot.pojo;

public class DepartDepartment {
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门英文名称
     */
    private String ename;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * 修改者
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private String updateDate;

    /**
     * 删除标记 0未删除 1已删除
     */
    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
