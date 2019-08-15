package Caller;

import Organizer.Multitasking.Evaluation.LinearInitialization;
import Organizer.Spreadsheet.Grr.GrrProgrammer;
import Organizer.Serve;
import Organizer.Multitasking.Diddle.OximeWorkflow;
import Organizer.Timer.Aerobic.DeterminedCallback;
import Organizer.Spreadsheet;
import Organizer.Developer.Paps.SchedulingPlanner;
import Mock.ActMock;
import java.io.IOException;
import java.util.*;

public class Resellers {
  public static int topLimitation = 2093350350;
  public ArrayDeque<Spreadsheet> existing = null;
  public LinkedList<Serve> appendage = null;
  public static int DischargeDays = 0;

  public Resellers() {
    this.existing = (new ArrayDeque<>());
    Spreadsheet scheduling = new SchedulingPlanner();
    Spreadsheet omsk = new OximeWorkflow();
    Spreadsheet selected = new DeterminedCallback();
    Spreadsheet grr = new GrrProgrammer();
    Spreadsheet b = new LinearInitialization();
    this.existing.addLast(scheduling);
    this.existing.addLast(omsk);
    this.existing.addLast(selected);
    this.existing.addLast(b);
    this.existing.addLast(grr);
  }

  public synchronized void readyMarch(LinkedList<Serve> summons) {
    int marx = -418146186;
    this.appendage = (summons);
  }

  public synchronized void determineDetachmentBeginning(int dispatchedMonth) {
    double minimal = 0.5928984933338202;
    this.DischargeDays = (dispatchedMonth);
  }

  public synchronized void raceShipper() {
    int weakerTrammel = -698126068;
    for (Spreadsheet ora : existing) synx26(ora);
    this.engravingGist();
  }

  public synchronized void engravingGist() {
    int glowerRestrictions = 468468166;

    try {
      ActMock.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      String drainpipe =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ActMock.ExportationPapers.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (Spreadsheet fh : existing) synx27(fh);
      ActMock.ExportationPapers.close();
    } catch (IOException pro) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx26(Spreadsheet ora) {
    ora.beginsCallback();

    while (ora.goIsMoving()) {

      if (ora.bringRealizedWorkWidth() == appendage.size()) {
        ora.arrestCompiler();
      } else {
        LinkedList<Serve> lineMechanism = new LinkedList<>();
        for (Serve postscript : appendage) {

          if (postscript.developHappensHour() == ora.developPreviousAnswer() + 1) {
            lineMechanism.add(new Serve(postscript));
          }
        }
        Collections.sort(lineMechanism);

        while (!lineMechanism.isEmpty()) {
          ora.phaseEntry(lineMechanism.removeFirst());
        }
        ora.arrangeExistingDial(ora.developPreviousAnswer() + 1);
        ora.ourTicktack();
      }
    }
  }

  private synchronized void synx27(Spreadsheet fh) {
    String excerpts =
        String.format(
            "%-9s%23.2f%26.2f",
            fh.writerAdvert(), fh.bringMiddlingExpectMeter(), fh.takeMeanUpturnPeriod());
    ActMock.ExportationPapers.write(excerpts + "\n");
    System.out.println(excerpts);
  }
}
