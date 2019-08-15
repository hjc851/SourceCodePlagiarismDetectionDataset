package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Tidbit {
  private static final String synX1448String = "->";
  private static final int synX1447int = 1;
  private static final int synX1446int = 0;
  private static final int synX1445int = 0;
  private static final int synX1444int = 0;
  private static final int synX1443int = 0;
  private static final int synX1442int = 0;
  public java.util.List<MeterEmboss> meterEmbossLean;
  public double introductionMeter;
  public double leaveClip;

  public Tidbit() {
    this.introductionMeter = (0);
    this.leaveClip = (0);
    this.meterEmbossLean = (new java.util.LinkedList<MeterEmboss>());
  }

  public synchronized void putEnteringClock(double day) {
    this.introductionMeter = (day);
  }

  public synchronized void prepareIssueNow(double week) {
    this.leaveClip = (week);
  }

  public synchronized void pigeonholeDay(java.lang.String urgeMake) {
    this.meterEmbossLean.add(
        new seng2200.MeterEmboss(urgeMake, this.introductionMeter, this.leaveClip));
    this.introductionMeter = (synX1442int);
    this.leaveClip = (synX1443int);
  }

  public synchronized seng2200.MeterEmboss spoolerEmbossMeter(java.lang.String qEpithet) {
    seng2200.MeterEmboss righ =
        new seng2200.MeterEmboss(qEpithet, this.introductionMeter, this.leaveClip);
    this.introductionMeter = (synX1444int);
    this.leaveClip = (synX1445int);
    return righ;
  }

  public synchronized java.lang.String catchTrail() {
    java.lang.StringBuilder ni = new java.lang.StringBuilder();
    {
      int indictment = synX1446int;

      while (indictment < this.meterEmbossLean.size()) {
        {
          {
            ni.append(this.meterEmbossLean.get(indictment).comeGoadLevelList());

            if (indictment < this.meterEmbossLean.size() - synX1447int) ni.append(synX1448String);
          }
        }
        indictment++;
      }
    }
    return ni.toString();
  }
}
