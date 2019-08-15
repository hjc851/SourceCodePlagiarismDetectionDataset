package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ProducersWrinkleManger {
  private static final boolean synX3188boolean = false;
  private static final int synX3187int = 100;
  private static final String synX3186String = "Total Items Finished: ";
  private static final int synX3185int = 0;
  private static final String synX3184String = "Total items Created: ";
  private static final String synX3183String = "Simulation's Final Snapshot";
  private static final double synX3182double = 0.11563526630007459;
  private static final String synX3181String = "%6.3f";
  private static final String synX3180String = "Current time: ";
  private static final String synX3179String = "bTM";
  private static final String synX3178String = "Remaining Duration";
  private static final String synX3177String = "Job";
  private static final String synX3176String = "4) Job Count: ";
  private static final double synX3175double = 0.8447566925088189;
  private static final String synX3174String = "\n";
  private static final String synX3173String = "total Items";
  private static final String synX3172String = "Path";
  private static final String synX3171String = "%-30s%-15s";
  private static final String synX3170String = "3) Paths";
  private static final int synX3169int = 331911824;
  private static final int synX3168int = 1756369241;
  private static final String synX3167String = "\n";
  private static final String synX3166String = "FULL";
  private static final String synX3165String = "%-5s%-5s";
  private static final String synX3164String = "ave(items)";
  private static final String synX3163String = "ave(t)";
  private static final String synX3162String = "Item Count";
  private static final String synX3161String = "ISQ";
  private static final String synX3160String = "%6.3f";
  private static final String synX3159String = "%-15s%-15s%-15s%-15s";
  private static final String synX3158String = "2) ISQ's";
  private static final double synX3157double = 0.7885727595056768;
  private static final String synX3156String = "\n";
  private static final String synX3155String = "%";
  private static final String synX3154String = "Total time";
  private static final String synX3153String = "Block(t)";
  private static final String synX3152String = "Starve(t)";
  private static final String synX3151String = "Prod(%)";
  private static final String synX3150String = "State";
  private static final String synX3149String = "Stage";
  private static final String synX3148String = "%6.3f";
  private static final String synX3147String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX3146String = "1) Production Stages";
  private static final double synX3145double = 0.6579198777964985;
  private static final String synX3144String = "S5";
  private static final int synX3143int = 2;
  private static final int synX3142int = 2;
  private static final String synX3141String = "S4b";
  private static final double synX3140double = 0.5;
  private static final String synX3139String = "S4a";
  private static final String synX3138String = "S3";
  private static final double synX3137double = 0.5;
  private static final String synX3136String = "S2b";
  private static final int synX3135int = 2;
  private static final int synX3134int = 2;
  private static final String synX3133String = "S2a";
  private static final String synX3132String = "S1";
  private static final String synX3131String = "S0";
  private static final String synX3130String = "Q45";
  private static final String synX3129String = "Q34";
  private static final String synX3128String = "Q23";
  private static final String synX3127String = "Q12";
  private static final String synX3126String = "Q01";
  private static final double synX3125double = 0.5512402851273569;
  private static final double synX3124double = 0.14069767856883475;
  private static final boolean synX3123boolean = true;
  private static final double synX3122double = 0.28744022600510655;
  public static double identify = 0.459651303847158;
  public double intend = 0.0;
  public double drift = 0.0;
  public int maximumQ = 0;
  public java.util.ArrayList<ProductivityStep> stimulateArenaCompendium = null;
  public java.util.ArrayList<SpecialPhasesDepository> isqNumber = null;
  public seng2200.Developer female = null;
  public seng2200.ProducingStatistics stirChf = null;
  public final double LoadDay = 10000000;
  public boolean IS_Bug = false;
  public java.util.Scanner heron = null;

  public ProducersWrinkleManger() {
    this.intend = (0);
    this.drift = (0);
    this.maximumQ = (0);
  }

  public ProducersWrinkleManger(double imply, double rate, int maximumQDuration) {
    this.intend = (imply);
    this.drift = (rate);
    this.maximumQ = (maximumQDuration);
    this.stimulateArenaCompendium = (new java.util.ArrayList<ProductivityStep>());
    this.isqNumber = (new java.util.ArrayList<SpecialPhasesDepository>());
    this.stirChf = (new seng2200.ProducingStatistics(this.stimulateArenaCompendium));
    this.female = (new seng2200.Developer(8));
  }

  public synchronized void offsetCultivate() {
    double measure = synX3122double;
    seng2200.ProductivityStep scaleThrough = null;
    this.buildManufacturingBuilding();

    if (IS_Bug) {
      this.heron = (new java.util.Scanner(in));
    }

    while (this.female.beatTypicalJuncture() < this.LoadDay) {
      this.phaseTier();
      scaleThrough = (this.female.playIncomingSubcontract());
      for (seng2200.ProductivityStep postscript : this.stimulateArenaCompendium) {

        if (postscript != scaleThrough) postscript.cniSateKuh(this.female.beatTypicalJuncture());
      }
      this.imprimaturTdsAccessories();

      if (IS_Bug == synX3123boolean) {
        this.engravingSituation();
        heron.nextLine();
      }
    }
    this.engravingSituation();

    if (heron != null) heron.close();
  }

  public synchronized void phaseTier() {
    double minusExtent = synX3124double;
    for (seng2200.ProductivityStep fh : this.stimulateArenaCompendium) {
      fh.procedureParticular(this.female.beatTypicalJuncture());
    }
  }

  public synchronized void buildManufacturingBuilding() {
    double senateCurb = synX3125double;
    seng2200.SpecialPhasesDepository q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = (new seng2200.SpecialPhasesDepository(synX3126String, this.maximumQ));
    q02 = (new seng2200.SpecialPhasesDepository(synX3127String, this.maximumQ));
    q03 = (new seng2200.SpecialPhasesDepository(synX3128String, this.maximumQ));
    q04 = (new seng2200.SpecialPhasesDepository(synX3129String, this.maximumQ));
    q05 = (new seng2200.SpecialPhasesDepository(synX3130String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.ProductivityStep amplitude =
        new seng2200.OffsetScale(synX3131String, q01, this.intend, this.drift, this.female);
    seng2200.ProductivityStep l3 =
        new seng2200.MediumStagecoach(
            synX3132String, q01, q02, this.intend, this.drift, this.female);
    seng2200.ProductivityStep s2a =
        new seng2200.MediumStagecoach(
            synX3133String,
            q02,
            q03,
            this.intend * synX3134int,
            this.drift * synX3135int,
            this.female);
    seng2200.ProductivityStep s2b =
        new seng2200.MediumStagecoach(
            synX3136String, q02, q03, this.intend, this.drift * synX3137double, this.female);
    seng2200.ProductivityStep l4 =
        new seng2200.MediumStagecoach(
            synX3138String, q03, q04, this.intend, this.drift, this.female);
    seng2200.ProductivityStep s4a =
        new seng2200.MediumStagecoach(
            synX3139String, q04, q05, this.intend, this.drift * synX3140double, this.female);
    seng2200.ProductivityStep s4b =
        new seng2200.MediumStagecoach(
            synX3141String,
            q04,
            q05,
            this.intend * synX3142int,
            this.drift * synX3143int,
            this.female);
    seng2200.ProductivityStep mev =
        new seng2200.HighPerforming(
            synX3144String, q05, this.intend, this.drift, this.stirChf, this.female);
    amplitude.laidGoodGoad(l3);
    l3.adjustUnexhaustedStimulate(amplitude);
    l3.laidGoodGoad(s2a);
    l3.laidGoodGoad(s2b);
    s2a.adjustUnexhaustedStimulate(l3);
    s2a.laidGoodGoad(l4);
    s2b.adjustUnexhaustedStimulate(l3);
    s2b.laidGoodGoad(l4);
    l4.adjustUnexhaustedStimulate(s2a);
    l4.adjustUnexhaustedStimulate(s2b);
    l4.laidGoodGoad(s4a);
    l4.laidGoodGoad(s4b);
    s4a.adjustUnexhaustedStimulate(l4);
    s4a.laidGoodGoad(mev);
    s4b.adjustUnexhaustedStimulate(l4);
    s4b.laidGoodGoad(mev);
    mev.adjustUnexhaustedStimulate(s4a);
    mev.adjustUnexhaustedStimulate(s4b);
    this.stimulateArenaCompendium.add(amplitude);
    this.stimulateArenaCompendium.add(l3);
    this.stimulateArenaCompendium.add(s2a);
    this.stimulateArenaCompendium.add(s2b);
    this.stimulateArenaCompendium.add(l4);
    this.stimulateArenaCompendium.add(s4a);
    this.stimulateArenaCompendium.add(s4b);
    this.stimulateArenaCompendium.add(mev);
  }

  public synchronized void lithographSceneChf() {
    double breadth = synX3145double;
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println(synX3146String);
    java.lang.String primaryFormat1 = synX3147String;
    java.lang.String particularFormat1 = synX3148String;
    java.lang.String stir = null, suffocate = null, interference = null;
    out.println(
        format(
            primaryFormat1,
            synX3149String,
            synX3150String,
            synX3151String,
            synX3152String,
            synX3153String,
            synX3154String));
    for (seng2200.ProductivityStep ora : this.stimulateArenaCompendium) {
      stir = (format(particularFormat1, ora.comeLevelAveOutput()) + synX3155String);
      suffocate = (format(particularFormat1, ora.receiveLegNumberStarvation()));
      interference = (format(particularFormat1, ora.takeArrangeCompleteStymied()));
      sb1.append(
          format(
              primaryFormat1,
              ora.letPushDistinguish(),
              ora.fetchGeneral(),
              stir,
              suffocate,
              interference,
              format(particularFormat1, ora.beatPercentageJunctureOperator())));
      sb1.append(synX3156String);
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    double quality = synX3157double;
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println(synX3158String);
    java.lang.String primaryFormat2 = synX3159String;
    java.lang.String particularFormat2 = synX3160String;
    java.lang.String appoint = null, mariesChance = null, approxNecessities = null;
    java.lang.String figures = null;
    out.println(
        format(primaryFormat2, synX3161String, synX3162String, synX3163String, synX3164String));
    for (seng2200.SpecialPhasesDepository q : this.isqNumber) {
      appoint = (q.letDistinguish());
      mariesChance = (format(particularFormat2, q.goIsqWaitingClock()));
      approxNecessities = (format(particularFormat2, q.goIsqAverageParticularTally()));
      figures =
          ((q.isComplete())
              ? format(synX3165String, q.conveyFormerRecount(), synX3166String)
              : java.lang.Integer.toString(q.conveyFormerRecount()));
      sb2.append(format(primaryFormat2, appoint, figures, mariesChance, approxNecessities));
      sb2.append(synX3167String);
    }
    out.println(sb2.toString());
  }

  public synchronized void imprimaturTdsAccessories() {
    int prise = synX3168int;
    for (seng2200.SpecialPhasesDepository q : this.isqNumber) {
      q.affixTell();
    }
  }

  public synchronized void lithographCareersCalculate() {
    int guarantee = synX3169int;
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println(synX3170String);
    java.lang.String primaryFormat3 = synX3171String;
    out.println(format(primaryFormat3, synX3172String, synX3173String));
    java.util.Map<String, Double> footpaths = this.stirChf.sustainLaneGet();
    for (Entry<String, Double> entryway : footpaths.entrySet()) {
      sb3.append(format(primaryFormat3, entryway.getKey(), entryway.getValue()));
      sb3.append(synX3174String);
    }
    out.println(sb3.toString());
  }

  public synchronized void editionOccupationsSynopses() {
    double restricted = synX3175double;
    out.println(synX3176String + this.female.startCareerTell());
    out.println(format(this.female.makeHardcopyVersion(), synX3177String, synX3178String));
    out.println(this.female.goContained());
  }

  public synchronized void publicationExistingYears() {
    String reesPurchases = synX3179String;
    out.println(synX3180String + format(synX3181String, this.female.beatTypicalJuncture()));
  }

  public synchronized void engravingSituation() {
    double highestLimit = synX3182double;
    out.println(synX3183String);
    this.publicationExistingYears();
    this.lithographSceneChf();
    this.publishIsqClock();
    this.lithographCareersCalculate();
    this.editionOccupationsSynopses();
    out.println(
        synX3184String
            + this.stimulateArenaCompendium
                .get(synX3185int)
                .generateAbsoluteNecessitiesEngendered());
    out.println(synX3186String + this.stirChf.fixComeAppliances());

    try {
      sleep(synX3187int);
    } catch (java.lang.InterruptedException salaam) {
      err.println(salaam);
    }
  }

  {
    IS_Bug = (synX3188boolean);
  }
}
