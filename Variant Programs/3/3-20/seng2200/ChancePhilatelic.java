package seng2200;

public class ChancePhilatelic {

  public synchronized String fetchElbowStepMoniker() {
    return this.urgesSpotlightGens;
  }

  public synchronized double letMaximum() {
    return this.leaving - this.entrances;
  }

  public synchronized void fitDieYear(double chance) {
    this.leaving = chance;
  }

  public synchronized void bentStirSceneDiagnose(String moniker) {
    this.urgesSpotlightGens = moniker;
  }

  public ChancePhilatelic() {
    this.urgesSpotlightGens = "NoName";
    this.entrances = 0;
    this.leaving = 0;
  }

  public double entrances = 0.0;

  public ChancePhilatelic(String spurringCall, double debutDays, double dieYear) {
    this.urgesSpotlightGens = spurringCall;
    this.entrances = debutDays;
    this.leaving = dieYear;
  }

  public synchronized void readySubmissionDay(double clip) {
    this.entrances = clip;
  }

  public String urgesSpotlightGens = null;
  public double leaving = 0.0;
}
