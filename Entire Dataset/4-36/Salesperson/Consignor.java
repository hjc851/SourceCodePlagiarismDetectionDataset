package Salesperson;

import Outliner.Developer.Submissions.FiaMultitasking;
import Outliner.Organizer.Grr.GrrProgrammer;
import Outliner.Formalities;
import Outliner.Spooler.Lyra.OximeWorkflow;
import Outliner.Workflow.Increasing.DesiredSpreadsheet;
import Outliner.Database;
import Outliner.Programmer.Paps.UsingProgramming;
import Simulating.WorkSimulating;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Consignor {
  public java.util.ArrayDeque<Database> managers = null;
  public java.util.LinkedList<Formalities> treat = null;
  public static int SentYears = 0;

  public Consignor() {
    this.managers = (new java.util.ArrayDeque<>());
    Outliner.Database paps = new Programmer.Paps.UsingProgramming();
    Outliner.Database b = new Spooler.Lyra.OximeWorkflow();
    Outliner.Database wbs = new Workflow.Increasing.DesiredSpreadsheet();
    Outliner.Database grr = new Organizer.Grr.GrrProgrammer();
    Outliner.Database bs = new Developer.Submissions.FiaMultitasking();
    this.managers.addLast(paps);
    this.managers.addLast(b);
    this.managers.addLast(wbs);
    this.managers.addLast(bs);
    this.managers.addLast(grr);
  }

  public synchronized void settledServe(java.util.LinkedList<Formalities> methodologies) {
    this.treat = (methodologies);
  }

  public synchronized void determineDetachmentBeginning(int dispatchesHours) {
    this.SentYears = (dispatchesHours);
  }

  public synchronized void bleedOriginator() {
    for (Outliner.Database fh : managers) {
      fh.kickoffSpooler();

      while (fh.goIsMoving()) {

        if (fh.comeConsummatedOperationLarger() == treat.size()) {
          fh.occlusiveInitialization();
        } else {
          java.util.LinkedList<Formalities> headingMethodologies = new java.util.LinkedList<>();
          for (Outliner.Formalities cern : treat) {

            if (cern.sustainHearThing() == fh.developPreviousAnswer() + 1) {
              headingMethodologies.add(new Outliner.Formalities(cern));
            }
          }
          java.util.Collections.sort(headingMethodologies);

          while (!headingMethodologies.isEmpty()) {
            fh.proceduresIngress(headingMethodologies.removeFirst());
          }
          fh.putPrevailingClick(fh.developPreviousAnswer() + 1);
          fh.bsiShudder();
        }
      }
    }
    this.typescriptDescription();
  }

  public synchronized void typescriptDescription() {

    try {
      WorkSimulating.SupplyDocumentation.write("Summary\n");
      out.println("Summary");
      java.lang.String lintel =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      WorkSimulating.SupplyDocumentation.write(lintel + "\n");
      out.println(lintel);
      for (Outliner.Database ora : managers) {
        java.lang.String excerpts =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.interfaceCall(),
                ora.obtainIntermediateBideDays(),
                ora.startOverallDownturnMinutes());
        WorkSimulating.SupplyDocumentation.write(excerpts + "\n");
        out.println(excerpts);
      }
      WorkSimulating.SupplyDocumentation.close();
    } catch (java.io.IOException pro) {
      out.println("Unable to write summary to file.");
    }
  }
}
