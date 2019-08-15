package seng2200;

public class CommencesPlace extends seng2200.ManufactureRostrum {
  private static final int synX1647int = -1347832533;
  private static final int synX1646int = 1;
  private static final int synX1645int = 1;
  private static final int synX1644int = 1;
  private static final int synX1643int = 1;
  private static final int synX1642int = 0;
  private static final int synX1641int = -1959454133;
  public static final int code = 1791026551;
  public seng2200.OtherLimelightRepository produces;

  public CommencesPlace(
      String orientedConstitute,
      OtherLimelightRepository outturn,
      double nasty,
      double graze,
      Workflow saturday) {
    super(orientedConstitute, nasty, graze, saturday);
    this.produces = (outturn);
  }

  public synchronized double mechanismsSubject(double actualSentence) {
    int johannes = synX1641int;
    double maximum = synX1642int;

    if (this.afootGovernment instanceof seng2200.FeedGeneral) {
      maximum = (this.reckonStabLasted());
      this.appendageGoods = (new seng2200.Element());
      this.appendageGoods.doRegisterAgain(actualSentence);
      this.afootGovernment = (new seng2200.DrudgingFederal());
      this.dutiesArvo.appendModernTask(maximum, this);
      this.pieceReckoning += (synX1643int);
    } else if (this.afootGovernment instanceof seng2200.HinderSay) {

      if (this.produces.isComplete()) {
        maximum = (-synX1644int);
      } else {
        this.appendageGoods.arrangeEgressYears(actualSentence);
        this.appendageGoods.eradicateOpportunity(this.goadingNominate);
        this.produces.enque(this.appendageGoods, actualSentence);
        this.appendageGoods = (new seng2200.Element());
        this.appendageGoods.doRegisterAgain(actualSentence);
        maximum = (this.reckonStabLasted());
        this.dutiesArvo.appendModernTask(maximum, this);
        this.afootGovernment = (new seng2200.DrudgingFederal());
        this.pieceReckoning += (synX1645int);
      }
    } else {
      maximum = (-synX1646int);
    }
    return maximum;
  }

  public synchronized void doneSubject(double previousHour) {
    int threshold = synX1647int;
    this.ltdCommonwealthTheo(previousHour);

    if (this.produces.isComplete()) synx240();
    else synx241(previousHour);
  }

  private synchronized void synx240() {
    this.afootGovernment = (new seng2200.HinderSay());
  }

  private synchronized void synx241(double previousHour) {
    this.appendageGoods.arrangeEgressYears(previousHour);
    this.appendageGoods.eradicateOpportunity(this.goadingNominate);
    this.produces.enque(this.appendageGoods, previousHour);
    this.appendageGoods = (null);
    this.afootGovernment = (new seng2200.FeedGeneral());
    this.informedReactionaryDig(previousHour);
  }
}
