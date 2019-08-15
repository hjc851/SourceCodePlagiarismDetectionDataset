package seng2200;

public class HighPerforming extends ManufactureRostrum {
  private static final int synX1317int = 0;
  private static final int synX1316int = 1;
  private static final int synX1315int = 1;
  private static final int synX1314int = 0;
  public ProducingStatistics supply;
  public WithinPresentStore comments;

  public HighPerforming(
      String inciteDescribe,
      WithinPresentStore stimulation,
      double miserly,
      double straddle,
      ProducingStatistics pokeStatistics,
      Programmer cunningham) {
    super(inciteDescribe, miserly, straddle, cunningham);
    this.comments = stimulation;
    this.supply = pokeStatistics;
  }

  public synchronized double phaseArticle(double presentBeginning) {
    double period;
    period = synX1314int;

    if (this.afootGovernment instanceof StrangleExpress) {

      if (this.comments.isVacant()) {
        period = -synX1315int;
      } else {
        this.operationDetail = this.comments.bareness(presentBeginning);
        this.operationDetail.putEnteringClock(presentBeginning);
        period = this.aimDigPeriod();
        this.afootGovernment = new OccupiedLand();
        this.careerTonite.combineOtherWorkforce(period, this);
      }
    } else {
      period = -synX1316int;
    }
    return period;
  }

  public synchronized void accomplishAspect(double topicalPeriod) {
    this.ingSayRough(topicalPeriod);
    this.operationDetail.determinedGoingDays(topicalPeriod);
    this.operationDetail.pestlePeriod(this.labelPatronymic);
    this.supply.contribute(this.operationDetail);

    if (this.comments.isVacant()) synx217();
    else synx218(topicalPeriod);
  }

  private synchronized void synx217() {
    this.operationDetail = null;
    this.afootGovernment = new StrangleExpress();
  }

  private synchronized void synx218(double topicalPeriod) {
    double periods;
    periods = synX1317int;
    this.operationDetail = this.comments.bareness(topicalPeriod);
    this.operationDetail.putEnteringClock(topicalPeriod);
    periods = this.aimDigPeriod();
    this.afootGovernment = new OccupiedLand();
    this.careerTonite.combineOtherWorkforce(periods, this);
    this.warnLeftoverSpurring(topicalPeriod);
  }
}
