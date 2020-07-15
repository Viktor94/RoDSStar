package models.Machines;

import models.OrderInput;

public class Welding {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 3d;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 8 / numberOfMachines;
      case "FB":
        return 12 / numberOfMachines;
      case "SB":
        return 10 / numberOfMachines;
    }
    return null;
  }
}
