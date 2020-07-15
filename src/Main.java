import java.io.IOException;
import java.util.List;
import models.OrderInput;
import models.OrderOutput;
import service.CsvReader;
import service.CsvWriter;
import service.OrderConverter;

public class Main {

  public static void main(String[] args) throws IOException {
    CsvReader csvReader = new CsvReader("asd1.csv");
    List<OrderInput> orderInputs = csvReader.readFile();
    for (int i = 0; i < orderInputs.size(); i++) {
      System.out.println(orderInputs.get(i).getId());
    }

    /*
    Integer kid = 50;
    Integer adult = 76;
    Integer adolescent = 63;
    Integer firstShift = 480;
    Integer secondShift = 480;
     */
    OrderConverter orderConverter = new OrderConverter();
    List<OrderOutput> orderOutputs = orderConverter.convertOrderToOrderOutput(orderInputs);

    CsvWriter csvWriter = new CsvWriter();
    csvWriter.createOrderOutput(orderOutputs);
  }
}
