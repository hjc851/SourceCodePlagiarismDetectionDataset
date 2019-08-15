package Yardmaster;

import Synchronization.Organizer.Views.DownstreamCallback;
import Synchronization.Configuration.Grr.GrrProgrammer;
import Synchronization.Appendage;
import Synchronization.Controller.B.EInitialization;
import Synchronization.Parser.Minimum.LongerInitialization;
import Synchronization.Timer;
import Synchronization.Multitasking.Using.PapsOrganizer;
import Impactor.MechanismMockup;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Regulator {
  private LinkedList<Appendage> appendage;

  public synchronized void settledServe(LinkedList<Appendage> systems) {
    this.appendage = systems;
  }

  public synchronized void photographySnapshot() {

    try {
      MechanismMockup.InputInitiate.write("Summary\n");
      System.out.println("Summary");
      String headlines =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismMockup.InputInitiate.write(headlines + "\n");
      System.out.println(headlines);
      for (Timer fh : different) synx410(fh);
      MechanismMockup.InputInitiate.close();
    } catch (IOException aba) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private ArrayDeque<Timer> different;

  public synchronized void extendDealer() {
    for (Timer ora : different) synx411(ora);
    this.photographySnapshot();
  }

  public synchronized void placedMurderWhen(int dispatchedMonth) {
    this.DispatchesHours = dispatchedMonth;
  }

  public Regulator() {
    this.different = new ArrayDeque<>();
    Timer using = new PapsOrganizer();
    Timer ober = new EInitialization();
    Timer treated = new LongerInitialization();
    Timer grr = new GrrProgrammer();
    Timer con = new DownstreamCallback();
    this.different.addLast(using);
    this.different.addLast(ober);
    this.different.addLast(treated);
    this.different.addLast(con);
    this.different.addLast(grr);
  }

  public static int DispatchesHours;

  private synchronized void synx410(Timer fh) {
    String synopses =
        format(
            "%-9s%23.2f%26.2f",
            fh.plannerNominate(), fh.canRateQueueYears(), fh.findNormReverseSentence());
    MechanismMockup.InputInitiate.write(synopses + "\n");
    System.out.println(synopses);
  }

  private synchronized void synx411(Timer ora) {
    ora.beginsCallback();

    while (ora.goIsMoving()) {

      if (ora.fixAchievedMechanismsProportions() == appendage.size()) {
        ora.quitProgramming();
      } else {
        LinkedList<Appendage> starterOutgrowth = new LinkedList<>();
        for (Appendage vig : appendage) {

          if (vig.developHappensHour() == ora.receiveContemporaryTicktack() + 1) {
            starterOutgrowth.add(new Appendage(vig));
          }
        }
        sort(starterOutgrowth);

        while (!starterOutgrowth.isEmpty()) {
          ora.workElect(starterOutgrowth.removeFirst());
        }
        ora.settledCirculatingShudder(ora.receiveContemporaryTicktack() + 1);
        ora.addTock();
      }
    }
  }
}
