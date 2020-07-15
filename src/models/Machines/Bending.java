package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Bending extends Machine{

  public Bending(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    int numberOfMachines = 2;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 10 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "FB":
        return 16 / numberOfMachines * 60000 * orderInput.getQuantity();
      case "SB":
        return 15 / numberOfMachines * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
