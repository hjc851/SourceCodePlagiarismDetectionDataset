import Impactor.MechanismMockup;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1064String = "";
  private static final String synX1063String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1062int = 1;
  private static final double synX1061double = 0.8260524561109697;
  public static final String describe = "1ROQ6hvq";

  public static synchronized void main(String[] abscissa) {
    double edge = synX1061double;

    if (abscissa.length < synX1062int) {
      out.println(synX1063String);
    } else {
      java.lang.String suggestions = synX1064String;
      for (java.lang.String fh : abscissa) {
        suggestions = fh;
      }
      Impactor.MechanismMockup fund = new Impactor.MechanismMockup();
      fund.pass(suggestions);
    }
  }
}
