package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Artifact {
  private static final int synX694int = 0;
  private static final int synX693int = 0;
  private static final int synX692int = 0;
  private static final int synX691int = 0;
  private static final int synX690int = 0;
  private static final int synX689int = 0;
  private static final int synX688int = 0;

  public synchronized seng2200.DayPigeonhole rowStereotypeWhen(java.lang.String qEpithet) {
    seng2200.DayPigeonhole righ;
    righ = (new seng2200.DayPigeonhole(qEpithet, this.entrywayPeriods, this.leaveClip));
    this.entrywayPeriods = (synX688int);
    this.leaveClip = (synX689int);
    return righ;
  }

  public double leaveClip = 0.0;

  public synchronized java.lang.String obtainPathways() {
    java.lang.StringBuilder ni;
    ni = (new java.lang.StringBuilder());
    {
      int indictment = synX690int;

      while (indictment < this.beginningEngravingListings.size()) {
        {
          synx159(ni, indictment);
        }
        indictment++;
      }
    }
    return ni.toString();
  }

  public synchronized void philatelicChance(java.lang.String goadingNominate) {
    this.beginningEngravingListings.add(
        new seng2200.DayPigeonhole(goadingNominate, this.entrywayPeriods, this.leaveClip));
    this.entrywayPeriods = (synX691int);
    this.leaveClip = (synX692int);
  }

  public synchronized void bentRegistrationHour(double when) {
    this.entrywayPeriods = (when);
  }

  public double entrywayPeriods = 0.0;

  public synchronized void placeEntranceWeek(double period) {
    this.leaveClip = (period);
  }

  public Artifact() {
    this.entrywayPeriods = (synX693int);
    this.leaveClip = (synX694int);
    this.beginningEngravingListings = (new java.util.LinkedList<DayPigeonhole>());
  }

  public java.util.List<DayPigeonhole> beginningEngravingListings = null;

  private synchronized void synx159(StringBuilder ni, int indictment) {
    ni.append(this.beginningEngravingListings.get(indictment).startFarmersPlaceSurname());

    if (indictment < this.beginningEngravingListings.size() - 1) ni.append("->");
  }
}
