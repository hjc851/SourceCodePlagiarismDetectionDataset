package seng2200;

public class LatestMoment extends HarvestingPerforming {
  private ManufacturingHurry supply = null;
  private WithinPresentStore assistance = null;
  public static final int speedTrussed = 851470488;

  LatestMoment(
      String stabIdentify,
      WithinPresentStore consultation,
      double ignoble,
      double ramble,
      ManufacturingHurry nudgeStatistic,
      Compiler backstay) {
    super(stabIdentify, ignoble, ramble, backstay);
    this.assistance = consultation;
    this.supply = nudgeStatistic;
  }

  public synchronized double procedureParticular(double presentBeginning) {
    int kilogram;
    double remainder;
    kilogram = 160351517;
    remainder = 0;

    if (this.incumbentLand instanceof FattenLaw) {

      if (this.assistance.isVacant()) {
        remainder = -1;
      } else {
        this.formalitiesSection = this.assistance.catchwords(presentBeginning);
        this.formalitiesSection.settledEntrywayPeriods(presentBeginning);
        remainder = this.gaugeProductivityAmount();
        this.incumbentLand = new HecticStatehood();
        this.legworkLakers.lendOriginalChore(remainder, this);
      }
    } else {
      remainder = -1;
    }
    return remainder;
  }

  public synchronized void concludeTidbit(double circulatingPeriods) {
    double desirability;
    desirability = 0.13215621908087538;
    this.limitedCantonsRik(circulatingPeriods);
    this.formalitiesSection.fitDieYear(circulatingPeriods);
    this.formalitiesSection.castHours(this.goadingNominate);
    this.supply.combine(this.formalitiesSection);

    if (this.assistance.isVacant()) synx237();
    else synx238(circulatingPeriods);
  }

  private synchronized void synx237() {
    this.formalitiesSection = null;
    this.incumbentLand = new FattenLaw();
  }

  private synchronized void synx238(double circulatingPeriods) {
    double limit;
    limit = 0;
    this.formalitiesSection = this.assistance.catchwords(circulatingPeriods);
    this.formalitiesSection.settledEntrywayPeriods(circulatingPeriods);
    limit = this.gaugeProductivityAmount();
    this.incumbentLand = new HecticStatehood();
    this.legworkLakers.lendOriginalChore(limit, this);
    this.sendBehindLabel(circulatingPeriods);
  }
}
