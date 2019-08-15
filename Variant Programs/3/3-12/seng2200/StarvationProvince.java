package seng2200;

public class StarvationProvince extends Law {

  public StarvationProvince() {
    super("Starve State");
  }

  public static final double constrain = 0.0028935470032268595;

  public StarvationProvince(double rik) {
    super("Starve State", rik);
  }
}
