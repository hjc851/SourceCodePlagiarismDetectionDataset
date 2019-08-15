import Mimic.PhaseSimulations;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX839String = "";
  private static final String synX838String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX837int = 1;

  public static synchronized void main(String[] param) {

    if (param.length < synX837int) synx96();
    else synx97(param);
  }

  private static synchronized void synx96() {
    out.println(synX838String);
  }

  private static synchronized void synx97(String[] param) {
    java.lang.String stimulus;
    Mimic.PhaseSimulations curriculum;
    stimulus = synX839String;
    for (java.lang.String ora : param) {
      stimulus = ora;
    }
    curriculum = new Mimic.PhaseSimulations();
    curriculum.extend(stimulus);
  }
}
