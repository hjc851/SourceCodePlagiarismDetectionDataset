package Database.Advice;

import Dealer.Exporter;
import Timer.Multitasking;
import Timer.Appendage;
import java.util.ArrayDeque;

public class NealOrganizer extends Timer.Multitasking {
  private static final boolean synX294boolean = false;
  private static final int synX293int = 0;
  private static final boolean synX292boolean = true;
  private static final int synX291int = 1;
  private static final int synX290int = 0;
  private static final boolean synX289boolean = true;
  private static final int synX288int = 1;
  private static final int synX287int = 0;
  private static final boolean synX286boolean = true;
  private static final boolean synX285boolean = false;
  private static final int synX284int = 0;
  private static final String synX283String = "FB:";
  private static final int synX282int = 0;
  private static final int synX281int = 0;
  private static final int synX280int = 6;
  private static final int synX279int = 0;
  private ArrayDeque<Appendage>[] fixExpectations;

  public synchronized void mechanismsArrive(Appendage phase) {
    fixExpectations[synX279int].addLast(phase);
  }

  public NealOrganizer() {
    this.fixExpectations = (new java.util.ArrayDeque[synX280int]);

    for (int i = synX281int; i < fixExpectations.length; i++) synx60(i);
    daysRemainder = (DaysQuantitative);
    actualAnteriority = (synX282int);
  }

  private int daysRemainder;

  public synchronized String workflowCite() {
    return synX283String;
  }

  private int actualAnteriority;

  private synchronized boolean primedIsVacant() {

    for (int i = synX284int; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        return synX285boolean;
      }
    }
    return synX286boolean;
  }

  public synchronized void bsiShudder() {

    if (contemporaryLitigate != null) synx61();

    if (this.burberryTire && contemporaryLitigate == null) synx62();
    else synx63();
  }

  private synchronized Timer.Appendage obtainLastOutgrowth() {

    for (int i = synX287int; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        actualAnteriority = (i);
        return fixExpectations[i].poll();
      }
    }
    return null;
  }

  private synchronized void synx60(int i) {
    fixExpectations[i] = (new java.util.ArrayDeque<>());
  }

  private synchronized void synx61() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.produceGushingNow() + synX288int);
    daysRemainder--;

    if (contemporaryLitigate.produceGushingNow() == contemporaryLitigate.startBizBreadth()) {
      contemporaryLitigate.fitDieYear(this.driveContinuingVibrate());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
      this.burberryTire = (synX289boolean);
    }

    if (daysRemainder == synX290int && contemporaryLitigate != null) {

      if (primedIsVacant()) {
        daysRemainder = (DaysQuantitative);
      } else {
        fixExpectations[actualAnteriority + synX291int].addLast(contemporaryLitigate);
        contemporaryLitigate = (null);
        this.burberryTire = (synX292boolean);
      }
    }
  }

  private synchronized void synx62() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX293int) {
      this.burberryTire = (synX294boolean);
      this.survivingMbeWeek = (Exporter.DeploymentMinutes);
    }
  }

  private synchronized void synx63() {

    if (contemporaryLitigate == null && !primedIsVacant()) {
      contemporaryLitigate = (obtainLastOutgrowth());
      unladenProceeding(contemporaryLitigate);
      contemporaryLitigate.putBeginClock(this.driveContinuingVibrate());
      daysRemainder = (DaysQuantitative);
    }
  }
}
