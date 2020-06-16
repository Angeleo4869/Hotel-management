package com.org.pojo;

public class Room {

  private long id;
  private long guestRoomLevelId;
  private long roomStateId;
  private String roomNumber;
  private String roomAmount;
  private double standardPriceDay;
  private double standardPrice;
  private String maxDuration;
  private String firstDuration;
  private double firstPrice;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGuestRoomLevelId() {
    return guestRoomLevelId;
  }

  public void setGuestRoomLevelId(long guestRoomLevelId) {
    this.guestRoomLevelId = guestRoomLevelId;
  }


  public long getRoomStateId() {
    return roomStateId;
  }

  public void setRoomStateId(long roomStateId) {
    this.roomStateId = roomStateId;
  }


  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }


  public String getRoomAmount() {
    return roomAmount;
  }

  public void setRoomAmount(String roomAmount) {
    this.roomAmount = roomAmount;
  }


  public double getStandardPriceDay() {
    return standardPriceDay;
  }

  public void setStandardPriceDay(double standardPriceDay) {
    this.standardPriceDay = standardPriceDay;
  }


  public double getStandardPrice() {
    return standardPrice;
  }

  public void setStandardPrice(double standardPrice) {
    this.standardPrice = standardPrice;
  }


  public String getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  public String getFirstDuration() {
    return firstDuration;
  }

  public void setFirstDuration(String firstDuration) {
    this.firstDuration = firstDuration;
  }


  public double getFirstPrice() {
    return firstPrice;
  }

  public void setFirstPrice(double firstPrice) {
    this.firstPrice = firstPrice;
  }

}
