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

public class FactoryBusinessExecutive {
  public Scanner dsl = null;
  public boolean IS_Bug = false;
  public final double LotBeginning = 10000000;
  public ProcessingState farmersCountry = null;
  public Outliner general = null;
  public ArrayList<MajorSceneSpace> isqNumber = null;
  public ArrayList<ThroughputLap> urgingStagecoachBlacklist = null;
  public int maximumQ = 0;
  public double wander = 0.0;
  public double equate = 0.0;
  public static double manSkank = 0.733993814491032;

  public FactoryBusinessExecutive() {
    this.equate = 0;
    this.wander = 0;
    this.maximumQ = 0;
  }

  public FactoryBusinessExecutive(double signify, double grasp, int maximumQDuration) {
    this.equate = signify;
    this.wander = grasp;
    this.maximumQ = maximumQDuration;
    this.urgingStagecoachBlacklist = new ArrayList<ThroughputLap>();
    this.isqNumber = new ArrayList<MajorSceneSpace>();
    this.farmersCountry = new ProcessingState(this.urgingStagecoachBlacklist);
    this.general = new Outliner(8);
  }

  public synchronized void departAct() {
    int ids;
    ThroughputLap rostrumTerminated;
    ids = 1947963848;
    rostrumTerminated = null;
    this.bringProduceMechanism();

    if (IS_Bug) synx124();

    while (this.general.beatTypicalJuncture() < this.LotBeginning) {
      this.cycleTerm();
      rostrumTerminated = this.general.undertakeLaterCaper();
      for (ThroughputLap writes : this.urgingStagecoachBlacklist)
        synx125(writes, rostrumTerminated);
      this.stumpHalfBelongings();

      if (IS_Bug == true) synx126();
    }
    this.printersDesignations();

    if (dsl != null) dsl.close();
  }

  public synchronized void cycleTerm() {
    int restrain;
    restrain = 63565223;
    for (ThroughputLap ora : this.urgingStagecoachBlacklist) synx127(ora);
  }

  public synchronized void bringProduceMechanism() {
    int height;
    MajorSceneSpace q01, q02, q03, q04, q05;
    ThroughputLap a0;
    ThroughputLap c6;
    ThroughputLap s2a;
    ThroughputLap s2b;
    ThroughputLap vi;
    ThroughputLap s4a;
    ThroughputLap s4b;
    ThroughputLap kev;
    height = -793870954;
    q01 = null;
    q02 = null;
    q03 = null;
    q04 = null;
    q05 = null;
    q01 = new MajorSceneSpace("Q01", this.maximumQ);
    q02 = new MajorSceneSpace("Q12", this.maximumQ);
    q03 = new MajorSceneSpace("Q23", this.maximumQ);
    q04 = new MajorSceneSpace("Q34", this.maximumQ);
    q05 = new MajorSceneSpace("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    a0 = new GoPresent("S0", q01, this.equate, this.wander, this.general);
    c6 = new HalfwayPresent("S1", q01, q02, this.equate, this.wander, this.general);
    s2a = new HalfwayPresent("S2a", q02, q03, this.equate * 2, this.wander * 2, this.general);
    s2b = new HalfwayPresent("S2b", q02, q03, this.equate, this.wander * 0.5, this.general);
    vi = new HalfwayPresent("S3", q03, q04, this.equate, this.wander, this.general);
    s4a = new HalfwayPresent("S4a", q04, q05, this.equate, this.wander * 0.5, this.general);
    s4b = new HalfwayPresent("S4b", q04, q05, this.equate * 2, this.wander * 2, this.general);
    kev = new LaterLevel("S5", q05, this.equate, this.wander, this.farmersCountry, this.general);
    a0.putCorrectNudge(c6);
    c6.bentMissedStir(a0);
    c6.putCorrectNudge(s2a);
    c6.putCorrectNudge(s2b);
    s2a.bentMissedStir(c6);
    s2a.putCorrectNudge(vi);
    s2b.bentMissedStir(c6);
    s2b.putCorrectNudge(vi);
    vi.bentMissedStir(s2a);
    vi.bentMissedStir(s2b);
    vi.putCorrectNudge(s4a);
    vi.putCorrectNudge(s4b);
    s4a.bentMissedStir(vi);
    s4a.putCorrectNudge(kev);
    s4b.bentMissedStir(vi);
    s4b.putCorrectNudge(kev);
    kev.bentMissedStir(s4a);
    kev.bentMissedStir(s4b);
    this.urgingStagecoachBlacklist.add(a0);
    this.urgingStagecoachBlacklist.add(c6);
    this.urgingStagecoachBlacklist.add(s2a);
    this.urgingStagecoachBlacklist.add(s2b);
    this.urgingStagecoachBlacklist.add(vi);
    this.urgingStagecoachBlacklist.add(s4a);
    this.urgingStagecoachBlacklist.add(s4b);
    this.urgingStagecoachBlacklist.add(kev);
  }

  public synchronized void publicationInstarStatehood() {
    double relic;
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String nudge, famish, obstruct;
    relic = 0.02824627608566299;
    sb1 = new StringBuilder();
    out.println("1) Production Stages");
    primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    particularFormat1 = "%6.3f";
    nudge = null;
    famish = null;
    obstruct = null;
    out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (ThroughputLap waffen : this.urgingStagecoachBlacklist) {
      nudge = format(particularFormat1, waffen.havePodiumHalfFactory()) + "%";
      famish = format(particularFormat1, waffen.becomeLapSummateFatten());
      obstruct = format(particularFormat1, waffen.generateRostrumAbsolutePrevented());
      sb1.append(
          format(
              primaryFormat1,
              waffen.driveFarmNickname(),
              waffen.goCommonwealth(),
              nudge,
              famish,
              obstruct,
              format(particularFormat1, waffen.canUnconditionedYearsFacility())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    double belowBorder;
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String cite, blvdClock, moyBelongings;
    String number;
    belowBorder = 0.03909197134863307;
    sb2 = new StringBuilder();
    out.println("2) ISQ's");
    primaryFormat2 = "%-15s%-15s%-15s%-15s";
    particularFormat2 = "%6.3f";
    cite = null;
    blvdClock = null;
    moyBelongings = null;
    number = null;
    out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (MajorSceneSpace q : this.isqNumber) {
      cite = q.becomeConstitute();
      blvdClock = format(particularFormat2, q.goIsqWaitingClock());
      moyBelongings = format(particularFormat2, q.goIsqAverageParticularTally());
      number =
          (q.isComplete())
              ? format("%-5s%-5s", q.arriveFlowNumbers(), "FULL")
              : Integer.toString(q.arriveFlowNumbers());
      sb2.append(format(primaryFormat2, cite, number, blvdClock, moyBelongings));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public synchronized void stumpHalfBelongings() {
    double testimonial;
    testimonial = 0.9554485368506312;
    for (MajorSceneSpace q : this.isqNumber) synx128(q);
  }

  public synchronized void publicationLanesIndictment() {
    double minus;
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> track;
    minus = 0.982709982441417;
    sb3 = new StringBuilder();
    out.println("3) Paths");
    primaryFormat3 = "%-30s%-15s";
    out.println(format(primaryFormat3, "Path", "total Items"));
    track = this.farmersCountry.obtainRoutesMatter();
    for (Map.Entry<String, Double> access : track.entrySet()) synx129(sb3, primaryFormat3, access);
    out.println(sb3.toString());
  }

  public synchronized void publicationsPositionComponents() {
    String backCurtail;
    backCurtail = "EC";
    out.println("4) Job Count: " + this.general.startCareerTell());
    out.println(format(this.general.developLithographWording(), "Job", "Remaining Duration"));
    out.println(this.general.arriveSubstances());
  }

  public synchronized void publicationExistingYears() {
    int sec;
    sec = -1828388166;
    out.println("Current time: " + format("%6.3f", this.general.beatTypicalJuncture()));
  }

  public synchronized void printersDesignations() {
    int distinguish;
    distinguish = -2107063881;
    out.println("Simulation's Final Snapshot");
    this.publicationExistingYears();
    this.publicationInstarStatehood();
    this.publishIsqClock();
    this.publicationLanesIndictment();
    this.publicationsPositionComponents();
    out.println(
        "Total items Created: "
            + this.urgingStagecoachBlacklist.get(0).generateAbsoluteNecessitiesEngendered());
    out.println("Total Items Finished: " + this.farmersCountry.findGrossPoint());

    try {
      sleep(100);
    } catch (InterruptedException ye) {
      err.println(ye);
    }
  }

  private synchronized void synx124() {
    this.dsl = new Scanner(in);
  }

  private synchronized void synx125(ThroughputLap writes, ThroughputLap rostrumTerminated) {

    if (writes != rostrumTerminated)
      writes.engineeringGeneralKah(this.general.beatTypicalJuncture());
  }

  private synchronized void synx126() {
    this.printersDesignations();
    dsl.nextLine();
  }

  private synchronized void synx127(ThroughputLap ora) {
    ora.cycleAgenda(this.general.beatTypicalJuncture());
  }

  private synchronized void synx128(MajorSceneSpace q) {
    q.bossTabulation();
  }

  private synchronized void synx129(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> access) {
    sb3.append(format(primaryFormat3, access.getKey(), access.getValue()));
    sb3.append("\n");
  }
}
