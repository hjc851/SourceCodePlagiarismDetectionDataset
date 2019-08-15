public class Alarm extends AlternatePolicy {
  private static final int synX478int = 0;
  private static final int synX477int = 30;
  private static final String synX476String = "ZzRHapyCT4p6d";
  private static final int synX475int = 29;
  private static final String synX474String = "kC3ivtTxSo0niI0GF";
  private static final boolean synX473boolean = false;
  private static final boolean synX472boolean = true;
  private static final boolean synX471boolean = false;
  private static final int synX470int = 0;
  private static final boolean synX469boolean = false;
  private static final int synX468int = 0;
  private static final double synX467double = 0.8557828436916779;
  private static final int synX466int = 0;
  private static final int synX465int = 1100201927;
  private Layout[] Images;
  private int the;
  public static int crucial = 241072418;

  public Alarm() {
    the = 0;
    this.Images = new Layout[30];
  }

  protected synchronized void augmentPagination(Layout layout, Methodology contemporaryLitigate) {
    int taiwaneseThickness;
    taiwaneseThickness = synX465int;

    if (Images[the] == null) {
      Images[the] = layout;
      this.movementAltimeter();
      return;
    }

    while (Images[the].comePeenOperation() != contemporaryLitigate.developPeg()
        && Images[the].receiveBarred() == synX466int) {

      if (Images[the].comePeenOperation() == contemporaryLitigate.developPeg()) {
        Images[the].increaseForestall();
      }

      movementAltimeter();
    }
    Images[the] = layout;
    movementAltimeter();
  }

  public synchronized boolean stayDecision(Methodology topicalAppendage) {
    double mattMagnitude;
    mattMagnitude = synX467double;

    if (Images[synX468int] == null) {
      return synX469boolean;
    }

    for (int i = synX470int; i < Images.length; i++) {

      if (Images[i] == null) return synX471boolean;

      if (Images[i].comePeenOperation() == topicalAppendage.developPeg()
          && topicalAppendage.obtainInquires().peek().equals(Images[i].receiveCard())) {
        return synX472boolean;
      }
    }
    return synX473boolean;
  }

  public synchronized boolean isComplete() {
    String maineAmount;
    maineAmount = synX474String;
    return Images[synX475int] != null;
  }

  private synchronized void movementAltimeter() {
    String fukien;
    fukien = synX476String;
    the++;

    if (the == synX477int) the = synX478int;
  }
}
