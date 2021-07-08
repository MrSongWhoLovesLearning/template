package com.example.springbootproject.tuser.po;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * <p>标题: </p>
 * <p>描述: (TUsers)入参实体类</p>
 * <p>类名: TUsers</p>
 * <p>单位: </p>
 * <p>作者: jia.song</p>
 * <p>邮箱: </p>
 * <p>日期: 2021-07-08 17:02:29</p>
 * <p>版本号: </p>
 */
public class TUsersPO implements Serializable {


    @ApiModelProperty(value = "id", name = "id", example = "", required = true)
    private String id;

    @ApiModelProperty(value = "帐号", name = "logingId", example = "", required = true)
    private String logingId;

    @ApiModelProperty(value = "密码", name = "password", example = "", required = true)
    private String password;

    @ApiModelProperty(value = "des密码", name = "desPassword", example = "", required = true)
    private String desPassword;

    @ApiModelProperty(value = "全名", name = "name", example = "", required = true)
    private String name;

    @ApiModelProperty(value = "邮箱", name = "email", example = "", required = true)
    private String email;

    @ApiModelProperty(value = "0为正常，1为停用，2为删除", name = "userState", example = "", required = true)
    private Integer userState;

    @ApiModelProperty(value = "头像", name = "icon", example = "", required = true)
    private String icon;

    @ApiModelProperty(value = "创建时间", name = "createTime", example = "", required = true)
    private Date createTime;

    @ApiModelProperty(value = "创建人id", name = "createUserId", example = "", required = true)
    private String createUserId;

    @ApiModelProperty(value = "修改时间", name = "updateTime", example = "", required = true)
    private Date updateTime;

    @ApiModelProperty(value = "修改人id", name = "updateUserId", example = "", required = true)
    private String updateUserId;

    @ApiModelProperty(value = "所属部门id", name = "departmentId", example = "", required = true)
    private String departmentId;

    @ApiModelProperty(value = "所属部门名称", name = "departmentName", example = "", required = true)
    private String departmentName;

    @ApiModelProperty(value = "姓", name = "surname", example = "", required = true)
    private String surname;

    @ApiModelProperty(value = "名", name = "commonName", example = "", required = true)
    private String commonName;

    @ApiModelProperty(value = "电话号码", name = "phone", example = "", required = true)
    private String phone;

    @ApiModelProperty(value = "生日", name = "birthday", example = "", required = true)
    private Date birthday;

    @ApiModelProperty(value = "性别（0-男，1-女）", name = "sex", example = "", required = true)
    private String sex;

    @ApiModelProperty(value = "地址", name = "address", example = "", required = true)
    private String address;

    @ApiModelProperty(value = "证件号", name = "identificationNumber", example = "", required = true)
    private String identificationNumber;

    @ApiModelProperty(value = "备注", name = "remarks", example = "", required = true)
    private String remarks;

    @ApiModelProperty(value = "用户类型：0普通用户；1租户管理员；2超级管理员", name = "userType", example = "", required = true)
    private Integer userType;

    @ApiModelProperty(value = "所属租户id", name = "tenantId", example = "", required = true)
    private Long tenantId;

    @ApiModelProperty(value = "所属机构", name = "foId", example = "", required = true)
    private String foId;

    @ApiModelProperty(value = "有效期", name = "validityTime", example = "", required = true)
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

    @ApiModelProperty(value = "offset", name = "开始序号", example = "", required = true)
    public Integer offset;

    @ApiModelProperty(value = "limit", name = "显示行数", example = "", required = true)
    public Integer limit;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
