package com.org.pojo;


public class Consumptiondetails {

  private long id;
  private long stayRegisterId;
  private long commodityId;
  private String consumptionNumber;
  private double consumptionMoney;
  private java.sql.Timestamp consumptionTime;


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


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public String getConsumptionNumber() {
    return consumptionNumber;
  }

  public void setConsumptionNumber(String consumptionNumber) {
    this.consumptionNumber = consumptionNumber;
  }


  public double getConsumptionMoney() {
    return consumptionMoney;
  }

  public void setConsumptionMoney(double consumptionMoney) {
    this.consumptionMoney = consumptionMoney;
  }


  public java.sql.Timestamp getConsumptionTime() {
    return consumptionTime;
  }

  public void setConsumptionTime(java.sql.Timestamp consumptionTime) {
    this.consumptionTime = consumptionTime;
  }

}
