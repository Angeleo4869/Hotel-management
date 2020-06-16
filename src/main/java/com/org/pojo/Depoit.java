package com.org.pojo;


public class Depoit {

  private long id;
  private long stayRegisterId;
  private long payWayId;
  private java.sql.Timestamp registerTime;
  private double deposit;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getStayRegisterId() {
    return stayRegisterId;
  }

  public void setStayRegisterId(long stayRegisterId) {
    this.stayRegisterId = stayRegisterId;
  }


  public long getPayWayId() {
    return payWayId;
  }

  public void setPayWayId(long payWayId) {
    this.payWayId = payWayId;
  }


  public java.sql.Timestamp getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(java.sql.Timestamp registerTime) {
    this.registerTime = registerTime;
  }


  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

}
