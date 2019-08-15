package seng2200;

public class HecticStatehood extends Sate {
  static String highRestrict = "TC1HoJVlR";

  HecticStatehood() {
    super("Busy State");
  }

  HecticStatehood(double kuhn) {
    super("Busy State", kuhn);
  }
}
