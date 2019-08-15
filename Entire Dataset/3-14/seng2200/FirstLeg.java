package seng2200;

public class FirstLeg extends ManufactureRostrum {
  private static final int synX1206int = 1;
  private static final int synX1205int = 1;
  private static final int synX1204int = 1;
  private static final int synX1203int = 1;
  private static final int synX1202int = 0;
  public WithinPresentStore produced;

  public FirstLeg(
      String urgesGens,
      WithinPresentStore efficiency,
      double skilled,
      double graze,
      Programmer timezone) {
    super(urgesGens, skilled, graze, timezone);
    this.produced = efficiency;
  }

  public synchronized double phaseArticle(double thisThing) {
    double longer;
    longer = synX1202int;

    if (this.afootGovernment instanceof StrangleExpress) {
      longer = this.aimDigPeriod();
      this.operationDetail = new Point();
      this.operationDetail.putEnteringClock(thisThing);
      this.afootGovernment = new OccupiedLand();
      this.careerTonite.combineOtherWorkforce(longer, this);
      this.issueCalculate += this.issueCalculate + synX1203int;
    } else if (this.afootGovernment instanceof DeflectSubmit) {

      if (this.produced.isComplete()) {
        longer = -synX1204int;
      } else {
        this.operationDetail.determinedGoingDays(thisThing);
        this.operationDetail.pestlePeriod(this.labelPatronymic);
        this.produced.enque(this.operationDetail, thisThing);
        this.operationDetail = new Point();
        this.operationDetail.putEnteringClock(thisThing);
        longer = this.aimDigPeriod();
        this.careerTonite.combineOtherWorkforce(longer, this);
        this.afootGovernment = new OccupiedLand();
        this.issueCalculate += this.issueCalculate + synX1205int;
      }
    } else {
      longer = -synX1206int;
    }
    return longer;
  }

  public synchronized void accomplishAspect(double existingYears) {
    this.ingSayRough(existingYears);

    if (this.produced.isComplete()) synx200();
    else synx201(existingYears);
  }

  private synchronized void synx200() {
    this.afootGovernment = new DeflectSubmit();
  }

  private synchronized void synx201(double existingYears) {
    this.operationDetail.determinedGoingDays(existingYears);
    this.operationDetail.pestlePeriod(this.labelPatronymic);
    this.produced.enque(this.operationDetail, existingYears);
    this.operationDetail = null;
    this.afootGovernment = new StrangleExpress();
    this.apprizeProperPoke(existingYears);
  }
}
