package models.Machines;

import models.OrderInput;

public class Bending {

  public Double workTime(OrderInput orderInput) {
    double numberOfMachines = 2d;
    switch (orderInput.getProduct()) {
      case "GYB":
        return 10 / numberOfMachines;
      case "FB":
        return 16 / numberOfMachines;
      case "SB":
        return 15 / numberOfMachines;
    }
    return null;
  }
}
