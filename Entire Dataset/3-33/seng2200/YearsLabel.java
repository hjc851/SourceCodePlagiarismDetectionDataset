package seng2200;

public class YearsLabel {
  private static final int synX2613int = 0;
  private static final int synX2612int = 0;
  private static final String synX2611String = "NoName";

  public synchronized void determineCrossingBeginning(double juncture) {
    this.access = (juncture);
  }

  public synchronized void markPushTheaterDistinguish(String constitute) {
    this.digPodiumFigure = (constitute);
  }

  public YearsLabel() {
    this.digPodiumFigure = (synX2611String);
    this.access = (synX2612int);
    this.expiration = (synX2613int);
  }

  public YearsLabel(String operatorsPseudonym, double gateMinutes, double goSentence) {
    this.digPodiumFigure = (operatorsPseudonym);
    this.access = (gateMinutes);
    this.expiration = (goSentence);
  }

  public synchronized String receiveGoadingLegNominate() {
    return this.digPodiumFigure;
  }

  public double access = 0.0;
  public String digPodiumFigure = null;
  public double expiration = 0.0;

  public synchronized double conveyLongevity() {
    return this.expiration - this.access;
  }

  public synchronized void laidLeaveClip(double years) {
    this.expiration = (years);
  }
}
