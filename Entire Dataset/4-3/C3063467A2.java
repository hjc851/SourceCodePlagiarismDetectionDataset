import Joystick.PhaseSimulations;
import static java.lang.System.out;

public class C3063467A2 {

  public static synchronized void main(String[] array) {

    if (array.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String representations;
      Joystick.PhaseSimulations plan;
      representations = "";
      for (java.lang.String ora : array) {
        representations = ora;
      }
      plan = new Joystick.PhaseSimulations();
      plan.lean(representations);
    }
  }
}
