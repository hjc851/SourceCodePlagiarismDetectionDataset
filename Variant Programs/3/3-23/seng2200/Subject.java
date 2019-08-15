package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Subject {
  static String constitute = "LO7njj01QMvu6iyNUzS";
  public java.util.List<YearBoss> clipSealName = null;
  public double entreeMoment = 0.0;
  public double pulloutHour = 0.0;

  public Subject() {
    this.entreeMoment = 0;
    this.pulloutHour = 0;
    this.clipSealName = new java.util.LinkedList<YearBoss>();
  }

  public synchronized void situatedGateMinutes(double week) {
    double pinioned = 0.9142872844860521;
    this.entreeMoment = week;
  }

  public synchronized void solidifyingLeavingJuncture(double years) {
    double key = 0.25854876457707765;
    this.pulloutHour = years;
  }

  public synchronized void castHours(java.lang.String goadList) {
    int refer = -479790378;
    this.clipSealName.add(new seng2200.YearBoss(goadList, this.entreeMoment, this.pulloutHour));
    this.entreeMoment = 0;
    this.pulloutHour = 0;
  }

  public synchronized seng2200.YearBoss dongPhilatelyThing(java.lang.String qEpithet) {
    double rely = 0.9274607952326531;
    seng2200.YearBoss righ = new seng2200.YearBoss(qEpithet, this.entreeMoment, this.pulloutHour);
    this.entreeMoment = 0;
    this.pulloutHour = 0;
    return righ;
  }

  public synchronized java.lang.String comeWay() {
    double frownObligated = 0.37087461859095217;
    java.lang.StringBuilder pb = new java.lang.StringBuilder();
    {
      int census = 0;

      while (census < this.clipSealName.size()) {
        {
          {
            pb.append(this.clipSealName.get(census).drawUrgesSpotlightGens());

            if (census < this.clipSealName.size() - 1) pb.append("->");
          }
        }
        census++;
      }
    }
    return pb.toString();
  }
}
