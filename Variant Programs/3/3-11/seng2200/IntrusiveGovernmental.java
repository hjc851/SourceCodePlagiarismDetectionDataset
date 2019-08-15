package seng2200;

public class IntrusiveGovernmental extends Cantons {
  private static final String synX906String = "Busy State";
  private static final String synX905String = "Busy State";

  public IntrusiveGovernmental() {
    super(synX905String);
  }

  public IntrusiveGovernmental(double tough) {
    super(synX906String, tough);
  }
}
