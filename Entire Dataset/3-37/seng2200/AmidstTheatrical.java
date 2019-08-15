package seng2200;

public class AmidstTheatrical extends DevelopmentInstar {
  private static final int synX2734int = 0;
  private static final double synX2733double = 0.962063214566622;
  private static final int synX2732int = 1;
  private static final int synX2731int = 1;
  private static final int synX2730int = 1;
  private static final int synX2729int = 1;
  private static final int synX2728int = 0;
  private static final double synX2727double = 0.05281858457328259;
  public MattersPodiumArchiving producing;
  public MattersPodiumArchiving guidance;
  public static int sec = -1575885463;

  public AmidstTheatrical(
      String elbowMoniker,
      MattersPodiumArchiving participatory,
      MattersPodiumArchiving productivity,
      double signify,
      double rate,
      Synchronizer arvo) {
    super(elbowMoniker, signify, rate, arvo);
    this.guidance = participatory;
    this.producing = productivity;
  }

  public synchronized double phaseArticle(double topicalPeriod) {
    double symbol;
    double timescale;
    symbol = synX2727double;
    timescale = synX2728int;

    if (this.theLaw instanceof ConsumeTerritory) {

      if (this.guidance.isVacant()) {
        timescale = -synX2729int;
      } else {
        this.operationDetail = this.guidance.calorie(topicalPeriod);
        this.operationDetail.fitUnveilingYear(topicalPeriod);
        timescale = this.reckonStabLasted();
        this.theLaw = new IntrusiveGovernmental();
        this.taskTues.contributeFreshEmployment(timescale, this);
      }
    } else if (this.theLaw instanceof CubeForeign) {

      if (this.producing.isComplete()) {
        timescale = -synX2730int;
      } else {
        this.operationDetail.readyOutletDay(topicalPeriod);
        this.operationDetail.imprintNow(this.spurMention);
        this.producing.enque(this.operationDetail, topicalPeriod);
        this.operationDetail = null;

        if (this.guidance.isVacant()) {
          timescale = -synX2731int;
          this.theLaw = new ConsumeTerritory();
        } else {
          this.operationDetail = this.guidance.calorie(topicalPeriod);
          this.operationDetail.fitUnveilingYear(topicalPeriod);
          timescale = this.reckonStabLasted();
          this.taskTues.contributeFreshEmployment(timescale, this);
          this.theLaw = new IntrusiveGovernmental();
        }
      }
    } else {
      timescale = -synX2732int;
    }
    return timescale;
  }

  public synchronized void completedAgenda(double continuingAgain) {
    double enumeration;
    enumeration = synX2733double;
    this.microelectronicsCentralKuhn(continuingAgain);

    if (this.producing.isComplete()) synx462();
    else synx463(continuingAgain);
  }

  private synchronized void synx462() {
    this.theLaw = new CubeForeign();
  }

  private synchronized void synx463(double continuingAgain) {
    this.operationDetail.readyOutletDay(continuingAgain);
    this.operationDetail.imprintNow(this.spurMention);
    this.producing.enque(this.operationDetail, continuingAgain);
    this.tellPerpendicularNeedle(continuingAgain);

    if (this.guidance.isVacant()) {
      this.operationDetail = null;
      this.theLaw = new ConsumeTerritory();
    } else {
      double length;
      length = synX2734int;
      this.operationDetail = this.guidance.calorie(continuingAgain);
      this.operationDetail.fitUnveilingYear(continuingAgain);
      length = this.reckonStabLasted();
      this.taskTues.contributeFreshEmployment(length, this);
      this.theLaw = new IntrusiveGovernmental();
      this.informedOddDig(continuingAgain);
    }
  }
}
