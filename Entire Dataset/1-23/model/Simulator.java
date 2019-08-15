package model;

import indiscernible.HourWatchman;
import producingAim.DepositionalObjet;
import output.*;
import storeroom.*;
import accomplishment.*;
import static java.lang.System.out;

public class Simulator {
  private static final String synX1800String = " ----------------------------------------------- ";
  private static final String synX1799String = " ----------------------------------------------- ";
  private static final String synX1798String = "Average Count";
  private static final String synX1797String = "Average Time";
  private static final String synX1796String = "Storage ID";
  private static final String synX1795String = "| %-14s | %-12s | %-12s |";
  private static final String synX1794String = " ----------------------------------------------- ";
  private static final String synX1793String = "Storage";
  private static final String synX1792String =
      " ----------------------------------------------------- ";
  private static final String synX1791String =
      "|-----------------------------------------------------|";
  private static final String synX1790String = "Blocked";
  private static final String synX1789String = "Starving";
  private static final String synX1788String = "Production";
  private static final String synX1787String = "Producer ID";
  private static final String synX1786String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1785String =
      " ----------------------------------------------------- ";
  private static final String synX1784String = "Assemblers";
  private static final String synX1783String = "Statistics\n";
  private static final String synX1782String = "ProducibleObject count: ";
  private static final String synX1781String = "Storage Capacity: %d";
  private static final String synX1780String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1779int = 0;

  public synchronized void run() {
    Simulator.liveSimulator = (this);

    while (indiscernible.HourWatchman.prevalentNow() < this.daysBoundary
        && this.caseWaiting.census() > synX1779int) {
      this.caseWaiting.firstParade().serveParade();
    }
    this.newspaperSurvey();
  }

  private accomplishment.SymposiumSufferance caseWaiting = null;

  public static synchronized model.Simulator contemporaryFeigning() {
    return liveSimulator;
  }

  private output.Emitter producing[] = null;
  private storeroom.Storeroom depository[] = null;

  public Simulator(double dayBounds, double receivedMiserly, double criterialRank) {
    this.daysBoundary = (dayBounds);
    this.canonicalSmall = (receivedMiserly);
    this.acceptedRun = (criterialRank);
    this.caseWaiting = (new accomplishment.SymposiumSufferance());
    this.producing = (new output.Emitter[8]);
    this.depository = (new storeroom.Storeroom[5]);
    depository[0] = (new storeroom.Storeroom());
    depository[1] = (new storeroom.Storeroom());
    depository[2] = (new storeroom.Storeroom());
    depository[3] = (new storeroom.Storeroom());
    depository[4] = (new storeroom.Storeroom());
    producing[0] = (new output.GrowerDepart(this.canonicalSmall, this.acceptedRun, depository[0]));
    producing[1] =
        (new output.ManufacturerBase(
            this.canonicalSmall, this.acceptedRun, depository[1], depository[0]));
    producing[2] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]));
    producing[3] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]));
    producing[4] =
        (new output.ManufacturerBase(
            this.canonicalSmall, this.acceptedRun, depository[3], depository[2]));
    producing[5] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]));
    producing[6] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]));
    producing[7] =
        (new output.OperatorConclude(this.canonicalSmall, this.acceptedRun, depository[4]));
    depository[0].markAhead(producing[1]);
    depository[0].placeSuccessive(producing[0]);
    depository[1].markAhead(producing[2], producing[3]);
    depository[1].placeSuccessive(producing[1]);
    depository[2].markAhead(producing[4]);
    depository[2].placeSuccessive(producing[2], producing[3]);
    depository[3].markAhead(producing[5], producing[6]);
    depository[3].placeSuccessive(producing[4]);
    depository[4].markAhead(producing[7]);
    depository[4].placeSuccessive(producing[5], producing[6]);
    this.caseWaiting.enterGala(
        new accomplishment.DirectorSeminar(
            indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, producing[0]));
  }

  private static model.Simulator liveSimulator = null;

  private synchronized void newspaperSurvey() {
    out.println(
        java.lang.String.format(
            synX1780String,
            this.daysBoundary,
            indiscernible.HourWatchman.prevalentNow(),
            this.canonicalSmall,
            this.acceptedRun));
    out.println(java.lang.String.format(synX1781String, storeroom.Storeroom.closetMax()));
    out.println(synX1782String + producingAim.DepositionalObjet.liveMatter());
    out.println();
    out.println(synX1783String);
    out.println(synX1784String);
    out.println(synX1785String);
    out.println(
        java.lang.String.format(
            synX1786String, synX1787String, synX1788String, synX1789String, synX1790String));
    out.println(synX1791String);
    for (output.Emitter equally : producing) {
      out.println(equally.information());
    }
    out.println(synX1792String);
    out.println();
    out.println(synX1793String);
    out.println(synX1794String);
    out.println(
        java.lang.String.format(synX1795String, synX1796String, synX1797String, synX1798String));
    out.println(synX1799String);
    for (storeroom.Storeroom ora : depository) {
      out.println(ora.censuses());
    }
    out.println(synX1800String);
  }

  public synchronized double yearsCurtail() {
    return this.daysBoundary;
  }

  private double daysBoundary = 0.0;
  private double canonicalSmall = 0.0;
  private double acceptedRun = 0.0;
}
