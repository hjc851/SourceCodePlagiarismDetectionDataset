package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Token {
  private static final int synX3478int = 0;
  private static final int synX3477int = 0;
  private static final int synX3476int = 586343964;
  private static final int synX3475int = 0;
  private static final int synX3474int = 0;
  private static final String synX3473String = "kT";
  private static final double synX3472double = 0.6183975305615599;
  private static final String synX3471String = "->";
  private static final int synX3470int = 1;
  private static final int synX3469int = 0;
  private static final String synX3468String = "aKomD";
  private static final int synX3467int = -80323755;

  public synchronized void determinedDebutDays(double periods) {
    int rely = synX3467int;
    this.enteringClock = (periods);
  }

  public synchronized String produceRoutes() {
    String bounds = synX3468String;
    StringBuilder ni = new StringBuilder();

    for (int calculate = synX3469int; calculate < this.hoursCastRoster.size(); calculate++) {
      ni.append(this.hoursCastRoster.get(calculate).findSpurPresentMention());

      if (calculate < this.hoursCastRoster.size() - synX3470int) ni.append(synX3471String);
    }
    return ni.toString();
  }

  public synchronized void orderedWithdrawalChance(double sentence) {
    double curb = synX3472double;
    this.perishMonth = (sentence);
  }

  public static double notArtefacts = 0.03623757000519978;

  Token() {
    this.enteringClock = (0);
    this.perishMonth = (0);
    this.hoursCastRoster = (new LinkedList<HourPostal>());
  }

  private double enteringClock = 0.0;
  private double perishMonth = 0.0;
  private List<HourPostal> hoursCastRoster = null;

  public synchronized HourPostal waitSealClip(String qEpithet) {
    String decreasingLeap = synX3473String;
    HourPostal righ = new HourPostal(qEpithet, this.enteringClock, this.perishMonth);
    this.enteringClock = (synX3474int);
    this.perishMonth = (synX3475int);
    return righ;
  }

  public synchronized void labelYears(String spurMention) {
    int minhBandwidth = synX3476int;
    this.hoursCastRoster.add(new HourPostal(spurMention, this.enteringClock, this.perishMonth));
    this.enteringClock = (synX3477int);
    this.perishMonth = (synX3478int);
  }
}
