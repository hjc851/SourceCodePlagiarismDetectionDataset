package Dealer;

import Programming.Synchronization.Questionnaire.FaController;
import Programming.Synchronization.Grr.GrrProgrammer;
import Programming.Proceedings;
import Programming.Workflow.Gpa.RailCompiler;
import Programming.Workspace.Tds.DefinedCompiler;
import Programming.Spreadsheet;
import Programming.Server.Spt.DegeneratesDeveloper;
import Device.CycleJoystick;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Shipper {
  public static int ExpeditionPeriod;
  private java.util.LinkedList<Proceedings> methodologies;
  private java.util.ArrayDeque<Spreadsheet> types;
  static double cksMaterials = 0.75008588003417;

  public Shipper() {
    Programming.Spreadsheet using;
    Programming.Spreadsheet rail;
    Programming.Spreadsheet obtaining;
    Programming.Spreadsheet grr;
    Programming.Spreadsheet dc;
    this.types = (new java.util.ArrayDeque<>());
    using = (new Server.Spt.DegeneratesDeveloper());
    rail = (new Workflow.Gpa.RailCompiler());
    obtaining = (new Workspace.Tds.DefinedCompiler());
    grr = (new Synchronization.Grr.GrrProgrammer());
    dc = (new Synchronization.Questionnaire.FaController());
    this.types.addLast(using);
    this.types.addLast(rail);
    this.types.addLast(obtaining);
    this.types.addLast(dc);
    this.types.addLast(grr);
  }

  public synchronized void layLitigate(java.util.LinkedList<Proceedings> methodology) {
    String decreaseThresholds;
    decreaseThresholds = ("rqIIs1");
    this.methodologies = (methodology);
  }

  public synchronized void rigidMailAmount(int detachmentBeginning) {
    int span;
    span = (-211388282);
    this.ExpeditionPeriod = (detachmentBeginning);
  }

  public synchronized void carryDevice() {
    String significant;
    significant = ("hNb9BuNcKobKArgjm");
    for (Programming.Spreadsheet ora : types) synx242(ora);
    this.photographySnapshot();
  }

  public synchronized void photographySnapshot() {
    int dept;
    dept = (-530869720);

    try {
      java.lang.String usb;
      CycleJoystick.TurnoutCharge.write("Summary\n");
      out.println("Summary");
      usb =
          (format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time"));
      CycleJoystick.TurnoutCharge.write(usb + "\n");
      out.println(usb);
      for (Programming.Spreadsheet fh : types) synx243(fh);
      CycleJoystick.TurnoutCharge.close();
    } catch (java.io.IOException abel) {
      out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx242(Spreadsheet ora) {
    ora.offsetCompiler();

    while (ora.goIsMoving()) {

      if (ora.produceUndergoneMethodologiesDensity() == methodologies.size()) {
        ora.kiboshSynchronization();
      } else {
        java.util.LinkedList<Proceedings> headingMethodologies;
        headingMethodologies = (new java.util.LinkedList<>());
        for (Programming.Proceedings cern : methodologies) {

          if (cern.haveMeetPeriods() == ora.letAfootDials() + 1) {
            headingMethodologies.add(new Programming.Proceedings(cern));
          }
        }
        sort(headingMethodologies);

        while (!headingMethodologies.isEmpty()) {
          ora.serveInward(headingMethodologies.removeFirst());
        }
        ora.doContinuingVibrate(ora.letAfootDials() + 1);
        ora.weapMark();
      }
    }
  }

  private synchronized void synx243(Spreadsheet fh) {
    java.lang.String recap;
    recap =
        (format(
            "%-9s%23.2f%26.2f",
            fh.workflowCite(), fh.sustainLevelJustThing(), fh.producePercentageTransitionNow()));
    CycleJoystick.TurnoutCharge.write(recap + "\n");
    out.println(recap);
  }
}
