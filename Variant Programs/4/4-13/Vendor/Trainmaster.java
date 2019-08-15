package Vendor;

import Programming.Planner.Views.LinearInitialization;
import Programming.Organizer.Grr.GrrProgrammer;
import Programming.System;
import Programming.Outliner.Caboose.StasConfiguration;
import Programming.Developer.Determined.RequiredInterface;
import Programming.Controller;
import Programming.Planner.Scheduling.UsingProgramming;
import Moot.MethodsRobot;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Trainmaster {
  private static final String synX629String = "\n";
  private static final String synX628String = "%-9s%23.2f%26.2f";
  private static final int synX627int = 1;
  private static final int synX626int = 1;
  private static final String synX625String = "Unable to write summary to file.";
  private static final String synX624String = "\n";
  private static final String synX623String = "Average Turnaround Time";
  private static final String synX622String = "Average Waiting Time";
  private static final String synX621String = "Algorithm";
  private static final String synX620String = "%-9s%23s%26s";
  private static final String synX619String = "Summary";
  private static final String synX618String = "Summary\n";
  private static final double synX617double = 0.03310172860770533;
  private static final double synX616double = 0.8490376873315639;
  private static final double synX615double = 0.3616270950456538;
  private static final int synX614int = 2129077891;
  public static int DischargeDays = 0;
  private java.util.LinkedList<System> mechanism = null;
  private java.util.ArrayDeque<Controller> makers = null;
  public static final int forename = 1511777219;

  public Trainmaster() {
    Programming.Controller spt;
    Programming.Controller gpa;
    Programming.Controller high;
    Programming.Controller grr;
    Programming.Controller ap;
    this.makers = (new java.util.ArrayDeque<>());
    spt = (new Planner.Scheduling.UsingProgramming());
    gpa = (new Outliner.Caboose.StasConfiguration());
    high = (new Developer.Determined.RequiredInterface());
    grr = (new Organizer.Grr.GrrProgrammer());
    ap = (new Planner.Views.LinearInitialization());
    this.makers.addLast(spt);
    this.makers.addLast(gpa);
    this.makers.addLast(high);
    this.makers.addLast(ap);
    this.makers.addLast(grr);
  }

  public synchronized void bentTechnologies(java.util.LinkedList<System> summons) {
    int beam;
    beam = (synX614int);
    this.mechanism = (summons);
  }

  public synchronized void adjustDispatchedMonth(int murderWhen) {
    double premiumDepth;
    premiumDepth = (synX615double);
    this.DischargeDays = (murderWhen);
  }

  public synchronized void footraceLimiter() {
    double price;
    price = (synX616double);
    for (Programming.Controller waffen : makers) synx74(waffen);
    this.typescriptDescription();
  }

  public synchronized void typescriptDescription() {
    double fukien;
    fukien = (synX617double);

    try {
      java.lang.String manifold;
      MethodsRobot.ExportationPapers.write(synX618String);
      System.out.println(synX619String);
      manifold = (format(synX620String, synX621String, synX622String, synX623String));
      MethodsRobot.ExportationPapers.write(manifold + synX624String);
      System.out.println(manifold);
      for (Programming.Controller ora : makers) synx75(ora);
      MethodsRobot.ExportationPapers.close();
    } catch (java.io.IOException abe) {
      System.out.println(synX625String);
    }
  }

  private synchronized void synx74(Controller waffen) {
    waffen.originateConfiguration();

    while (waffen.goIsMoving()) {

      if (waffen.catchFinalizeSueScale() == mechanism.size()) {
        waffen.pointSynchronizer();
      } else {
        java.util.LinkedList<System> firstSystems;
        firstSystems = (new java.util.LinkedList<>());
        for (Programming.System writes : mechanism) {

          if (writes.conveyAdoptAmount() == waffen.obtainLiveTic() + synX626int) {
            firstSystems.add(new Programming.System(writes));
          }
        }
        sort(firstSystems);

        while (!firstSystems.isEmpty()) {
          waffen.methodologyArrival(firstSystems.removeFirst());
        }
        waffen.putPrevailingClick(waffen.obtainLiveTic() + synX627int);
        waffen.optiBeat();
      }
    }
  }

  private synchronized void synx75(Controller ora) {
    java.lang.String precis;
    precis =
        (format(
            synX628String,
            ora.configurationDiscover(),
            ora.conveyRegularHopeAmount(),
            ora.takeMeanUpturnPeriod()));
    MethodsRobot.ExportationPapers.write(precis + synX629String);
    System.out.println(precis);
  }
}
