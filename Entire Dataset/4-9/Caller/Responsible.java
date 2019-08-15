package Caller;

import Controller.Database.Opinions.ComSynchronization;
import Controller.Developer.Grr.GrrProgrammer;
import Controller.Cycle;
import Controller.Timer.Oxime.LyraSynchronizer;
import Controller.Spreadsheet.Determined.GrtProgrammer;
import Controller.Parser;
import Controller.Database.Lamps.LampsProgrammer;
import Modelling.TreatModelling;
import java.io.IOException;
import java.util.*;

public class Responsible {
  private static final int synX338int = 1738341244;
  private static final int synX337int = 1;
  private static final int synX336int = 1;
  private static final String synX335String = "o35SmPneb";
  private static final String synX334String = "Unable to write summary to file.";
  private static final String synX333String = "\n";
  private static final String synX332String = "%-9s%23.2f%26.2f";
  private static final String synX331String = "\n";
  private static final String synX330String = "Average Turnaround Time";
  private static final String synX329String = "Average Waiting Time";
  private static final String synX328String = "Algorithm";
  private static final String synX327String = "%-9s%23s%26s";
  private static final String synX326String = "Summary";
  private static final String synX325String = "Summary\n";
  private static final double synX324double = 0.4909183242169951;
  private static final double synX323double = 0.11534043817753448;

  public synchronized void primedAppendage(LinkedList<Cycle> methodology) {
    double juniorConstrained;
    juniorConstrained = synX323double;
    this.systems = methodology;
  }

  static String unfree = "7S";

  public synchronized void printersUnofficial() {
    double kilo;
    kilo = synX324double;

    try {
      String heading;
      TreatModelling.ProductivityDocuments.write(synX325String);
      System.out.println(synX326String);
      heading = String.format(synX327String, synX328String, synX329String, synX330String);
      TreatModelling.ProductivityDocuments.write(heading + synX331String);
      System.out.println(heading);
      for (Parser waffen : work) {
        String concise;
        concise =
            String.format(
                synX332String,
                waffen.workspaceForename(),
                waffen.goMedianAwaitClock(),
                waffen.developTypicalRevitalizationHour());
        TreatModelling.ProductivityDocuments.write(concise + synX333String);
        System.out.println(concise);
      }
      TreatModelling.ProductivityDocuments.close();
    } catch (IOException con) {
      System.out.println(synX334String);
    }
  }

  public synchronized void endureRetailer() {
    String apexRestrictions;
    apexRestrictions = synX335String;
    for (Parser ora : work) {
      ora.beginsCallback();

      while (ora.goIsMoving()) {

        if (ora.produceUndergoneMethodologiesDensity() == systems.size()) {
          ora.checkWorkflow();
        } else {
          LinkedList<Cycle> leavingProces;
          leavingProces = new LinkedList<>();
          for (Cycle writes : systems) {

            if (writes.sustainHearThing() == ora.takeTopicalMark() + synX336int) {
              leavingProces.add(new Cycle(writes));
            }
          }
          Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            ora.operationInbound(leavingProces.removeFirst());
          }
          ora.determinePresentRicky(ora.takeTopicalMark() + synX337int);
          ora.weapMark();
        }
      }
    }
    this.printersUnofficial();
  }

  public static int RoutingWeek = 0;

  public synchronized void laidShipmentClip(int deploymentMinutes) {
    int highestLimit;
    highestLimit = synX338int;
    this.RoutingWeek = deploymentMinutes;
  }

  public ArrayDeque<Parser> work = null;

  public Responsible() {
    Parser spt;
    Parser gpa;
    Parser obtaining;
    Parser grr;
    Parser tm;
    this.work = new ArrayDeque<>();
    spt = new LampsProgrammer();
    gpa = new LyraSynchronizer();
    obtaining = new GrtProgrammer();
    grr = new GrrProgrammer();
    tm = new ComSynchronization();
    this.work.addLast(spt);
    this.work.addLast(gpa);
    this.work.addLast(obtaining);
    this.work.addLast(tm);
    this.work.addLast(grr);
  }

  public LinkedList<Cycle> systems = null;
}
