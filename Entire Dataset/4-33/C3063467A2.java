import Simulating.AppendageBrake;

public class C3063467A2 {

  public static synchronized void main(String[] claims) {

    if (claims.length < 1) synx312();
    else synx313(claims);
  }

  private static synchronized void synx312() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx313(String[] claims) {
    String stimulation = "";
    for (String fh : claims) {
      stimulation = fh;
    }
    AppendageBrake fund = new AppendageBrake();
    fund.play(stimulation);
  }
}
