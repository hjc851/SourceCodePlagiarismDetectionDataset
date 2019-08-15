package Outliner.Caboose;

import Vendor.Trainmaster;
import Programming.Controller;
import Programming.System;
import java.util.ArrayDeque;

public class StasConfiguration extends Programming.Controller {
  private static final boolean synX688boolean = false;
  private static final int synX687int = 0;
  private static final boolean synX686boolean = true;
  private static final int synX685int = 0;
  private static final boolean synX684boolean = true;
  private static final int synX683int = 1;
  private static final double synX682double = 0.6236409086383787;
  private static final String synX681String = "Hdfy4857a";
  private static final String synX680String = "RR:";
  private static final double synX679double = 0.15220747814493885;
  private int meterLeftover = 0;
  private java.util.ArrayDeque<System> eagerJunk = null;
  public static double flag = 0.4133835322057252;

  public StasConfiguration() {
    this.eagerJunk = (new java.util.ArrayDeque<>());
    meterLeftover = (HourPurity);
  }

  public synchronized String configurationDiscover() {
    double wide;
    wide = (synX679double);
    return synX680String;
  }

  public synchronized void optiBeat() {
    String minutes;
    minutes = (synX681String);

    if (ongoingWork != null) synx77();

    if (this.variWaving && ongoingWork == null) synx78();
    else synx79();
  }

  public synchronized void methodologyArrival(System work) {
    double mention;
    mention = (synX682double);
    eagerJunk.addLast(work);
  }

  private synchronized void synx77() {
    ongoingWork.fixGoingThing(ongoingWork.comeWorkingClip() + synX683int);
    meterLeftover--;

    if (ongoingWork.comeWorkingClip() == ongoingWork.drawBossScope()) {
      ongoingWork.arrangeEgressYears(this.obtainLiveTic());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = (null);
      this.variWaving = (synX684boolean);
    }

    if (meterLeftover == synX685int && ongoingWork != null) {

      if (eagerJunk.isEmpty()) {
        meterLeftover = (HourPurity);
      } else {
        eagerJunk.addLast(ongoingWork);
        ongoingWork = (null);
        this.variWaving = (synX686boolean);
      }
    }
  }

  private synchronized void synx78() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == synX687int) {
      this.variWaving = (synX688boolean);
      this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    }
  }

  private synchronized void synx79() {

    if (ongoingWork == null && !eagerJunk.isEmpty()) {
      ongoingWork = (eagerJunk.removeFirst());
      onusServe(ongoingWork);
      ongoingWork.rigidOpeningAmount(this.obtainLiveTic());
      meterLeftover = (HourPurity);
    }
  }
}
