package seng2200;

public class UnlikelyLimelight extends ManufacturingDegree {
  private static final int synX876int = 0;
  private static final double synX875double = 0.17798954016400748;
  private static final int synX874int = 1;
  private static final int synX873int = 1;
  private static final int synX872int = 0;
  private static final double synX871double = 0.6924866787688526;

  UnlikelyLimelight(
      String impelDiscover,
      AmorTheaterWarehousing assistance,
      double equate,
      double ambit,
      ProcessingState urgesOxygen,
      Workflow mainsail) {
    super(impelDiscover, equate, ambit, mainsail);
    this.involvement = (assistance);
    this.supply = (urgesOxygen);
  }

  public static final double symbolism = 0.9059574401615895;

  public synchronized double operationDetail(double newChance) {
    double hokkianeseRadius;
    double expiry;
    hokkianeseRadius = (synX871double);
    expiry = (synX872int);

    if (this.typicalCentral instanceof FamishSate) {

      if (this.involvement.isVacant()) {
        expiry = (-synX873int);
      } else {
        this.workToken = (this.involvement.end(newChance));
        this.workToken.situatedGateMinutes(newChance);
        expiry = (this.recalculatedUrgesSpan());
        this.typicalCentral = (new BusybodiedRepublic());
        this.employerThursday.bestowNewfangledProblem(expiry, this);
      }
    } else {
      expiry = (-synX874int);
    }
    return expiry;
  }

  private ProcessingState supply = null;
  private AmorTheaterWarehousing involvement = null;

  public synchronized void endDetail(double flowMonth) {
    double highestRestricts;
    highestRestricts = (synX875double);
    this.corporateGovernmentalMeer(flowMonth);
    this.workToken.placedExpireWhen(flowMonth);
    this.workToken.imprimaturWeek(this.stimulateCite);
    this.supply.impart(this.workToken);

    if (this.involvement.isVacant()) {
      this.workToken = (null);
      this.typicalCentral = (new FamishSate());
    } else {
      double during;
      during = (synX876int);
      this.workToken = (this.involvement.end(flowMonth));
      this.workToken.situatedGateMinutes(flowMonth);
      during = (this.recalculatedUrgesSpan());
      this.typicalCentral = (new BusybodiedRepublic());
      this.employerThursday.bestowNewfangledProblem(during, this);
      this.warnLeftoverSpurring(flowMonth);
    }
  }
}
