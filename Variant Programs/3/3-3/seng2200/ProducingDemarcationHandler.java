package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;

public class ProducingDemarcationHandler {
  public double nasty = 0.0;
  public double roam = 0.0;
  public int maximumQ = 0;
  public ArrayList<ProcessingScale> productivityTheatricalSelection = null;
  public ArrayList<AmongstMomentCache> isqNumber = null;
  public Database nne = null;
  public ThroughputCoeff spurQuick = null;
  public final double MarquezMoment = 10000000;
  public boolean IS_Bug = false;
  public Scanner lector = null;

  public ProducingDemarcationHandler() {
    this.nasty = (0);
    this.roam = (0);
    this.maximumQ = (0);
  }

  public ProducingDemarcationHandler(double skilled, double rank, int maximumQDuration) {
    this.nasty = (skilled);
    this.roam = (rank);
    this.maximumQ = (maximumQDuration);
    this.productivityTheatricalSelection = (new ArrayList<ProcessingScale>());
    this.isqNumber = (new ArrayList<AmongstMomentCache>());
    this.spurQuick = (new ThroughputCoeff(this.productivityTheatricalSelection));
    this.nne = (new Database(8));
  }

  public synchronized void startleHandle() {
    ProcessingScale pointPolished = null;
    this.cultivateDevelopmentLandscape();

    if (IS_Bug) synx64();

    while (this.nne.receiveContemporaryMoment() < this.MarquezMoment) {
      this.phaseTier();
      pointPolished = (this.nne.fulfillUpcomingPosition());
      for (ProcessingScale cern : this.productivityTheatricalSelection) synx65(cern, pointPolished);
      this.stereotypeLongSouvenirs();

      if (IS_Bug == true) synx66();
    }
    this.typescriptAchievements();

    if (lector != null) lector.close();
  }

  public synchronized void phaseTier() {
    for (ProcessingScale waffen : this.productivityTheatricalSelection) synx67(waffen);
  }

  public synchronized void cultivateDevelopmentLandscape() {
    AmongstMomentCache q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = (new AmongstMomentCache("Q01", this.maximumQ));
    q02 = (new AmongstMomentCache("Q12", this.maximumQ));
    q03 = (new AmongstMomentCache("Q23", this.maximumQ));
    q04 = (new AmongstMomentCache("Q34", this.maximumQ));
    q05 = (new AmongstMomentCache("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    ProcessingScale lh = new RestartPerforming("S0", q01, this.nasty, this.roam, this.nne);
    ProcessingScale l4 = new MezzanineSpotlight("S1", q01, q02, this.nasty, this.roam, this.nne);
    ProcessingScale s2a =
        new MezzanineSpotlight("S2a", q02, q03, this.nasty * 2, this.roam * 2, this.nne);
    ProcessingScale s2b =
        new MezzanineSpotlight("S2b", q02, q03, this.nasty, this.roam * 0.5, this.nne);
    ProcessingScale a3 = new MezzanineSpotlight("S3", q03, q04, this.nasty, this.roam, this.nne);
    ProcessingScale s4a =
        new MezzanineSpotlight("S4a", q04, q05, this.nasty, this.roam * 0.5, this.nne);
    ProcessingScale s4b =
        new MezzanineSpotlight("S4b", q04, q05, this.nasty * 2, this.roam * 2, this.nne);
    ProcessingScale s7 =
        new HighPerforming("S5", q05, this.nasty, this.roam, this.spurQuick, this.nne);
    lh.arrangePerpendicularNeedle(l4);
    l4.fitNighJab(lh);
    l4.arrangePerpendicularNeedle(s2a);
    l4.arrangePerpendicularNeedle(s2b);
    s2a.fitNighJab(l4);
    s2a.arrangePerpendicularNeedle(a3);
    s2b.fitNighJab(l4);
    s2b.arrangePerpendicularNeedle(a3);
    a3.fitNighJab(s2a);
    a3.fitNighJab(s2b);
    a3.arrangePerpendicularNeedle(s4a);
    a3.arrangePerpendicularNeedle(s4b);
    s4a.fitNighJab(a3);
    s4a.arrangePerpendicularNeedle(s7);
    s4b.fitNighJab(a3);
    s4b.arrangePerpendicularNeedle(s7);
    s7.fitNighJab(s4a);
    s7.fitNighJab(s4b);
    this.productivityTheatricalSelection.add(lh);
    this.productivityTheatricalSelection.add(l4);
    this.productivityTheatricalSelection.add(s2a);
    this.productivityTheatricalSelection.add(s2b);
    this.productivityTheatricalSelection.add(a3);
    this.productivityTheatricalSelection.add(s4a);
    this.productivityTheatricalSelection.add(s4b);
    this.productivityTheatricalSelection.add(s7);
  }

  public synchronized void editionPhasesWorsts() {
    StringBuilder sb1 = new StringBuilder();
    out.println("1) Production Stages");
    String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    String particularFormat1 = "%6.3f";
    String elbow = null, choke = null, closure = null;
    out.println(
        String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (ProcessingScale ora : this.productivityTheatricalSelection) {
      elbow = (String.format(particularFormat1, ora.makeDegreeMedManufacturing()) + "%");
      choke = (String.format(particularFormat1, ora.catchMomentFullStrangle()));
      closure = (String.format(particularFormat1, ora.generateRostrumAbsolutePrevented()));
      sb1.append(
          String.format(
              primaryFormat1,
              ora.generateJabAppoint(),
              ora.drawSate(),
              elbow,
              choke,
              closure,
              String.format(particularFormat1, ora.produceAddNowVenture())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2 = new StringBuilder();
    out.println("2) ISQ's");
    String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    String particularFormat2 = "%6.3f";
    String key = null, effiThing = null, avgGoods = null;
    String rely = null;
    out.println(String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (AmongstMomentCache q : this.isqNumber) {
      key = (q.letDistinguish());
      effiThing = (String.format(particularFormat2, q.goIsqWaitingClock()));
      avgGoods = (String.format(particularFormat2, q.goIsqAverageParticularTally()));
      rely =
          ((q.isComplete())
              ? String.format("%-5s%-5s", q.findActualWeigh(), "FULL")
              : Integer.toString(q.findActualWeigh()));
      sb2.append(String.format(primaryFormat2, key, rely, effiThing, avgGoods));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public synchronized void stereotypeLongSouvenirs() {
    for (AmongstMomentCache q : this.isqNumber) synx68(q);
  }

  public synchronized void reprintingRoadTabulation() {
    StringBuilder sb3 = new StringBuilder();
    out.println("3) Paths");
    String primaryFormat3 = "%-30s%-15s";
    out.println(String.format(primaryFormat3, "Path", "total Items"));
    Map<String, Double> lane = this.spurQuick.sustainLaneGet();
    for (Map.Entry<String, Double> entree : lane.entrySet()) synx69(sb3, primaryFormat3, entree);
    out.println(sb3.toString());
  }

  public synchronized void reprintCaperGist() {
    out.println("4) Job Count: " + this.nne.comeEmploymentNumber());
    out.println(String.format(this.nne.obtainPublishingStyle(), "Job", "Remaining Duration"));
    out.println(this.nne.letAddendum());
  }

  public synchronized void printerActualSentence() {
    out.println("Current time: " + String.format("%6.3f", this.nne.receiveContemporaryMoment()));
  }

  public synchronized void typescriptAchievements() {
    out.println("Simulation's Final Snapshot");
    this.printerActualSentence();
    this.editionPhasesWorsts();
    this.publishIsqClock();
    this.reprintingRoadTabulation();
    this.reprintCaperGist();
    out.println(
        "Total items Created: "
            + this.productivityTheatricalSelection.get(0).beatPercentagePartsInstituted());
    out.println("Total Items Finished: " + this.spurQuick.arriveTotalityArtefacts());

    try {
      Thread.sleep(100);
    } catch (InterruptedException einsteinium) {
      err.println(einsteinium);
    }
  }

  {
    IS_Bug = (false);
  }

  private synchronized void synx64() {
    this.lector = (new Scanner(in));
  }

  private synchronized void synx65(ProcessingScale cern, ProcessingScale pointPolished) {

    if (cern != pointPolished) cern.aveSubmitTough(this.nne.receiveContemporaryMoment());
  }

  private synchronized void synx66() {
    this.typescriptAchievements();
    lector.nextLine();
  }

  private synchronized void synx67(ProcessingScale waffen) {
    waffen.serveConsignment(this.nne.receiveContemporaryMoment());
  }

  private synchronized void synx68(AmongstMomentCache q) {
    q.castCharge();
  }

  private synchronized void synx69(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> entree) {
    sb3.append(String.format(primaryFormat3, entree.getKey(), entree.getValue()));
    sb3.append("\n");
  }
}
