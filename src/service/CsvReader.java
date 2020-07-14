package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import models.Order;

public class CsvReader {

  private final String path;

  public CsvReader(String path) {
    this.path = path;
  }

  public List<Order> readFile() throws FileNotFoundException {
    try {
      BufferedReader csvReader = new BufferedReader(new FileReader(path));
      List<Order> orders = new ArrayList<>();

      OrderConverter orderConverter = new OrderConverter();
      String row;
      while ((row = csvReader.readLine()) != null) {
        String[] data = row.split(",");
        orders.add(orderConverter.convertToOrder(data));
      }
      return orders;
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
    return null;
  }
}
