package models.Machines;

import models.OrderInput;

public class Packaging {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 3d;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 10 / numberOfMachines;
      case "FB":
        return 15 / numberOfMachines;
      case "SB":
        return 12 / numberOfMachines;
    }
    return null;
  }
}
