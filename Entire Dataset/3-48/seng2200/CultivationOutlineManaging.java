package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class CultivationOutlineManaging {
  private java.util.Scanner editor;
  private boolean IS_Bug = false;
  private final double UltimateHour = 10000000;
  private seng2200.ProducesOxygen needleStatehood;
  private seng2200.Debugging salon;
  private java.util.ArrayList<AmorTheaterWarehousing> isqNumber;
  private java.util.ArrayList<ProcessingScale> goadLevelName;
  private int maximumQ;
  private double chain;
  private double stingy;

  CultivationOutlineManaging() {
    this.stingy = (0);
    this.chain = (0);
    this.maximumQ = (0);
  }

  CultivationOutlineManaging(double small, double compass, int maximumQDuration) {
    this.stingy = (small);
    this.chain = (compass);
    this.maximumQ = (maximumQDuration);
    this.goadLevelName = (new java.util.ArrayList<ProcessingScale>());
    this.isqNumber = (new java.util.ArrayList<AmorTheaterWarehousing>());
    this.needleStatehood = (new seng2200.ProducesOxygen(this.goadLevelName));
    this.salon = (new seng2200.Debugging(8));
  }

  public synchronized void firstPlow() {
    seng2200.ProcessingScale theatricalWrap;
    this.cultivateDevelopmentLandscape();

    if (IS_Bug) synx524();

    while (this.salon.sustainThisThing() < this.UltimateHour) {
      this.workProcess();
      theatricalWrap = (this.salon.singCloseTask());
      for (seng2200.ProcessingScale cern : this.goadLevelName) synx525(cern, theatricalWrap);
      this.eradicateAttsPurchases();

      if (IS_Bug == true) synx526();
    }
    this.reprintStature();

    if (editor != null) editor.close();
  }

  private synchronized void workProcess() {
    for (seng2200.ProcessingScale ora : this.goadLevelName) synx527(ora);
  }

  private synchronized void cultivateDevelopmentLandscape() {
    seng2200.AmorTheaterWarehousing q01, q02, q03, q04, q05;
    seng2200.ProcessingScale fig;
    seng2200.ProcessingScale l5;
    seng2200.ProcessingScale s2a;
    seng2200.ProcessingScale s2b;
    seng2200.ProcessingScale l4;
    seng2200.ProcessingScale s4a;
    seng2200.ProcessingScale s4b;
    seng2200.ProcessingScale s4;
    q01 = (new seng2200.AmorTheaterWarehousing("Q01", this.maximumQ));
    q02 = (new seng2200.AmorTheaterWarehousing("Q12", this.maximumQ));
    q03 = (new seng2200.AmorTheaterWarehousing("Q23", this.maximumQ));
    q04 = (new seng2200.AmorTheaterWarehousing("Q34", this.maximumQ));
    q05 = (new seng2200.AmorTheaterWarehousing("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    fig = (new seng2200.EarlyTheatrical("S0", q01, this.stingy, this.chain, this.salon));
    l5 = (new seng2200.CenterInstar("S1", q01, q02, this.stingy, this.chain, this.salon));
    s2a = (new seng2200.CenterInstar("S2a", q02, q03, this.stingy * 2, this.chain * 2, this.salon));
    s2b = (new seng2200.CenterInstar("S2b", q02, q03, this.stingy, this.chain * 0.5, this.salon));
    l4 = (new seng2200.CenterInstar("S3", q03, q04, this.stingy, this.chain, this.salon));
    s4a = (new seng2200.CenterInstar("S4a", q04, q05, this.stingy, this.chain * 0.5, this.salon));
    s4b = (new seng2200.CenterInstar("S4b", q04, q05, this.stingy * 2, this.chain * 2, this.salon));
    s4 =
        (new seng2200.NetJuncture(
            "S5", q05, this.stingy, this.chain, this.needleStatehood, this.salon));
    fig.rigidFarOperators(l5);
    l5.fitNighJab(fig);
    l5.rigidFarOperators(s2a);
    l5.rigidFarOperators(s2b);
    s2a.fitNighJab(l5);
    s2a.rigidFarOperators(l4);
    s2b.fitNighJab(l5);
    s2b.rigidFarOperators(l4);
    l4.fitNighJab(s2a);
    l4.fitNighJab(s2b);
    l4.rigidFarOperators(s4a);
    l4.rigidFarOperators(s4b);
    s4a.fitNighJab(l4);
    s4a.rigidFarOperators(s4);
    s4b.fitNighJab(l4);
    s4b.rigidFarOperators(s4);
    s4.fitNighJab(s4a);
    s4.fitNighJab(s4b);
    this.goadLevelName.add(fig);
    this.goadLevelName.add(l5);
    this.goadLevelName.add(s2a);
    this.goadLevelName.add(s2b);
    this.goadLevelName.add(l4);
    this.goadLevelName.add(s4a);
    this.goadLevelName.add(s4b);
    this.goadLevelName.add(s4);
  }

  private synchronized void editionPhasesWorsts() {
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String spur, famish, parry;
    sb1 = (new java.lang.StringBuilder());
    System.out.println("1) Production Stages");
    primaryFormat1 = ("%-15s%-15s%-15s%-15s%-15s%-15s");
    particularFormat1 = ("%6.3f");
    System.out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.ProcessingScale fh : this.goadLevelName) {
      spur = (format(particularFormat1, fh.receiveLegGtaProducer()) + "%");
      famish = (format(particularFormat1, fh.goPhaseTallyHunger()));
      parry = (format(particularFormat1, fh.letTheaterWholeHalted()));
      sb1.append(
          format(
              primaryFormat1,
              fh.beatLabelPatronymic(),
              fh.developStatehood(),
              spur,
              famish,
              parry,
              format(particularFormat1, fh.receiveNumberMomentAct())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  private synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String nickname, boulDay, incPieces;
    java.lang.String reckoning;
    sb2 = (new java.lang.StringBuilder());
    System.out.println("2) ISQ's");
    primaryFormat2 = ("%-15s%-15s%-15s%-15s");
    particularFormat2 = ("%6.3f");
    System.out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.AmorTheaterWarehousing q : this.isqNumber) {
      nickname = (q.makeIdentify());
      boulDay = (format(particularFormat2, q.goIsqWaitingClock()));
      incPieces = (format(particularFormat2, q.goIsqAverageParticularTally()));
      reckoning =
          ((q.isComplete())
              ? format("%-5s%-5s", q.beatTypicalRely(), "FULL")
              : java.lang.Integer.toString(q.beatTypicalRely()));
      sb2.append(format(primaryFormat2, nickname, reckoning, boulDay, incPieces));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  private synchronized void eradicateAttsPurchases() {
    for (seng2200.AmorTheaterWarehousing q : this.isqNumber) synx528(q);
  }

  private synchronized void photographyLinesRecount() {
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> approaches;
    sb3 = (new java.lang.StringBuilder());
    System.out.println("3) Paths");
    primaryFormat3 = ("%-30s%-15s");
    System.out.println(format(primaryFormat3, "Path", "total Items"));
    approaches = (this.needleStatehood.canLanesIndictment());
    for (Entry<String, Double> register : approaches.entrySet())
      synx529(sb3, primaryFormat3, register);
    System.out.println(sb3.toString());
  }

  private synchronized void lithographGigBibliographies() {
    System.out.println("4) Job Count: " + this.salon.produceUnemployedCalculation());
    System.out.println(format(this.salon.becomeCatalogCompress(), "Job", "Remaining Duration"));
    System.out.println(this.salon.sustainProvisions());
  }

  private synchronized void inkAfootHours() {
    System.out.println("Current time: " + format("%6.3f", this.salon.sustainThisThing()));
  }

  private synchronized void reprintStature() {
    System.out.println("Simulation's Final Snapshot");
    this.inkAfootHours();
    this.editionPhasesWorsts();
    this.publishIsqClock();
    this.photographyLinesRecount();
    this.lithographGigBibliographies();
    System.out.println(
        "Total items Created: " + this.goadLevelName.get(0).produceAddFoodsIntroduced());
    System.out.println("Total Items Finished: " + this.needleStatehood.arriveTotalityArtefacts());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException einsteinium) {
      System.err.println(einsteinium);
    }
  }

  private synchronized void synx524() {
    this.editor = (new java.util.Scanner(System.in));
  }

  private synchronized void synx525(ProcessingScale cern, ProcessingScale theatricalWrap) {

    if (cern != theatricalWrap) cern.cinCountryRum(this.salon.sustainThisThing());
  }

  private synchronized void synx526() {
    this.reprintStature();
    editor.nextLine();
  }

  private synchronized void synx527(ProcessingScale ora) {
    ora.methodsArticles(this.salon.sustainThisThing());
  }

  private synchronized void synx528(AmorTheaterWarehousing q) {
    q.philatelyGet();
  }

  private synchronized void synx529(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> register) {
    sb3.append(format(primaryFormat3, register.getKey(), register.getValue()));
    sb3.append("\n");
  }
}
