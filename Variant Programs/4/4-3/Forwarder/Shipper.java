package Forwarder;

import Server.Debugging.Submissions.ApDeveloper;
import Server.Writer.Grr.GrrProgrammer;
import Server.Mechanisms;
import Server.Programmer.Erie.CabooseOrganizer;
import Server.Parser.Trb.WbsWriter;
import Server.Database;
import Server.Synchronization.Lamps.LampsProgrammer;
import Joystick.PhaseSimulations;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Shipper {
  public static int DeployingOpportunity = 0;
  private java.util.LinkedList<Mechanisms> litigate = null;
  private java.util.ArrayDeque<Database> local = null;

  public Shipper() {
    Server.Database using;
    Server.Database ac;
    Server.Database grt;
    Server.Database grr;
    Server.Database dc;
    this.local = new java.util.ArrayDeque<>();
    using = new Synchronization.Lamps.LampsProgrammer();
    ac = new Programmer.Erie.CabooseOrganizer();
    grt = new Parser.Trb.WbsWriter();
    grr = new Writer.Grr.GrrProgrammer();
    dc = new Debugging.Submissions.ApDeveloper();
    this.local.addLast(using);
    this.local.addLast(ac);
    this.local.addLast(grt);
    this.local.addLast(dc);
    this.local.addLast(grr);
  }

  public synchronized void doTechniques(java.util.LinkedList<Mechanisms> operation) {
    this.litigate = operation;
  }

  public synchronized void fixedDeployingOpportunity(int forwardingAgain) {
    this.DeployingOpportunity = forwardingAgain;
  }

  public synchronized void moveSender() {
    for (Server.Database waffen : local) {
      waffen.jumpSynchronizer();

      while (waffen.goIsMoving()) {

        if (waffen.developSubmittedTechnologiesStature() == litigate.size()) {
          waffen.haltProgrammer();
        } else {
          java.util.LinkedList<Mechanisms> beganAppendage;
          beganAppendage = new java.util.LinkedList<>();
          for (Server.Mechanisms vig : litigate) {

            if (vig.haveMeetPeriods() == waffen.takeTopicalMark() + 1) {
              beganAppendage.add(new Server.Mechanisms(vig));
            }
          }
          sort(beganAppendage);

          while (!beganAppendage.isEmpty()) {
            waffen.methodsElected(beganAppendage.removeFirst());
          }
          waffen.putPrevailingClick(waffen.takeTopicalMark() + 1);
          waffen.optiBeat();
        }
      }
    }
    this.reprintSummarizing();
  }

  public synchronized void reprintSummarizing() {

    try {
      java.lang.String heading;
      PhaseSimulations.ProductivityDocuments.write("Summary\n");
      out.println("Summary");
      heading =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.ProductivityDocuments.write(heading + "\n");
      out.println(heading);
      for (Server.Database fh : local) {
        java.lang.String description;
        description =
            format(
                "%-9s%23.2f%26.2f",
                fh.databaseNickname(), fh.goMedianAwaitClock(), fh.bringMiddlingTurnaboutMeter());
        PhaseSimulations.ProductivityDocuments.write(description + "\n");
        out.println(description);
      }
      PhaseSimulations.ProductivityDocuments.close();
    } catch (java.io.IOException voto) {
      out.println("Unable to write summary to file.");
    }
  }
}
