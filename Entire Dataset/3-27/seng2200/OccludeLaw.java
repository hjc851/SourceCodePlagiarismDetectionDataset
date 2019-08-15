package seng2200;

public class OccludeLaw extends seng2200.Foreign {

  OccludeLaw() {
    super("Blocked State");
  }

  OccludeLaw(double tough) {
    super("Blocked State", tough);
  }

  public static final double restriction = 0.9659615809783877;
}
