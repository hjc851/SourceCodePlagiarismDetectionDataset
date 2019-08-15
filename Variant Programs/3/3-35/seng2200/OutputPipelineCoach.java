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

public class OutputPipelineCoach {
  public java.util.Scanner viewer;
  public boolean IS_Bug = false;
  public final double HighestHours = 10000000;
  public seng2200.ExtractionFast needleStatehood;
  public seng2200.Organizer general;
  public java.util.ArrayList<MattersPodiumArchiving> isqNumber;
  public java.util.ArrayList<IndustrializationPhases> goadLevelName;
  public int maximumQ;
  public double rate;
  public double beggarly;

  public OutputPipelineCoach() {
    this.beggarly = (0);
    this.rate = (0);
    this.maximumQ = (0);
  }

  public OutputPipelineCoach(double average, double compass, int maximumQDuration) {
    this.beggarly = (average);
    this.rate = (compass);
    this.maximumQ = (maximumQDuration);
    this.goadLevelName = (new java.util.ArrayList<IndustrializationPhases>());
    this.isqNumber = (new java.util.ArrayList<MattersPodiumArchiving>());
    this.needleStatehood = (new seng2200.ExtractionFast(this.goadLevelName));
    this.general = (new seng2200.Organizer(8));
  }

  public synchronized void earlyCover() {
    seng2200.IndustrializationPhases presentConcluded;
    this.inventHarvestingApparatus();

    if (IS_Bug) synx424();

    while (this.general.developPreviousHour() < this.HighestHours) {
      this.proceedingComponent();
      presentConcluded = (this.general.takeEarlyWorkload());
      for (seng2200.IndustrializationPhases vig : this.goadLevelName)
        synx425(vig, presentConcluded);
      this.postalPerThings();

      if (IS_Bug == true) synx426();
    }
    this.reprintStature();

    if (viewer != null) viewer.close();
  }

  public synchronized void proceedingComponent() {
    for (seng2200.IndustrializationPhases waffen : this.goadLevelName) synx427(waffen);
  }

  public synchronized void inventHarvestingApparatus() {
    seng2200.MattersPodiumArchiving q01, q02, q03, q04, q05;
    seng2200.IndustrializationPhases l4;
    seng2200.IndustrializationPhases l5;
    seng2200.IndustrializationPhases s2a;
    seng2200.IndustrializationPhases s2b;
    seng2200.IndustrializationPhases l6;
    seng2200.IndustrializationPhases s4a;
    seng2200.IndustrializationPhases s4b;
    seng2200.IndustrializationPhases sl;
    q01 = (new seng2200.MattersPodiumArchiving("Q01", this.maximumQ));
    q02 = (new seng2200.MattersPodiumArchiving("Q12", this.maximumQ));
    q03 = (new seng2200.MattersPodiumArchiving("Q23", this.maximumQ));
    q04 = (new seng2200.MattersPodiumArchiving("Q34", this.maximumQ));
    q05 = (new seng2200.MattersPodiumArchiving("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    l4 = (new seng2200.CommencementRostrum("S0", q01, this.beggarly, this.rate, this.general));
    l5 = (new seng2200.CentralArena("S1", q01, q02, this.beggarly, this.rate, this.general));
    s2a =
        (new seng2200.CentralArena(
            "S2a", q02, q03, this.beggarly * 2, this.rate * 2, this.general));
    s2b =
        (new seng2200.CentralArena("S2b", q02, q03, this.beggarly, this.rate * 0.5, this.general));
    l6 = (new seng2200.CentralArena("S3", q03, q04, this.beggarly, this.rate, this.general));
    s4a =
        (new seng2200.CentralArena("S4a", q04, q05, this.beggarly, this.rate * 0.5, this.general));
    s4b =
        (new seng2200.CentralArena(
            "S4b", q04, q05, this.beggarly * 2, this.rate * 2, this.general));
    sl =
        (new seng2200.HighPerforming(
            "S5", q05, this.beggarly, this.rate, this.needleStatehood, this.general));
    l4.determineRightfulnessElbow(l5);
    l5.adjustUnexhaustedStimulate(l4);
    l5.determineRightfulnessElbow(s2a);
    l5.determineRightfulnessElbow(s2b);
    s2a.adjustUnexhaustedStimulate(l5);
    s2a.determineRightfulnessElbow(l6);
    s2b.adjustUnexhaustedStimulate(l5);
    s2b.determineRightfulnessElbow(l6);
    l6.adjustUnexhaustedStimulate(s2a);
    l6.adjustUnexhaustedStimulate(s2b);
    l6.determineRightfulnessElbow(s4a);
    l6.determineRightfulnessElbow(s4b);
    s4a.adjustUnexhaustedStimulate(l6);
    s4a.determineRightfulnessElbow(sl);
    s4b.adjustUnexhaustedStimulate(l6);
    s4b.determineRightfulnessElbow(sl);
    sl.adjustUnexhaustedStimulate(s4a);
    sl.adjustUnexhaustedStimulate(s4b);
    this.goadLevelName.add(l4);
    this.goadLevelName.add(l5);
    this.goadLevelName.add(s2a);
    this.goadLevelName.add(s2b);
    this.goadLevelName.add(l6);
    this.goadLevelName.add(s4a);
    this.goadLevelName.add(s4b);
    this.goadLevelName.add(sl);
  }

  public synchronized void editionPhasesWorsts() {
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String dig, deprive, blockade;
    sb1 = (new java.lang.StringBuilder());
    out.println("1) Production Stages");
    primaryFormat1 = ("%-15s%-15s%-15s%-15s%-15s%-15s");
    particularFormat1 = ("%6.3f");
    out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.IndustrializationPhases ora : this.goadLevelName) {
      dig = (format(particularFormat1, ora.obtainStagecoachMeanProduced()) + "%");
      deprive = (format(particularFormat1, ora.comeLevelOverallThirst()));
      blockade = (format(particularFormat1, ora.fetchStepCombinedDenied()));
      sb1.append(
          format(
              primaryFormat1,
              ora.makeStabIdentify(),
              ora.generateFederal(),
              dig,
              deprive,
              blockade,
              format(particularFormat1, ora.startCumulativeMinutesUndertaking())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String appoint, helloNow, helloFoods;
    java.lang.String number;
    sb2 = (new java.lang.StringBuilder());
    out.println("2) ISQ's");
    primaryFormat2 = ("%-15s%-15s%-15s%-15s");
    particularFormat2 = ("%6.3f");
    out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.MattersPodiumArchiving q : this.isqNumber) {
      appoint = (q.comeList());
      helloNow = (format(particularFormat2, q.goIsqWaitingClock()));
      helloFoods = (format(particularFormat2, q.goIsqAverageParticularTally()));
      number =
          ((q.isComplete())
              ? format("%-5s%-5s", q.producePrevalentCalculation(), "FULL")
              : java.lang.Integer.toString(q.producePrevalentCalculation()));
      sb2.append(format(primaryFormat2, appoint, number, helloNow, helloFoods));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public synchronized void postalPerThings() {
    for (seng2200.MattersPodiumArchiving q : this.isqNumber) synx428(q);
  }

  public synchronized void brailleApproachesFigures() {
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> trails;
    sb3 = (new java.lang.StringBuilder());
    out.println("3) Paths");
    primaryFormat3 = ("%-30s%-15s");
    out.println(format(primaryFormat3, "Path", "total Items"));
    trails = (this.needleStatehood.canLanesIndictment());
    for (Entry<String, Double> incoming : trails.entrySet()) synx429(sb3, primaryFormat3, incoming);
    out.println(sb3.toString());
  }

  public synchronized void reprintingAssignmentsAspects() {
    out.println("4) Job Count: " + this.general.generateAssignmentsTabulation());
    out.println(format(this.general.developLithographWording(), "Job", "Remaining Duration"));
    out.println(this.general.takeGist());
  }

  public synchronized void newspaperFlowMonth() {
    out.println("Current time: " + format("%6.3f", this.general.developPreviousHour()));
  }

  public synchronized void reprintStature() {
    out.println("Simulation's Final Snapshot");
    this.newspaperFlowMonth();
    this.editionPhasesWorsts();
    this.publishIsqClock();
    this.brailleApproachesFigures();
    this.reprintingAssignmentsAspects();
    out.println("Total items Created: " + this.goadLevelName.get(0).fetchCombinedEquipmentCaused());
    out.println("Total Items Finished: " + this.needleStatehood.conveyMaximumConsignments());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException samad) {
      err.println(samad);
    }
  }

  private synchronized void synx424() {
    this.viewer = (new java.util.Scanner(in));
  }

  private synchronized void synx425(
      IndustrializationPhases vig, IndustrializationPhases presentConcluded) {

    if (vig != presentConcluded) vig.companiesStatehoodKan(this.general.developPreviousHour());
  }

  private synchronized void synx426() {
    this.reprintStature();
    viewer.nextLine();
  }

  private synchronized void synx427(IndustrializationPhases waffen) {
    waffen.proceedingsAppropriation(this.general.developPreviousHour());
  }

  private synchronized void synx428(MattersPodiumArchiving q) {
    q.mailRecount();
  }

  private synchronized void synx429(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> incoming) {
    sb3.append(format(primaryFormat3, incoming.getKey(), incoming.getValue()));
    sb3.append("\n");
  }
}
