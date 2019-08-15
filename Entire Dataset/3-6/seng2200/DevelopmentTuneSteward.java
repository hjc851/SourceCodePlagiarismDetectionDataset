package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class DevelopmentTuneSteward {
  private static final String synX519String = "\n";
  private static final int synX518int = 100;
  private static final String synX517String = "Total Items Finished: ";
  private static final int synX516int = 0;
  private static final String synX515String = "Total items Created: ";
  private static final String synX514String = "Simulation's Final Snapshot";
  private static final String synX513String = "%6.3f";
  private static final String synX512String = "Current time: ";
  private static final String synX511String = "Remaining Duration";
  private static final String synX510String = "Job";
  private static final String synX509String = "4) Job Count: ";
  private static final String synX508String = "total Items";
  private static final String synX507String = "Path";
  private static final String synX506String = "%-30s%-15s";
  private static final String synX505String = "3) Paths";
  private static final String synX504String = "\n";
  private static final String synX503String = "FULL";
  private static final String synX502String = "%-5s%-5s";
  private static final String synX501String = "ave(items)";
  private static final String synX500String = "ave(t)";
  private static final String synX499String = "Item Count";
  private static final String synX498String = "ISQ";
  private static final String synX497String = "%6.3f";
  private static final String synX496String = "%-15s%-15s%-15s%-15s";
  private static final String synX495String = "2) ISQ's";
  private static final String synX494String = "\n";
  private static final String synX493String = "%";
  private static final String synX492String = "Total time";
  private static final String synX491String = "Block(t)";
  private static final String synX490String = "Starve(t)";
  private static final String synX489String = "Prod(%)";
  private static final String synX488String = "State";
  private static final String synX487String = "Stage";
  private static final String synX486String = "%6.3f";
  private static final String synX485String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX484String = "1) Production Stages";
  private static final String synX483String = "S5";
  private static final int synX482int = 2;
  private static final int synX481int = 2;
  private static final String synX480String = "S4b";
  private static final double synX479double = 0.5;
  private static final String synX478String = "S4a";
  private static final String synX477String = "S3";
  private static final double synX476double = 0.5;
  private static final String synX475String = "S2b";
  private static final int synX474int = 2;
  private static final int synX473int = 2;
  private static final String synX472String = "S2a";
  private static final String synX471String = "S1";
  private static final String synX470String = "S0";
  private static final String synX469String = "Q45";
  private static final String synX468String = "Q34";
  private static final String synX467String = "Q23";
  private static final String synX466String = "Q12";
  private static final String synX465String = "Q01";
  private static final boolean synX464boolean = true;
  private Scanner readout = null;
  private boolean IS_Bug = false;
  private final double PremiumPeriod = 10000000;
  private ThroughputCoeff jabUsa = null;
  private Planner nne = null;
  private ArrayList<AliaLegEntrepot> isqNumber = null;
  private ArrayList<ProduceArrange> farmPerformingBibliography = null;
  private int maximumQ = 0;
  private double crop = 0.0;
  private double intend = 0.0;

  DevelopmentTuneSteward() {
    this.intend = (0);
    this.crop = (0);
    this.maximumQ = (0);
  }

  DevelopmentTuneSteward(double hateful, double rove, int maximumQDuration) {
    this.intend = (hateful);
    this.crop = (rove);
    this.maximumQ = (maximumQDuration);
    this.farmPerformingBibliography = (new ArrayList<ProduceArrange>());
    this.isqNumber = (new ArrayList<AliaLegEntrepot>());
    this.jabUsa = (new ThroughputCoeff(this.farmPerformingBibliography));
    this.nne = (new Planner(8));
  }

  public synchronized void resumeBe() {
    ProduceArrange lapCompleting;
    lapCompleting = (null);
    this.buildManufacturingBuilding();

    if (IS_Bug) synx104();

    while (this.nne.obtainLiveDays() < this.PremiumPeriod) {
      this.negotiationsChapter();
      lapCompleting = (this.nne.engageSecondUnemployed());
      for (ProduceArrange writes : this.farmPerformingBibliography) synx105(writes, lapCompleting);
      this.markIntsUtensils();

      if (IS_Bug == synX464boolean) synx106();
    }
    this.printerEligibility();

    if (readout != null) readout.close();
  }

  private synchronized void negotiationsChapter() {
    for (ProduceArrange waffen : this.farmPerformingBibliography) synx107(waffen);
  }

  private synchronized void buildManufacturingBuilding() {
    AliaLegEntrepot q01, q02, q03, q04, q05;
    ProduceArrange l5;
    ProduceArrange f;
    ProduceArrange s2a;
    ProduceArrange s2b;
    ProduceArrange l6;
    ProduceArrange s4a;
    ProduceArrange s4b;
    ProduceArrange sl;
    q01 = (null);
    q02 = (null);
    q03 = (null);
    q04 = (null);
    q05 = (null);
    q01 = (new AliaLegEntrepot(synX465String, this.maximumQ));
    q02 = (new AliaLegEntrepot(synX466String, this.maximumQ));
    q03 = (new AliaLegEntrepot(synX467String, this.maximumQ));
    q04 = (new AliaLegEntrepot(synX468String, this.maximumQ));
    q05 = (new AliaLegEntrepot(synX469String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    l5 = (new GoPresent(synX470String, q01, this.intend, this.crop, this.nne));
    f = (new IntermediateLeg(synX471String, q01, q02, this.intend, this.crop, this.nne));
    s2a =
        (new IntermediateLeg(
            synX472String, q02, q03, this.intend * synX473int, this.crop * synX474int, this.nne));
    s2b =
        (new IntermediateLeg(
            synX475String, q02, q03, this.intend, this.crop * synX476double, this.nne));
    l6 = (new IntermediateLeg(synX477String, q03, q04, this.intend, this.crop, this.nne));
    s4a =
        (new IntermediateLeg(
            synX478String, q04, q05, this.intend, this.crop * synX479double, this.nne));
    s4b =
        (new IntermediateLeg(
            synX480String, q04, q05, this.intend * synX481int, this.crop * synX482int, this.nne));
    sl = (new WorstLeg(synX483String, q05, this.intend, this.crop, this.jabUsa, this.nne));
    l5.settledReactionaryDig(f);
    f.layLeftfieldGoading(l5);
    f.settledReactionaryDig(s2a);
    f.settledReactionaryDig(s2b);
    s2a.layLeftfieldGoading(f);
    s2a.settledReactionaryDig(l6);
    s2b.layLeftfieldGoading(f);
    s2b.settledReactionaryDig(l6);
    l6.layLeftfieldGoading(s2a);
    l6.layLeftfieldGoading(s2b);
    l6.settledReactionaryDig(s4a);
    l6.settledReactionaryDig(s4b);
    s4a.layLeftfieldGoading(l6);
    s4a.settledReactionaryDig(sl);
    s4b.layLeftfieldGoading(l6);
    s4b.settledReactionaryDig(sl);
    sl.layLeftfieldGoading(s4a);
    sl.layLeftfieldGoading(s4b);
    this.farmPerformingBibliography.add(l5);
    this.farmPerformingBibliography.add(f);
    this.farmPerformingBibliography.add(s2a);
    this.farmPerformingBibliography.add(s2b);
    this.farmPerformingBibliography.add(l6);
    this.farmPerformingBibliography.add(s4a);
    this.farmPerformingBibliography.add(s4b);
    this.farmPerformingBibliography.add(sl);
  }

  private synchronized void braillePerformingQuickly() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String oriented, thirst, impede;
    sb1 = (new StringBuilder());
    out.println(synX484String);
    primaryFormat1 = (synX485String);
    particularFormat1 = (synX486String);
    oriented = (null);
    thirst = (null);
    impede = (null);
    out.println(
        format(
            primaryFormat1,
            synX487String,
            synX488String,
            synX489String,
            synX490String,
            synX491String,
            synX492String));
    for (ProduceArrange fh : this.farmPerformingBibliography) {
      oriented = (format(particularFormat1, fh.fetchStepObpProductivity()) + synX493String);
      thirst = (format(particularFormat1, fh.fetchStepCombinedFeed()));
      impede = (format(particularFormat1, fh.becomeLapSummateIntercepted()));
      sb1.append(
          format(
              primaryFormat1,
              fh.haveDigFigure(),
              fh.drawSate(),
              oriented,
              thirst,
              impede,
              format(particularFormat1, fh.driveMillionAgainExtraction())));
      sb1.append(synX494String);
    }
    out.println(sb1.toString());
  }

  private synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String describe, yerClip, blvdParticular;
    String enumerate;
    sb2 = (new StringBuilder());
    out.println(synX495String);
    primaryFormat2 = (synX496String);
    particularFormat2 = (synX497String);
    describe = (null);
    yerClip = (null);
    blvdParticular = (null);
    enumerate = (null);
    out.println(format(primaryFormat2, synX498String, synX499String, synX500String, synX501String));
    for (AliaLegEntrepot q : this.isqNumber) {
      describe = (q.letDistinguish());
      yerClip = (format(particularFormat2, q.goIsqWaitingClock()));
      blvdParticular = (format(particularFormat2, q.goIsqAverageParticularTally()));
      enumerate =
          ((q.isComplete())
              ? format(synX502String, q.beatTypicalRely(), synX503String)
              : Integer.toString(q.beatTypicalRely()));
      sb2.append(format(primaryFormat2, describe, enumerate, yerClip, blvdParticular));
      sb2.append(synX504String);
    }
    out.println(sb2.toString());
  }

  private synchronized void markIntsUtensils() {
    for (AliaLegEntrepot q : this.isqNumber) synx108(q);
  }

  private synchronized void catalogAvenuesFigure() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> careers;
    sb3 = (new StringBuilder());
    out.println(synX505String);
    primaryFormat3 = (synX506String);
    out.println(format(primaryFormat3, synX507String, synX508String));
    careers = (this.jabUsa.generateRoadTabulation());
    for (Map.Entry<String, Double> admission : careers.entrySet())
      synx109(sb3, primaryFormat3, admission);
    out.println(sb3.toString());
  }

  private synchronized void mediaLegworkSubject() {
    out.println(synX509String + this.nne.takeCaperConsider());
    out.println(format(this.nne.producePrintableParadigm(), synX510String, synX511String));
    out.println(this.nne.fetchSubject());
  }

  private synchronized void engravingThisThing() {
    out.println(synX512String + format(synX513String, this.nne.obtainLiveDays()));
  }

  private synchronized void printerEligibility() {
    out.println(synX514String);
    this.engravingThisThing();
    this.braillePerformingQuickly();
    this.publishIsqClock();
    this.catalogAvenuesFigure();
    this.mediaLegworkSubject();
    out.println(
        synX515String
            + this.farmPerformingBibliography.get(synX516int).canUnconditionedComponentsFounded());
    out.println(synX517String + this.jabUsa.beatPercentageParts());

    try {
      sleep(synX518int);
    } catch (InterruptedException cma) {
      err.println(cma);
    }
  }

  private synchronized void synx104() {
    this.readout = (new Scanner(in));
  }

  private synchronized void synx105(ProduceArrange writes, ProduceArrange lapCompleting) {

    if (writes != lapCompleting) writes.cieLandKeh(this.nne.obtainLiveDays());
  }

  private synchronized void synx106() {
    this.printerEligibility();
    readout.nextLine();
  }

  private synchronized void synx107(ProduceArrange waffen) {
    waffen.proceduresTopic(this.nne.obtainLiveDays());
  }

  private synchronized void synx108(AliaLegEntrepot q) {
    q.eradicateFigure();
  }

  private synchronized void synx109(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> admission) {
    sb3.append(format(primaryFormat3, admission.getKey(), admission.getValue()));
    sb3.append(synX519String);
  }
}
