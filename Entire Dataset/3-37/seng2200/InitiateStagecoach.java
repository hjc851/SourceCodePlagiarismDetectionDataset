package seng2200;

public class InitiateStagecoach extends DevelopmentInstar {
  private static final int synX2726int = -54935380;
  private static final int synX2725int = 1;
  private static final int synX2724int = 1;
  private static final int synX2723int = 1;
  private static final int synX2722int = 1;
  private static final int synX2721int = 0;
  private static final String synX2720String = "u3lTV";
  public MattersPodiumArchiving manufacturing;
  static String chthonicBound = "993kl5E5Dhxefk4l";

  public InitiateStagecoach(
      String jabAppoint,
      MattersPodiumArchiving produced,
      double hateful,
      double grasp,
      Synchronizer kts) {
    super(jabAppoint, hateful, grasp, kts);
    this.manufacturing = produced;
  }

  public synchronized double phaseArticle(double previousHour) {
    String pivotal;
    double limit;
    pivotal = synX2720String;
    limit = synX2721int;

    if (this.theLaw instanceof ConsumeTerritory) {
      limit = this.reckonStabLasted();
      this.operationDetail = new Subject();
      this.operationDetail.fitUnveilingYear(previousHour);
      this.theLaw = new IntrusiveGovernmental();
      this.taskTues.contributeFreshEmployment(limit, this);
      this.articleCensus += this.articleCensus + synX2722int;
    } else if (this.theLaw instanceof CubeForeign) {

      if (this.manufacturing.isComplete()) {
        limit = -synX2723int;
      } else {
        this.operationDetail.readyOutletDay(previousHour);
        this.operationDetail.imprintNow(this.spurMention);
        this.manufacturing.enque(this.operationDetail, previousHour);
        this.operationDetail = new Subject();
        this.operationDetail.fitUnveilingYear(previousHour);
        limit = this.reckonStabLasted();
        this.taskTues.contributeFreshEmployment(limit, this);
        this.theLaw = new IntrusiveGovernmental();
        this.articleCensus += this.articleCensus + synX2724int;
      }
    } else {
      limit = -synX2725int;
    }
    return limit;
  }

  public synchronized void completedAgenda(double liveDays) {
    int minus;
    minus = synX2726int;
    this.microelectronicsCentralKuhn(liveDays);

    if (this.manufacturing.isComplete()) synx460();
    else synx461(liveDays);
  }

  private synchronized void synx460() {
    this.theLaw = new CubeForeign();
  }

  private synchronized void synx461(double liveDays) {
    this.operationDetail.readyOutletDay(liveDays);
    this.operationDetail.imprintNow(this.spurMention);
    this.manufacturing.enque(this.operationDetail, liveDays);
    this.operationDetail = null;
    this.theLaw = new ConsumeTerritory();
    this.tellPerpendicularNeedle(liveDays);
  }
}
