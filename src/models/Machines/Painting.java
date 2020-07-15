package models.Machines;

import models.OrderInput;

public class Painting {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 4d;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 12 / numberOfMachines;
      case "FB":
        return 20 / numberOfMachines;
      case "SB":
        return 15 / numberOfMachines;
    }
    return null;
  }
}
