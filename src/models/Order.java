package models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

  private String id;
  private String product;
  private Integer quantity;
  private Date deadline;
  private Integer margin;
  private Integer penalty;

  public Order(String id, String product, Integer quantity, Date deadline, Integer margin,
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

  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
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
