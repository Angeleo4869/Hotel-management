package com.org.pojo;


public class Commodity {

  private long id;
  private long commodityTypeId;
  private long uOmid;
  private String commodityName;
  private double salePrice;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommodityTypeId() {
    return commodityTypeId;
  }

  public void setCommodityTypeId(long commodityTypeId) {
    this.commodityTypeId = commodityTypeId;
  }


  public long getUOmid() {
    return uOmid;
  }

  public void setUOmid(long uOmid) {
    this.uOmid = uOmid;
  }


  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }


  public double getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(double salePrice) {
    this.salePrice = salePrice;
  }

}
