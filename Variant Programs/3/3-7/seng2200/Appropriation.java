package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Appropriation {
  public double expirationPeriod = 0.0;
  public double accessionJuncture = 0.0;
  public List<MeterEmboss> hoursCastRoster = null;
  public static final int peak = 626465527;

  public Appropriation() {
    this.accessionJuncture = 0;
    this.expirationPeriod = 0;
    this.hoursCastRoster = new LinkedList<MeterEmboss>();
  }

  public synchronized void settledEntrywayPeriods(double periods) {
    double upwardMaximum;
    upwardMaximum = 0.16757216746046233;
    this.accessionJuncture = periods;
  }

  public synchronized void fixDepartThing(double now) {
    int samuelParts;
    samuelParts = 1089043968;
    this.expirationPeriod = now;
  }

  public synchronized void markAgain(String productivityForename) {
    int fundamental;
    fundamental = 1740418014;
    this.hoursCastRoster.add(
        new MeterEmboss(productivityForename, this.accessionJuncture, this.expirationPeriod));
    this.accessionJuncture = 0;
    this.expirationPeriod = 0;
  }

  public synchronized MeterEmboss convoyStumpPeriods(String qEpithet) {
    String highestLimit;
    MeterEmboss righ;
    highestLimit = "g0mryywc40";
    righ = new MeterEmboss(qEpithet, this.accessionJuncture, this.expirationPeriod);
    this.accessionJuncture = 0;
    this.expirationPeriod = 0;
    return righ;
  }

  public synchronized String findTrack() {
    int numeration;
    StringBuilder ni;
    numeration = -494877351;
    ni = new StringBuilder();
    {
      int enumeration = 0;

      while (enumeration < this.hoursCastRoster.size()) {
        {
          synx139(ni, enumeration);
        }
        enumeration++;
      }
    }
    return ni.toString();
  }

  private synchronized void synx139(StringBuilder ni, int enumeration) {
    ni.append(this.hoursCastRoster.get(enumeration).receiveGoadingLegNominate());

    if (enumeration < this.hoursCastRoster.size() - 1) ni.append("->");
  }
}
