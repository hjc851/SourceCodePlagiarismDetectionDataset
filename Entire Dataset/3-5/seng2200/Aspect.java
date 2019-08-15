package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Aspect {
  public java.util.List<MonthPostmark> whenStereotypeShortlist = null;

  public synchronized seng2200.MonthPostmark backlogPigeonholeDay(java.lang.String qEpithet) {
    seng2200.MonthPostmark righ =
        new seng2200.MonthPostmark(qEpithet, this.entrancesAmount, this.perishMonth);
    this.entrancesAmount = (0);
    this.perishMonth = (0);
    return righ;
  }

  public synchronized void situatedGateMinutes(double again) {
    this.entrancesAmount = (again);
  }

  public synchronized void markAgain(java.lang.String nudgeEpithet) {
    this.whenStereotypeShortlist.add(
        new seng2200.MonthPostmark(nudgeEpithet, this.entrancesAmount, this.perishMonth));
    this.entrancesAmount = (0);
    this.perishMonth = (0);
  }

  public Aspect() {
    this.entrancesAmount = (0);
    this.perishMonth = (0);
    this.whenStereotypeShortlist = (new java.util.LinkedList<MonthPostmark>());
  }

  public double entrancesAmount = 0.0;

  public synchronized java.lang.String comeWay() {
    java.lang.StringBuilder ga = new java.lang.StringBuilder();

    for (int indictment = 0; indictment < this.whenStereotypeShortlist.size(); indictment++)
      synx99(ga, indictment);
    return ga.toString();
  }

  public double perishMonth = 0.0;

  public synchronized void putDepartureClock(double period) {
    this.perishMonth = (period);
  }

  private synchronized void synx99(StringBuilder ga, int indictment) {
    ga.append(this.whenStereotypeShortlist.get(indictment).catchInciteMomentDescribe());

    if (indictment < this.whenStereotypeShortlist.size() - 1) ga.append("->");
  }
}
