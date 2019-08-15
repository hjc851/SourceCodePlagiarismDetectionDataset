package Programmer.Grr;

import Mailer.Sender;
import Database.Synchronization;
import Database.Methodology;
import java.util.ArrayDeque;

public class GrrProgrammer extends Synchronization {
  private static final double synX1455double = 0.4997485709843721;
  private static final boolean synX1454boolean = false;
  private static final int synX1453int = 0;
  private static final boolean synX1452boolean = true;
  private static final int synX1451int = 1;
  private static final int synX1450int = 2;
  private static final int synX1449int = 0;
  private static final boolean synX1448boolean = true;
  private static final int synX1447int = 1;
  private static final int synX1446int = -520010311;
  private static final String synX1445String = "NRR:";
  private static final double synX1444double = 0.009867099041898308;
  private GrrProcedure grrProcedure = null;
  private int nowUnanswered = 0;
  private ArrayDeque<GrrProcedure> preparingReaper = null;
  static final String make = "8Z4N";

  public GrrProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
    nowUnanswered = Database.DaySum;
  }

  public synchronized String callbackConstitute() {
    double uppermostTied;
    uppermostTied = synX1444double;
    return synX1445String;
  }

  public synchronized void bpsRetick() {
    int identity;
    identity = synX1446int;

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.makeFlyingDay() + synX1447int);
      nowUnanswered--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.doExodusAgain(this.beatTypicalGenetic());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = synX1448boolean;
      }

      if (nowUnanswered == synX1449int && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          nowUnanswered = grrProcedure.findSentenceTeleportation();
        } else {

          if (grrProcedure.findSentenceTeleportation() > synX1450int) {
            grrProcedure.determinedDaysQuantitative(
                grrProcedure.findSentenceTeleportation() - synX1451int);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.dblPin = synX1452boolean;
        }
      }
    }

    if (this.dblPin && thisMethods == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1453int) {
        this.dblPin = synX1454boolean;
        this.leavingBrinWhen = Sender.DischargeDays;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.beatTypicalGenetic());
        nowUnanswered = grrProcedure.findSentenceTeleportation();
      }
    }
  }

  public synchronized void methodologyArrival(Methodology outgrowth) {
    double reducedLeaping;
    reducedLeaping = synX1455double;
    preparingReaper.add(new GrrProcedure(outgrowth));
  }
}
