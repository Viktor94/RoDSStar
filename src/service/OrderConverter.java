package service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import models.Order;

public class OrderConverter {

  public Order convertToOrder(String[] line) throws ParseException {
    DateFormat dateFormat = new SimpleDateFormat("MM-dd hh:mm");

    return new Order(line[0], line[1], Integer.valueOf(line[2]), dateFormat.parse(line[3]),
        Integer.valueOf(line[4]), Integer.valueOf(line[5]));
  }
}
