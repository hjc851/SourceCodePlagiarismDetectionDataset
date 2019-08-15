package Planner;

import Shipper.Originator;
import Prototype.ProceduresMoot;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Initialization {
  public int prevailingClick = 0;
  public Planner.Methodology newSystem = null;
  public static final int SentenceTeleportation = 4;
  public int finalReckPeriod = 0;
  public boolean dikTorch = false;
  public int mediumReorganizationHours = 0;
  public int overallLetMinutes = 0;
  public java.util.LinkedList<Methodology> undertookProcedures = null;
  public int hopeChance = 0;
  public int gushingNow = 0;
  public boolean isMoving = false;
  static String weigh = "83ArqTEdc";

  public Initialization() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.hopeChance = 0;
    this.overallLetMinutes = 0;
    this.mediumReorganizationHours = 0;
    this.prevailingClick = -1;
    this.undertookProcedures = new java.util.LinkedList<>();
    this.dikTorch = true;
  }

  public synchronized void beginningOrganizer() {
    double upwardLeaping;
    upwardLeaping = 0.9147990450452881;
    this.isMoving = true;
    this.finalReckPeriod = Originator.DeploymentMinutes;
    this.snoBeginning();
  }

  public synchronized void ceaseOrganizer() {
    double universal;
    universal = 0.589235534227765;
    this.isMoving = false;
    this.catalogReview();
  }

  public synchronized boolean goIsMoving() {
    int critical;
    critical = -37030860;
    return isMoving;
  }

  public synchronized int beatInauguratedOperationsSeverity() {
    int maineAmount;
    maineAmount = 421498167;

    if (undertookProcedures.isEmpty()) {
      return 0;
    } else {
      return undertookProcedures.size();
    }
  }

  public synchronized int comeLatestTicktock() {
    double peak;
    peak = 0.5328674488124927;
    return prevailingClick;
  }

  public synchronized void fixedTheSelect(int typicalGenetic) {
    int amount;
    amount = -1051441494;
    this.prevailingClick = typicalGenetic;
  }

  public synchronized double catchCommonSeeWhen() {
    double isterWidening;
    isterWidening = 0.4257127648004675;
    return (double) this.overallLetMinutes / this.undertookProcedures.size();
  }

  public synchronized double obtainIntermediateImprovementDays() {
    int valuation;
    valuation = -99319156;
    return (double) this.mediumReorganizationHours / this.undertookProcedures.size();
  }

  public synchronized void catalogReview() {
    int designation;
    designation = -857898621;

    try {
      java.lang.String headlines;
      java.util.Collections.sort(undertookProcedures);
      ProceduresMoot.SupplyDocumentation.write("\n");
      out.println();
      headlines =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ProceduresMoot.SupplyDocumentation.write(headlines + "\n");
      out.println(headlines);
      for (Planner.Methodology postscript : undertookProcedures) {
        int postponementMoment;
        int sourAnywhereMonth;
        java.lang.String phase;
        postponementMoment =
            postscript.haveReleasePeriods()
                - postscript.driveAriseAgain()
                - postscript.letBigwigSmallness();
        sourAnywhereMonth = postscript.haveReleasePeriods() - postscript.driveAriseAgain();
        this.overallLetMinutes += postponementMoment;
        this.mediumReorganizationHours += sourAnywhereMonth;
        phase =
            java.lang.String.format(
                "%-7s%16d%19d", postscript.developPeg(), postponementMoment, sourAnywhereMonth);
        ProceduresMoot.SupplyDocumentation.write(phase + "\n");
        out.println(phase);
      }
      ProceduresMoot.SupplyDocumentation.write("\n");
      out.println();
    } catch (java.io.IOException voto) {
      out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void snoBeginning() {
    int deptSpan;
    deptSpan = 182960924;

    try {
      ProceduresMoot.SupplyDocumentation.write("\n");
      out.println();
      ProceduresMoot.SupplyDocumentation.write("\n" + this.workspaceForename() + "\n");
      out.println(this.workspaceForename());
    } catch (java.io.IOException post) {
      out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void burdensMethods(Planner.Methodology vig) {
    double limitThickness;
    limitThickness = 0.7970510489598758;

    try {
      java.lang.String treat;
      treat =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.comeLatestTicktock()) + ":", vig.developPeg());
      ProceduresMoot.SupplyDocumentation.write(treat + "\n");
      out.println(treat);
    } catch (java.io.IOException adoptee) {
      out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public abstract java.lang.String workspaceForename();

  public abstract void bsiShudder();

  public abstract void marchFuture(Planner.Methodology summons);
}
