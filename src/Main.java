import java.io.FileNotFoundException;
import java.util.List;
import models.OrderInput;
import service.CsvReader;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    CsvReader csvReader = new CsvReader("asd1.csv");
    List<OrderInput> orderInputs = csvReader.readFile();
    for (int i = 0; i < orderInputs.size(); i++) {
      System.out.println(orderInputs.get(i).getId());
    }
  }
}
