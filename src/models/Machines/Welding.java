package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Welding extends Machine{

  public Welding(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    int numberOfMachines = 3;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 8 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "FB":
        return 12 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "SB":
        return 10 / numberOfMachines * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
