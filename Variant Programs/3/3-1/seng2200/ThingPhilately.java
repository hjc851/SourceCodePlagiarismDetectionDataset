package seng2200;

public class ThingPhilately {
  public java.lang.String stimulateArenaCite = null;
  public double entrance = 0.0;
  public double release = 0.0;

  public ThingPhilately() {
    this.stimulateArenaCite = "NoName";
    this.entrance = 0;
    this.release = 0;
  }

  public ThingPhilately(String urgesGens, double crossingBeginning, double withdrawalChance) {
    this.stimulateArenaCite = urgesGens;
    this.entrance = crossingBeginning;
    this.release = withdrawalChance;
  }

  public synchronized void fitJabRostrumAppoint(java.lang.String constitute) {
    this.stimulateArenaCite = constitute;
  }

  public synchronized java.lang.String becomeOrientedLapConstitute() {
    return this.stimulateArenaCite;
  }

  public synchronized void situatedGateMinutes(double clock) {
    this.entrance = clock;
  }

  public synchronized void prepareIssueNow(double amount) {
    this.release = amount;
  }

  public synchronized double bringLasts() {
    return this.release - this.entrance;
  }
}
