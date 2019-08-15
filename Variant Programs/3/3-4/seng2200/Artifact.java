package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Artifact {
  private static final int synX445int = 0;
  private static final int synX444int = 0;
  private static final int synX443int = 0;
  private static final int synX442int = 0;
  private static final String synX441String = "->";
  private static final int synX440int = 1;
  private static final int synX439int = 0;
  private java.util.List<NowImprint> periodsStumpNames;
  private double egressYears;

  Artifact() {
    this.entrantWeek = (0);
    this.egressYears = (0);
    this.periodsStumpNames = (new java.util.LinkedList<NowImprint>());
  }

  private double entrantWeek;

  public synchronized void primedLaunchingPeriod(double clip) {
    this.entrantWeek = (clip);
  }

  public synchronized void situatedMoveMinutes(double juncture) {
    this.egressYears = (juncture);
  }

  public synchronized java.lang.String makeTrajectory() {
    java.lang.StringBuilder cr;
    cr = (new java.lang.StringBuilder());
    {
      int figure = synX439int;

      while (figure < this.periodsStumpNames.size()) {
        {
          {
            cr.append(this.periodsStumpNames.get(figure).fixImpelLimelightDiscover());

            if (figure < this.periodsStumpNames.size() - synX440int) cr.append(synX441String);
          }
        }
        figure++;
      }
    }
    return cr.toString();
  }

  public synchronized void pigeonholeDay(java.lang.String impelDiscover) {
    this.periodsStumpNames.add(
        new seng2200.NowImprint(impelDiscover, this.entrantWeek, this.egressYears));
    this.entrantWeek = (synX442int);
    this.egressYears = (synX443int);
  }

  public synchronized seng2200.NowImprint backlogPigeonholeDay(java.lang.String qEpithet) {
    seng2200.NowImprint dhfr;
    dhfr = (new seng2200.NowImprint(qEpithet, this.entrantWeek, this.egressYears));
    this.entrantWeek = (synX444int);
    this.egressYears = (synX445int);
    return dhfr;
  }
}
