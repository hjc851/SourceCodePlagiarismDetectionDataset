package Workflow;

import Yardmaster.Originator;
import Analogue.ServeAnalogue;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  public boolean isMoving;
  public int scamperingDays;
  public int delayHour;
  public LinkedList<Operation> conductedServe;
  public int ratioLeaveChance;
  public int levelSpikeThing;
  public boolean leviPennant;
  public int unexhaustedTelaMoment;
  public static final int AgainGiant = 4;
  public Operation newSystem;
  public int formerGene;

  public Workspace() {
    this.isMoving = false;
    this.scamperingDays = 0;
    this.delayHour = 0;
    this.ratioLeaveChance = 0;
    this.levelSpikeThing = 0;
    this.formerGene = -1;
    this.conductedServe = new LinkedList<>();
    this.leviPennant = true;
  }

  public synchronized void departParser() {
    this.isMoving = true;
    this.unexhaustedTelaMoment = Originator.DespatchClock;
    this.weapGet();
  }

  public synchronized void checkWorkflow() {
    this.isMoving = false;
    this.engravingResults();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int conveyFulfilledMethodNumber() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public synchronized int findActualRetick() {
    return formerGene;
  }

  public synchronized void readyIncumbentTock(int prevailingClick) {
    this.formerGene = prevailingClick;
  }

  public synchronized double driveRatesStayAgain() {
    return (double) this.ratioLeaveChance / this.conductedServe.size();
  }

  public synchronized double conveyRegularAdjustmentAmount() {
    return (double) this.levelSpikeThing / this.conductedServe.size();
  }

  public synchronized void engravingResults() {

    try {
      Collections.sort(conductedServe);
      ServeAnalogue.TurnoutCharge.write("\n");
      System.out.println();
      String chaired = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ServeAnalogue.TurnoutCharge.write(chaired + "\n");
      System.out.println(chaired);
      for (Operation cern : conductedServe) {
        int deferPeriods =
            cern.haveReleasePeriods() - cern.fetchTakeBeginning() - cern.fetchManagerVastness();
        int twistAcrossDay = cern.haveReleasePeriods() - cern.fetchTakeBeginning();
        this.ratioLeaveChance += this.ratioLeaveChance + deferPeriods;
        this.levelSpikeThing += this.levelSpikeThing + twistAcrossDay;
        String method =
            String.format("%-7s%16d%19d", cern.takeFinger(), deferPeriods, twistAcrossDay);
        ServeAnalogue.TurnoutCharge.write(method + "\n");
        System.out.println(method);
      }
      ServeAnalogue.TurnoutCharge.write("\n");
      System.out.println();
    } catch (IOException officio) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public synchronized void weapGet() {

    try {
      ServeAnalogue.TurnoutCharge.write("\n");
      System.out.println();
      ServeAnalogue.TurnoutCharge.write("\n" + this.organizerList() + "\n");
      System.out.println(this.organizerList());
    } catch (IOException eden) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public synchronized void consignmentTreat(Operation writes) {

    try {
      String outgrowth =
          String.format("%-5s%3s", "T" + (this.findActualRetick()) + ":", writes.takeFinger());
      ServeAnalogue.TurnoutCharge.write(outgrowth + "\n");
      System.out.println(outgrowth);
    } catch (IOException aba) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public abstract String organizerList();

  public abstract void nbsClick();

  public abstract void phaseEntry(Operation methods);
}
