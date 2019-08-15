package tape;

import indiscernible.PeriodWarden;
import promoter.Director;

public class CommodityRace extends FestivalRegister implements Comparable<CommodityRace> {
  public static final String WishEndTarget = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(CommodityRace certify) {

    if (this.days < certify.days) return 1;
    else if (this.days == certify.days) return 0;
    else return -1;
  }

  public Director lessor;

  public synchronized void workFestival() {
    PeriodWarden.bentHour(this.days);
    this.lessor.proceduresExpectedObjet();
  }

  public static final String BumGet = "CAN_START";

  public synchronized String toString() {
    return "owner: " + lessor + " info: " + details + " chrono: " + days;
  }

  public CommodityRace(double opportunity, String briefing, Director manager) {
    this.days = opportunity;
    this.details = briefing;
    this.lessor = manager;
  }
}
