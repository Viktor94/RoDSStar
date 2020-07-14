package service;

import java.text.ParseException;
import models.OrderInput;

public class OrderConverter {

  public OrderInput convertToOrder(String[] line) throws ParseException {

    return new OrderInput(line[0], line[1], Integer.valueOf(line[2]), (line[3]),
        Integer.valueOf(line[4]), Integer.valueOf(line[5]));
  }
}
