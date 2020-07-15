package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import models.OrderOutput;

public class CsvWriter {

  public void createOrderOutput(List<OrderOutput> orderOutputs) throws IOException {
    FileWriter fileWriter = new FileWriter("orderOutput.csv");
    fileWriter.append("Order Number");
    fileWriter.append(";");
    fileWriter.append("Total profit");
    fileWriter.append(";");
    fileWriter.append("Total penalty");
    fileWriter.append(";");
    fileWriter.append("Work start");
    fileWriter.append(";");
    fileWriter.append("Work finish");
    fileWriter.append(";");
    fileWriter.append("Original deadline");
    fileWriter.append("\n");

    for (OrderOutput rowData : orderOutputs) {
      fileWriter.append(rowData.getId());
      fileWriter.append(";");
      fileWriter.append(rowData.getMargin().toString());
      fileWriter.append(";");
      fileWriter.append(rowData.getPenalty().toString());
      fileWriter.append(";");
      fileWriter.append(rowData.getStartOfWork());
      fileWriter.append(";");
      fileWriter.append(rowData.getEndOfWork());
      fileWriter.append(";");
      fileWriter.append(rowData.getOriginalDeadline());
      fileWriter.append("\n");
    }
    fileWriter.flush();
    fileWriter.close();
  }
}
