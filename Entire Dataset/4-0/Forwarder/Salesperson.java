package Forwarder;

import Controller.Callback.Replies.IkWorkspace;
import Controller.Server.Grr.GrrProgrammer;
import Controller.Cycle;
import Controller.Callback.B.EtdDeveloper;
import Controller.Planner.Required.MinimumController;
import Controller.Parser;
import Controller.Workflow.Lamps.SptTimer;
import Device.SummonsFaker;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Salesperson {
  private static final String synX19String = "\n";
  private static final String synX18String = "%-9s%23.2f%26.2f";
  private static final int synX17int = 1;
  private static final int synX16int = 1;
  private static final String synX15String = "Unable to write summary to file.";
  private static final String synX14String = "\n";
  private static final String synX13String = "Average Turnaround Time";
  private static final String synX12String = "Average Waiting Time";
  private static final String synX11String = "Algorithm";
  private static final String synX10String = "%-9s%23s%26s";
  private static final String synX9String = "Summary";
  private static final String synX8String = "Summary\n";
  private static final double synX7double = 0.8355062157463564;
  private static final int synX6int = -772329283;
  private static final double synX5double = 0.052084538173983286;
  private static final int synX4int = 1327824311;
  public static int MailAmount;
  public java.util.LinkedList<Cycle> technologies;
  public java.util.ArrayDeque<Parser> different;
  public static final double indicator = 0.34984357308510083;

  public Salesperson() {
    Controller.Parser lamps;
    Controller.Parser f;
    Controller.Parser obtained;
    Controller.Parser grr;
    Controller.Parser com;
    this.different = (new java.util.ArrayDeque<>());
    lamps = (new Workflow.Lamps.SptTimer());
    f = (new Callback.B.EtdDeveloper());
    obtained = (new Planner.Required.MinimumController());
    grr = (new Server.Grr.GrrProgrammer());
    com = (new Callback.Replies.IkWorkspace());
    this.different.addLast(lamps);
    this.different.addLast(f);
    this.different.addLast(obtained);
    this.different.addLast(com);
    this.different.addLast(grr);
  }

  public synchronized void determineProces(java.util.LinkedList<Cycle> march) {
    int threshold;
    threshold = (synX4int);
    this.technologies = (march);
  }

  public synchronized void adjustDispatchedMonth(int dispatchedMonth) {
    double evaluate;
    evaluate = (synX5double);
    this.MailAmount = (dispatchedMonth);
  }

  public synchronized void operateStarter() {
    int bestAmount;
    bestAmount = (synX6int);
    for (Controller.Parser waffen : different) synx2(waffen);
    this.newspaperAnalysis();
  }

  public synchronized void newspaperAnalysis() {
    double secDepth;
    secDepth = (synX7double);

    try {
      java.lang.String banner;
      SummonsFaker.EfficiencyDocket.write(synX8String);
      out.println(synX9String);
      banner = (format(synX10String, synX11String, synX12String, synX13String));
      SummonsFaker.EfficiencyDocket.write(banner + synX14String);
      out.println(banner);
      for (Controller.Parser ora : different) synx3(ora);
      SummonsFaker.EfficiencyDocket.close();
    } catch (java.io.IOException officio) {
      out.println(synX15String);
    }
  }

  private synchronized void synx2(Parser waffen) {
    waffen.outsetDeveloper();

    while (waffen.goIsMoving()) {

      if (waffen.generatePerformedTreatFootprint() == technologies.size()) {
        waffen.diaphragmWorkspace();
      } else {
        java.util.LinkedList<Cycle> openingProcedure;
        openingProcedure = (new java.util.LinkedList<>());
        for (Controller.Cycle writes : technologies) {

          if (writes.driveAriseAgain() == waffen.fetchPresentRicky() + synX16int) {
            openingProcedure.add(new Controller.Cycle(writes));
          }
        }
        sort(openingProcedure);

        while (!openingProcedure.isEmpty()) {
          waffen.formalitiesImpending(openingProcedure.removeFirst());
        }
        waffen.bentPreviousAnswer(waffen.fetchPresentRicky() + synX17int);
        waffen.weapMark();
      }
    }
  }

  private synchronized void synx3(Parser ora) {
    java.lang.String summarized;
    summarized =
        (format(
            synX18String,
            ora.organizerList(),
            ora.developTypicalAwaitedHour(),
            ora.startOverallDownturnMinutes()));
    SummonsFaker.EfficiencyDocket.write(summarized + synX19String);
    out.println(summarized);
  }
}
