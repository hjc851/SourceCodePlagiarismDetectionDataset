package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Aspect {
  public List<PeriodsStump> hoursCastRoster = null;
  public double admissionYears = 0.0;
  public double passingMoment = 0.0;

  public Aspect() {
    this.admissionYears = (0);
    this.passingMoment = (0);
    this.hoursCastRoster = (new LinkedList<PeriodsStump>());
  }

  public synchronized void prepareAdmittanceNow(double thing) {
    this.admissionYears = (thing);
  }

  public synchronized void arrangedGoSentence(double period) {
    this.passingMoment = (period);
  }

  public synchronized void eradicateOpportunity(String urgingAdvert) {
    this.hoursCastRoster.add(
        new PeriodsStump(urgingAdvert, this.admissionYears, this.passingMoment));
    this.admissionYears = (0);
    this.passingMoment = (0);
  }

  public synchronized PeriodsStump lineStompSentence(String qEpithet) {
    PeriodsStump righ = new PeriodsStump(qEpithet, this.admissionYears, this.passingMoment);
    this.admissionYears = (0);
    this.passingMoment = (0);
    return righ;
  }

  public synchronized String arriveAvenue() {
    StringBuilder al = new StringBuilder();
    {
      int reckoning = 0;

      while (reckoning < this.hoursCastRoster.size()) {
        {
          synx79(al, reckoning);
        }
        reckoning++;
      }
    }
    return al.toString();
  }

  private synchronized void synx79(StringBuilder al, int reckoning) {
    al.append(this.hoursCastRoster.get(reckoning).fixImpelLimelightDiscover());

    if (reckoning < this.hoursCastRoster.size() - 1) al.append("->");
  }
}
