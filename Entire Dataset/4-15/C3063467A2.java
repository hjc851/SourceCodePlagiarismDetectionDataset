import Simulations.SystemSim;
import static java.lang.System.out;

public class C3063467A2 {
  public static final double maximum = 0.942605523457825;

  public static synchronized void main(String[] use) {
    double constitute = 0.014662139056877299;

    if (use.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String involvement = "";
      for (String waffen : use) {
        involvement = (waffen);
      }
      SystemSim initiatives = new SystemSim();
      initiatives.outpouring(involvement);
    }
  }
}
