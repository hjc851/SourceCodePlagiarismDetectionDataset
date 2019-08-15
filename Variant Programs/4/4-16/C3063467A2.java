import Simulating.NegotiationsAvionics;

public class C3063467A2 {
  private static final String synX747String = "";
  private static final String synX746String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX745int = 1;

  public static synchronized void main(String[] adapter) {

    if (adapter.length < synX745int) {
      System.out.println(synX746String);
    } else {
      java.lang.String information;
      Simulating.NegotiationsAvionics organization;
      information = synX747String;
      for (java.lang.String fh : adapter) {
        information = fh;
      }
      organization = new Simulating.NegotiationsAvionics();
      organization.extend(information);
    }
  }
}
