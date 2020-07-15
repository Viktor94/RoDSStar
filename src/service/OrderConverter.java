package service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import models.OrderInput;
import models.OrderOutput;

public class OrderConverter {

  public OrderInput convertToOrder(String[] line) throws ParseException {

    return new OrderInput(line[0], line[1], Integer.valueOf(line[2]), (line[3]),
        Integer.valueOf(line[4]), Integer.valueOf(line[5]));
  }

  public List<OrderOutput> convertOrderToOrderOutput(List<OrderInput> orderInputs) {
    List<OrderOutput> orderOutputs = new ArrayList<>();

    for (OrderInput orderInput : orderInputs) {
      OrderOutput orderOutput = new OrderOutput(orderInput.getId(), orderInput.getProfit()
          , 1, "Start time", "End time", orderInput.getDeadline());
      orderOutputs.add(orderOutput);
    }
    return orderOutputs;
  }
}
