package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ExtractionFurrowOwner {
  public int maximumQ = 0;
  public seng2200.Synchronizer priority = null;

  public synchronized void inkAfootHours() {
    out.println("Current time: " + format("%6.3f", this.priority.developPreviousHour()));
  }

  public synchronized void cultivateDevelopmentLandscape() {
    seng2200.AcrossDegreeStoring q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = (new seng2200.AcrossDegreeStoring("Q01", this.maximumQ));
    q02 = (new seng2200.AcrossDegreeStoring("Q12", this.maximumQ));
    q03 = (new seng2200.AcrossDegreeStoring("Q23", this.maximumQ));
    q04 = (new seng2200.AcrossDegreeStoring("Q34", this.maximumQ));
    q05 = (new seng2200.AcrossDegreeStoring("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.ProducesSpotlight g =
        new seng2200.JumpMoment("S0", q01, this.spiteful, this.rank, this.priority);
    seng2200.ProducesSpotlight kda =
        new seng2200.MidyearPoint("S1", q01, q02, this.spiteful, this.rank, this.priority);
    seng2200.ProducesSpotlight s2a =
        new seng2200.MidyearPoint("S2a", q02, q03, this.spiteful * 2, this.rank * 2, this.priority);
    seng2200.ProducesSpotlight s2b =
        new seng2200.MidyearPoint("S2b", q02, q03, this.spiteful, this.rank * 0.5, this.priority);
    seng2200.ProducesSpotlight s4 =
        new seng2200.MidyearPoint("S3", q03, q04, this.spiteful, this.rank, this.priority);
    seng2200.ProducesSpotlight s4a =
        new seng2200.MidyearPoint("S4a", q04, q05, this.spiteful, this.rank * 0.5, this.priority);
    seng2200.ProducesSpotlight s4b =
        new seng2200.MidyearPoint("S4b", q04, q05, this.spiteful * 2, this.rank * 2, this.priority);
    seng2200.ProducesSpotlight lll =
        new seng2200.FinishRostrum(
            "S5", q05, this.spiteful, this.rank, this.stabHurry, this.priority);
    g.placeProperlyUrges(kda);
    kda.adjustUnexhaustedStimulate(g);
    kda.placeProperlyUrges(s2a);
    kda.placeProperlyUrges(s2b);
    s2a.adjustUnexhaustedStimulate(kda);
    s2a.placeProperlyUrges(s4);
    s2b.adjustUnexhaustedStimulate(kda);
    s2b.placeProperlyUrges(s4);
    s4.adjustUnexhaustedStimulate(s2a);
    s4.adjustUnexhaustedStimulate(s2b);
    s4.placeProperlyUrges(s4a);
    s4.placeProperlyUrges(s4b);
    s4a.adjustUnexhaustedStimulate(s4);
    s4a.placeProperlyUrges(lll);
    s4b.adjustUnexhaustedStimulate(s4);
    s4b.placeProperlyUrges(lll);
    lll.adjustUnexhaustedStimulate(s4a);
    lll.adjustUnexhaustedStimulate(s4b);
    this.jabRostrumLitany.add(g);
    this.jabRostrumLitany.add(kda);
    this.jabRostrumLitany.add(s2a);
    this.jabRostrumLitany.add(s2b);
    this.jabRostrumLitany.add(s4);
    this.jabRostrumLitany.add(s4a);
    this.jabRostrumLitany.add(s4b);
    this.jabRostrumLitany.add(lll);
  }

  public synchronized void lithographCareersCalculate() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println("3) Paths");
    java.lang.String primaryFormat3 = "%-30s%-15s";
    out.println(format(primaryFormat3, "Path", "total Items"));
    java.util.Map<String, Double> route = this.stabHurry.comeWayNumber();
    for (Entry<String, Double> access : route.entrySet()) synx84(sb3, primaryFormat3, access);
    out.println(sb3.toString());
  }

  public synchronized void braillePerformingQuickly() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println("1) Production Stages");
    java.lang.String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat1 = "%6.3f";
    java.lang.String operators = null, feed = null, immobilize = null;
    out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.ProducesSpotlight fh : this.jabRostrumLitany) {
      operators = (format(particularFormat1, fh.havePodiumHalfFactory()) + "%");
      feed = (format(particularFormat1, fh.havePodiumEntireChoke()));
      immobilize = (format(particularFormat1, fh.catchMomentFullStalled()));
      sb1.append(
          format(
              primaryFormat1,
              fh.catchInciteDescribe(),
              fh.letGovernment(),
              operators,
              feed,
              immobilize,
              format(particularFormat1, fh.findGrossSentenceProcess())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public double spiteful = 0.0;

  public synchronized void brailleWorkloadScope() {
    out.println("4) Job Count: " + this.priority.driveWorkloadFigures());
    out.println(format(this.priority.makeHardcopyVersion(), "Job", "Remaining Duration"));
    out.println(this.priority.fetchSubject());
  }

  public boolean IS_Bug = false;

  public synchronized void paperRanking() {
    out.println("Simulation's Final Snapshot");
    this.inkAfootHours();
    this.braillePerformingQuickly();
    this.publishIsqClock();
    this.lithographCareersCalculate();
    this.brailleWorkloadScope();
    out.println("Total items Created: " + this.jabRostrumLitany.get(0).letWholeMaterialsInvented());
    out.println("Total Items Finished: " + this.stabHurry.letWholeMaterials());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException samad) {
      err.println(samad);
    }
  }

  public java.util.ArrayList<ProducesSpotlight> jabRostrumLitany = null;
  public java.util.ArrayList<AcrossDegreeStoring> isqNumber = null;

  public synchronized void operationStages() {
    for (seng2200.ProducesSpotlight waffen : this.jabRostrumLitany) synx85(waffen);
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println("2) ISQ's");
    java.lang.String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat2 = "%6.3f";
    java.lang.String distinguish = null, ltdMonth = null, incPieces = null;
    java.lang.String enumeration = null;
    out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.AcrossDegreeStoring q : this.isqNumber) {
      distinguish = (q.drawGens());
      ltdMonth = (format(particularFormat2, q.goIsqWaitingClock()));
      incPieces = (format(particularFormat2, q.goIsqAverageParticularTally()));
      enumeration =
          ((q.isComplete())
              ? format("%-5s%-5s", q.letAfootCharge(), "FULL")
              : java.lang.Integer.toString(q.letAfootCharge()));
      sb2.append(format(primaryFormat2, distinguish, enumeration, ltdMonth, incPieces));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public seng2200.FilmingCountry stabHurry = null;

  {
    IS_Bug = (false);
  }

  public ExtractionFurrowOwner(double hateful, double stray, int maximumQDuration) {
    this.spiteful = (hateful);
    this.rank = (stray);
    this.maximumQ = (maximumQDuration);
    this.jabRostrumLitany = (new java.util.ArrayList<ProducesSpotlight>());
    this.isqNumber = (new java.util.ArrayList<AcrossDegreeStoring>());
    this.stabHurry = (new seng2200.FilmingCountry(this.jabRostrumLitany));
    this.priority = (new seng2200.Synchronizer(8));
  }

  public synchronized void commencementSolve() {
    seng2200.ProducesSpotlight placeRanked = null;
    this.cultivateDevelopmentLandscape();

    if (IS_Bug) synx86();

    while (this.priority.developPreviousHour() < this.CeilingMinutes) {
      this.operationStages();
      placeRanked = (this.priority.danceThenTasks());
      for (seng2200.ProducesSpotlight postscript : this.jabRostrumLitany)
        synx87(postscript, placeRanked);
      this.postageAverageParticular();

      if (IS_Bug == true) synx88();
    }
    this.paperRanking();

    if (dsl != null) dsl.close();
  }

  public double rank = 0.0;
  public final double CeilingMinutes = 10000000;

  public synchronized void postageAverageParticular() {
    for (seng2200.AcrossDegreeStoring q : this.isqNumber) synx89(q);
  }

  public ExtractionFurrowOwner() {
    this.spiteful = (0);
    this.rank = (0);
    this.maximumQ = (0);
  }

  public java.util.Scanner dsl = null;

  private synchronized void synx84(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> access) {
    sb3.append(format(primaryFormat3, access.getKey(), access.getValue()));
    sb3.append("\n");
  }

  private synchronized void synx85(ProducesSpotlight waffen) {
    waffen.appendageGoods(this.priority.developPreviousHour());
  }

  private synchronized void synx86() {
    this.dsl = (new java.util.Scanner(in));
  }

  private synchronized void synx87(ProducesSpotlight postscript, ProducesSpotlight placeRanked) {

    if (postscript != placeRanked) postscript.unkTellSah(this.priority.developPreviousHour());
  }

  private synchronized void synx88() {
    this.paperRanking();
    dsl.nextLine();
  }

  private synchronized void synx89(AcrossDegreeStoring q) {
    q.pestleConsider();
  }
}
