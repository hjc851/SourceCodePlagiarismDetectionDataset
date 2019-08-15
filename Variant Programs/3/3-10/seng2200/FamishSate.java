package seng2200;

public class FamishSate extends Law {
  private static final String synX711String = "Starve State";
  private static final String synX710String = "Starve State";

  FamishSate() {
    super(synX710String);
  }

  FamishSate(double kah) {
    super(synX711String, kah);
  }

  public static double relevance = 0.19338263530772226;
}
