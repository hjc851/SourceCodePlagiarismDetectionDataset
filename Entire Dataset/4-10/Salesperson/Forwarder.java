package Salesperson;

import Planner.Timer.Observations.AbProgramming;
import Planner.Timer.Grr.GrrProgrammer;
import Planner.Appendage;
import Planner.Outliner.Rail.TrilledServer;
import Planner.Outliner.Long.DeterminedCallback;
import Planner.Initialization;
import Planner.Interface.Lamps.LampsProgrammer;
import Mock.WorkSimulating;
import java.io.IOException;
import java.util.*;

public class Forwarder {
  private static final int synX483int = 1;
  private static final int synX482int = 1;
  private static final double synX481double = 0.7480915306098467;
  private static final int synX480int = 1166049499;
  private static final String synX479String = "Unable to write summary to file.";
  private static final String synX478String = "\n";
  private static final String synX477String = "%-9s%23.2f%26.2f";
  private static final String synX476String = "\n";
  private static final String synX475String = "Average Turnaround Time";
  private static final String synX474String = "Average Waiting Time";
  private static final String synX473String = "Algorithm";
  private static final String synX472String = "%-9s%23s%26s";
  private static final String synX471String = "Summary";
  private static final String synX470String = "Summary\n";
  private static final int synX469int = -1692342348;
  private static final double synX468double = 0.17248504688614097;

  public Forwarder() {
    Initialization degenerates;
    Initialization stas;
    Initialization defined;
    Initialization grr;
    Initialization alter;
    this.most = (new ArrayDeque<>());
    degenerates = (new LampsProgrammer());
    stas = (new TrilledServer());
    defined = (new DeterminedCallback());
    grr = (new GrrProgrammer());
    alter = (new AbProgramming());
    this.most.addLast(degenerates);
    this.most.addLast(stas);
    this.most.addLast(defined);
    this.most.addLast(alter);
    this.most.addLast(grr);
  }

  public static int SentYears;
  public static double circumscribe = 0.3342060974634925;
  private ArrayDeque<Initialization> most;

  public synchronized void settledHitPeriods(int expeditiousnessYear) {
    double constitute;
    constitute = (synX468double);
    this.SentYears = (expeditiousnessYear);
  }

  public synchronized void publishConcise() {
    int reducedLeaping;
    reducedLeaping = (synX469int);

    try {
      String manifold;
      WorkSimulating.ProducedExecutable.write(synX470String);
      System.out.println(synX471String);
      manifold = (String.format(synX472String, synX473String, synX474String, synX475String));
      WorkSimulating.ProducedExecutable.write(manifold + synX476String);
      System.out.println(manifold);
      for (Initialization waffen : most) {
        String summarizes;
        summarizes =
            (String.format(
                synX477String,
                waffen.initializationPseudonym(),
                waffen.driveRatesStayAgain(),
                waffen.letMediumReorganizationHours()));
        WorkSimulating.ProducedExecutable.write(summarizes + synX478String);
        System.out.println(summarizes);
      }
      WorkSimulating.ProducedExecutable.close();
    } catch (IOException afterwards) {
      System.out.println(synX479String);
    }
  }

  public synchronized void dictatedWork(LinkedList<Appendage> appendage) {
    int decreaseThresholds;
    decreaseThresholds = (synX480int);
    this.sue = (appendage);
  }

  private LinkedList<Appendage> sue;

  public synchronized void testDistributors() {
    double maximum;
    maximum = (synX481double);
    for (Initialization ora : most) {
      ora.partWorkflow();

      while (ora.goIsMoving()) {

        if (ora.produceUndergoneMethodologiesDensity() == sue.size()) {
          ora.breakInterface();
        } else {
          LinkedList<Appendage> launchingPractices;
          launchingPractices = (new LinkedList<>());
          for (Appendage writes : sue) {

            if (writes.beatSubmitJuncture() == ora.sustainThisValidation() + synX482int) {
              launchingPractices.add(new Appendage(writes));
            }
          }
          Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            ora.proceduresIngress(launchingPractices.removeFirst());
          }
          ora.fitUnderwayWalk(ora.sustainThisValidation() + synX483int);
          ora.weapMark();
        }
      }
    }
    this.publishConcise();
  }
}
