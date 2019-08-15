package Forwarder;

import Programmer.Synchronizer.Opinions.LmDebugging;
import Programmer.Interface.Grr.GrrProgrammer;
import Programmer.Sue;
import Programmer.Multitasking.Sta.BWorkspace;
import Programmer.Controller.Treated.MrcOrganizer;
import Programmer.Callback;
import Programmer.Configuration.Spt.UsingProgramming;
import Moot.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Yardmaster {
  private static final double synX2071double = 0.4555023265248296;
  private static final double synX2070double = 0.2831617882120774;
  private static final int synX2069int = 308479344;
  private static final String synX2068String = "Unable to write summary to file.";
  private static final String synX2067String = "\n";
  private static final String synX2066String = "Average Turnaround Time";
  private static final String synX2065String = "Average Waiting Time";
  private static final String synX2064String = "Algorithm";
  private static final String synX2063String = "%-9s%23s%26s";
  private static final String synX2062String = "Summary";
  private static final String synX2061String = "Summary\n";
  private static final double synX2060double = 0.8205504225621054;

  public synchronized void reprintingSummarized() {
    double flag = synX2060double;

    try {
      SummonsFaker.ProducesFilename.write(synX2061String);
      System.out.println(synX2062String);
      java.lang.String title =
          java.lang.String.format(synX2063String, synX2064String, synX2065String, synX2066String);
      SummonsFaker.ProducesFilename.write(title + synX2067String);
      System.out.println(title);
      for (Programmer.Callback waffen : using) synx434(waffen);
      SummonsFaker.ProducesFilename.close();
    } catch (java.io.IOException vet) {
      System.out.println(synX2068String);
    }
  }

  public static int SendingHour;
  public static String mention = "ii02GHocXxb";

  public synchronized void passMailer() {
    int enchained = synX2069int;
    for (Programmer.Callback fh : using) synx435(fh);
    this.reprintingSummarized();
  }

  public Yardmaster() {
    this.using = new java.util.ArrayDeque<>();
    Programmer.Callback paps = new Configuration.Spt.UsingProgramming();
    Programmer.Callback gpa = new Multitasking.Sta.BWorkspace();
    Programmer.Callback mrc = new Controller.Treated.MrcOrganizer();
    Programmer.Callback grr = new Interface.Grr.GrrProgrammer();
    Programmer.Callback ap = new Synchronizer.Opinions.LmDebugging();
    this.using.addLast(paps);
    this.using.addLast(gpa);
    this.using.addLast(mrc);
    this.using.addLast(ap);
    this.using.addLast(grr);
  }

  public java.util.ArrayDeque<Callback> using;

  public synchronized void readyMarch(java.util.LinkedList<Sue> mechanism) {
    double measure = synX2070double;
    this.treat = mechanism;
  }

  public synchronized void markDispatchesHours(int removeDay) {
    double fettered = synX2071double;
    this.SendingHour = removeDay;
  }

  public java.util.LinkedList<Sue> treat;

  private synchronized void synx434(Callback waffen) {
    java.lang.String precis =
        java.lang.String.format(
            "%-9s%23.2f%26.2f",
            waffen.writerAdvert(), waffen.goMedianAwaitClock(), waffen.catchCommonRevivalWhen());
    SummonsFaker.ProducesFilename.write(precis + "\n");
    System.out.println(precis);
  }

  private synchronized void synx435(Callback fh) {
    fh.beginsCallback();

    while (fh.goIsMoving()) {

      if (fh.arriveUndertookProceduresWingspan() == treat.size()) {
        fh.quitProgramming();
      } else {
        java.util.LinkedList<Sue> beginAct = new java.util.LinkedList<>();
        for (Programmer.Sue writes : treat) {

          if (writes.produceComingNow() == fh.catchRifeCheck() + 1) {
            beginAct.add(new Programmer.Sue(writes));
          }
        }
        java.util.Collections.sort(beginAct);

        while (!beginAct.isEmpty()) {
          fh.methodologyArrival(beginAct.removeFirst());
        }
        fh.fitUnderwayWalk(fh.catchRifeCheck() + 1);
        fh.optiBeat();
      }
    }
  }
}
