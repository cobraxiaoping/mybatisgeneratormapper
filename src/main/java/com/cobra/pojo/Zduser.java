package com.cobra.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "zduser")
public class Zduser {
    @Id
    @Column(name = "UserName")
    private String username;

    @Column(name = "RealName")
    private String realname;

    @Column(name = "Password")
    private String password;

    @Column(name = "BranchInnerCode")
    private String branchinnercode;

    @Column(name = "IsBranchAdmin")
    private String isbranchadmin;

    @Column(name = "Status")
    private String status;

    @Column(name = "Type")
    private String type;

    @Column(name = "Email")
    private String email;

    @Column(name = "Tel")
    private String tel;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "LastLoginTime")
    private Date lastlogintime;

    @Column(name = "LastLoginIP")
    private String lastloginip;

    @Column(name = "Prop1")
    private String prop1;

    @Column(name = "Prop2")
    private String prop2;

    @Column(name = "Prop6")
    private String prop6;

    @Column(name = "Prop5")
    private String prop5;

    @Column(name = "Prop4")
    private String prop4;

    @Column(name = "Prop3")
    private String prop3;

    @Column(name = "Memo")
    private String memo;

    @Column(name = "AddTime")
    private Date addtime;

    @Column(name = "AddUser")
    private String adduser;

    @Column(name = "ModifyTime")
    private Date modifytime;

    @Column(name = "ModifyUser")
    private String modifyuser;

    @Column(name = "LoginErrorCount")
    private Long loginerrorcount;

    @Column(name = "LoginErrorTime")
    private Date loginerrortime;

    @Column(name = "ModifyPassStatus")
    private String modifypassstatus;

    @Column(name = "ForbiddenLoginTime")
    private Date forbiddenlogintime;

    @Column(name = "LastModifyPassTime")
    private Date lastmodifypasstime;

    /**
     * @return UserName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return RealName
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return BranchInnerCode
     */
    public String getBranchinnercode() {
        return branchinnercode;
    }

    /**
     * @param branchinnercode
     */
    public void setBranchinnercode(String branchinnercode) {
        this.branchinnercode = branchinnercode;
    }

    /**
     * @return IsBranchAdmin
     */
    public String getIsbranchadmin() {
        return isbranchadmin;
    }

    /**
     * @param isbranchadmin
     */
    public void setIsbranchadmin(String isbranchadmin) {
        this.isbranchadmin = isbranchadmin;
    }

    /**
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return Type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return Mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return LastLoginTime
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * @param lastlogintime
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * @return LastLoginIP
     */
    public String getLastloginip() {
        return lastloginip;
    }

    /**
     * @param lastloginip
     */
    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    /**
     * @return Prop1
     */
    public String getProp1() {
        return prop1;
    }

    /**
     * @param prop1
     */
    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    /**
     * @return Prop2
     */
    public String getProp2() {
        return prop2;
    }

    /**
     * @param prop2
     */
    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    /**
     * @return Prop6
     */
    public String getProp6() {
        return prop6;
    }

    /**
     * @param prop6
     */
    public void setProp6(String prop6) {
        this.prop6 = prop6;
    }

    /**
     * @return Prop5
     */
    public String getProp5() {
        return prop5;
    }

    /**
     * @param prop5
     */
    public void setProp5(String prop5) {
        this.prop5 = prop5;
    }

    /**
     * @return Prop4
     */
    public String getProp4() {
        return prop4;
    }

    /**
     * @param prop4
     */
    public void setProp4(String prop4) {
        this.prop4 = prop4;
    }

    /**
     * @return Prop3
     */
    public String getProp3() {
        return prop3;
    }

    /**
     * @param prop3
     */
    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }

    /**
     * @return Memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return AddTime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * @return AddUser
     */
    public String getAdduser() {
        return adduser;
    }

    /**
     * @param adduser
     */
    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }

    /**
     * @return ModifyTime
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * @param modifytime
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * @return ModifyUser
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * @param modifyuser
     */
    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser;
    }

    /**
     * @return LoginErrorCount
     */
    public Long getLoginerrorcount() {
        return loginerrorcount;
    }

    /**
     * @param loginerrorcount
     */
    public void setLoginerrorcount(Long loginerrorcount) {
        this.loginerrorcount = loginerrorcount;
    }

    /**
     * @return LoginErrorTime
     */
    public Date getLoginerrortime() {
        return loginerrortime;
    }

    /**
     * @param loginerrortime
     */
    public void setLoginerrortime(Date loginerrortime) {
        this.loginerrortime = loginerrortime;
    }

    /**
     * @return ModifyPassStatus
     */
    public String getModifypassstatus() {
        return modifypassstatus;
    }

    /**
     * @param modifypassstatus
     */
    public void setModifypassstatus(String modifypassstatus) {
        this.modifypassstatus = modifypassstatus;
    }

    /**
     * @return ForbiddenLoginTime
     */
    public Date getForbiddenlogintime() {
        return forbiddenlogintime;
    }

    /**
     * @param forbiddenlogintime
     */
    public void setForbiddenlogintime(Date forbiddenlogintime) {
        this.forbiddenlogintime = forbiddenlogintime;
    }

    /**
     * @return LastModifyPassTime
     */
    public Date getLastmodifypasstime() {
        return lastmodifypasstime;
    }

    /**
     * @param lastmodifypasstime
     */
    public void setLastmodifypasstime(Date lastmodifypasstime) {
        this.lastmodifypasstime = lastmodifypasstime;
    }
}