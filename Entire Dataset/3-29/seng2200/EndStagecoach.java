package seng2200;

public class EndStagecoach extends ProcessingScale {
  private static final int synX2458int = 0;
  private static final int synX2457int = 1;
  private static final int synX2456int = 1;
  private static final int synX2455int = 0;
  public FilmingCountry production;
  public EntreArrangeDisk response;

  public EndStagecoach(
      String urgeMake,
      EntreArrangeDisk comments,
      double ignoble,
      double rove,
      FilmingCountry orientedCoeff,
      Configuration saturday) {
    super(urgeMake, ignoble, rove, saturday);
    this.response = (comments);
    this.production = (orientedCoeff);
  }

  public synchronized double treatObject(double prevailingClock) {
    double expiry;
    expiry = (synX2455int);

    if (this.flowNational instanceof FattenLaw) {

      if (this.response.isVacant()) {
        expiry = (-synX2456int);
      } else {
        this.summonsIngredient = (this.response.element(prevailingClock));
        this.summonsIngredient.adjustEnterMonth(prevailingClock);
        expiry = (this.computeNudgeLength());
        this.flowNational = (new OccupyGovernment());
        this.gigJimmie.totalRecentlySpeculate(expiry, this);
      }
    } else {
      expiry = (-synX2457int);
    }
    return expiry;
  }

  public synchronized void completingComponent(double presentBeginning) {
    this.ltdCommonwealthTheo(presentBeginning);
    this.summonsIngredient.rigidQuittingAmount(presentBeginning);
    this.summonsIngredient.affixMinutes(this.operatorsPseudonym);
    this.production.combine(this.summonsIngredient);

    if (this.response.isVacant()) synx397();
    else synx398(presentBeginning);
  }

  private synchronized void synx397() {
    this.summonsIngredient = (null);
    this.flowNational = (new FattenLaw());
  }

  private synchronized void synx398(double presentBeginning) {
    double lasts;
    lasts = (synX2458int);
    this.summonsIngredient = (this.response.element(presentBeginning));
    this.summonsIngredient.adjustEnterMonth(presentBeginning);
    lasts = (this.computeNudgeLength());
    this.flowNational = (new OccupyGovernment());
    this.gigJimmie.totalRecentlySpeculate(lasts, this);
    this.communicatedBoltedOriented(presentBeginning);
  }
}
