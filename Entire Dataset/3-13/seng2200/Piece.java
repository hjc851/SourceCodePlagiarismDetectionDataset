package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Piece {
  public double leavingJuncture = 0.0;
  public double enteredChance = 0.0;
  public java.util.List<PeriodsStump> chancePhilatelicDocket = null;

  public Piece() {
    this.enteredChance = (0);
    this.leavingJuncture = (0);
    this.chancePhilatelicDocket = (new java.util.LinkedList<PeriodsStump>());
  }

  public synchronized void rigidEntrancesAmount(double hours) {
    this.enteredChance = (hours);
  }

  public synchronized void bentPulloutHour(double when) {
    this.leavingJuncture = (when);
  }

  public synchronized void couponJuncture(java.lang.String pokeRefer) {
    this.chancePhilatelicDocket.add(
        new seng2200.PeriodsStump(pokeRefer, this.enteredChance, this.leavingJuncture));
    this.enteredChance = (0);
    this.leavingJuncture = (0);
  }

  public synchronized seng2200.PeriodsStump backlogPigeonholeDay(java.lang.String qEpithet) {
    seng2200.PeriodsStump righ;
    righ = (new seng2200.PeriodsStump(qEpithet, this.enteredChance, this.leavingJuncture));
    this.enteredChance = (0);
    this.leavingJuncture = (0);
    return righ;
  }

  public synchronized java.lang.String takeJourney() {
    java.lang.StringBuilder g;
    g = (new java.lang.StringBuilder());

    for (int reckon = 0; reckon < this.chancePhilatelicDocket.size(); reckon++) {
      g.append(this.chancePhilatelicDocket.get(reckon).obtainUrgingStagecoachAdvert());

      if (reckon < this.chancePhilatelicDocket.size() - 1) g.append("->");
    }
    return g.toString();
  }
}
