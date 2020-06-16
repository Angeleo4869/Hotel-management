package com.org.pojo;

public class Predetermine {

  private long id;
  private long roomId;
  private long predetermineTargetId;
  private long passengerId;
  private long payWayId;
  private long predetermineStateId;
  private java.sql.Timestamp arriveTime;
  private double deposit;
  private String predetermineDay;
  private long remind;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public long getPredetermineTargetId() {
    return predetermineTargetId;
  }

  public void setPredetermineTargetId(long predetermineTargetId) {
    this.predetermineTargetId = predetermineTargetId;
  }


  public long getPassengerId() {
    return passengerId;
  }

  public void setPassengerId(long passengerId) {
    this.passengerId = passengerId;
  }


  public long getPayWayId() {
    return payWayId;
  }

  public void setPayWayId(long payWayId) {
    this.payWayId = payWayId;
  }


  public long getPredetermineStateId() {
    return predetermineStateId;
  }

  public void setPredetermineStateId(long predetermineStateId) {
    this.predetermineStateId = predetermineStateId;
  }


  public java.sql.Timestamp getArriveTime() {
    return arriveTime;
  }

  public void setArriveTime(java.sql.Timestamp arriveTime) {
    this.arriveTime = arriveTime;
  }


  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }


  public String getPredetermineDay() {
    return predetermineDay;
  }

  public void setPredetermineDay(String predetermineDay) {
    this.predetermineDay = predetermineDay;
  }


  public long getRemind() {
    return remind;
  }

  public void setRemind(long remind) {
    this.remind = remind;
  }

}
