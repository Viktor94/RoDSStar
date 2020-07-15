package models.Machines;

import models.OrderInput;

public class Cutting {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 6d;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 5 / numberOfMachines;
      case "FB":
        return 8 / numberOfMachines;
      case "SB":
        return 6 / numberOfMachines;
    }
    return null;
  }
}
