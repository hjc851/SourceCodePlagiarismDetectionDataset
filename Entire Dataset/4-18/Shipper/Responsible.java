package Shipper;

import Spooler.Organizer.Reply.CpCompiler;
import Spooler.Interface.Grr.GrrProgrammer;
import Spooler.Appendage;
import Spooler.Workspace.Diddle.OberProgrammer;
import Spooler.Configuration.Longer.HighWorkspace;
import Spooler.Planner;
import Spooler.Developer.Spt.UsingProgramming;
import Demo.MechanismMockup;
import java.io.IOException;
import java.util.*;

public class Responsible {
  private static final int synX946int = 1;
  private static final int synX945int = 1;
  private static final String synX944String = "\n";
  private static final String synX943String = "%-9s%23.2f%26.2f";
  private static final double synX942double = 0.6705713837289;
  private static final int synX941int = 1447988357;
  private static final double synX940double = 0.9213840888830536;
  private static final String synX939String = "Unable to write summary to file.";
  private static final String synX938String = "\n";
  private static final String synX937String = "Average Turnaround Time";
  private static final String synX936String = "Average Waiting Time";
  private static final String synX935String = "Algorithm";
  private static final String synX934String = "%-9s%23s%26s";
  private static final String synX933String = "Summary";
  private static final String synX932String = "Summary\n";
  private static final double synX931double = 0.7291500080221238;

  public Responsible() {
    Spooler.Planner paps;
    Spooler.Planner gpa;
    Spooler.Planner determined;
    Spooler.Planner grr;
    Spooler.Planner approximate;
    this.work = new java.util.ArrayDeque<>();
    paps = new Developer.Spt.UsingProgramming();
    gpa = new Workspace.Diddle.OberProgrammer();
    determined = new Configuration.Longer.HighWorkspace();
    grr = new Interface.Grr.GrrProgrammer();
    approximate = new Organizer.Reply.CpCompiler();
    this.work.addLast(paps);
    this.work.addLast(gpa);
    this.work.addLast(determined);
    this.work.addLast(approximate);
    this.work.addLast(grr);
  }

  public static int DeployChance = 0;
  static int operative = -1117370461;

  public synchronized void photographySnapshot() {
    double aboveFettered;
    aboveFettered = synX931double;

    try {
      java.lang.String coping;
      MechanismMockup.VolumeArchiving.write(synX932String);
      System.out.println(synX933String);
      coping = java.lang.String.format(synX934String, synX935String, synX936String, synX937String);
      MechanismMockup.VolumeArchiving.write(coping + synX938String);
      System.out.println(coping);
      for (Spooler.Planner fh : work) synx122(fh);
      MechanismMockup.VolumeArchiving.close();
    } catch (java.io.IOException former) {
      System.out.println(synX939String);
    }
  }

  public synchronized void leanExporter() {
    double charge;
    charge = synX940double;
    for (Spooler.Planner ora : work) synx123(ora);
    this.photographySnapshot();
  }

  public java.util.ArrayDeque<Planner> work = null;

  public synchronized void arrangeSentYears(int removeDay) {
    int prize;
    prize = synX941int;
    this.DeployChance = removeDay;
  }

  public java.util.LinkedList<Appendage> treat = null;

  public synchronized void arrangedAct(java.util.LinkedList<Appendage> serve) {
    double fullThick;
    fullThick = synX942double;
    this.treat = serve;
  }

  private synchronized void synx122(Planner fh) {
    java.lang.String review;
    review =
        java.lang.String.format(
            synX943String,
            fh.workspaceForename(),
            fh.obtainIntermediateBideDays(),
            fh.takeMeanUpturnPeriod());
    MechanismMockup.VolumeArchiving.write(review + synX944String);
    System.out.println(review);
  }

  private synchronized void synx123(Planner ora) {
    ora.commenceProgramming();

    while (ora.goIsMoving()) {

      if (ora.drawFinalizingSystemsScope() == treat.size()) {
        ora.discontinueTimer();
      } else {
        java.util.LinkedList<Appendage> beginsMarch;
        beginsMarch = new java.util.LinkedList<>();
        for (Spooler.Appendage cern : treat) {

          if (cern.becomeFindOpportunity() == ora.makeIncumbentTock() + synX945int) {
            beginsMarch.add(new Spooler.Appendage(cern));
          }
        }
        java.util.Collections.sort(beginsMarch);

        while (!beginsMarch.isEmpty()) {
          ora.appendageEntering(beginsMarch.removeFirst());
        }
        ora.orderedNewTally(ora.makeIncumbentTock() + synX946int);
        ora.optiBeat();
      }
    }
  }
}
