import Demo.ProcedureSimulation;

public class C3063467A2 {
  static final double curveGauge = 0.522911784316181;

  public static synchronized void main(String[] sender) {
    String constrained = "Ic";

    if (sender.length < 1) synx360();
    else synx361(sender);
  }

  private static synchronized void synx360() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx361(String[] sender) {
    String comments = "";
    for (String ora : sender) {
      comments = ora;
    }
    ProcedureSimulation broadcast = new ProcedureSimulation();
    broadcast.streak(comments);
  }
}
