package Starter;

import Multitasking.Initialization.Answers.NealOrganizer;
import Multitasking.Spooler.Grr.GrrProgrammer;
import Multitasking.Methods;
import Multitasking.Programmer.Diddle.LyraSynchronizer;
import Multitasking.Spreadsheet.Obtaining.DesiredSpreadsheet;
import Multitasking.Debugging;
import Multitasking.Spooler.Lamps.UsingProgramming;
import Simulating.AppendageBrake;
import java.io.IOException;
import java.util.*;

public class Forwarder {
  private ArrayDeque<Debugging> using;
  private LinkedList<Methods> mechanisms;
  public static int ShipmentClip;

  public Forwarder() {
    this.using = new ArrayDeque<>();
    Debugging spt = new UsingProgramming();
    Debugging fuzee = new LyraSynchronizer();
    Debugging required = new DesiredSpreadsheet();
    Debugging grr = new GrrProgrammer();
    Debugging lm = new NealOrganizer();
    this.using.addLast(spt);
    this.using.addLast(fuzee);
    this.using.addLast(required);
    this.using.addLast(lm);
    this.using.addLast(grr);
  }

  public synchronized void fitTreat(LinkedList<Methods> serve) {
    this.mechanisms = serve;
  }

  public synchronized void determineDetachmentBeginning(int dispatchesHours) {
    this.ShipmentClip = dispatchesHours;
  }

  public synchronized void campaignReseller() {
    for (Debugging ora : using) synx314(ora);
    this.publishConcise();
  }

  public synchronized void publishConcise() {

    try {
      AppendageBrake.PerformanceArchives.write("Summary\n");
      System.out.println("Summary");
      String headline =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      AppendageBrake.PerformanceArchives.write(headline + "\n");
      System.out.println(headline);
      for (Debugging waffen : using) synx315(waffen);
      AppendageBrake.PerformanceArchives.close();
    } catch (IOException voto) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx314(Debugging ora) {
    ora.beginningOrganizer();

    while (ora.goIsMoving()) {

      if (ora.produceUndergoneMethodologiesDensity() == mechanisms.size()) {
        ora.terminateWriter();
      } else {
        LinkedList<Methods> beginsMarch = new LinkedList<>();
        for (Methods cern : mechanisms) {

          if (cern.sustainHearThing() == ora.goPrevailingClick() + 1) {
            beginsMarch.add(new Methods(cern));
          }
        }
        Collections.sort(beginsMarch);

        while (!beginsMarch.isEmpty()) {
          ora.treatInfluent(beginsMarch.removeFirst());
        }
        ora.placedRifeCheck(ora.goPrevailingClick() + 1);
        ora.bpsRetick();
      }
    }
  }

  private synchronized void synx315(Debugging waffen) {
    String compendious =
        String.format(
            "%-9s%23.2f%26.2f",
            waffen.timerMention(), waffen.arriveModalComeMonth(), waffen.beatHalfTurnJuncture());
    AppendageBrake.PerformanceArchives.write(compendious + "\n");
    System.out.println(compendious);
  }
}
