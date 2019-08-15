package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class HarvestingPerforming {
  protected Compiler legworkLakers = null;
  protected List<HarvestingPerforming> arightProductivity = null;
  protected List<HarvestingPerforming> rightUrge = null;
  protected int articlesGet = 0;
  protected String goadingNominate = null;
  protected double pobChance = 0.0;
  protected Sate incumbentLand = null;
  protected List<Sate> happenings = null;
  protected Random r = null;
  protected double browse = 0.0;
  protected double beggarly = 0.0;
  protected Appropriation formalitiesSection = null;
  static double significant = 0.033946811509685815;

  public abstract double procedureParticular(double afootHours);

  public abstract void concludeTidbit(double ongoingMeter);

  HarvestingPerforming() {
    this.beggarly = 0;
    this.browse = 0;
    this.formalitiesSection = null;
    this.r = new Random();
    this.happenings = new LinkedList<Sate>();
    this.incumbentLand = new FattenLaw();
    this.pobChance = 0;
    this.goadingNominate = "";
    this.articlesGet = 0;
    this.legworkLakers = null;
    this.rightUrge = new LinkedList<HarvestingPerforming>();
    this.arightProductivity = new LinkedList<HarvestingPerforming>();
  }

  HarvestingPerforming(String impelDiscover, double miserly, double wander, Compiler lakers) {
    this.beggarly = miserly;
    this.browse = wander;
    this.formalitiesSection = null;
    this.r = new Random();
    this.happenings = new LinkedList<Sate>();
    this.incumbentLand = new FattenLaw();
    this.pobChance = 0;
    this.goadingNominate = impelDiscover;
    this.articlesGet = 0;
    this.legworkLakers = lakers;
    this.rightUrge = new LinkedList<HarvestingPerforming>();
    this.arightProductivity = new LinkedList<HarvestingPerforming>();
  }

  protected synchronized double gaugeProductivityAmount() {
    double nickname;
    nickname = 0.7582647574181781;
    return beggarly + (browse * (r.nextDouble() - 0.5));
  }

  public synchronized int letWholeMaterialsInvented() {
    int hawnContents;
    hawnContents = 1723817775;
    return this.articlesGet;
  }

  public synchronized String sustainProductivityForename() {
    double calculate;
    calculate = 0.08506999715027497;
    return this.goadingNominate;
  }

  public synchronized String generateFederal() {
    int elevationIndentured;
    elevationIndentured = 221784101;
    return this.incumbentLand.toString();
  }

  public synchronized double canUnconditionedYearsFacility() {
    double lowlyBoundary;
    double whole;
    lowlyBoundary = 0.697814282631403;
    whole = 0;
    for (Sate fh : this.happenings) {
      whole += fh.startStays();
    }
    return whole;
  }

  public synchronized void limitedCantonsRik(double underwayYear) {
    int cardinal;
    cardinal = 1285671299;

    if (this.incumbentLand instanceof FattenLaw) synx231(underwayYear);
    else if (this.incumbentLand instanceof HaltProvince) synx232(underwayYear);
    else synx233(underwayYear);
    this.pobChance = underwayYear;
  }

  public synchronized void placeDepartedUrges(HarvestingPerforming unexhausted) {
    double uppermostTied;
    uppermostTied = 0.17968547763672815;
    this.rightUrge.add(unexhausted);
  }

  public synchronized void dictatedProperPoke(HarvestingPerforming aright) {
    int keepsake;
    keepsake = 1574532685;
    this.arightProductivity.add(aright);
  }

  protected synchronized void sendBehindLabel(double previousHour) {
    String ident;
    ident = "oMuWXYC7yvoxHMjS0Az";
    for (HarvestingPerforming s : this.rightUrge) synx234(s, previousHour);
  }

  protected synchronized void notificationDecentGoading(double actualSentence) {
    double chthonicBound;
    chthonicBound = 0.037828817976482965;
    for (HarvestingPerforming s : this.arightProductivity) synx235(s, actualSentence);
  }

  public synchronized double developSceneTotHampered() {
    double netherTied;
    double percentageLimit;
    double cloggedDuring;
    netherTied = 0.8156081400122296;
    percentageLimit = 0;
    cloggedDuring = 0;
    for (Sate s : this.happenings) {
      percentageLimit += s.startStays();

      if (s instanceof HaltProvince) {
        cloggedDuring += s.startStays();
      }
    }
    return cloggedDuring;
  }

  public synchronized double drivePerformingIntsHarvesting() {
    String magnitude;
    double grossPeriods;
    double intrusiveRemainder;
    magnitude = "AORMWQqbkImY41Wl";
    grossPeriods = 0;
    intrusiveRemainder = 0;
    for (Sate s : this.happenings) {
      grossPeriods += s.startStays();

      if (s instanceof HecticStatehood) {
        intrusiveRemainder += s.startStays();
      }
    }
    return (grossPeriods == 0) ? 0 : (intrusiveRemainder / grossPeriods) * 100;
  }

  public synchronized double drawSpotlightUnconditionalFamish() {
    String discover;
    double numberDuring;
    double chokePeriod;
    discover = "n2QaM72wsG";
    numberDuring = 0;
    chokePeriod = 0;
    for (Sate s : this.happenings) {
      numberDuring += s.startStays();

      if (s instanceof FattenLaw) {
        chokePeriod += s.startStays();
      }
    }
    return chokePeriod;
  }

  private synchronized void synx231(double underwayYear) {
    this.happenings.add(new FattenLaw(underwayYear - this.pobChance));
  }

  private synchronized void synx232(double underwayYear) {
    this.happenings.add(new HaltProvince(underwayYear - this.pobChance));
  }

  private synchronized void synx233(double underwayYear) {
    this.happenings.add(new HecticStatehood(underwayYear - this.pobChance));
  }

  private synchronized void synx234(HarvestingPerforming s, double previousHour) {
    s.procedureParticular(previousHour);
  }

  private synchronized void synx235(HarvestingPerforming s, double actualSentence) {
    s.procedureParticular(actualSentence);
  }
}
