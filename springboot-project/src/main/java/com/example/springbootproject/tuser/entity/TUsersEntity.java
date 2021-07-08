package com.example.springbootproject.tuser.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)实体类</p>
 * <p>类名: TUsers</p>
 * <p>单位: 北京大医通汇云技术有限公司</p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:32</p>
 * <p>版本号: </p>
 */
public class TUsersEntity implements Serializable {
    private static final long serialVersionUID = 200119324389888796L;

    /**
     * id
     */
    private String id;

    /**
     * 帐号
     */
    private String logingId;

    /**
     * 密码
     */
    private String password;

    /**
     * des密码
     */
    private String desPassword;

    /**
     * 全名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 0为正常，1为停用，2为删除
     */
    private Integer userState;

    /**
     * 头像
     */
    private String icon;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人id
     */
    private String createUserId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人id
     */
    private String updateUserId;

    /**
     * 所属部门id
     */
    private String departmentId;

    /**
     * 所属部门名称
     */
    private String departmentName;

    /**
     * 姓
     */
    private String surname;

    /**
     * 名
     */
    private String commonName;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别（0-男，1-女）
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 证件号
     */
    private String identificationNumber;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 用户类型：0普通用户；1租户管理员；2超级管理员
     */
    private Integer userType;

    /**
     * 所属租户id
     */
    private Long tenantId;

    /**
     * 所属机构
     */
    private String foId;

    /**
     * 有效期
     */
    private Date validityTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogingId() {
        return logingId;
    }

    public void setLogingId(String logingId) {
        this.logingId = logingId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesPassword() {
        return desPassword;
    }

    public void setDesPassword(String desPassword) {
        this.desPassword = desPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getFoId() {
        return foId;
    }

    public void setFoId(String foId) {
        this.foId = foId;
    }

    public Date getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(Date validityTime) {
        this.validityTime = validityTime;
    }

}
