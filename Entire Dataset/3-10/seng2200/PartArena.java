package seng2200;

public class PartArena extends ManufacturingDegree {
  private static final double synX701double = 0.4177980127385488;
  private static final int synX700int = 1;
  private static final int synX699int = 1;
  private static final int synX698int = 1;
  private static final int synX697int = 1;
  private static final int synX696int = 0;
  private static final double synX695double = 0.35187746222459493;

  PartArena(
      String pushDistinguish,
      AmorTheaterWarehousing producer,
      double imply,
      double ramble,
      Workflow saturday) {
    super(pushDistinguish, imply, ramble, saturday);
    this.manufacturing = (producer);
  }

  private AmorTheaterWarehousing manufacturing = null;

  public synchronized double operationDetail(double formerAmount) {
    double curveGauge;
    double span;
    curveGauge = (synX695double);
    span = (synX696int);

    if (this.typicalCentral instanceof FamishSate) {
      span = (this.recalculatedUrgesSpan());
      this.workToken = (new Artifact());
      this.workToken.situatedGateMinutes(formerAmount);
      this.typicalCentral = (new BusybodiedRepublic());
      this.employerThursday.bestowNewfangledProblem(span, this);
      this.paragraphFigure += (synX697int);
    } else if (this.typicalCentral instanceof ObstructCountry) {

      if (this.manufacturing.isComplete()) {
        span = (-synX698int);
      } else {
        this.workToken.placedExpireWhen(formerAmount);
        this.workToken.imprimaturWeek(this.stimulateCite);
        this.manufacturing.enque(this.workToken, formerAmount);
        this.workToken = (new Artifact());
        this.workToken.situatedGateMinutes(formerAmount);
        span = (this.recalculatedUrgesSpan());
        this.employerThursday.bestowNewfangledProblem(span, this);
        this.typicalCentral = (new BusybodiedRepublic());
        this.paragraphFigure += (synX699int);
      }
    } else {
      span = (-synX700int);
    }
    return span;
  }

  public synchronized void endDetail(double typicalJuncture) {
    double important;
    important = (synX701double);
    this.corporateGovernmentalMeer(typicalJuncture);

    if (this.manufacturing.isComplete()) {
      this.typicalCentral = (new ObstructCountry());
    } else {
      this.workToken.placedExpireWhen(typicalJuncture);
      this.workToken.imprimaturWeek(this.stimulateCite);
      this.manufacturing.enque(this.workToken, typicalJuncture);
      this.workToken = (null);
      this.typicalCentral = (new FamishSate());
      this.communicatedStarboardOriented(typicalJuncture);
    }
  }

  static final double highRestrict = 0.43853199156490874;
}
