package Organizer.Grr;

import Vendor.Trainmaster;
import Programming.Controller;
import Programming.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programming.Controller {
  private static final boolean synX720boolean = false;
  private static final int synX719int = 0;
  private static final boolean synX718boolean = true;
  private static final int synX717int = 1;
  private static final int synX716int = 2;
  private static final int synX715int = 0;
  private static final boolean synX714boolean = true;
  private static final int synX713int = 1;
  private static final double synX712double = 0.7646166135782408;
  private static final int synX711int = 1555857594;
  private static final String synX710String = "NRR:";
  private static final String synX709String = "pQ08ERMUCbRDAtSm3Ba";
  private Organizer.Grr.GrrProcedure grrProcedure = null;
  private int yearStill = 0;
  private java.util.ArrayDeque<GrrProcedure> ripeStandby = null;
  public static final double index = 0.3586973231978169;

  public GrrProgrammer() {
    this.ripeStandby = (new java.util.ArrayDeque<>());
    yearStill = (Programming.HourPurity);
  }

  public synchronized String configurationDiscover() {
    String enumeration;
    enumeration = (synX709String);
    return synX710String;
  }

  public synchronized void optiBeat() {
    int chthonianThreshold;
    chthonianThreshold = (synX711int);

    if (grrProcedure != null) synx88();

    if (this.variWaving && ongoingWork == null) synx89();
    else synx90();
  }

  public synchronized void methodologyArrival(System proceedings) {
    double figure;
    figure = (synX712double);
    ripeStandby.add(new Organizer.Grr.GrrProcedure(proceedings));
  }

  private synchronized void synx88() {
    grrProcedure.fixGoingThing(grrProcedure.comeWorkingClip() + synX713int);
    yearStill--;

    if (grrProcedure.comeWorkingClip() == grrProcedure.drawBossScope()) {
      grrProcedure.arrangeEgressYears(this.obtainLiveTic());
      this.undergoneMethodologies.addLast(grrProcedure);
      grrProcedure = (null);
      this.variWaving = (synX714boolean);
    }

    if (yearStill == synX715int && grrProcedure != null) {

      if (ripeStandby.isEmpty()) {
        yearStill = (grrProcedure.produceNowLevel());
      } else {

        if (grrProcedure.produceNowLevel() > synX716int) {
          grrProcedure.dictatedMeterMeasure(grrProcedure.produceNowLevel() - synX717int);
        }

        ripeStandby.addLast(grrProcedure);
        grrProcedure = (null);
        this.variWaving = (synX718boolean);
      }
    }
  }

  private synchronized void synx89() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == synX719int) {
      this.variWaving = (synX720boolean);
      this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    }
  }

  private synchronized void synx90() {

    if (grrProcedure == null && !ripeStandby.isEmpty()) {
      grrProcedure = (ripeStandby.removeFirst());
      onusServe(grrProcedure);
      grrProcedure.rigidOpeningAmount(this.obtainLiveTic());
      yearStill = (grrProcedure.produceNowLevel());
    }
  }
}
