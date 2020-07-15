import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import models.OrderInput;
import models.OrderOutput;
import models.machines.Bending;
import models.machines.Cutting;
import models.machines.Machine;
import models.machines.Packaging;
import models.machines.Painting;
import models.machines.Testing;
import models.machines.Welding;
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

    List<Machine> machines = Arrays
        .asList(new Cutting("1"), new Bending("2"), new Welding("3"),
            new Testing("4"), new Packaging("5"), new Painting("6"));

    CsvWriter csvWriter = new CsvWriter();
    csvWriter.createOrderOutput(orderConverter.calculateOrderTime(orderInputs, machines));
  }
}
