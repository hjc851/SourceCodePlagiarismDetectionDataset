package Yardmaster;

import Workflow.Organizer.Debriefing.BParser;
import Workflow.Interface.Grr.GrrProgrammer;
import Workflow.Operation;
import Workflow.Spreadsheet.Trill.GpaInterface;
import Workflow.Compiler.Longer.ObtainedSpooler;
import Workflow.Workspace;
import Workflow.Timer.Paps.PapsOrganizer;
import Analogue.ServeAnalogue;
import java.io.IOException;
import java.util.*;

public class Originator {
  public ArrayDeque<Workspace> multiple;
  public LinkedList<Operation> methodologies;
  public static int DespatchClock;

  public Originator() {
    this.multiple = new ArrayDeque<>();
    Workspace scheduling = new PapsOrganizer();
    Workspace ober = new GpaInterface();
    Workspace wbs = new ObtainedSpooler();
    Workspace grr = new GrrProgrammer();
    Workspace downstream = new BParser();
    this.multiple.addLast(scheduling);
    this.multiple.addLast(ober);
    this.multiple.addLast(wbs);
    this.multiple.addLast(downstream);
    this.multiple.addLast(grr);
  }

  public synchronized void fixMechanism(LinkedList<Operation> litigate) {
    this.methodologies = litigate;
  }

  public synchronized void prepareSendNow(int communiqueMeter) {
    this.DespatchClock = communiqueMeter;
  }

  public synchronized void ramRegulator() {
    for (Workspace fh : multiple) {
      fh.departParser();

      while (fh.goIsMoving()) {

        if (fh.conveyFulfilledMethodNumber() == methodologies.size()) {
          fh.checkWorkflow();
        } else {
          LinkedList<Operation> departsMethod = new LinkedList<>();
          for (Operation postscript : methodologies) {

            if (postscript.fetchTakeBeginning() == fh.findActualRetick() + 1) {
              departsMethod.add(new Operation(postscript));
            }
          }
          Collections.sort(departsMethod);

          while (!departsMethod.isEmpty()) {
            fh.phaseEntry(departsMethod.removeFirst());
          }
          fh.readyIncumbentTock(fh.findActualRetick() + 1);
          fh.nbsClick();
        }
      }
    }
    this.publicationPrecis();
  }

  public synchronized void publicationPrecis() {

    try {
      ServeAnalogue.TurnoutCharge.write("Summary\n");
      System.out.println("Summary");
      String head =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ServeAnalogue.TurnoutCharge.write(head + "\n");
      System.out.println(head);
      for (Workspace ora : multiple) {
        String summarized =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.organizerList(),
                ora.driveRatesStayAgain(),
                ora.conveyRegularAdjustmentAmount());
        ServeAnalogue.TurnoutCharge.write(summarized + "\n");
        System.out.println(summarized);
      }
      ServeAnalogue.TurnoutCharge.close();
    } catch (IOException admittedly) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
