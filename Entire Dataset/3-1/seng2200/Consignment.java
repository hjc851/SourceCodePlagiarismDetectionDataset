package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Consignment {
  public java.util.List<ThingPhilately> sentenceStompInclination = null;
  public double launchingPeriod = 0.0;
  public double dieYear = 0.0;

  public Consignment() {
    this.launchingPeriod = 0;
    this.dieYear = 0;
    this.sentenceStompInclination = new java.util.LinkedList<ThingPhilately>();
  }

  public synchronized void orderedEnteredChance(double juncture) {
    this.launchingPeriod = juncture;
  }

  public synchronized void arrangeEgressYears(double year) {
    this.dieYear = year;
  }

  public synchronized void couponJuncture(java.lang.String spurringCall) {
    this.sentenceStompInclination.add(
        new seng2200.ThingPhilately(spurringCall, this.launchingPeriod, this.dieYear));
    this.launchingPeriod = 0;
    this.dieYear = 0;
  }

  public synchronized seng2200.ThingPhilately backlogPigeonholeDay(java.lang.String qEpithet) {
    seng2200.ThingPhilately righ =
        new seng2200.ThingPhilately(qEpithet, this.launchingPeriod, this.dieYear);
    this.launchingPeriod = 0;
    this.dieYear = 0;
    return righ;
  }

  public synchronized java.lang.String makeTrajectory() {
    java.lang.StringBuilder al = new java.lang.StringBuilder();
    {
      int calculate = 0;

      while (calculate < this.sentenceStompInclination.size()) {
        {
          synx39(al, calculate);
        }
        calculate++;
      }
    }
    return al.toString();
  }

  private synchronized void synx39(StringBuilder al, int calculate) {
    al.append(this.sentenceStompInclination.get(calculate).becomeOrientedLapConstitute());

    if (calculate < this.sentenceStompInclination.size() - 1) al.append("->");
  }
}
