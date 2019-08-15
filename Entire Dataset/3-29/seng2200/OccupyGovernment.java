package seng2200;

public class OccupyGovernment extends National {
  private static final String synX2360String = "Busy State";
  private static final String synX2359String = "Busy State";

  public OccupyGovernment() {
    super(synX2359String);
  }

  public OccupyGovernment(double rum) {
    super(synX2360String, rum);
  }
}
