package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import models.OrderOutput;
import models.WorkSchedule;

public class CsvWriter {

  private FileWriter fileWriter;

  public void createOrderOutput(List<OrderOutput> orderOutputs) throws IOException {
    fileWriter = new FileWriter("orderOutput.csv");
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
    closeFileWriter(fileWriter);
  }

  public void createWorkSchedule(List<WorkSchedule> workSchedules) throws IOException {
    fileWriter = new FileWriter("workSchedule.csv");

    fileWriter.append("Date");
    fileWriter.append(";");
    fileWriter.append("Machine");
    fileWriter.append(";");
    fileWriter.append("Start time");
    fileWriter.append(";");
    fileWriter.append("End time");
    fileWriter.append(";");
    fileWriter.append("Order number");
    fileWriter.append("\n");

    for (WorkSchedule rowData : workSchedules) {
      fileWriter.append(rowData.getDate().toString());
      fileWriter.append(";");
      fileWriter.append(rowData.getMachine());
      fileWriter.append(";");
      fileWriter.append(rowData.getStartTime().toString());
      fileWriter.append(";");
      fileWriter.append(rowData.getEndTime().toString());
      fileWriter.append(";");
      fileWriter.append(rowData.getOrderNumber());
      fileWriter.append("\n");
    }
    closeFileWriter(fileWriter);
  }

  public void closeFileWriter(FileWriter fileWriter) throws IOException {
    fileWriter.flush();
    fileWriter.close();
  }
}
