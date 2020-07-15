package models;

public class OrderOutput {

  private String id;
  private Integer margin;
  private Integer penalty;
  private String startOfWork;
  private String endOfWork;
  private String originalDeadline;

  public OrderOutput() {
  }

  public OrderOutput(String id, Integer margin, Integer penalty, String startOfWork,
      String endOfWork, String originalDeadline) {
    this.id = id;
    this.margin = margin;
    this.penalty = penalty;
    this.startOfWork = startOfWork;
    this.endOfWork = endOfWork;
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

  public String getStartOfWork() {
    return startOfWork;
  }

  public void setStartOfWork(String startOfWork) {
    this.startOfWork = startOfWork;
  }

  public String getEndOfWork() {
    return endOfWork;
  }

  public void setEndOfWork(String endOfWork) {
    this.endOfWork = endOfWork;
  }

  public String getOriginalDeadline() {
    return originalDeadline;
  }

  public void setOriginalDeadline(String originalDeadline) {
    this.originalDeadline = originalDeadline;
  }
}
