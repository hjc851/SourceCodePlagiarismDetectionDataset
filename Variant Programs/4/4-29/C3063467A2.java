import Robot.MechanismsManikin;

public class C3063467A2 {
  private static final String synX1482String = "";
  private static final String synX1481String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1480int = 1;

  public static synchronized void main(String[] array) {

    if (array.length < synX1480int) synx264();
    else synx265(array);
  }

  private static synchronized void synx264() {
    System.out.println(synX1481String);
  }

  private static synchronized void synx265(String[] array) {
    String comments = synX1482String;
    for (String fh : array) {
      comments = fh;
    }
    MechanismsManikin organization = new MechanismsManikin();
    organization.carry(comments);
  }
}
