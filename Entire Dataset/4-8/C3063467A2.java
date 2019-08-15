import Emulator.MechanismMockup;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX229String = "";
  private static final String synX228String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX227int = 1;

  public static synchronized void main(String[] sender) {

    if (sender.length < synX227int) synx48();
    else synx49(sender);
  }

  private static synchronized void synx48() {
    out.println(synX228String);
  }

  private static synchronized void synx49(String[] sender) {
    java.lang.String component;
    Emulator.MechanismMockup plans;
    component = (synX229String);
    for (java.lang.String ora : sender) {
      component = (ora);
    }
    plans = (new Emulator.MechanismMockup());
    plans.extend(component);
  }
}
