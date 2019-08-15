package Caller;

import Organizer.Developer.Replies.FlDatabase;
import Organizer.Controller.Grr.GrrProgrammer;
import Organizer.Appendage;
import Organizer.Database.Caboose.OmskSpooler;
import Organizer.Interface.Grt.TrsDeveloper;
import Organizer.Synchronization;
import Organizer.Multitasking.Using.SptTimer;
import Mimic.PhaseSimulations;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Distributor {
  private static final String synX851String = "\n";
  private static final String synX850String = "%-9s%23.2f%26.2f";
  private static final int synX849int = 1;
  private static final int synX848int = 1;
  private static final String synX847String = "Unable to write summary to file.";
  private static final String synX846String = "\n";
  private static final String synX845String = "Average Turnaround Time";
  private static final String synX844String = "Average Waiting Time";
  private static final String synX843String = "Algorithm";
  private static final String synX842String = "%-9s%23s%26s";
  private static final String synX841String = "Summary";
  private static final String synX840String = "Summary\n";
  public static int ForwardingAgain;
  private java.util.LinkedList<Appendage> method;
  private java.util.ArrayDeque<Synchronization> work;

  public Distributor() {
    Organizer.Synchronization scheduling;
    Organizer.Synchronization trilled;
    Organizer.Synchronization grt;
    Organizer.Synchronization grr;
    Organizer.Synchronization downstream;
    this.work = new java.util.ArrayDeque<>();
    scheduling = new Multitasking.Using.SptTimer();
    trilled = new Database.Caboose.OmskSpooler();
    grt = new Interface.Grt.TrsDeveloper();
    grr = new Controller.Grr.GrrProgrammer();
    downstream = new Developer.Replies.FlDatabase();
    this.work.addLast(scheduling);
    this.work.addLast(trilled);
    this.work.addLast(grt);
    this.work.addLast(downstream);
    this.work.addLast(grr);
  }

  public synchronized void bentTechnologies(java.util.LinkedList<Appendage> proces) {
    this.method = proces;
  }

  public synchronized void placedMurderWhen(int communiqueMeter) {
    this.ForwardingAgain = communiqueMeter;
  }

  public synchronized void extendDealer() {
    for (Organizer.Synchronization fh : work) synx98(fh);
    this.reprintSummarizing();
  }

  public synchronized void reprintSummarizing() {

    try {
      java.lang.String lead;
      PhaseSimulations.AmperageSubmitting.write(synX840String);
      out.println(synX841String);
      lead = format(synX842String, synX843String, synX844String, synX845String);
      PhaseSimulations.AmperageSubmitting.write(lead + synX846String);
      out.println(lead);
      for (Organizer.Synchronization waffen : work) synx99(waffen);
      PhaseSimulations.AmperageSubmitting.close();
    } catch (java.io.IOException combatants) {
      out.println(synX847String);
    }
  }

  private synchronized void synx98(Synchronization fh) {
    fh.beginningOrganizer();

    while (fh.goIsMoving()) {

      if (fh.makeUndertakenMarchDimensions() == method.size()) {
        fh.discontinueTimer();
      } else {
        java.util.LinkedList<Appendage> beganAppendage;
        beganAppendage = new java.util.LinkedList<>();
        for (Organizer.Appendage cern : method) {

          if (cern.haveMeetPeriods() == fh.canExistingDial() + synX848int) {
            beganAppendage.add(new Organizer.Appendage(cern));
          }
        }
        sort(beganAppendage);

        while (!beganAppendage.isEmpty()) {
          fh.procedureIngoing(beganAppendage.removeFirst());
        }
        fh.placedRifeCheck(fh.canExistingDial() + synX849int);
        fh.weapMark();
      }
    }
  }

  private synchronized void synx99(Synchronization waffen) {
    java.lang.String summarized;
    summarized =
        format(
            synX850String,
            waffen.configurationDiscover(),
            waffen.beatHalfNotJuncture(),
            waffen.takeMeanUpturnPeriod());
    PhaseSimulations.AmperageSubmitting.write(summarized + synX851String);
    out.println(summarized);
  }
}
