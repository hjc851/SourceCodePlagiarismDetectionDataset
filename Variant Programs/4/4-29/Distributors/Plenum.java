package Distributors;

import Spooler.Multitasking.Comment.LinearInitialization;
import Spooler.Outliner.Grr.GrrProgrammer;
import Spooler.Appendage;
import Spooler.Debugging.Oxime.RailCompiler;
import Spooler.Workspace.Desired.HighWorkspace;
import Spooler.Outliner;
import Spooler.Writer.Degenerates.DegeneratesDeveloper;
import Robot.MechanismsManikin;
import java.io.IOException;
import java.util.*;

public class Plenum {
  private static final String synX1494String = "\n";
  private static final String synX1493String = "%-9s%23.2f%26.2f";
  private static final int synX1492int = 1;
  private static final int synX1491int = 1;
  private static final String synX1490String = "Unable to write summary to file.";
  private static final String synX1489String = "\n";
  private static final String synX1488String = "Average Turnaround Time";
  private static final String synX1487String = "Average Waiting Time";
  private static final String synX1486String = "Algorithm";
  private static final String synX1485String = "%-9s%23s%26s";
  private static final String synX1484String = "Summary";
  private static final String synX1483String = "Summary\n";
  private ArrayDeque<Outliner> fair;
  private LinkedList<Appendage> march;
  public static int DeployingOpportunity;

  public Plenum() {
    this.fair = new ArrayDeque<>();
    Outliner scheduling = new DegeneratesDeveloper();
    Outliner e = new RailCompiler();
    Outliner desired = new HighWorkspace();
    Outliner grr = new GrrProgrammer();
    Outliner downstream = new LinearInitialization();
    this.fair.addLast(scheduling);
    this.fair.addLast(e);
    this.fair.addLast(desired);
    this.fair.addLast(downstream);
    this.fair.addLast(grr);
  }

  public synchronized void prepareMethodologies(LinkedList<Appendage> litigate) {
    this.march = litigate;
  }

  public synchronized void primedExpeditionPeriod(int sendingHour) {
    this.DeployingOpportunity = sendingHour;
  }

  public synchronized void goTrainmaster() {
    for (Outliner ora : fair) synx266(ora);
    this.fontReport();
  }

  public synchronized void fontReport() {

    try {
      MechanismsManikin.EfficiencyDocket.write(synX1483String);
      System.out.println(synX1484String);
      String bay = String.format(synX1485String, synX1486String, synX1487String, synX1488String);
      MechanismsManikin.EfficiencyDocket.write(bay + synX1489String);
      System.out.println(bay);
      for (Outliner waffen : fair) synx267(waffen);
      MechanismsManikin.EfficiencyDocket.close();
    } catch (IOException afterwards) {
      System.out.println(synX1490String);
    }
  }

  private synchronized void synx266(Outliner ora) {
    ora.openingInitialization();

    while (ora.goIsMoving()) {

      if (ora.comeConsummatedOperationLarger() == march.size()) {
        ora.occlusiveInitialization();
      } else {
        LinkedList<Appendage> commencingServe = new LinkedList<>();
        for (Appendage postscript : march) {

          if (postscript.fetchTakeBeginning() == ora.conveyFormerGene() + synX1491int) {
            commencingServe.add(new Appendage(postscript));
          }
        }
        Collections.sort(commencingServe);

        while (!commencingServe.isEmpty()) {
          ora.systemInpouring(commencingServe.removeFirst());
        }
        ora.settledCirculatingShudder(ora.conveyFormerGene() + synX1492int);
        ora.optiBeat();
      }
    }
  }

  private synchronized void synx267(Outliner waffen) {
    String summation =
        String.format(
            synX1493String,
            waffen.parserFigure(),
            waffen.developTypicalAwaitedHour(),
            waffen.becomeApproximatelyChangeOpportunity());
    MechanismsManikin.EfficiencyDocket.write(summation + synX1494String);
    System.out.println(summation);
  }
}
