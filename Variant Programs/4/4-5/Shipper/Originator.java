package Shipper;

import Planner.Debugging.Opinion.ConWorkflow;
import Planner.Programmer.Grr.GrrProgrammer;
import Planner.Methodology;
import Planner.Interface.A.StaOutliner;
import Planner.Debugging.Tribunal.TrsDeveloper;
import Planner.Initialization;
import Planner.Organizer.Using.UsingProgramming;
import Prototype.ProceduresMoot;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Originator {
  public static int DeploymentMinutes = 0;
  public java.util.LinkedList<Methodology> methodology = null;
  public java.util.ArrayDeque<Initialization> design = null;
  static final double greaterConstrain = 0.48616643734750675;

  public Originator() {
    Planner.Initialization degenerates;
    Planner.Initialization gpa;
    Planner.Initialization wbs;
    Planner.Initialization grr;
    Planner.Initialization con;
    this.design = new java.util.ArrayDeque<>();
    degenerates = new Organizer.Using.UsingProgramming();
    gpa = new Interface.A.StaOutliner();
    wbs = new Debugging.Tribunal.TrsDeveloper();
    grr = new Programmer.Grr.GrrProgrammer();
    con = new Debugging.Opinion.ConWorkflow();
    this.design.addLast(degenerates);
    this.design.addLast(gpa);
    this.design.addLast(wbs);
    this.design.addLast(con);
    this.design.addLast(grr);
  }

  public synchronized void dictatedWork(java.util.LinkedList<Methodology> techniques) {
    String curve;
    curve = "hp3B5jHx34X";
    this.methodology = techniques;
  }

  public synchronized void determineDetachmentBeginning(int murderWhen) {
    int number;
    number = -1389350151;
    this.DeploymentMinutes = murderWhen;
  }

  public synchronized void goTrainmaster() {
    int elevationIndentured;
    elevationIndentured = -667076672;
    for (Planner.Initialization ora : design) {
      ora.beginningOrganizer();

      while (ora.goIsMoving()) {

        if (ora.beatInauguratedOperationsSeverity() == methodology.size()) {
          ora.ceaseOrganizer();
        } else {
          java.util.LinkedList<Methodology> opensMechanisms;
          opensMechanisms = new java.util.LinkedList<>();
          for (Planner.Methodology writes : methodology) {

            if (writes.driveAriseAgain() == ora.comeLatestTicktock() + 1) {
              opensMechanisms.add(new Planner.Methodology(writes));
            }
          }
          java.util.Collections.sort(opensMechanisms);

          while (!opensMechanisms.isEmpty()) {
            ora.marchFuture(opensMechanisms.removeFirst());
          }
          ora.fixedTheSelect(ora.comeLatestTicktock() + 1);
          ora.bsiShudder();
        }
      }
    }
    this.publicationsOverview();
  }

  public synchronized void publicationsOverview() {
    double johannesBeam;
    johannesBeam = 0.04630676912816134;

    try {
      java.lang.String banner;
      ProceduresMoot.SupplyDocumentation.write("Summary\n");
      out.println("Summary");
      banner =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceduresMoot.SupplyDocumentation.write(banner + "\n");
      out.println(banner);
      for (Planner.Initialization waffen : design) {
        java.lang.String outline;
        outline =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.workspaceForename(),
                waffen.catchCommonSeeWhen(),
                waffen.obtainIntermediateImprovementDays());
        ProceduresMoot.SupplyDocumentation.write(outline + "\n");
        out.println(outline);
      }
      ProceduresMoot.SupplyDocumentation.close();
    } catch (java.io.IOException late) {
      out.println("Unable to write summary to file.");
    }
  }
}
