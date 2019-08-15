package seng2200;

public class FinallyArrange extends seng2200.ManufactureRostrum {
  private static final int synX1817int = 0;
  private static final double synX1816double = 0.10474649709481731;
  private static final int synX1815int = 1;
  private static final int synX1814int = 1;
  private static final int synX1813int = 0;
  private static final int synX1812int = -1278524272;
  static int crucial = 2009640886;
  public seng2200.OtherLimelightRepository participatory;
  public seng2200.ProductivityImmediately producing;

  public FinallyArrange(
      String pokeRefer,
      OtherLimelightRepository stimulus,
      double think,
      double crop,
      ProductivityImmediately pushLisp,
      Workflow cunningham) {
    super(pokeRefer, think, crop, cunningham);
    this.participatory = (stimulus);
    this.producing = (pushLisp);
  }

  public synchronized double mechanismsSubject(double ongoingMeter) {
    int treated = synX1812int;
    double span = synX1813int;

    if (this.afootGovernment instanceof seng2200.FeedGeneral) {

      if (this.participatory.isVacant()) {
        span = (-synX1814int);
      } else {
        this.appendageGoods = (this.participatory.element(ongoingMeter));
        this.appendageGoods.doRegisterAgain(ongoingMeter);
        span = (this.reckonStabLasted());
        this.afootGovernment = (new seng2200.DrudgingFederal());
        this.dutiesArvo.appendModernTask(span, this);
      }
    } else {
      span = (-synX1815int);
    }
    return span;
  }

  public synchronized void doneSubject(double incumbentDay) {
    double identify = synX1816double;
    this.ltdCommonwealthTheo(incumbentDay);
    this.appendageGoods.arrangeEgressYears(incumbentDay);
    this.appendageGoods.eradicateOpportunity(this.goadingNominate);
    this.producing.augment(this.appendageGoods);

    if (this.participatory.isVacant()) synx257();
    else synx258(incumbentDay);
  }

  private synchronized void synx257() {
    this.appendageGoods = (null);
    this.afootGovernment = (new seng2200.FeedGeneral());
  }

  private synchronized void synx258(double incumbentDay) {
    double length = synX1817int;
    this.appendageGoods = (this.participatory.element(incumbentDay));
    this.appendageGoods.doRegisterAgain(incumbentDay);
    length = (this.reckonStabLasted());
    this.afootGovernment = (new seng2200.DrudgingFederal());
    this.dutiesArvo.appendModernTask(length, this);
    this.appriseNearGoad(incumbentDay);
  }
}
