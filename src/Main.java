import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import models.OrderInput;
import models.OrderOutput;
import models.machines.Cutting;
import services.CsvReader;
import services.CsvWriter;
import services.OrderConverter;

public class Main {

  public static void main(String[] args) throws IOException, ParseException {
    CsvReader csvReader = new CsvReader("asd1.csv");
    List<OrderInput> orderInputs = csvReader.readFile();

    OrderConverter orderConverter = new OrderConverter();
    List<OrderOutput> orderOutputs = orderConverter.convertOrderToOrderOutput(orderInputs);
    Cutting cutting = new Cutting("Cutting-1");
    System.out.println(cutting.getAvailableFrom());
    cutting.work(orderInputs.get(1));
    System.out.println(cutting.getAvailableFrom());

    CsvWriter csvWriter = new CsvWriter();
    csvWriter.createOrderOutput(orderOutputs);
  }
}
