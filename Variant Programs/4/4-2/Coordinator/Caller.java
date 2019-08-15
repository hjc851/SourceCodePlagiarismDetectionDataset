package Coordinator;

import Server.Organizer.Submissions.ApDeveloper;
import Server.Programming.Grr.GrrProgrammer;
import Server.Procedure;
import Server.Spreadsheet.Etd.StaOutliner;
import Server.Configuration.Defined.MrcOrganizer;
import Server.Workspace;
import Server.Controller.Spt.LampsProgrammer;
import Analogue.MarchDevice;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Caller {

  public Caller() {
    Workspace spt;
    Workspace xing;
    Workspace trb;
    Workspace grr;
    Workspace tm;
    this.managers = (new ArrayDeque<>());
    spt = (new LampsProgrammer());
    xing = (new StaOutliner());
    trb = (new MrcOrganizer());
    grr = (new GrrProgrammer());
    tm = (new ApDeveloper());
    this.managers.addLast(spt);
    this.managers.addLast(xing);
    this.managers.addLast(trb);
    this.managers.addLast(tm);
    this.managers.addLast(grr);
  }

  public synchronized void readyRemoveDay(int murderWhen) {
    this.AssignThing = (murderWhen);
  }

  public static int AssignThing = 0;

  public synchronized void putProcedure(LinkedList<Procedure> operations) {
    this.practices = (operations);
  }

  private ArrayDeque<Workspace> managers = null;
  private LinkedList<Procedure> practices = null;

  public synchronized void newspaperAnalysis() {

    try {
      String banner;
      MarchDevice.PerformanceArchives.write("Summary\n");
      System.out.println("Summary");
      banner =
          (format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time"));
      MarchDevice.PerformanceArchives.write(banner + "\n");
      System.out.println(banner);
      for (Workspace fh : managers) {
        String compact;
        compact =
            (format(
                "%-9s%23.2f%26.2f",
                fh.plannerNominate(), fh.generateFairPostponeYear(), fh.canRateShiftYears()));
        MarchDevice.PerformanceArchives.write(compact + "\n");
        System.out.println(compact);
      }
      MarchDevice.PerformanceArchives.close();
    } catch (IOException abbe) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void tallyConsignor() {
    for (Workspace waffen : managers) {
      waffen.openingInitialization();

      while (waffen.goIsMoving()) {

        if (waffen.letImplementedSummonsSmallness() == practices.size()) {
          waffen.occlusionDebugging();
        } else {
          LinkedList<Procedure> firstSystems;
          firstSystems = (new LinkedList<>());
          for (Procedure writes : practices) {

            if (writes.fixHappenChance() == waffen.driveContinuingVibrate() + 1) {
              firstSystems.add(new Procedure(writes));
            }
          }
          sort(firstSystems);

          while (!firstSystems.isEmpty()) {
            waffen.proceedingOutbound(firstSystems.removeFirst());
          }
          waffen.determinedLiveTic(waffen.driveContinuingVibrate() + 1);
          waffen.weapMark();
        }
      }
    }
    this.newspaperAnalysis();
  }
}
