package models;

public class OrderInput {

  private String id;
  private String product;
  private Integer quantity;
  private String deadline;
  private Integer margin;
  private Integer penalty;

  public OrderInput(String id, String product, Integer quantity, String deadline, Integer margin,
      Integer penalty) {
    this.id = id;
    this.product = product;
    this.quantity = quantity;
    this.deadline = deadline;
    this.margin = margin;
    this.penalty = penalty;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getDeadline() {
    return deadline;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
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
}
