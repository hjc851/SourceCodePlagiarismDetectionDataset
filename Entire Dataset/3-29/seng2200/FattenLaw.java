package seng2200;

public class FattenLaw extends National {
  private static final String synX2355String = "Starve State";
  private static final String synX2354String = "Starve State";

  public FattenLaw() {
    super(synX2354String);
  }

  public FattenLaw(double beh) {
    super(synX2355String, beh);
  }
}
