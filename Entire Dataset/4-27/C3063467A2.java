import Sim.ProceedingsKinematics;

public class C3063467A2 {

  public static synchronized void main(String[] abscissa) {

    if (abscissa.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String comments = "";
      for (java.lang.String fh : abscissa) {
        comments = (fh);
      }
      Sim.ProceedingsKinematics scheme = new Sim.ProceedingsKinematics();
      scheme.streak(comments);
    }
  }
}
