package Caller;

import Writer.Outliner.Evaluation.AbProgramming;
import Writer.Workspace.Grr.GrrProgrammer;
import Writer.Negotiations;
import Writer.Workspace.Ohio.OhioSynchronization;
import Writer.Programming.Obtained.DaysDebugging;
import Writer.Callback;
import Writer.Organizer.Using.PapsOrganizer;
import Moot.ProceedingsKinematics;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Starter {
  private static final String synX1678String = "\n";
  private static final String synX1677String = "%-9s%23.2f%26.2f";
  private static final int synX1676int = 1;
  private static final int synX1675int = 1;
  private static final String synX1674String = "Unable to write summary to file.";
  private static final String synX1673String = "\n";
  private static final String synX1672String = "Average Turnaround Time";
  private static final String synX1671String = "Average Waiting Time";
  private static final String synX1670String = "Algorithm";
  private static final String synX1669String = "%-9s%23s%26s";
  private static final String synX1668String = "Summary";
  private static final String synX1667String = "Summary\n";
  public static int RoutingWeek = 0;
  private java.util.LinkedList<Negotiations> operations = null;
  private java.util.ArrayDeque<Callback> use = null;

  public Starter() {
    Writer.Callback using;
    Writer.Callback rail;
    Writer.Callback defined;
    Writer.Callback grr;
    Writer.Callback commercial;
    this.use = new java.util.ArrayDeque<>();
    using = new Organizer.Using.PapsOrganizer();
    rail = new Workspace.Ohio.OhioSynchronization();
    defined = new Programming.Obtained.DaysDebugging();
    grr = new Workspace.Grr.GrrProgrammer();
    commercial = new Outliner.Evaluation.AbProgramming();
    this.use.addLast(using);
    this.use.addLast(rail);
    this.use.addLast(defined);
    this.use.addLast(commercial);
    this.use.addLast(grr);
  }

  public synchronized void adjustProcedures(java.util.LinkedList<Negotiations> methods) {
    this.operations = methods;
  }

  public synchronized void solidifyingOfficeJuncture(int despatchClock) {
    this.RoutingWeek = despatchClock;
  }

  public synchronized void raceShipper() {
    for (Writer.Callback waffen : use) synx338(waffen);
    this.photographySnapshot();
  }

  public synchronized void photographySnapshot() {

    try {
      java.lang.String usb;
      ProceedingsKinematics.InputInitiate.write(synX1667String);
      out.println(synX1668String);
      usb = format(synX1669String, synX1670String, synX1671String, synX1672String);
      ProceedingsKinematics.InputInitiate.write(usb + synX1673String);
      out.println(usb);
      for (Writer.Callback ora : use) synx339(ora);
      ProceedingsKinematics.InputInitiate.close();
    } catch (java.io.IOException past) {
      out.println(synX1674String);
    }
  }

  private synchronized void synx338(Callback waffen) {
    waffen.beginProgrammer();

    while (waffen.goIsMoving()) {

      if (waffen.fetchAttainedProcesVastness() == operations.size()) {
        waffen.layoverConfiguration();
      } else {
        java.util.LinkedList<Negotiations> launchingPractices;
        launchingPractices = new java.util.LinkedList<>();
        for (Writer.Negotiations vig : operations) {

          if (vig.goComeClock() == waffen.producePrevalentScore() + synX1675int) {
            launchingPractices.add(new Writer.Negotiations(vig));
          }
        }
        sort(launchingPractices);

        while (!launchingPractices.isEmpty()) {
          waffen.outgrowthSucceeding(launchingPractices.removeFirst());
        }
        waffen.markAfootDials(waffen.producePrevalentScore() + synX1676int);
        waffen.ourTicktack();
      }
    }
  }

  private synchronized void synx339(Callback ora) {
    java.lang.String synopsis;
    synopsis =
        format(
            synX1677String, ora.outlinerGens(), ora.fixRatioLeaveChance(), ora.canRateShiftYears());
    ProceedingsKinematics.InputInitiate.write(synopsis + synX1678String);
    out.println(synopsis);
  }
}
