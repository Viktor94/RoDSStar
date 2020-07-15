package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderOutput {

  private String id;
  private Integer margin;
  private Integer penalty;
  private Date startOfWork;
  private Date endOfWork;
  private Date originalDeadline;

  public OrderOutput() {
  }

  public OrderOutput(String id, Integer margin, Integer penalty, String startOfWork,
      String endOfWork, Date originalDeadline) throws ParseException {
    this.id = id;
    this.margin = margin;
    this.penalty = penalty;
    this.startOfWork = new SimpleDateFormat("hh:mm").parse(startOfWork);
    this.endOfWork = new SimpleDateFormat("hh:mm").parse(endOfWork);
    this.originalDeadline = originalDeadline;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getMargin() {
    return margin;
  }

  public void setMargin(Integer margin) {
    this.margin = margin;
  }

  public Integer getPenalty() {
    return penalty;
  }

  public void setPenalty(Integer penalty) {
    this.penalty = penalty;
  }

  public Date getStartOfWork() {
    return startOfWork;
  }

  public void setStartOfWork(Date startOfWork) {
    this.startOfWork = startOfWork;
  }

  public Date getEndOfWork() {
    return endOfWork;
  }

  public void setEndOfWork(Date endOfWork) {
    this.endOfWork = endOfWork;
  }

  public Date getOriginalDeadline() {
    return originalDeadline;
  }

  public void setOriginalDeadline(Date originalDeadline) {
    this.originalDeadline = originalDeadline;
  }
}
