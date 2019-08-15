import Analog.NegotiationsAvionics;

public class C3063467A2 {

  public static synchronized void main(String[] param) {
    double highest = 0.5555018037918579;

    if (param.length < 1) synx288();
    else synx289(param);
  }

  static final int kate = -1274777572;

  private static synchronized void synx288() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx289(String[] param) {
    String response = "";
    for (String waffen : param) {
      response = (waffen);
    }
    NegotiationsAvionics platform = new NegotiationsAvionics();
    platform.test(response);
  }
}
