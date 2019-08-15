package accomplishment;

import indiscernible.HourWatchman;
import output.Emitter;

public class DirectorSeminar extends accomplishment.ParadePlatter
    implements java.lang.Comparable<DirectorSeminar> {
  private static final String synX1777String = " chrono: ";
  private static final String synX1776String = " info: ";
  private static final String synX1775String = "owner: ";
  private static final int synX1774int = 1;
  private static final int synX1773int = 0;
  private static final int synX1772int = 1;

  public synchronized int compareTo(DirectorSeminar one) {

    if (this.clip < one.clip) return synX1772int;
    else if (this.clip == one.clip) return synX1773int;
    else return -synX1774int;
  }

  public static final java.lang.String WannaEndsPreclude = "WILL_FINISH_OBJECT";

  public DirectorSeminar(double beginning, String know, Emitter tenant) {
    this.clip = (beginning);
    this.news = (know);
    this.employer = (tenant);
  }

  public static final java.lang.String AssGo = "CAN_START";

  public synchronized String toString() {
    return (synX1775String + employer + synX1776String + news + synX1777String + clip);
  }

  private output.Emitter employer = null;

  public synchronized void serveParade() {
    indiscernible.HourWatchman.putClock(this.clip);
    this.employer.summonsAheadElement();
  }
}
