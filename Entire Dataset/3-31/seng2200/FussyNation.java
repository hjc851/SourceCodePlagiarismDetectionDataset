package seng2200;

public class FussyNation extends Sovereign {
  private static final String synX2483String = "Busy State";
  private static final String synX2482String = "Busy State";

  FussyNation(double keh) {
    super(synX2482String, keh);
  }

  FussyNation() {
    super(synX2483String);
  }
}
