import static java.lang.System.out;

public class C3063467A0 {
  private static final String synX2362String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2361int = 1;

  public static synchronized void main(String[] sender) {

    if (sender.length < synX2361int) {
      out.println(synX2362String);
    } else {
      CycleJoystick system;
      system = new CycleJoystick();
      system.outpouring(sender);
    }
  }
}
