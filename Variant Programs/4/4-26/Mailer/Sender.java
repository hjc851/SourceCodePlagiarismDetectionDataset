package Mailer;

import Database.Workflow.Results.AlterPlanner;
import Database.Programmer.Grr.GrrProgrammer;
import Database.Methodology;
import Database.Developer.E.XingCallback;
import Database.Workspace.Defined.DefinedCompiler;
import Database.Synchronization;
import Database.Spooler.Using.UsingProgramming;
import Impactor.ProcedureSimulation;
import java.io.IOException;
import java.util.*;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Sender {
  private static final String synX1364String = "Unable to write summary to file.";
  private static final String synX1363String = "\n";
  private static final String synX1362String = "%-9s%23.2f%26.2f";
  private static final String synX1361String = "\n";
  private static final String synX1360String = "Average Turnaround Time";
  private static final String synX1359String = "Average Waiting Time";
  private static final String synX1358String = "Algorithm";
  private static final String synX1357String = "%-9s%23s%26s";
  private static final String synX1356String = "Summary";
  private static final String synX1355String = "Summary\n";
  private static final String synX1354String = "XVa4vqvFO6xc";
  private static final int synX1353int = 1;
  private static final int synX1352int = 1;
  private static final double synX1351double = 0.7126959157681217;
  private static final double synX1350double = 0.8130713564806572;
  private static final double synX1349double = 0.9143889159017479;
  public static int DischargeDays = 0;
  private LinkedList<Methodology> technologies = null;
  private ArrayDeque<Synchronization> local = null;
  public static final int nung = 389062131;

  public Sender() {
    Synchronization spt;
    Synchronization etd;
    Synchronization tribunal;
    Synchronization grr;
    Synchronization cp;
    this.local = new ArrayDeque<>();
    spt = new UsingProgramming();
    etd = new XingCallback();
    tribunal = new DefinedCompiler();
    grr = new GrrProgrammer();
    cp = new AlterPlanner();
    this.local.addLast(spt);
    this.local.addLast(etd);
    this.local.addLast(tribunal);
    this.local.addLast(cp);
    this.local.addLast(grr);
  }

  public synchronized void primedAppendage(LinkedList<Methodology> methodology) {
    double infernalMinimum;
    infernalMinimum = synX1349double;
    this.technologies = methodology;
  }

  public synchronized void settledHitPeriods(int officeJuncture) {
    double discover;
    discover = synX1350double;
    this.DischargeDays = officeJuncture;
  }

  public synchronized void bleedOriginator() {
    double curve;
    curve = synX1351double;
    for (Synchronization ora : local) {
      ora.partWorkflow();

      while (ora.goIsMoving()) {

        if (ora.arriveUndertookProceduresWingspan() == technologies.size()) {
          ora.hitchMultitasking();
        } else {
          LinkedList<Methodology> playMethodology;
          playMethodology = new LinkedList<>();
          for (Methodology writes : technologies) {

            if (writes.fixHappenChance() == ora.beatTypicalGenetic() + synX1352int) {
              playMethodology.add(new Methodology(writes));
            }
          }
          sort(playMethodology);

          while (!playMethodology.isEmpty()) {
            ora.methodologyArrival(playMethodology.removeFirst());
          }
          ora.preparePrevalentScore(ora.beatTypicalGenetic() + synX1353int);
          ora.bpsRetick();
        }
      }
    }
    this.lithographSynopses();
  }

  public synchronized void lithographSynopses() {
    String lowlyBoundary;
    lowlyBoundary = synX1354String;

    try {
      String head;
      ProcedureSimulation.TurnoutCharge.write(synX1355String);
      System.out.println(synX1356String);
      head = format(synX1357String, synX1358String, synX1359String, synX1360String);
      ProcedureSimulation.TurnoutCharge.write(head + synX1361String);
      System.out.println(head);
      for (Synchronization waffen : local) {
        String summarize;
        summarize =
            format(
                synX1362String,
                waffen.callbackConstitute(),
                waffen.beatHalfNotJuncture(),
                waffen.arriveModalUpswingMonth());
        ProcedureSimulation.TurnoutCharge.write(summarize + synX1363String);
        System.out.println(summarize);
      }
      ProcedureSimulation.TurnoutCharge.close();
    } catch (IOException afterwards) {
      System.out.println(synX1364String);
    }
  }
}
