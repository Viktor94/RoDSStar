package models;

import java.util.Date;

public class WorkSchedule {

  private Date date;
  private String machine;
  private Date startTime;
  private Date endTime;
  private String orderNumber;

  public WorkSchedule(Date date, String machine, Date startTime, Date endTime,
      String orderNumber) {
    this.date = date;
    this.machine = machine;
    this.startTime = startTime;
    this.endTime = endTime;
    this.orderNumber = orderNumber;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getMachine() {
    return machine;
  }

  public void setMachine(String machine) {
    this.machine = machine;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }
}
