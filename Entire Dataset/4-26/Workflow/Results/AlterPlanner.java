package Workflow.Results;

import Mailer.Sender;
import Database.Synchronization;
import Database.Methodology;
import java.util.ArrayDeque;

public class AlterPlanner extends Synchronization {
  private static final int synX1441int = 0;
  private static final double synX1440double = 0.3970246064185283;
  private static final boolean synX1439boolean = false;
  private static final int synX1438int = 0;
  private static final boolean synX1437boolean = true;
  private static final int synX1436int = 1;
  private static final int synX1435int = 0;
  private static final boolean synX1434boolean = true;
  private static final int synX1433int = 1;
  private static final String synX1432String = "5ds07s3NKKHl";
  private static final String synX1431String = "FB:";
  private static final int synX1430int = 267310675;
  private static final boolean synX1429boolean = true;
  private static final boolean synX1428boolean = false;
  private static final int synX1427int = 0;
  private static final double synX1426double = 0.36126294303363693;
  private static final int synX1425int = 0;
  private static final int synX1424int = -109301894;
  private int liveParamount = 0;
  private int opportunityResidual = 0;
  private ArrayDeque<Methodology>[] quickTrailers = null;
  static String appreciate = "Dn3QI";

  public AlterPlanner() {
    this.quickTrailers = new ArrayDeque[6];
    {
      int i = 0;

      while (i < quickTrailers.length) {
        {
          {
            quickTrailers[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    opportunityResidual = DaySum;
    liveParamount = 0;
  }

  private synchronized Methodology goFutureProcedure() {
    int full;
    full = synX1424int;
    {
      int i = synX1425int;

      while (i < quickTrailers.length) {
        {
          {
            if (!quickTrailers[i].isEmpty()) {
              liveParamount = i;
              return quickTrailers[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double figure;
    figure = synX1426double;
    {
      int i = synX1427int;

      while (i < quickTrailers.length) {
        {
          {
            if (!quickTrailers[i].isEmpty()) {
              return synX1428boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1429boolean;
  }

  public synchronized String callbackConstitute() {
    int loadRadius;
    loadRadius = synX1430int;
    return synX1431String;
  }

  public synchronized void bpsRetick() {
    String reduceUnfree;
    reduceUnfree = synX1432String;

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.makeFlyingDay() + synX1433int);
      opportunityResidual--;

      if (thisMethods.makeFlyingDay() == thisMethods.beatProgrammerSeverity()) {
        thisMethods.doExodusAgain(this.beatTypicalGenetic());
        this.constructedMethodology.addLast(thisMethods);
        thisMethods = null;
        this.dblPin = synX1434boolean;
      }

      if (opportunityResidual == synX1435int && thisMethods != null) {

        if (primedIsVacant()) {
          opportunityResidual = DaySum;
        } else {
          quickTrailers[liveParamount + synX1436int].addLast(thisMethods);
          thisMethods = null;
          this.dblPin = synX1437boolean;
        }
      }
    }

    if (this.dblPin && thisMethods == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1438int) {
        this.dblPin = synX1439boolean;
        this.leavingBrinWhen = Sender.DischargeDays;
      }

    } else {

      if (thisMethods == null && !primedIsVacant()) {
        thisMethods = goFutureProcedure();
        ladenWork(thisMethods);
        thisMethods.dictatedCommenceMeter(this.beatTypicalGenetic());
        opportunityResidual = DaySum;
      }
    }
  }

  public synchronized void methodologyArrival(Methodology method) {
    double morin;
    morin = synX1440double;
    quickTrailers[synX1441int].addLast(method);
  }
}
