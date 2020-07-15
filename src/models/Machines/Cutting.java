package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Cutting extends Machine{

  public Cutting(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    int numberOfMachines = 6;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 5 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "FB":
        return 8 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "SB":
      return 6 / numberOfMachines * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
