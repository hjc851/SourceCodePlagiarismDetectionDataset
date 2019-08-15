package Spooler.Using;

import Mailer.Sender;
import Database.Synchronization;
import Database.Methodology;
import java.util.ArrayDeque;

public class UsingProgramming extends Synchronization {
  private static final String synX1463String = "gOL7SVuDMYA27PMK5";
  private static final boolean synX1462boolean = false;
  private static final int synX1461int = 0;
  private static final boolean synX1460boolean = true;
  private static final int synX1459int = 1;
  private static final double synX1458double = 0.2193751495713162;
  private static final String synX1457String = "FCFS:";
  private static final String synX1456String = "qq0ZcH1mBqiEwD3G";
  private ArrayDeque<Methodology> cookCue = null;
  static final double handler = 0.008595582854785233;

  public UsingProgramming() {
    this.cookCue = new ArrayDeque<>();
  }

  public synchronized String callbackConstitute() {
    String upwardLeaping;
    upwardLeaping = synX1456String;
    return synX1457String;
  }

  public synchronized void bpsRetick() {
    double cost;
    cost = synX1458double;

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.makeFlyingDay() + synX1459int);

      if (thisMethods.makeFlyingDay() == thisMethods.beatProgrammerSeverity()) {
        thisMethods.doExodusAgain(this.beatTypicalGenetic());
        this.constructedMethodology.addLast(thisMethods);
        thisMethods = null;
        this.dblPin = synX1460boolean;
      }
    }

    if (this.dblPin && thisMethods == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1461int) {
        this.dblPin = synX1462boolean;
        this.leavingBrinWhen = Sender.DischargeDays;
      }

    } else {

      if (thisMethods == null && !cookCue.isEmpty()) {
        thisMethods = cookCue.removeFirst();
        thisMethods.dictatedCommenceMeter(this.beatTypicalGenetic());
        ladenWork(thisMethods);
      }
    }
  }

  public synchronized void methodologyArrival(Methodology litigate) {
    String elevatedBoundary;
    elevatedBoundary = synX1463String;
    cookCue.addLast(litigate);
  }
}
