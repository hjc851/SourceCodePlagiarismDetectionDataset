package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Appropriation {
  private static final int synX1958int = 0;
  private static final int synX1957int = 0;
  private static final int synX1956int = 0;
  private static final int synX1955int = 0;
  private static final String synX1954String = "->";
  private static final int synX1953int = 1;
  private static final int synX1952int = 0;

  public Appropriation() {
    this.entreeMoment = (0);
    this.withdrawBeginning = (0);
    this.daysMoldBlacklist = (new java.util.LinkedList<MeterEmboss>());
  }

  public double entreeMoment = 0.0;
  public java.util.List<MeterEmboss> daysMoldBlacklist = null;

  public synchronized java.lang.String arriveAvenue() {
    java.lang.StringBuilder mn = new java.lang.StringBuilder();
    {
      int charge = synX1952int;

      while (charge < this.daysMoldBlacklist.size()) {
        {
          {
            mn.append(this.daysMoldBlacklist.get(charge).findSpurPresentMention());

            if (charge < this.daysMoldBlacklist.size() - synX1953int) mn.append(synX1954String);
          }
        }
        charge++;
      }
    }
    return mn.toString();
  }

  public synchronized seng2200.MeterEmboss standbyMoldDays(java.lang.String qEpithet) {
    seng2200.MeterEmboss dhfr =
        new seng2200.MeterEmboss(qEpithet, this.entreeMoment, this.withdrawBeginning);
    this.entreeMoment = (synX1955int);
    this.withdrawBeginning = (synX1956int);
    return dhfr;
  }

  public double withdrawBeginning = 0.0;

  public synchronized void bossYear(java.lang.String stimulateCite) {
    this.daysMoldBlacklist.add(
        new seng2200.MeterEmboss(stimulateCite, this.entreeMoment, this.withdrawBeginning));
    this.entreeMoment = (synX1957int);
    this.withdrawBeginning = (synX1958int);
  }

  public synchronized void determinedDebutDays(double minutes) {
    this.entreeMoment = (minutes);
  }

  public synchronized void solidifyingLeavingJuncture(double years) {
    this.withdrawBeginning = (years);
  }
}
