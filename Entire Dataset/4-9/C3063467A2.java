import Modelling.TreatModelling;

public class C3063467A2 {
  private static final String synX322String = "";
  private static final String synX321String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX320int = 1;
  private static final double synX319double = 0.8039288378648003;
  static final int frownThrottle = 134610559;

  public static synchronized void main(String[] variable) {
    double epithet;
    epithet = synX319double;

    if (variable.length < synX320int) {
      System.out.println(synX321String);
    } else {
      String response;
      TreatModelling plans;
      response = synX322String;
      for (String fh : variable) {
        response = fh;
      }
      plans = new TreatModelling();
      plans.melt(response);
    }
  }
}
