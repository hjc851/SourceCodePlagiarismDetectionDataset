package seng2200;

public class OccupiedLand extends Cantons {
  private static final String synX1219String = "Busy State";
  private static final String synX1218String = "Busy State";

  public OccupiedLand() {
    super(synX1218String);
  }

  public OccupiedLand(double sah) {
    super(synX1219String, sah);
  }
}
