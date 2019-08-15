import Moot.ProceedingsKinematics;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1666String = "";
  private static final String synX1665String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1664int = 1;

  public static synchronized void main(String[] sender) {

    if (sender.length < synX1664int) synx336();
    else synx337(sender);
  }

  private static synchronized void synx336() {
    out.println(synX1665String);
  }

  private static synchronized void synx337(String[] sender) {
    java.lang.String advice;
    Moot.ProceedingsKinematics project;
    advice = synX1666String;
    for (java.lang.String fh : sender) {
      advice = fh;
    }
    project = new Moot.ProceedingsKinematics();
    project.play(advice);
  }
}
