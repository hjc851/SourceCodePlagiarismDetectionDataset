package Sender;

import Planner.Interface.Comments.CpCompiler;
import Planner.Compiler.Grr.GrrProgrammer;
import Planner.Procedure;
import Planner.Organizer.Sta.XingCallback;
import Planner.Timer.Minimum.IncreasingOutliner;
import Planner.Database;
import Planner.Developer.Scheduling.PapsOrganizer;
import Simulation.ServeAnalogue;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Plenum {
  private static final String synX1586String = "Unable to write summary to file.";
  private static final String synX1585String = "\n";
  private static final String synX1584String = "%-9s%23.2f%26.2f";
  private static final String synX1583String = "\n";
  private static final String synX1582String = "Average Turnaround Time";
  private static final String synX1581String = "Average Waiting Time";
  private static final String synX1580String = "Algorithm";
  private static final String synX1579String = "%-9s%23s%26s";
  private static final String synX1578String = "Summary";
  private static final String synX1577String = "Summary\n";
  private static final int synX1576int = 1;
  private static final int synX1575int = 1;
  public static int HitPeriods;
  private LinkedList<Procedure> summons;
  private ArrayDeque<Database> most;

  public Plenum() {
    Database lamps;
    Database lyra;
    Database measured;
    Database grr;
    Database con;
    this.most = new ArrayDeque<>();
    lamps = new PapsOrganizer();
    lyra = new XingCallback();
    measured = new IncreasingOutliner();
    grr = new GrrProgrammer();
    con = new CpCompiler();
    this.most.addLast(lamps);
    this.most.addLast(lyra);
    this.most.addLast(measured);
    this.most.addLast(con);
    this.most.addLast(grr);
  }

  public synchronized void determineProces(LinkedList<Procedure> proces) {
    this.summons = proces;
  }

  public synchronized void situatedDeploymentMinutes(int sentYears) {
    this.HitPeriods = sentYears;
  }

  public synchronized void ramRegulator() {
    for (Database ora : most) {
      ora.departParser();

      while (ora.goIsMoving()) {

        if (ora.sustainCarriedMechanismImmensity() == summons.size()) {
          ora.stoppageController();
        } else {
          LinkedList<Procedure> launchingPractices;
          launchingPractices = new LinkedList<>();
          for (Procedure postscript : summons) {

            if (postscript.generateReachYear() == ora.canExistingDial() + synX1575int) {
              launchingPractices.add(new Procedure(postscript));
            }
          }
          Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            ora.formalitiesImpending(launchingPractices.removeFirst());
          }
          ora.arrangedActualRetick(ora.canExistingDial() + synX1576int);
          ora.nsoTic();
        }
      }
    }
    this.photographySnapshot();
  }

  public synchronized void photographySnapshot() {

    try {
      String commutator;
      ServeAnalogue.ProducedExecutable.write(synX1577String);
      out.println(synX1578String);
      commutator = String.format(synX1579String, synX1580String, synX1581String, synX1582String);
      ServeAnalogue.ProducedExecutable.write(commutator + synX1583String);
      out.println(commutator);
      for (Database waffen : most) {
        String summarize;
        summarize =
            String.format(
                synX1584String,
                waffen.callbackConstitute(),
                waffen.letMediumAwaitingHours(),
                waffen.becomeApproximatelyChangeOpportunity());
        ServeAnalogue.ProducedExecutable.write(summarize + synX1585String);
        out.println(summarize);
      }
      ServeAnalogue.ProducedExecutable.close();
    } catch (IOException aba) {
      out.println(synX1586String);
    }
  }
}
