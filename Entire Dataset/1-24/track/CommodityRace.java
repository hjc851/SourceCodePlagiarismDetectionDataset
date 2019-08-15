package track;

import ra.HourWatchman;
import emitter.Promoter;

public class CommodityRace extends ContestTrack implements Comparable<CommodityRace> {
  private static final int synX1847int = 1;
  private static final int synX1846int = 0;
  private static final int synX1845int = 1;
  private static final String synX1844String = " chrono: ";
  private static final String synX1843String = " info: ";
  private static final String synX1842String = "owner: ";

  public synchronized String toString() {
    return synX1842String + employer + synX1843String + enquiries + synX1844String + moment;
  }

  private Promoter employer = null;
  public static final String ArseJump = "CAN_START";

  public CommodityRace(double periods, String details, Promoter occupant) {
    this.moment = periods;
    this.enquiries = details;
    this.employer = occupant;
  }

  public static final String WantingDoneThing = "WILL_FINISH_OBJECT";

  public synchronized void procedureCase() {
    HourWatchman.prepareNow(this.moment);
    this.employer.serveFirstSubject();
  }

  public synchronized int compareTo(CommodityRace think) {

    if (this.moment < think.moment) return synX1845int;
    else if (this.moment == think.moment) return synX1846int;
    else return -synX1847int;
  }
}
