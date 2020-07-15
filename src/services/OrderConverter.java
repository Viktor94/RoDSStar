package services;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import models.OrderInput;
import models.OrderOutput;
import models.machines.Machine;

public class OrderConverter {

  public OrderInput convertToOrder(String[] line) throws ParseException {

    return new OrderInput(line[0], line[1], Integer.valueOf(line[2]), (line[3]),
        Integer.valueOf(line[4]), Integer.valueOf(line[5]));
  }

  public List<OrderOutput> convertOrderToOrderOutput(List<OrderInput> orderInputs)
      throws ParseException {
    List<OrderOutput> orderOutputs = new ArrayList<>();

    for (OrderInput orderInput : orderInputs) {
      OrderOutput orderOutput = new OrderOutput(orderInput.getId(), orderInput.getProfit()
          , 1, "08:00", "12:00", orderInput.getDeadline());
      orderOutputs.add(orderOutput);
    }
    return orderOutputs;
  }

  public List<OrderOutput> calculateOrderTime(List<OrderInput> orderInputs,
      List<Machine> machineList)
      throws ParseException {
    List<OrderOutput> orderOutputs = new ArrayList<>();
    for (int i = 0; i < orderInputs.size(); i++) {
      for (int j = 0; j < machineList.size(); j++) {
        machineList.get(j).work(orderInputs.get(i));
      }
      Long deadline = orderInputs.get(i).getDeadline().getTime();
      Long finishedAt = machineList.get(machineList.size() - 1).getAvailableFrom().getTime();

      Integer penaltyDays = 0;
      if (finishedAt > deadline) {
        penaltyDays =
            (int) TimeUnit.DAYS.convert(finishedAt - deadline, TimeUnit.MILLISECONDS);
      }

      OrderOutput orderOutput = new OrderOutput(orderInputs.get(i).getId(),
          orderInputs.get(i).getProfit(), orderInputs.get(i).getPenalty() * penaltyDays,
          machineList.get(0).getAvailableFrom().toString().substring(11,15),
          machineList.get(machineList.size() - 1).getAvailableFrom().toString().substring(11,15),
          orderInputs.get(i).getDeadline());

      orderOutputs.add(orderOutput);
    }

    return orderOutputs;
  }
}
