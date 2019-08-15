package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Articles {
  private static final int synX3608int = 0;
  private static final int synX3607int = 0;
  private static final int synX3606int = 0;
  private static final int synX3605int = 0;
  private static final int synX3604int = 0;
  private static final int synX3603int = 0;
  private static final String synX3602String = "->";
  private static final int synX3601int = 1;
  private static final int synX3600int = 0;

  public synchronized java.lang.String makeTrajectory() {
    java.lang.StringBuilder cu;
    cu = new java.lang.StringBuilder();

    for (int numbers = synX3600int; numbers < this.minutesAffixAgenda.size(); numbers++) {
      cu.append(this.minutesAffixAgenda.get(numbers).sustainProductivityTheatricalForename());

      if (numbers < this.minutesAffixAgenda.size() - synX3601int) cu.append(synX3602String);
    }
    return cu.toString();
  }

  public double debutDays = 0.0;

  public synchronized void markIncomingHours(double chance) {
    this.debutDays = chance;
  }

  public synchronized void primedExpirationPeriod(double days) {
    this.lossMeter = days;
  }

  public java.util.List<HourPostal> minutesAffixAgenda = null;

  public synchronized void castHours(java.lang.String goadingNominate) {
    this.minutesAffixAgenda.add(
        new seng2200.HourPostal(goadingNominate, this.debutDays, this.lossMeter));
    this.debutDays = synX3603int;
    this.lossMeter = synX3604int;
  }

  public Articles() {
    this.debutDays = synX3605int;
    this.lossMeter = synX3606int;
    this.minutesAffixAgenda = new java.util.LinkedList<HourPostal>();
  }

  public synchronized seng2200.HourPostal penisBossYear(java.lang.String qEpithet) {
    seng2200.HourPostal dhfr;
    dhfr = new seng2200.HourPostal(qEpithet, this.debutDays, this.lossMeter);
    this.debutDays = synX3607int;
    this.lossMeter = synX3608int;
    return dhfr;
  }

  public double lossMeter = 0.0;
}
