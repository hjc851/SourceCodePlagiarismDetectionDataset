package seng2200;

public class SettingPerforming extends seng2200.ManufactureRostrum {
  private static final int synX1655int = 0;
  private static final String synX1654String = "fm1QpTSiCDHaSl";
  private static final int synX1653int = 1;
  private static final int synX1652int = 1;
  private static final int synX1651int = 1;
  private static final int synX1650int = 1;
  private static final int synX1649int = 0;
  private static final int synX1648int = 956953631;
  public static String aboveBounds = "";
  public seng2200.OtherLimelightRepository stimulation;
  public seng2200.OtherLimelightRepository quantity;

  public SettingPerforming(
      String spurringCall,
      OtherLimelightRepository involvement,
      OtherLimelightRepository intensity,
      double normal,
      double rove,
      Workflow tues) {
    super(spurringCall, normal, rove, tues);
    this.stimulation = (involvement);
    this.quantity = (intensity);
  }

  public synchronized double mechanismsSubject(double continuingAgain) {
    int market = synX1648int;
    double longevity = synX1649int;

    if (this.afootGovernment instanceof seng2200.FeedGeneral) {

      if (this.stimulation.isVacant()) {
        longevity = (-synX1650int);
      } else {
        this.appendageGoods = (this.stimulation.element(continuingAgain));
        this.appendageGoods.doRegisterAgain(continuingAgain);
        longevity = (this.reckonStabLasted());
        this.afootGovernment = (new seng2200.DrudgingFederal());
        this.dutiesArvo.appendModernTask(longevity, this);
      }
    } else if (this.afootGovernment instanceof seng2200.HinderSay) {

      if (this.quantity.isComplete()) {
        longevity = (-synX1651int);
      } else {
        this.appendageGoods.arrangeEgressYears(continuingAgain);
        this.appendageGoods.eradicateOpportunity(this.goadingNominate);
        this.quantity.enque(this.appendageGoods, continuingAgain);
        this.appendageGoods = (null);

        if (this.stimulation.isVacant()) {
          longevity = (-synX1652int);
          this.afootGovernment = (new seng2200.FeedGeneral());
        } else {
          this.appendageGoods = (this.stimulation.element(continuingAgain));
          this.appendageGoods.doRegisterAgain(continuingAgain);
          longevity = (this.reckonStabLasted());
          this.dutiesArvo.appendModernTask(longevity, this);
          this.afootGovernment = (new seng2200.DrudgingFederal());
        }
      }
    } else {
      longevity = (-synX1653int);
    }
    return longevity;
  }

  public synchronized void doneSubject(double afootHours) {
    String token = synX1654String;
    this.ltdCommonwealthTheo(afootHours);

    if (this.quantity.isComplete()) synx242();
    else synx243(afootHours);
  }

  private synchronized void synx242() {
    this.afootGovernment = (new seng2200.HinderSay());
  }

  private synchronized void synx243(double afootHours) {
    this.appendageGoods.arrangeEgressYears(afootHours);
    this.appendageGoods.eradicateOpportunity(this.goadingNominate);
    this.quantity.enque(this.appendageGoods, afootHours);
    this.informedReactionaryDig(afootHours);

    if (this.stimulation.isVacant()) {
      this.appendageGoods = (null);
      this.afootGovernment = (new seng2200.FeedGeneral());
    } else {
      double timescale = synX1655int;
      this.appendageGoods = (this.stimulation.element(afootHours));
      this.appendageGoods.doRegisterAgain(afootHours);
      timescale = (this.reckonStabLasted());
      this.dutiesArvo.appendModernTask(timescale, this);
      this.afootGovernment = (new seng2200.DrudgingFederal());
      this.appriseNearGoad(afootHours);
    }
  }
}
