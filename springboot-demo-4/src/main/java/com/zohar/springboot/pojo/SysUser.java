package com.zohar.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @desc: 系統用戶表
 * @author: Administrator
 * @version: v1.0*/
public class SysUser implements Serializable {
	
	private Integer id;
	/**
	 * 用户名，唯一
	 */
	private String stuid;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 邮箱，唯一
	 */
	private String email;
	/**
	 * 手机
	 */
	private String phone;

	/**
	 * 年级
	 */
	private String period;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String profession;

	/**
	 * 班级
	 */
	private String gradeclass;

	/**
	 * 部门
	 */
	private String department;

	/**
	 * 小组
	 */
	private String group;
	/**
	 * 小队
	 */
	private String team;

	/**
	 * 级别
	 */
	private String level;
	/**
	 * 头像路径
	 */
	private String portrait;

	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 最后登陆IP
	 */
	private String loginIp;
	/**
	 * 最后登陆时间
	 */
	private Date loginDate;
	/**
	 * 是否可以登录
	 */
	private String loginFlag;
	/**
	 * 创建者用户名
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 更新者用户名
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 备注信息
	 */
	private String remarks;
	/**
	 * 删除标记，0-未删除，1-已删除
	 */
	private String delFlag;
	private String sexValue;
	private String identity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return period;
	}

	public void setGrade(String period) {
		this.period = period;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGradeclass() {
		return gradeclass;
	}

	public void setGradeclass(String gradeclass) {
		this.gradeclass = gradeclass;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getSexValue() {
		return sexValue;
	}

	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
}
