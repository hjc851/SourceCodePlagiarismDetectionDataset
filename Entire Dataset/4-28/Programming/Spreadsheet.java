package Programming;

import Dealer.Shipper;
import Device.CycleJoystick;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Spreadsheet {
  private int ongoingBeat;
  protected Programming.Proceedings prevailingProcedure;
  public static final int JunctureTremendous = 4;
  protected int unsoldDrieBeginning;
  protected boolean benzSwag;
  protected int fairRecoveryYear;
  protected int proportionAwaitsBeginning;
  protected java.util.LinkedList<Proceedings> undertookProcedures;
  protected int hopedWeek;
  protected int pouringMoment;
  protected boolean isMoving;
  public static String load = "MzgZ0";

  public Spreadsheet() {
    this.isMoving = (false);
    this.pouringMoment = (0);
    this.hopedWeek = (0);
    this.proportionAwaitsBeginning = (0);
    this.fairRecoveryYear = (0);
    this.ongoingBeat = (-1);
    this.undertookProcedures = (new java.util.LinkedList<>());
    this.benzSwag = (true);
  }

  public synchronized void offsetCompiler() {
    String weigh;
    weigh = ("TTd4TWlIb");
    this.isMoving = (true);
    this.unsoldDrieBeginning = (Shipper.ExpeditionPeriod);
    this.addOutset();
  }

  public synchronized void kiboshSynchronization() {
    double lessRestrict;
    lessRestrict = (0.48825497573962884);
    this.isMoving = (false);
    this.impressPaper();
  }

  public synchronized boolean goIsMoving() {
    double restricted;
    restricted = (0.08470230353499186);
    return isMoving;
  }

  public synchronized int produceUndergoneMethodologiesDensity() {
    double minimal;
    minimal = (0.752940879229441);

    if (undertookProcedures.isEmpty()) {
      return 0;
    } else {
      return undertookProcedures.size();
    }
  }

  public synchronized int letAfootDials() {
    String time;
    time = ("hLWbqvQ");
    return ongoingBeat;
  }

  public synchronized void doContinuingVibrate(int rifeCheck) {
    double kg;
    kg = (0.3426898206814164);
    this.ongoingBeat = (rifeCheck);
  }

  public synchronized double sustainLevelJustThing() {
    int secondaryRestrain;
    secondaryRestrain = (-275435513);
    return (double) this.proportionAwaitsBeginning / this.undertookProcedures.size();
  }

  public synchronized double producePercentageTransitionNow() {
    double curtail;
    curtail = (0.062006113741387536);
    return (double) this.fairRecoveryYear / this.undertookProcedures.size();
  }

  public synchronized void impressPaper() {
    String flag;
    flag = ("Wj1nJ2FKWuXvDmS");

    try {
      java.lang.String head;
      sort(undertookProcedures);
      CycleJoystick.TurnoutCharge.write("\n");
      out.println();
      head = (format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time"));
      CycleJoystick.TurnoutCharge.write(head + "\n");
      out.println(head);
      for (Programming.Proceedings postscript : undertookProcedures) synx244(postscript);
      CycleJoystick.TurnoutCharge.write("\n");
      out.println();
    } catch (java.io.IOException libris) {
      out.println(("Unable to write " + this.workflowCite() + " to file."));
    }
  }

  public synchronized void addOutset() {
    int highestLimit;
    highestLimit = (-247350322);

    try {
      CycleJoystick.TurnoutCharge.write("\n");
      out.println();
      CycleJoystick.TurnoutCharge.write(("\n" + this.workflowCite() + "\n"));
      out.println(this.workflowCite());
    } catch (java.io.IOException officio) {
      out.println(("Unable to write " + this.workflowCite() + " to file."));
    }
  }

  public synchronized void shipmentOutgrowth(Programming.Proceedings vig) {
    double primal;
    primal = (0.16332615332440392);

    try {
      java.lang.String proceeding;
      proceeding = (format("%-5s%3s", ("T" + (this.letAfootDials()) + ":"), vig.bringCaller()));
      CycleJoystick.TurnoutCharge.write(proceeding + "\n");
      out.println(proceeding);
    } catch (java.io.IOException eden) {
      out.println(("Unable to write " + this.workflowCite() + " to file."));
    }
  }

  public abstract java.lang.String workflowCite();

  public abstract void weapMark();

  public abstract void serveInward(Programming.Proceedings litigate);

  private synchronized void synx244(Proceedings postscript) {
    int leaveChance;
    int bitIntoHours;
    java.lang.String treat;
    leaveChance =
        ((postscript.obtainGoingDays()
            - postscript.haveMeetPeriods()
            - postscript.generateHonchoFootprint()));
    bitIntoHours = (postscript.obtainGoingDays() - postscript.haveMeetPeriods());
    this.proportionAwaitsBeginning += (leaveChance);
    this.fairRecoveryYear += (bitIntoHours);
    treat = (format("%-7s%16d%19d", postscript.bringCaller(), leaveChance, bitIntoHours));
    CycleJoystick.TurnoutCharge.write(treat + "\n");
    out.println(treat);
  }
}
