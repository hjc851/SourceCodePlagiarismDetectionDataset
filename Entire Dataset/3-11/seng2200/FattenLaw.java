package seng2200;

public class FattenLaw extends Cantons {
  private static final String synX901String = "Starve State";
  private static final String synX900String = "Starve State";

  public FattenLaw() {
    super(synX900String);
  }

  public FattenLaw(double roh) {
    super(synX901String, roh);
  }
}
