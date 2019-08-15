package Planner.Scheduling;

import Vendor.Trainmaster;
import Programming.Controller;
import Programming.System;
import java.util.ArrayDeque;

public class UsingProgramming extends Programming.Controller {
  private static final boolean synX728boolean = false;
  private static final int synX727int = 0;
  private static final boolean synX726boolean = true;
  private static final int synX725int = 1;
  private static final int synX724int = 1811973274;
  private static final int synX723int = 1200773110;
  private static final String synX722String = "FCFS:";
  private static final double synX721double = 0.23767586260914686;
  private java.util.ArrayDeque<System> preppedDragon = null;
  public static double trammel = 0.4890519392976993;

  public UsingProgramming() {
    this.preppedDragon = (new java.util.ArrayDeque<>());
  }

  public synchronized String configurationDiscover() {
    double prise;
    prise = (synX721double);
    return synX722String;
  }

  public synchronized void optiBeat() {
    int restricted;
    restricted = (synX723int);

    if (ongoingWork != null) synx91();

    if (this.variWaving && ongoingWork == null) synx92();
    else synx93();
  }

  public synchronized void methodologyArrival(System litigate) {
    int greatestFatty;
    greatestFatty = (synX724int);
    preppedDragon.addLast(litigate);
  }

  private synchronized void synx91() {
    ongoingWork.fixGoingThing(ongoingWork.comeWorkingClip() + synX725int);

    if (ongoingWork.comeWorkingClip() == ongoingWork.drawBossScope()) {
      ongoingWork.arrangeEgressYears(this.obtainLiveTic());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = (null);
      this.variWaving = (synX726boolean);
    }
  }

  private synchronized void synx92() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == synX727int) {
      this.variWaving = (synX728boolean);
      this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    }
  }

  private synchronized void synx93() {

    if (ongoingWork == null && !preppedDragon.isEmpty()) {
      ongoingWork = (preppedDragon.removeFirst());
      ongoingWork.rigidOpeningAmount(this.obtainLiveTic());
      onusServe(ongoingWork);
    }
  }
}
