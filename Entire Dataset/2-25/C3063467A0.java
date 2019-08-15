import static java.lang.System.out;

public class C3063467A0 {
  private static final String synX1476String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1475int = 1;

  public static synchronized void main(String[] param) {

    if (param.length < synX1475int) {
      out.println(synX1476String);
    } else {
      PhaseSimulations system = new PhaseSimulations();
      system.extend(param);
    }
  }
}
