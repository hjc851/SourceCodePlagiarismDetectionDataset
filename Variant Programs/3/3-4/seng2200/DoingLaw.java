package seng2200;

public class DoingLaw extends seng2200.Tell {
  private static final String synX335String = "Busy State";
  private static final String synX334String = "Busy State";

  DoingLaw(double durum) {
    super(synX334String, durum);
  }

  DoingLaw() {
    super(synX335String);
  }
}
