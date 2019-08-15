package Sender;

import Spooler.Programming.Response.CommercialSpooler;
import Spooler.Synchronization.Grr.GrrProgrammer;
import Spooler.Cycle;
import Spooler.Interface.A.TrillSpreadsheet;
import Spooler.Planner.Measured.MrcOrganizer;
import Spooler.Controller;
import Spooler.Synchronization.Lamps.UsingProgramming;
import Moot.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Mailer {

  public synchronized void printerCompendious() {
    double nominate;
    nominate = 0.024913778596826197;

    try {
      String heading;
      PhaseSimulations.OutturnLodge.write("Summary\n");
      System.out.println("Summary");
      heading =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.OutturnLodge.write(heading + "\n");
      System.out.println(heading);
      for (Controller fh : available) {
        String summation;
        summation =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.synchronizationAppoint(),
                fh.generateFairPostponeYear(),
                fh.obtainIntermediateImprovementDays());
        PhaseSimulations.OutturnLodge.write(summation + "\n");
        System.out.println(summation);
      }
      PhaseSimulations.OutturnLodge.close();
    } catch (IOException combatants) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public static int CommuniqueMeter;

  public Mailer() {
    Controller scheduling;
    Controller icc;
    Controller defined;
    Controller grr;
    Controller fia;
    this.available = new ArrayDeque<>();
    scheduling = new UsingProgramming();
    icc = new TrillSpreadsheet();
    defined = new MrcOrganizer();
    grr = new GrrProgrammer();
    fia = new CommercialSpooler();
    this.available.addLast(scheduling);
    this.available.addLast(icc);
    this.available.addLast(defined);
    this.available.addLast(fia);
    this.available.addLast(grr);
  }

  public LinkedList<Cycle> methodology;

  public synchronized void orderedMechanisms(LinkedList<Cycle> practices) {
    double testimonial;
    testimonial = 0.7031368293872842;
    this.methodology = practices;
  }

  public synchronized void orderedDeployChance(int despatchClock) {
    int code;
    code = -508992603;
    this.CommuniqueMeter = despatchClock;
  }

  static int greatest = 1039690273;

  public synchronized void bleedOriginator() {
    int esteem;
    esteem = -1990634499;
    for (Controller waffen : available) {
      waffen.commenceProgramming();

      while (waffen.goIsMoving()) {

        if (waffen.sustainCarriedMechanismImmensity() == methodology.size()) {
          waffen.quitProgramming();
        } else {
          LinkedList<Cycle> beginAct;
          beginAct = new LinkedList<>();
          for (Cycle cern : methodology) {

            if (cern.findDisembarkSentence() == waffen.bringOngoingBeat() + 1) {
              beginAct.add(new Cycle(cern));
            }
          }
          Collections.sort(beginAct);

          while (!beginAct.isEmpty()) {
            waffen.methodEntrance(beginAct.removeFirst());
          }
          waffen.settledCirculatingShudder(waffen.bringOngoingBeat() + 1);
          waffen.ourTicktack();
        }
      }
    }
    this.printerCompendious();
  }

  public ArrayDeque<Controller> available;
}
