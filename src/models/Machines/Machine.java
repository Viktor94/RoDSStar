package models.machines;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.OrderInput;

public abstract class Machine {

  private String name;
  private Date availableFrom = new SimpleDateFormat("yyyy.MM.dd. hh:mm").parse("2020.07.20. 06:00");

  Machine(String name) throws ParseException {
    this.name = name;
  }

  public abstract Integer workTimeInMillisecond(OrderInput orderInput);

  public void work(OrderInput orderInput) {
    this.availableFrom = new Date(
        this.availableFrom.getTime() + (workTimeInMillisecond(orderInput)));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getAvailableFrom() {
    return availableFrom;
  }
}
