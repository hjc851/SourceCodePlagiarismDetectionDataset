package seng2200;

public class CongestedCanton extends seng2200.Foreign {
  private static final String synX202String = "Busy State";
  private static final String synX201String = "Busy State";

  public CongestedCanton(double tough) {
    super(synX201String, tough);
  }

  public CongestedCanton() {
    super(synX202String);
  }
}
