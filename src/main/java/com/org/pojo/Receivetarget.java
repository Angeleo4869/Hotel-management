package com.org.pojo;

public class Receivetarget {

  private long id;
  private long targetTypeId;
  private String principal;
  private String teamName;
  private String teamCode;
  private java.sql.Timestamp registerTime;
  private String contactPhoneNUmber;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTargetTypeId() {
    return targetTypeId;
  }

  public void setTargetTypeId(long targetTypeId) {
    this.targetTypeId = targetTypeId;
  }


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public String getTeamCode() {
    return teamCode;
  }

  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
  }


  public java.sql.Timestamp getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(java.sql.Timestamp registerTime) {
    this.registerTime = registerTime;
  }


  public String getContactPhoneNUmber() {
    return contactPhoneNUmber;
  }

  public void setContactPhoneNUmber(String contactPhoneNUmber) {
    this.contactPhoneNUmber = contactPhoneNUmber;
  }

}
