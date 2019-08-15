package seng2200;

public class HecticStatehood extends National {
  private static final String synX463String = "Busy State";
  private static final String synX462String = "Busy State";

  HecticStatehood() {
    super(synX462String);
  }

  HecticStatehood(double theo) {
    super(synX463String, theo);
  }
}
