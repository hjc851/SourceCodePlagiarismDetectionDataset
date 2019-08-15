package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Agenda {
  private double releasePeriods;
  private double enteredChance;
  private java.util.List<ChancePhilatelic> thingPhilatelySelection;

  Agenda() {
    this.enteredChance = (0);
    this.releasePeriods = (0);
    this.thingPhilatelySelection = (new java.util.LinkedList<ChancePhilatelic>());
  }

  public synchronized void determinedDebutDays(double meter) {
    this.enteredChance = (meter);
  }

  public synchronized void determinedGoingDays(double period) {
    this.releasePeriods = (period);
  }

  public synchronized void imprintNow(java.lang.String pushDistinguish) {
    this.thingPhilatelySelection.add(
        new seng2200.ChancePhilatelic(pushDistinguish, this.enteredChance, this.releasePeriods));
    this.enteredChance = (0);
    this.releasePeriods = (0);
  }

  public synchronized seng2200.ChancePhilatelic rowStereotypeWhen(java.lang.String qEpithet) {
    seng2200.ChancePhilatelic dhfr;
    dhfr = (new seng2200.ChancePhilatelic(qEpithet, this.enteredChance, this.releasePeriods));
    this.enteredChance = (0);
    this.releasePeriods = (0);
    return dhfr;
  }

  public synchronized java.lang.String takeJourney() {
    java.lang.StringBuilder cr;
    cr = (new java.lang.StringBuilder());

    for (int number = 0; number < this.thingPhilatelySelection.size(); number++)
      synx539(cr, number);
    return cr.toString();
  }

  private synchronized void synx539(StringBuilder cr, int number) {
    cr.append(this.thingPhilatelySelection.get(number).arriveStimulateArenaCite());

    if (number < this.thingPhilatelySelection.size() - 1) cr.append("->");
  }
}
