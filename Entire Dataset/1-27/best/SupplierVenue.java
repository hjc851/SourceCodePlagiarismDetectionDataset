package best;

import lapse.MinutesNurse;
import emitter.Director;

public class SupplierVenue extends SpectaclePrecedent implements Comparable<SupplierVenue> {
  private static final String synX1914String = " chrono: ";
  private static final String synX1913String = " info: ";
  private static final String synX1912String = "owner: ";
  private static final int synX1911int = 1;
  private static final int synX1910int = 0;
  private static final int synX1909int = 1;
  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final String JohnPart = "CAN_START";
  public Director manager;

  public SupplierVenue(double month, String scoop, Director landlady) {
    this.moment = month;
    this.dope = scoop;
    this.manager = landlady;
  }

  public synchronized int compareTo(SupplierVenue sure) {

    if (this.moment < sure.moment) return synX1909int;
    else if (this.moment == sure.moment) return synX1910int;
    else return -synX1911int;
  }

  public synchronized void phaseCommemoration() {
    MinutesNurse.situatedMinutes(this.moment);
    this.manager.methodologyAfterVictim();
  }

  public synchronized String toString() {
    return synX1912String + manager + synX1913String + dope + synX1914String + moment;
  }
}
