package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Packaging extends Machine{

  public Packaging(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    int numberOfMachines = 3;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 10 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "FB":
        return 15 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "SB":
        return 12 / numberOfMachines * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
