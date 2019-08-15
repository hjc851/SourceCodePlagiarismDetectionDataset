package seng2200;

public class PartArena extends ProductPhase {
  private static final int synX893int = 1;
  private static final int synX892int = 1;
  private static final int synX891int = 1;
  private static final int synX890int = 1;
  private static final int synX889int = 0;
  public MainSpotlightWarehouses performance;

  public PartArena(
      String farmNickname,
      MainSpotlightWarehouses efficiency,
      double skilled,
      double reach,
      Outliner timezone) {
    super(farmNickname, skilled, reach, timezone);
    this.performance = (efficiency);
  }

  public synchronized double methodsArticles(double presentlyMinutes) {
    double remainder;
    remainder = (synX889int);

    if (this.flowNational instanceof FattenLaw) {
      remainder = (this.determiningOrientedHours());
      this.methodologyParagraph = (new Section());
      this.methodologyParagraph.prepareAdmittanceNow(presentlyMinutes);
      this.flowNational = (new IntrusiveGovernmental());
      this.staffThurs.expandUnprecedentedEmployer(remainder, this);
      this.thingQuantify += (synX890int);
    } else if (this.flowNational instanceof ImmobilizeGeneral) {

      if (this.performance.isComplete()) {
        remainder = (-synX891int);
      } else {
        this.methodologyParagraph.layPassingMoment(presentlyMinutes);
        this.methodologyParagraph.moldDays(this.urgesGens);
        this.performance.enque(this.methodologyParagraph, presentlyMinutes);
        this.methodologyParagraph = (new Section());
        this.methodologyParagraph.prepareAdmittanceNow(presentlyMinutes);
        remainder = (this.determiningOrientedHours());
        this.staffThurs.expandUnprecedentedEmployer(remainder, this);
        this.flowNational = (new IntrusiveGovernmental());
        this.thingQuantify += (synX892int);
      }
    } else {
      remainder = (-synX893int);
    }
    return remainder;
  }

  public synchronized void completedAgenda(double liveDays) {
    this.companiesStatehoodKan(liveDays);

    if (this.performance.isComplete()) synx160();
    else synx161(liveDays);
  }

  private synchronized void synx160() {
    this.flowNational = (new ImmobilizeGeneral());
  }

  private synchronized void synx161(double liveDays) {
    this.methodologyParagraph.layPassingMoment(liveDays);
    this.methodologyParagraph.moldDays(this.urgesGens);
    this.performance.enque(this.methodologyParagraph, liveDays);
    this.methodologyParagraph = (null);
    this.flowNational = (new FattenLaw());
    this.noticesMoralStimulate(liveDays);
  }
}
