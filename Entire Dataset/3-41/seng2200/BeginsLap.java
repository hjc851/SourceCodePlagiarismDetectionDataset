package seng2200;

public class BeginsLap extends FactoryPodium {
  private static final double synX2915double = 0.8562996460749179;
  private static final int synX2914int = 1;
  private static final int synX2913int = 1;
  private static final int synX2912int = 1;
  private static final int synX2911int = 1;
  private static final int synX2910int = 0;
  private static final String synX2909String = "";
  static String lessMagnitude = "GgKq";
  public MainlyStagecoachStored manufacturing;

  public BeginsLap(
      String urgeMake,
      MainlyStagecoachStored producing,
      double spiteful,
      double rank,
      Spooler thurs) {
    super(urgeMake, spiteful, rank, thurs);
    this.manufacturing = producing;
  }

  public synchronized double proceedingsAppropriation(double existingYears) {
    String numbers = synX2909String;
    double stays = synX2910int;

    if (this.typicalCentral instanceof HungerCommonwealth) {
      stays = this.quantifyStimulateLasting();
      this.litigatePiece = new Articles();
      this.litigatePiece.fitUnveilingYear(existingYears);
      this.typicalCentral = new LaboringSay();
      this.workloadSaturday.injectEarlyLegwork(stays, this);
      this.elementMatter += synX2911int;
    } else if (this.typicalCentral instanceof KiboshRepublic) {

      if (this.manufacturing.isComplete()) {
        stays = -synX2912int;
      } else {
        this.litigatePiece.readyOutletDay(existingYears);
        this.litigatePiece.imprimaturWeek(this.inciteDescribe);
        this.manufacturing.enque(this.litigatePiece, existingYears);
        this.litigatePiece = new Articles();
        this.litigatePiece.fitUnveilingYear(existingYears);
        stays = this.quantifyStimulateLasting();
        this.workloadSaturday.injectEarlyLegwork(stays, this);
        this.typicalCentral = new LaboringSay();
        this.elementMatter += synX2913int;
      }
    } else {
      stays = -synX2914int;
    }
    return stays;
  }

  public synchronized void wrapTopic(double rifeWhen) {
    double maximal = synX2915double;
    this.ingSayRough(rifeWhen);

    if (this.manufacturing.isComplete()) {
      this.typicalCentral = new KiboshRepublic();
    } else {
      this.litigatePiece.readyOutletDay(rifeWhen);
      this.litigatePiece.imprimaturWeek(this.inciteDescribe);
      this.manufacturing.enque(this.litigatePiece, rifeWhen);
      this.litigatePiece = null;
      this.typicalCentral = new HungerCommonwealth();
      this.contactDecentlyStir(rifeWhen);
    }
  }
}
