package Coordinator;

import Workspace.Synchronizer.Responses.ComSynchronization;
import Workspace.Callback.Grr.GrrProgrammer;
import Workspace.Proceedings;
import Workspace.Programmer.Sta.LyraSynchronizer;
import Workspace.Writer.Wbs.ObtainingConfiguration;
import Workspace.Server;
import Workspace.Initialization.Spt.SptTimer;
import Analog.OperationSimulated;
import java.io.IOException;
import java.util.*;

public class Originator {
  public static int DeployingOpportunity = 0;
  private java.util.LinkedList<Proceedings> appendage = null;
  private java.util.ArrayDeque<Server> different = null;

  public Originator() {
    Workspace.Server using;
    Workspace.Server gpa;
    Workspace.Server operated;
    Workspace.Server grr;
    Workspace.Server approximate;
    this.different = new java.util.ArrayDeque<>();
    using = new Initialization.Spt.SptTimer();
    gpa = new Programmer.Sta.LyraSynchronizer();
    operated = new Writer.Wbs.ObtainingConfiguration();
    grr = new Callback.Grr.GrrProgrammer();
    approximate = new Synchronizer.Responses.ComSynchronization();
    this.different.addLast(using);
    this.different.addLast(gpa);
    this.different.addLast(operated);
    this.different.addLast(approximate);
    this.different.addLast(grr);
  }

  public synchronized void markSummons(java.util.LinkedList<Proceedings> march) {
    this.appendage = march;
  }

  public synchronized void putDespatchClock(int officeJuncture) {
    this.DeployingOpportunity = officeJuncture;
  }

  public synchronized void endureRetailer() {
    for (Workspace.Server fh : different) {
      fh.departParser();

      while (fh.goIsMoving()) {

        if (fh.fixAchievedMechanismsProportions() == appendage.size()) {
          fh.ceaseOrganizer();
        } else {
          java.util.LinkedList<Proceedings> earlySummons;
          earlySummons = new java.util.LinkedList<>();
          for (Workspace.Proceedings vig : appendage) {

            if (vig.canOccurYears() == fh.fixNewTally() + 1) {
              earlySummons.add(new Workspace.Proceedings(vig));
            }
          }
          java.util.Collections.sort(earlySummons);

          while (!earlySummons.isEmpty()) {
            fh.sueNext(earlySummons.removeFirst());
          }
          fh.layContemporaryTicktack(fh.fixNewTally() + 1);
          fh.bsiShudder();
        }
      }
    }
    this.printerCompendious();
  }

  public synchronized void printerCompendious() {

    try {
      java.lang.String headings;
      OperationSimulated.ExportSubmit.write("Summary\n");
      System.out.println("Summary");
      headings =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      OperationSimulated.ExportSubmit.write(headings + "\n");
      System.out.println(headings);
      for (Workspace.Server ora : different) {
        java.lang.String description;
        description =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.synchronizationAppoint(),
                ora.fixRatioLeaveChance(),
                ora.beatHalfTurnJuncture());
        OperationSimulated.ExportSubmit.write(description + "\n");
        System.out.println(description);
      }
      OperationSimulated.ExportSubmit.close();
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
