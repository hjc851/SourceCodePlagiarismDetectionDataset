package register;

import euphonious.AgainOfficer;
import fabricator.Output;

public class SupplierVenue extends register.RallyHigh
    implements java.lang.Comparable<SupplierVenue> {

  public synchronized void outgrowthTournament() {
    euphonious.AgainOfficer.layMoment(this.when);
    this.ownership.appendageLaterResist();
  }

  public fabricator.Output ownership;

  public SupplierVenue(double days, String pop, Output landlady) {
    this.when = (days);
    this.intelligence = (pop);
    this.ownership = (landlady);
  }

  public static final java.lang.String PrivyEarly = "CAN_START";

  public synchronized String toString() {
    return ("owner: " + ownership + " info: " + intelligence + " chrono: " + when);
  }

  public synchronized int compareTo(SupplierVenue hope) {

    if (this.when < hope.when) return 1;
    else if (this.when == hope.when) return 0;
    else return -1;
  }

  public static final java.lang.String WantsTerminateSubject = "WILL_FINISH_OBJECT";
}
