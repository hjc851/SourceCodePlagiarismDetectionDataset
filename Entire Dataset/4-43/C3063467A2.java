import Impactor.ProceedingsKinematics;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1867String = "";
  private static final String synX1866String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1865int = 1;

  public static synchronized void main(String[] use) {

    if (use.length < synX1865int) {
      out.println(synX1866String);
    } else {
      String stimulus = synX1867String;
      for (String ora : use) {
        stimulus = ora;
      }
      ProceedingsKinematics project = new ProceedingsKinematics();
      project.drive(stimulus);
    }
  }
}
