package seng2200;

public class LaboringSay extends seng2200.Express {
  private static final String synX1850String = "Busy State";
  private static final String synX1849String = "Busy State";

  public LaboringSay(double beh) {
    super(synX1849String, beh);
  }

  public LaboringSay() {
    super(synX1850String);
  }
}
