package Plenum;

import Workflow.Compiler.Reactions.AxialInterface;
import Workflow.Spreadsheet.Grr.GrrProgrammer;
import Workflow.Treat;
import Workflow.Synchronization.Lyra.RailCompiler;
import Workflow.Server.Obtained.LongDatabase;
import Workflow.Programming;
import Workflow.Developer.Spt.UsingProgramming;
import Analogue.ProcedureSimulation;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Dealer {
  private static final String synX149String = "Unable to write summary to file.";
  private static final String synX148String = "\n";
  private static final String synX147String = "%-9s%23.2f%26.2f";
  private static final String synX146String = "\n";
  private static final String synX145String = "Average Turnaround Time";
  private static final String synX144String = "Average Waiting Time";
  private static final String synX143String = "Algorithm";
  private static final String synX142String = "%-9s%23s%26s";
  private static final String synX141String = "Summary";
  private static final String synX140String = "Summary\n";
  private static final int synX139int = 1;
  private static final int synX138int = 1;
  public ArrayDeque<Programming> algorithms = null;
  public LinkedList<Treat> practices = null;
  public static int SendNow = 0;

  public Dealer() {
    this.algorithms = (new ArrayDeque<>());
    Programming scheduling = new UsingProgramming();
    Programming caboose = new RailCompiler();
    Programming desired = new LongDatabase();
    Programming grr = new GrrProgrammer();
    Programming alter = new AxialInterface();
    this.algorithms.addLast(scheduling);
    this.algorithms.addLast(caboose);
    this.algorithms.addLast(desired);
    this.algorithms.addLast(alter);
    this.algorithms.addLast(grr);
  }

  public synchronized void putProcedure(LinkedList<Treat> techniques) {
    this.practices = (techniques);
  }

  public synchronized void adjustDispatchedMonth(int expeditiousnessYear) {
    this.SendNow = (expeditiousnessYear);
  }

  public synchronized void extendDealer() {
    for (Programming ora : algorithms) {
      ora.beginningOrganizer();

      while (ora.goIsMoving()) {

        if (ora.generatePerformedTreatFootprint() == practices.size()) {
          ora.haltProgrammer();
        } else {
          LinkedList<Treat> playMethodology = new LinkedList<>();
          for (Treat postscript : practices) {

            if (postscript.developHappensHour() == ora.arriveFlowIndicate() + synX138int) {
              playMethodology.add(new Treat(postscript));
            }
          }
          Collections.sort(playMethodology);

          while (!playMethodology.isEmpty()) {
            ora.phaseEntry(playMethodology.removeFirst());
          }
          ora.putPrevailingClick(ora.arriveFlowIndicate() + synX139int);
          ora.ourTicktack();
        }
      }
    }
    this.hardcopyCompact();
  }

  public synchronized void hardcopyCompact() {

    try {
      ProcedureSimulation.ProductivityDocuments.write(synX140String);
      out.println(synX141String);
      String headlines = String.format(synX142String, synX143String, synX144String, synX145String);
      ProcedureSimulation.ProductivityDocuments.write(headlines + synX146String);
      out.println(headlines);
      for (Programming fh : algorithms) {
        String overview =
            String.format(
                synX147String,
                fh.serverDiagnose(),
                fh.fetchProportionAwaitsBeginning(),
                fh.takeMeanUpturnPeriod());
        ProcedureSimulation.ProductivityDocuments.write(overview + synX148String);
        out.println(overview);
      }
      ProcedureSimulation.ProductivityDocuments.close();
    } catch (IOException aba) {
      out.println(synX149String);
    }
  }
}
