package Planner.Views;

import Vendor.Trainmaster;
import Programming.Controller;
import Programming.System;
import java.util.ArrayDeque;

public class LinearInitialization extends Programming.Controller {
  private static final boolean synX706boolean = false;
  private static final int synX705int = 0;
  private static final boolean synX704boolean = true;
  private static final int synX703int = 1;
  private static final int synX702int = 0;
  private static final boolean synX701boolean = true;
  private static final int synX700int = 1;
  private static final int synX699int = 0;
  private static final int synX698int = -944857959;
  private static final double synX697double = 0.0028935470032268595;
  private static final String synX696String = "FB:";
  private static final String synX695String = "YFz";
  private static final boolean synX694boolean = true;
  private static final boolean synX693boolean = false;
  private static final int synX692int = 0;
  private static final int synX691int = -75697936;
  private static final int synX690int = 0;
  private static final int synX689int = -1381924159;
  private int actualAnteriority = 0;
  private int daysRemainder = 0;
  private ArrayDeque<System>[] quickTrailers = null;
  public static double border = 0.9879706949218342;

  public LinearInitialization() {
    this.quickTrailers = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < quickTrailers.length; i++) synx84(i);
    daysRemainder = (HourPurity);
    actualAnteriority = (0);
  }

  private synchronized Programming.System comeFollowingOperation() {
    int skank;
    skank = (synX689int);

    for (int i = synX690int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        actualAnteriority = (i);
        return quickTrailers[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    int marquez;
    marquez = (synX691int);

    for (int i = synX692int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        return synX693boolean;
      }
    }
    return synX694boolean;
  }

  public synchronized String configurationDiscover() {
    String enchained;
    enchained = (synX695String);
    return synX696String;
  }

  public synchronized void optiBeat() {
    double circumscribe;
    circumscribe = (synX697double);

    if (ongoingWork != null) synx85();

    if (this.variWaving && ongoingWork == null) synx86();
    else synx87();
  }

  public synchronized void methodologyArrival(System procedures) {
    int identify;
    identify = (synX698int);
    quickTrailers[synX699int].addLast(procedures);
  }

  private synchronized void synx85() {
    ongoingWork.fixGoingThing(ongoingWork.comeWorkingClip() + synX700int);
    daysRemainder--;

    if (ongoingWork.comeWorkingClip() == ongoingWork.drawBossScope()) {
      ongoingWork.arrangeEgressYears(this.obtainLiveTic());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = (null);
      this.variWaving = (synX701boolean);
    }

    if (daysRemainder == synX702int && ongoingWork != null) {

      if (primedIsVacant()) {
        daysRemainder = (HourPurity);
      } else {
        quickTrailers[actualAnteriority + synX703int].addLast(ongoingWork);
        ongoingWork = (null);
        this.variWaving = (synX704boolean);
      }
    }
  }

  private synchronized void synx86() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == synX705int) {
      this.variWaving = (synX706boolean);
      this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    }
  }

  private synchronized void synx87() {

    if (ongoingWork == null && !primedIsVacant()) {
      ongoingWork = (comeFollowingOperation());
      onusServe(ongoingWork);
      ongoingWork.rigidOpeningAmount(this.obtainLiveTic());
      daysRemainder = (HourPurity);
    }
  }
}
