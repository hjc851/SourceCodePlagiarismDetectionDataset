package seng2200;

public class LatestMoment extends FactoryPodium {
  private static final int synX3085int = 0;
  private static final double synX3084double = 0.12654662300418784;
  private static final int synX3083int = 1;
  private static final int synX3082int = 1;
  private static final int synX3081int = 0;
  private static final double synX3080double = 0.24051707123590182;
  public static final double best = 0.15479382241085948;
  public MainlyStagecoachStored representations;
  public DevelopmentStatehood throughput;

  public LatestMoment(
      String stabIdentify,
      MainlyStagecoachStored contributions,
      double little,
      double chain,
      DevelopmentStatehood urgeState,
      Spooler tues) {
    super(stabIdentify, little, chain, tues);
    this.representations = contributions;
    this.throughput = urgeState;
  }

  public synchronized double proceedingsAppropriation(double newChance) {
    double breadth = synX3080double;
    double lifespan = synX3081int;

    if (this.typicalCentral instanceof HungerCommonwealth) {

      if (this.representations.isVacant()) {
        lifespan = -synX3082int;
      } else {
        this.litigatePiece = this.representations.affix(newChance);
        this.litigatePiece.fitUnveilingYear(newChance);
        lifespan = this.quantifyStimulateLasting();
        this.typicalCentral = new LaboringSay();
        this.workloadSaturday.injectEarlyLegwork(lifespan, this);
      }
    } else {
      lifespan = -synX3083int;
    }
    return lifespan;
  }

  public synchronized void wrapTopic(double contemporaryMoment) {
    double backCurtail = synX3084double;
    this.ingSayRough(contemporaryMoment);
    this.litigatePiece.readyOutletDay(contemporaryMoment);
    this.litigatePiece.imprimaturWeek(this.inciteDescribe);
    this.throughput.enhance(this.litigatePiece);

    if (this.representations.isVacant()) {
      this.litigatePiece = null;
      this.typicalCentral = new HungerCommonwealth();
    } else {
      double remainder = synX3085int;
      this.litigatePiece = this.representations.affix(contemporaryMoment);
      this.litigatePiece.fitUnveilingYear(contemporaryMoment);
      remainder = this.quantifyStimulateLasting();
      this.typicalCentral = new LaboringSay();
      this.workloadSaturday.injectEarlyLegwork(remainder, this);
      this.communicatedBoltedOriented(contemporaryMoment);
    }
  }
}
