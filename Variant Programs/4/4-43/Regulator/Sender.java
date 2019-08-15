package Regulator;

import Interface.Timer.Opinions.AlterPlanner;
import Interface.Spreadsheet.Grr.GrrProgrammer;
import Interface.Mechanisms;
import Interface.Spooler.F.FuzeeWriter;
import Interface.Synchronizer.Determined.GrtProgrammer;
import Interface.Writer;
import Interface.Programming.Using.PapsOrganizer;
import Impactor.ProceedingsKinematics;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Sender {
  private static final String synX1879String = "Unable to write summary to file.";
  private static final String synX1878String = "\n";
  private static final String synX1877String = "%-9s%23.2f%26.2f";
  private static final String synX1876String = "\n";
  private static final String synX1875String = "Average Turnaround Time";
  private static final String synX1874String = "Average Waiting Time";
  private static final String synX1873String = "Algorithm";
  private static final String synX1872String = "%-9s%23s%26s";
  private static final String synX1871String = "Summary";
  private static final String synX1870String = "Summary\n";
  private static final int synX1869int = 1;
  private static final int synX1868int = 1;
  public ArrayDeque<Writer> number;
  public LinkedList<Mechanisms> operations;
  public static int DeployChance;

  public Sender() {
    this.number = new ArrayDeque<>();
    Writer degenerates = new PapsOrganizer();
    Writer f = new FuzeeWriter();
    Writer increasing = new GrtProgrammer();
    Writer grr = new GrrProgrammer();
    Writer direct = new AlterPlanner();
    this.number.addLast(degenerates);
    this.number.addLast(f);
    this.number.addLast(increasing);
    this.number.addLast(direct);
    this.number.addLast(grr);
  }

  public synchronized void markSummons(LinkedList<Mechanisms> operation) {
    this.operations = operation;
  }

  public synchronized void prepareSendNow(int deployingOpportunity) {
    this.DeployChance = deployingOpportunity;
  }

  public synchronized void streakVendor() {
    for (Writer fh : number) {
      fh.resumeServer();

      while (fh.goIsMoving()) {

        if (fh.becomeConcludedPracticesQuantity() == operations.size()) {
          fh.ceaseOrganizer();
        } else {
          LinkedList<Mechanisms> departingTechnologies = new LinkedList<>();
          for (Mechanisms cern : operations) {

            if (cern.canOccurYears() == fh.comeLatestTicktock() + synX1868int) {
              departingTechnologies.add(new Mechanisms(cern));
            }
          }
          Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            fh.methodsElected(departingTechnologies.removeFirst());
          }
          fh.bentPreviousAnswer(fh.comeLatestTicktock() + synX1869int);
          fh.weapMark();
        }
      }
    }
    this.printersUnofficial();
  }

  public synchronized void printersUnofficial() {

    try {
      ProceedingsKinematics.CropData.write(synX1870String);
      out.println(synX1871String);
      String commutator =
          String.format(synX1872String, synX1873String, synX1874String, synX1875String);
      ProceedingsKinematics.CropData.write(commutator + synX1876String);
      out.println(commutator);
      for (Writer waffen : number) {
        String overview =
            String.format(
                synX1877String,
                waffen.programmerEpithet(),
                waffen.driveRatesStayAgain(),
                waffen.becomeApproximatelyChangeOpportunity());
        ProceedingsKinematics.CropData.write(overview + synX1878String);
        out.println(overview);
      }
      ProceedingsKinematics.CropData.close();
    } catch (IOException abe) {
      out.println(synX1879String);
    }
  }
}
