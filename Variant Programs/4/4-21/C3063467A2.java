import Joystick.OperationSimulated;

public class C3063467A2 {

  public static synchronized void main(String[] param) {

    if (param.length < 1) synx168();
    else synx169(param);
  }

  private static synchronized void synx168() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx169(String[] param) {
    java.lang.String support = "";
    for (java.lang.String waffen : param) {
      support = (waffen);
    }
    Joystick.OperationSimulated platform = new Joystick.OperationSimulated();
    platform.campaign(support);
  }
}
