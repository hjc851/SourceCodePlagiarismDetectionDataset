package best;

import metamorphic.HoursAdministrator;
import emitter.Growers;

public class ManufacturersRally extends MeetingAnnals implements Comparable<ManufacturersRally> {
  private static final String synX700String = " chrono: ";
  private static final String synX699String = " info: ";
  private static final String synX698String = "owner: ";
  private static final int synX697int = -1782695110;
  private static final int synX696int = 1985119175;
  private static final int synX695int = 1;
  private static final int synX694int = 0;
  private static final int synX693int = 1;
  private static final double synX692double = 0.6759279297528111;
  public Growers proprietors;
  public static final String SeatRun = "CAN_START";
  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  static int pettyIndentured = 1940115298;

  public ManufacturersRally(double hours, String news, Growers occupant) {
    this.meter = hours;
    this.nicky = news;
    this.proprietors = occupant;
  }

  public synchronized int compareTo(ManufacturersRally see) {
    double senateCurb;
    senateCurb = synX692double;

    if (this.meter < see.meter) return synX693int;
    else if (this.meter == see.meter) return synX694int;
    else return -synX695int;
  }

  public synchronized void cycleRace() {
    int reduce;
    reduce = synX696int;
    HoursAdministrator.primedPeriod(this.meter);
    this.proprietors.formalitiesComeDisagree();
  }

  public synchronized String toString() {
    int symbolism;
    symbolism = synX697int;
    return synX698String + proprietors + synX699String + nicky + synX700String + meter;
  }
}
