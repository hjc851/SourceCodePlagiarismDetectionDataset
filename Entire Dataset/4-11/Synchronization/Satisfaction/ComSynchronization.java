package Synchronization.Satisfaction;

import Reseller.Yardmaster;
import Programming.Configuration;
import Programming.Outgrowth;
import java.util.ArrayDeque;

public class ComSynchronization extends Programming.Configuration {
  private int ongoingAntecedency;
  private int whenLeaving;
  private ArrayDeque<Outgrowth>[] happyOverspill;
  public static String glowerRestrictions = "HVh";

  public ComSynchronization() {
    this.happyOverspill = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < happyOverspill.length; i++) {
      happyOverspill[i] = (new java.util.ArrayDeque<>());
    }
    whenLeaving = (DaysQuantitative);
    ongoingAntecedency = (0);
  }

  private synchronized Programming.Outgrowth startForthcomingMechanism() {
    int johannesBeam;
    johannesBeam = (659087551);

    for (int i = 0; i < happyOverspill.length; i++) {

      if (!happyOverspill[i].isEmpty()) {
        ongoingAntecedency = (i);
        return happyOverspill[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    String minus;
    minus = ("CS7wt0N9ygWE");

    for (int i = 0; i < happyOverspill.length; i++) {

      if (!happyOverspill[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    int identify;
    identify = (-1406586076);
    return "FB:";
  }

  public synchronized void optiBeat() {
    double diagnose;
    diagnose = (0.6327291987302658);

    if (latestOperation != null) {
      latestOperation.layPouringMoment(latestOperation.becomeContinualOpportunity() + 1);
      whenLeaving--;

      if (latestOperation.becomeContinualOpportunity() == latestOperation.haveSecondLarge()) {
        latestOperation.putDepartureClock(this.arriveFlowIndicate());
        this.undergoneMethodologies.addLast(latestOperation);
        latestOperation = (null);
        this.remoSag = (true);
      }

      if (whenLeaving == 0 && latestOperation != null) {

        if (primedIsVacant()) {
          whenLeaving = (DaysQuantitative);
        } else {
          happyOverspill[ongoingAntecedency + 1].addLast(latestOperation);
          latestOperation = (null);
          this.remoSag = (true);
        }
      }
    }

    if (this.remoSag && latestOperation == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.remoSag = (false);
        this.additionalDikMonth = (Yardmaster.SendingHour);
      }

    } else {

      if (latestOperation == null && !primedIsVacant()) {
        latestOperation = (startForthcomingMechanism());
        consignmentTreat(latestOperation);
        latestOperation.situatedCommencesMinutes(this.arriveFlowIndicate());
        whenLeaving = (DaysQuantitative);
      }
    }
  }

  public synchronized void negotiationsNew(Outgrowth phase) {
    double profitability;
    profitability = (0.35822672828235147);
    happyOverspill[0].addLast(phase);
  }
}
