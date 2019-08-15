package seng2200;

public class EngagedCountry extends Country {
  private static final String synX2176String = "Busy State";
  private static final String synX2175String = "Busy State";

  public EngagedCountry() {
    super(synX2175String);
  }

  public EngagedCountry(double beh) {
    super(synX2176String, beh);
  }

  public static final double netherTrammel = 0.5636945617890264;
}
