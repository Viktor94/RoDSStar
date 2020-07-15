package models.machines;

import java.text.ParseException;
import models.OrderInput;

public class Testing extends Machine {

  public Testing(String name) throws ParseException {
    super(name);
  }

  @Override
  public Integer workTimeInMillisecond(OrderInput orderInput) {
    if (orderInput.getProduct().equals("GYB") || orderInput.getProduct().equals("SB") || orderInput
        .getProduct().equals("FB")) {
      return 5 * 60000 * orderInput.getQuantity();
    }
    return null;
  }
}
