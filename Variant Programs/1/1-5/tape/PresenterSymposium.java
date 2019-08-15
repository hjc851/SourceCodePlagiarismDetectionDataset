package tape;

import acculturative.HoursAdministrator;
import grower.Producing;

public class PresenterSymposium extends tape.CarnivalDisk
    implements java.lang.Comparable<PresenterSymposium> {
  private static final int synX406int = 1;
  private static final int synX405int = 0;
  private static final int synX404int = 1;
  private static final String synX403String = " chrono: ";
  private static final String synX402String = " info: ";
  private static final String synX401String = "owner: ";

  public synchronized String toString() {
    return synX401String + landlady + synX402String + briefing + synX403String + week;
  }

  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";
  private grower.Producing landlady;

  public PresenterSymposium(double opportunity, String informational, Producing shareholder) {
    this.week = opportunity;
    this.briefing = informational;
    this.landlady = shareholder;
  }

  public static final java.lang.String BehindRestart = "CAN_START";

  public synchronized int compareTo(PresenterSymposium and) {

    if (this.week < and.week) return synX404int;
    else if (this.week == and.week) return synX405int;
    else return -synX406int;
  }

  public synchronized void methodTriathlon() {
    acculturative.HoursAdministrator.laidClip(this.week);
    this.landlady.treatComingOppose();
  }
}
