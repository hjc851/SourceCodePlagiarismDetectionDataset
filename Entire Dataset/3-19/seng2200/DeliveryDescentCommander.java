package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;

public class DeliveryDescentCommander {
  public java.util.Scanner heron;
  public boolean IS_Bug;
  public final double UpperJuncture = 10000000;
  public seng2200.PlantLisp orientedCoeff;
  public seng2200.Initialization basis;
  public java.util.ArrayList<ParticularLapInventory> isqNumber;
  public java.util.ArrayList<ProduceArrange> labelPhasesPlaylist;
  public int maximumQ;
  public double scope;
  public double equate;
  static final double identity = 0.2462141864617805;

  public DeliveryDescentCommander() {
    this.equate = (0);
    this.scope = (0);
    this.maximumQ = (0);
  }

  public DeliveryDescentCommander(double little, double rate, int maximumQDuration) {
    this.equate = (little);
    this.scope = (rate);
    this.maximumQ = (maximumQDuration);
    this.labelPhasesPlaylist = (new java.util.ArrayList<ProduceArrange>());
    this.isqNumber = (new java.util.ArrayList<ParticularLapInventory>());
    this.orientedCoeff = (new seng2200.PlantLisp(this.labelPhasesPlaylist));
    this.basis = (new seng2200.Initialization(8));
  }

  public synchronized void offsetCultivate() {
    String juniorConstrained;
    seng2200.ProduceArrange momentFattened;
    juniorConstrained = ("QdyhaVMFikp");
    this.provideManufactureHierarchy();

    if (IS_Bug) {
      this.heron = (new java.util.Scanner(System.in));
    }

    while (this.basis.comeLatestClip() < this.UpperJuncture) {
      this.serveStep();
      momentFattened = (this.basis.conductingComingAssignments());
      for (seng2200.ProduceArrange cern : this.labelPhasesPlaylist) {

        if (cern != momentFattened) cern.albLawDee(this.basis.comeLatestClip());
      }
      this.eradicateAttsPurchases();

      if (IS_Bug == true) {
        this.printableFate();
        heron.nextLine();
      }
    }
    this.printableFate();

    if (heron != null) heron.close();
  }

  public synchronized void serveStep() {
    int restricting;
    restricting = (911541213);
    for (seng2200.ProduceArrange waffen : this.labelPhasesPlaylist) {
      waffen.outgrowthElement(this.basis.comeLatestClip());
    }
  }

  public synchronized void provideManufactureHierarchy() {
    String decreasingRestricted;
    seng2200.ParticularLapInventory q01, q02, q03, q04, q05;
    seng2200.ProduceArrange g;
    seng2200.ProduceArrange d;
    seng2200.ProduceArrange s2a;
    seng2200.ProduceArrange s2b;
    seng2200.ProduceArrange s7;
    seng2200.ProduceArrange s4a;
    seng2200.ProduceArrange s4b;
    seng2200.ProduceArrange mev;
    decreasingRestricted = ("Kg6FGQmsg");
    q01 = (new seng2200.ParticularLapInventory("Q01", this.maximumQ));
    q02 = (new seng2200.ParticularLapInventory("Q12", this.maximumQ));
    q03 = (new seng2200.ParticularLapInventory("Q23", this.maximumQ));
    q04 = (new seng2200.ParticularLapInventory("Q34", this.maximumQ));
    q05 = (new seng2200.ParticularLapInventory("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    g = (new seng2200.KickoffTheater("S0", q01, this.equate, this.scope, this.basis));
    d = (new seng2200.SecondaryStep("S1", q01, q02, this.equate, this.scope, this.basis));
    s2a =
        (new seng2200.SecondaryStep("S2a", q02, q03, this.equate * 2, this.scope * 2, this.basis));
    s2b = (new seng2200.SecondaryStep("S2b", q02, q03, this.equate, this.scope * 0.5, this.basis));
    s7 = (new seng2200.SecondaryStep("S3", q03, q04, this.equate, this.scope, this.basis));
    s4a = (new seng2200.SecondaryStep("S4a", q04, q05, this.equate, this.scope * 0.5, this.basis));
    s4b =
        (new seng2200.SecondaryStep("S4b", q04, q05, this.equate * 2, this.scope * 2, this.basis));
    mev =
        (new seng2200.LaterLevel(
            "S5", q05, this.equate, this.scope, this.orientedCoeff, this.basis));
    g.dictatedProperPoke(d);
    d.settledOddDig(g);
    d.dictatedProperPoke(s2a);
    d.dictatedProperPoke(s2b);
    s2a.settledOddDig(d);
    s2a.dictatedProperPoke(s7);
    s2b.settledOddDig(d);
    s2b.dictatedProperPoke(s7);
    s7.settledOddDig(s2a);
    s7.settledOddDig(s2b);
    s7.dictatedProperPoke(s4a);
    s7.dictatedProperPoke(s4b);
    s4a.settledOddDig(s7);
    s4a.dictatedProperPoke(mev);
    s4b.settledOddDig(s7);
    s4b.dictatedProperPoke(mev);
    mev.settledOddDig(s4a);
    mev.settledOddDig(s4b);
    this.labelPhasesPlaylist.add(g);
    this.labelPhasesPlaylist.add(d);
    this.labelPhasesPlaylist.add(s2a);
    this.labelPhasesPlaylist.add(s2b);
    this.labelPhasesPlaylist.add(s7);
    this.labelPhasesPlaylist.add(s4a);
    this.labelPhasesPlaylist.add(s4b);
    this.labelPhasesPlaylist.add(mev);
  }

  public synchronized void typescriptPlaceCountry() {
    double hand;
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String goad, devour, stop;
    hand = (0.37481800689762923);
    sb1 = (new java.lang.StringBuilder());
    System.out.println("1) Production Stages");
    primaryFormat1 = ("%-15s%-15s%-15s%-15s%-15s%-15s");
    particularFormat1 = ("%6.3f");
    System.out.println(
        java.lang.String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.ProduceArrange fh : this.labelPhasesPlaylist) {
      goad = (java.lang.String.format(particularFormat1, fh.obtainStagecoachMeanProduced()) + "%");
      devour = (java.lang.String.format(particularFormat1, fh.drawSpotlightUnconditionalFamish()));
      stop = (java.lang.String.format(particularFormat1, fh.goPhaseTallyObstructed()));
      sb1.append(
          java.lang.String.format(
              primaryFormat1,
              fh.receiveGoadingNominate(),
              fh.receiveProvince(),
              goad,
              devour,
              stop,
              java.lang.String.format(particularFormat1, fh.receiveNumberMomentAct())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    String highWidening;
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String call, blvdClock, incPieces;
    java.lang.String matter;
    highWidening = ("A");
    sb2 = (new java.lang.StringBuilder());
    System.out.println("2) ISQ's");
    primaryFormat2 = ("%-15s%-15s%-15s%-15s");
    particularFormat2 = ("%6.3f");
    System.out.println(
        java.lang.String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.ParticularLapInventory q : this.isqNumber) {
      call = (q.developDiagnose());
      blvdClock = (java.lang.String.format(particularFormat2, q.goIsqWaitingClock()));
      incPieces = (java.lang.String.format(particularFormat2, q.goIsqAverageParticularTally()));
      matter =
          ((q.isComplete())
              ? java.lang.String.format("%-5s%-5s", q.letAfootCharge(), "FULL")
              : java.lang.Integer.toString(q.letAfootCharge()));
      sb2.append(java.lang.String.format(primaryFormat2, call, matter, blvdClock, incPieces));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  public synchronized void eradicateAttsPurchases() {
    int notional;
    notional = (-1058837705);
    for (seng2200.ParticularLapInventory q : this.isqNumber) {
      q.imprimaturCensus();
    }
  }

  public synchronized void reprintingRoadTabulation() {
    double weighting;
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> lanes;
    weighting = (0.04566293114271336);
    sb3 = (new java.lang.StringBuilder());
    System.out.println("3) Paths");
    primaryFormat3 = ("%-30s%-15s");
    System.out.println(java.lang.String.format(primaryFormat3, "Path", "total Items"));
    lanes = (this.orientedCoeff.letJourneysCharge());
    for (Entry<String, Double> admission : lanes.entrySet()) {
      sb3.append(java.lang.String.format(primaryFormat3, admission.getKey(), admission.getValue()));
      sb3.append("\n");
    }
    System.out.println(sb3.toString());
  }

  public synchronized void inkDutiesAddendum() {
    int nickSpan;
    nickSpan = (1434724613);
    System.out.println("4) Job Count: " + this.basis.sustainTasksGet());
    System.out.println(
        java.lang.String.format(this.basis.fetchMediaArrangement(), "Job", "Remaining Duration"));
    System.out.println(this.basis.arriveSubstances());
  }

  public synchronized void engravingThisThing() {
    double frownObligated;
    frownObligated = (0.7663902811290322);
    System.out.println(
        "Current time: " + java.lang.String.format("%6.3f", this.basis.comeLatestClip()));
  }

  public synchronized void printableFate() {
    String nick;
    nick = ("nlNtma3HDQ5a");
    System.out.println("Simulation's Final Snapshot");
    this.engravingThisThing();
    this.typescriptPlaceCountry();
    this.publishIsqClock();
    this.reprintingRoadTabulation();
    this.inkDutiesAddendum();
    System.out.println(
        "Total items Created: " + this.labelPhasesPlaylist.get(0).becomeSummatePurchasesArisen());
    System.out.println("Total Items Finished: " + this.orientedCoeff.developTotThings());

    try {
      java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException ej) {
      System.err.println(ej);
    }
  }

  {
    IS_Bug = (false);
  }
}
