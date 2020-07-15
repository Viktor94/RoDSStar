package models.Machines;

import models.OrderInput;

public class Testing {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 1d;
    switch (orderInput.getProduct()) {
      case "GYB":
      case "SB":
      case "FB":
        return 5 / numberOfMachines;
    }
    return null;
  }
}
