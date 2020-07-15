package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import models.OrderInput;

public class CsvReader {

  private final String path;

  public CsvReader(String path) {
    this.path = path;
  }

  public List<OrderInput> readFile() {
    try {
      BufferedReader csvReader = new BufferedReader(new FileReader(path));
      List<OrderInput> orderInputs = new ArrayList<>();

      OrderConverter orderConverter = new OrderConverter();
      String row;
      int counter = 0;
      while ((row = csvReader.readLine()) != null) {
        String[] data = row.split(";");
        if (counter != 0) {
          orderInputs.add(orderConverter.convertToOrder(data));
        }
        counter++;
      }
      return orderInputs;
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
    return null;
  }
}
