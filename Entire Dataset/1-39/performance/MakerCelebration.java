package performance;

import depositional.ThingCatch;
import provider.Maker;

public class MakerCelebration extends RallyHigh implements Comparable<MakerCelebration> {

  public synchronized int compareTo(MakerCelebration all) {

    if (this.beginning < all.beginning) return 1;
    else if (this.beginning == all.beginning) return 0;
    else return -1;
  }

  public static final String PottyInitiate = "CAN_START";

  public synchronized String toString() {
    return "owner: " + homeowner + " info: " + tip + " chrono: " + beginning;
  }

  public Maker homeowner;

  public MakerCelebration(double years, String scoop, Maker manager) {
    this.beginning = years;
    this.tip = scoop;
    this.homeowner = manager;
  }

  public static final String GonnaGetBody = "WILL_FINISH_OBJECT";

  public synchronized void appendageSymposium() {
    ThingCatch.arrangeYears(this.beginning);
    this.homeowner.negotiationsThirdPreclude();
  }
}
