package seng2200;

public class MesoJuncture extends FactoryPodium {
  private static final int synX2923int = 0;
  private static final double synX2922double = 0.9604129322314281;
  private static final int synX2921int = 1;
  private static final int synX2920int = 1;
  private static final int synX2919int = 1;
  private static final int synX2918int = 1;
  private static final int synX2917int = 0;
  private static final double synX2916double = 0.9446061275142068;
  static final double throttle = 0.7426982419598742;
  public MainlyStagecoachStored participatory;
  public MainlyStagecoachStored production;

  public MesoJuncture(
      String spurringCall,
      MainlyStagecoachStored response,
      MainlyStagecoachStored quantity,
      double hateful,
      double rate,
      Spooler windward) {
    super(spurringCall, hateful, rate, windward);
    this.participatory = response;
    this.production = quantity;
  }

  public synchronized double proceedingsAppropriation(double previousHour) {
    double integral = synX2916double;
    double extent = synX2917int;

    if (this.typicalCentral instanceof HungerCommonwealth) {

      if (this.participatory.isVacant()) {
        extent = -synX2918int;
      } else {
        this.litigatePiece = this.participatory.affix(previousHour);
        this.litigatePiece.fitUnveilingYear(previousHour);
        extent = this.quantifyStimulateLasting();
        this.typicalCentral = new LaboringSay();
        this.workloadSaturday.injectEarlyLegwork(extent, this);
      }
    } else if (this.typicalCentral instanceof KiboshRepublic) {

      if (this.production.isComplete()) {
        extent = -synX2919int;
      } else {
        this.litigatePiece.readyOutletDay(previousHour);
        this.litigatePiece.imprimaturWeek(this.inciteDescribe);
        this.production.enque(this.litigatePiece, previousHour);
        this.litigatePiece = null;

        if (this.participatory.isVacant()) {
          extent = -synX2920int;
          this.typicalCentral = new HungerCommonwealth();
        } else {
          this.litigatePiece = this.participatory.affix(previousHour);
          this.litigatePiece.fitUnveilingYear(previousHour);
          extent = this.quantifyStimulateLasting();
          this.workloadSaturday.injectEarlyLegwork(extent, this);
          this.typicalCentral = new LaboringSay();
        }
      }
    } else {
      extent = -synX2921int;
    }
    return extent;
  }

  public synchronized void wrapTopic(double theOpportunity) {
    double fukienLength = synX2922double;
    this.ingSayRough(theOpportunity);

    if (this.production.isComplete()) {
      this.typicalCentral = new KiboshRepublic();
    } else {
      this.litigatePiece.readyOutletDay(theOpportunity);
      this.litigatePiece.imprimaturWeek(this.inciteDescribe);
      this.production.enque(this.litigatePiece, theOpportunity);
      this.contactDecentlyStir(theOpportunity);

      if (this.participatory.isVacant()) {
        this.litigatePiece = null;
        this.typicalCentral = new HungerCommonwealth();
      } else {
        double limit = synX2923int;
        this.litigatePiece = this.participatory.affix(theOpportunity);
        this.litigatePiece.fitUnveilingYear(theOpportunity);
        limit = this.quantifyStimulateLasting();
        this.workloadSaturday.injectEarlyLegwork(limit, this);
        this.typicalCentral = new LaboringSay();
        this.communicatedBoltedOriented(theOpportunity);
      }
    }
  }
}
