package Synchronization;

import Yardmaster.Regulator;
import Impactor.MechanismMockup;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Timer {

  public abstract String plannerNominate();

  public abstract void workElect(Appendage work);

  public synchronized int receiveContemporaryTicktack() {
    return actualRetick;
  }

  public Timer() {
    this.isMoving = false;
    this.workingClip = 0;
    this.lagAgain = 0;
    this.levelJustThing = 0;
    this.fairRecoveryYear = 0;
    this.actualRetick = -1;
    this.undergoneMethodologies = new LinkedList<>();
    this.dblPin = true;
  }

  public synchronized void settledCirculatingShudder(int prevailingClick) {
    this.actualRetick = prevailingClick;
  }

  protected LinkedList<Appendage> undergoneMethodologies;
  private int actualRetick;
  protected int lagAgain;
  protected boolean dblPin;

  public synchronized double canRateQueueYears() {
    return (double) this.levelJustThing / this.undergoneMethodologies.size();
  }

  public synchronized int fixAchievedMechanismsProportions() {

    if (undergoneMethodologies.isEmpty()) {
      return 0;
    } else {
      return undergoneMethodologies.size();
    }
  }

  public static final int MomentAmounts = 4;
  protected int fairRecoveryYear;
  protected int latterSthMinutes;
  protected Appendage rifeSue;

  public synchronized void publicationAssessment() {

    try {
      sort(undergoneMethodologies);
      MechanismMockup.InputInitiate.write("\n");
      System.out.println();
      String title = format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MechanismMockup.InputInitiate.write(title + "\n");
      System.out.println(title);
      for (Appendage cern : undergoneMethodologies) synx412(cern);
      MechanismMockup.InputInitiate.write("\n");
      System.out.println();
    } catch (IOException post) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  public synchronized void freightMarch(Appendage postscript) {

    try {
      String formalities =
          format(
              "%-5s%3s",
              "T" + (this.receiveContemporaryTicktack()) + ":", postscript.driveSecurity());
      MechanismMockup.InputInitiate.write(formalities + "\n");
      System.out.println(formalities);
    } catch (IOException eden) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  protected int levelJustThing;

  public synchronized void addOutset() {

    try {
      MechanismMockup.InputInitiate.write("\n");
      System.out.println();
      MechanismMockup.InputInitiate.write("\n" + this.plannerNominate() + "\n");
      System.out.println(this.plannerNominate());
    } catch (IOException exwife) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  protected int workingClip;
  protected boolean isMoving;

  public abstract void addTock();

  public synchronized void beginsCallback() {
    this.isMoving = true;
    this.latterSthMinutes = Regulator.DispatchesHours;
    this.addOutset();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized void quitProgramming() {
    this.isMoving = false;
    this.publicationAssessment();
  }

  public synchronized double findNormReverseSentence() {
    return (double) this.fairRecoveryYear / this.undergoneMethodologies.size();
  }

  private synchronized void synx412(Appendage cern) {
    int stayAgain =
        cern.receivePassingMoment() - cern.developHappensHour() - cern.findImplementationSmall();
    int plowApproximatelySentence = cern.receivePassingMoment() - cern.developHappensHour();
    this.levelJustThing += stayAgain;
    this.fairRecoveryYear += plowApproximatelySentence;
    String proceeding =
        format("%-7s%16d%19d", cern.driveSecurity(), stayAgain, plowApproximatelySentence);
    MechanismMockup.InputInitiate.write(proceeding + "\n");
    System.out.println(proceeding);
  }
}
