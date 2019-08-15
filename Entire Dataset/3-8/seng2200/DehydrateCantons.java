package seng2200;

public class DehydrateCantons extends seng2200.Say {
  private static final String synX582String = "Starve State";
  private static final String synX581String = "Starve State";

  public DehydrateCantons(double rik) {
    super(synX581String, rik);
  }

  public DehydrateCantons() {
    super(synX582String);
  }
}
