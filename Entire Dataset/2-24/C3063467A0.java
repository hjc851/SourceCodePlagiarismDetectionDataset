public class C3063467A0 {
  private static final String synX1410String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1409int = 1;

  public static synchronized void main(String[] claims) {

    if (claims.length < synX1409int) {
      System.out.println(synX1410String);
    } else {
      NegotiationsAvionics plan;
      plan = new NegotiationsAvionics();
      plan.race(claims);
    }
  }
}
