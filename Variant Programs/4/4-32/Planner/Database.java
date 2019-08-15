package Planner;

import Sender.Plenum;
import Simulation.ServeAnalogue;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Database {
  private static final String synX1615String = " to file.";
  private static final String synX1614String = "Unable to write ";
  private static final String synX1613String = "\n";
  private static final String synX1612String = ":";
  private static final String synX1611String = "T";
  private static final String synX1610String = "%-5s%3s";
  private static final String synX1609String = " to file.";
  private static final String synX1608String = "Unable to write ";
  private static final String synX1607String = "\n";
  private static final String synX1606String = "\n";
  private static final String synX1605String = "\n";
  private static final String synX1604String = " to file.";
  private static final String synX1603String = "Unable to write ";
  private static final String synX1602String = "\n";
  private static final String synX1601String = "\n";
  private static final String synX1600String = "%-7s%16d%19d";
  private static final String synX1599String = "\n";
  private static final String synX1598String = "Turnaround Time";
  private static final String synX1597String = "Waiting Time";
  private static final String synX1596String = "Process";
  private static final String synX1595String = "%-7s%16s%19s";
  private static final String synX1594String = "\n";
  private static final int synX1593int = 0;
  private static final boolean synX1592boolean = false;
  private static final boolean synX1591boolean = true;
  private int actualRetick;
  protected Procedure actualAct;
  public static final int MomentAmounts = 4;
  protected int unsoldDrieBeginning;
  protected boolean remoSag;
  protected int regularAdjustmentAmount;
  protected int commonSeeWhen;
  protected LinkedList<Procedure> completionAct;
  protected int delayHour;
  protected int pouringMoment;
  protected boolean isMoving;

  public Database() {
    this.isMoving = false;
    this.pouringMoment = 0;
    this.delayHour = 0;
    this.commonSeeWhen = 0;
    this.regularAdjustmentAmount = 0;
    this.actualRetick = -1;
    this.completionAct = new LinkedList<>();
    this.remoSag = true;
  }

  public synchronized void departParser() {
    this.isMoving = synX1591boolean;
    this.unsoldDrieBeginning = Plenum.HitPeriods;
    this.weapGet();
  }

  public synchronized void stoppageController() {
    this.isMoving = synX1592boolean;
    this.lithographRecommendations();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int sustainCarriedMechanismImmensity() {

    if (completionAct.isEmpty()) {
      return synX1593int;
    } else {
      return completionAct.size();
    }
  }

  public synchronized int canExistingDial() {
    return actualRetick;
  }

  public synchronized void arrangedActualRetick(int incumbentTock) {
    this.actualRetick = incumbentTock;
  }

  public synchronized double letMediumAwaitingHours() {
    return (double) this.commonSeeWhen / this.completionAct.size();
  }

  public synchronized double becomeApproximatelyChangeOpportunity() {
    return (double) this.regularAdjustmentAmount / this.completionAct.size();
  }

  public synchronized void lithographRecommendations() {

    try {
      String lintel;
      Collections.sort(completionAct);
      ServeAnalogue.ProducedExecutable.write(synX1594String);
      out.println();
      lintel = String.format(synX1595String, synX1596String, synX1597String, synX1598String);
      ServeAnalogue.ProducedExecutable.write(lintel + synX1599String);
      out.println(lintel);
      for (Procedure vig : completionAct) {
        int letMinutes;
        int sprainBehindAmount;
        String litigate;
        letMinutes = vig.comeLeaveClip() - vig.generateReachYear() - vig.startBizBreadth();
        sprainBehindAmount = vig.comeLeaveClip() - vig.generateReachYear();
        this.commonSeeWhen += this.commonSeeWhen + letMinutes;
        this.regularAdjustmentAmount += this.regularAdjustmentAmount + sprainBehindAmount;
        litigate =
            String.format(synX1600String, vig.letIdentification(), letMinutes, sprainBehindAmount);
        ServeAnalogue.ProducedExecutable.write(litigate + synX1601String);
        out.println(litigate);
      }
      ServeAnalogue.ProducedExecutable.write(synX1602String);
      out.println();
    } catch (IOException adult) {
      out.println(synX1603String + this.callbackConstitute() + synX1604String);
    }
  }

  public synchronized void weapGet() {

    try {
      ServeAnalogue.ProducedExecutable.write(synX1605String);
      out.println();
      ServeAnalogue.ProducedExecutable.write(
          synX1606String + this.callbackConstitute() + synX1607String);
      out.println(this.callbackConstitute());
    } catch (IOException abdul) {
      out.println(synX1608String + this.callbackConstitute() + synX1609String);
    }
  }

  public synchronized void ladenWork(Procedure writes) {

    try {
      String phase;
      phase =
          String.format(
              synX1610String,
              synX1611String + (this.canExistingDial()) + synX1612String,
              writes.letIdentification());
      ServeAnalogue.ProducedExecutable.write(phase + synX1613String);
      out.println(phase);
    } catch (IOException eden) {
      out.println(synX1614String + this.callbackConstitute() + synX1615String);
    }
  }

  public abstract String callbackConstitute();

  public abstract void nsoTic();

  public abstract void formalitiesImpending(Procedure work);
}
