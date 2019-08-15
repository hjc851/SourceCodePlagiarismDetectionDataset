package Writer;

import Caller.Starter;
import Moot.ProceedingsKinematics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Callback {
  private static final String synX1707String = "\n";
  private static final String synX1706String = "%-7s%16d%19d";
  private static final String synX1705String = " to file.";
  private static final String synX1704String = "Unable to write ";
  private static final String synX1703String = "\n";
  private static final String synX1702String = ":";
  private static final String synX1701String = "T";
  private static final String synX1700String = "%-5s%3s";
  private static final String synX1699String = " to file.";
  private static final String synX1698String = "Unable to write ";
  private static final String synX1697String = "\n";
  private static final String synX1696String = "\n";
  private static final String synX1695String = "\n";
  private static final String synX1694String = " to file.";
  private static final String synX1693String = "Unable to write ";
  private static final String synX1692String = "\n";
  private static final String synX1691String = "\n";
  private static final String synX1690String = "Turnaround Time";
  private static final String synX1689String = "Waiting Time";
  private static final String synX1688String = "Process";
  private static final String synX1687String = "%-7s%16s%19s";
  private static final String synX1686String = "\n";
  private static final int synX1685int = 0;
  private static final boolean synX1684boolean = false;
  private static final boolean synX1683boolean = true;
  private int previousAnswer = 0;
  protected Writer.Negotiations contemporaryLitigate = null;
  public static final int MinutesEnormous = 4;
  protected int lingeringInedThing = 0;
  protected boolean dikTorch = false;
  protected int halfTurnJuncture = 0;
  protected int regularHopeAmount = 0;
  protected java.util.LinkedList<Negotiations> accomplishedProcedure = null;
  protected int withholdingJuncture = 0;
  protected int rollingJuncture = 0;
  protected boolean isMoving = false;

  public Callback() {
    this.isMoving = false;
    this.rollingJuncture = 0;
    this.withholdingJuncture = 0;
    this.regularHopeAmount = 0;
    this.halfTurnJuncture = 0;
    this.previousAnswer = -1;
    this.accomplishedProcedure = new java.util.LinkedList<>();
    this.dikTorch = true;
  }

  public synchronized void beginProgrammer() {
    this.isMoving = synX1683boolean;
    this.lingeringInedThing = Starter.RoutingWeek;
    this.bpsGo();
  }

  public synchronized void layoverConfiguration() {
    this.isMoving = synX1684boolean;
    this.publicationsFindings();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int fetchAttainedProcesVastness() {

    if (accomplishedProcedure.isEmpty()) {
      return synX1685int;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public synchronized int producePrevalentScore() {
    return previousAnswer;
  }

  public synchronized void markAfootDials(int liveTic) {
    this.previousAnswer = liveTic;
  }

  public synchronized double fixRatioLeaveChance() {
    return (double) this.regularHopeAmount / this.accomplishedProcedure.size();
  }

  public synchronized double canRateShiftYears() {
    return (double) this.halfTurnJuncture / this.accomplishedProcedure.size();
  }

  public synchronized void publicationsFindings() {

    try {
      java.lang.String chapeau;
      sort(accomplishedProcedure);
      ProceedingsKinematics.InputInitiate.write(synX1686String);
      out.println();
      chapeau = format(synX1687String, synX1688String, synX1689String, synX1690String);
      ProceedingsKinematics.InputInitiate.write(chapeau + synX1691String);
      out.println(chapeau);
      for (Writer.Negotiations postscript : accomplishedProcedure) synx340(postscript);
      ProceedingsKinematics.InputInitiate.write(synX1692String);
      out.println();
    } catch (java.io.IOException adult) {
      out.println(synX1693String + this.outlinerGens() + synX1694String);
    }
  }

  public synchronized void bpsGo() {

    try {
      ProceedingsKinematics.InputInitiate.write(synX1695String);
      out.println();
      ProceedingsKinematics.InputInitiate.write(
          synX1696String + this.outlinerGens() + synX1697String);
      out.println(this.outlinerGens());
    } catch (java.io.IOException appointed) {
      out.println(synX1698String + this.outlinerGens() + synX1699String);
    }
  }

  public synchronized void encumbranceSummons(Writer.Negotiations cern) {

    try {
      java.lang.String cycle;
      cycle =
          format(
              synX1700String,
              synX1701String + (this.producePrevalentScore()) + synX1702String,
              cern.produceMap());
      ProceedingsKinematics.InputInitiate.write(cycle + synX1703String);
      out.println(cycle);
    } catch (java.io.IOException abdul) {
      out.println(synX1704String + this.outlinerGens() + synX1705String);
    }
  }

  public abstract java.lang.String outlinerGens();

  public abstract void ourTicktack();

  public abstract void outgrowthSucceeding(Writer.Negotiations litigate);

  private synchronized void synx340(Negotiations postscript) {
    int awaitsBeginning;
    int goAboutClock;
    java.lang.String outgrowth;
    awaitsBeginning =
        postscript.findGoSentence()
            - postscript.goComeClock()
            - postscript.developDirectorStature();
    goAboutClock = postscript.findGoSentence() - postscript.goComeClock();
    this.regularHopeAmount += this.regularHopeAmount + awaitsBeginning;
    this.halfTurnJuncture += this.halfTurnJuncture + goAboutClock;
    outgrowth = format(synX1706String, postscript.produceMap(), awaitsBeginning, goAboutClock);
    ProceedingsKinematics.InputInitiate.write(outgrowth + synX1707String);
    out.println(outgrowth);
  }
}
