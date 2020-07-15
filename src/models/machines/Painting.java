package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Painting extends Machine{

  public Painting(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    int numberOfMachines = 4;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 12 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "FB":
        return 20 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "SB":
        return 15 / numberOfMachines * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
