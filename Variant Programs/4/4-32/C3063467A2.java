import Simulation.ServeAnalogue;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1574String = "";
  private static final String synX1573String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1572int = 1;

  public static synchronized void main(String[] param) {

    if (param.length < synX1572int) {
      out.println(synX1573String);
    } else {
      String stimulant;
      ServeAnalogue fund;
      stimulant = synX1574String;
      for (String fh : param) {
        stimulant = fh;
      }
      fund = new ServeAnalogue();
      fund.tally(stimulant);
    }
  }
}
