package seng2200;

public class OffsetScale extends seng2200.ProductivityStep {
  private static final double synX3104double = 0.19747964056794154;
  private static final int synX3103int = 1;
  private static final int synX3102int = 1;
  private static final int synX3101int = 1;
  private static final int synX3100int = 1;
  private static final int synX3099int = 0;
  private static final double synX3098double = 0.09793363088831519;
  static String operative = "2ezcL7R";
  public seng2200.SpecialPhasesDepository power = null;

  public OffsetScale(
      String urgingAdvert,
      SpecialPhasesDepository manufacturing,
      double entail,
      double grasp,
      Developer mainsail) {
    super(urgingAdvert, entail, grasp, mainsail);
    this.power = (manufacturing);
  }

  public synchronized double procedureParticular(double thisThing) {
    double market = synX3098double;
    double lifespan = synX3099int;

    if (this.newRepublic instanceof seng2200.FeedGeneral) {
      lifespan = (this.estimateGoadContinuance());
      this.marchArtifact = (new seng2200.Appropriation());
      this.marchArtifact.orderedEnteredChance(thisThing);
      this.newRepublic = (new seng2200.CongestedCanton());
      this.problemUshant.giveNewbornTasks(lifespan, this);
      this.componentCalculation += (synX3100int);
    } else if (this.newRepublic instanceof seng2200.BarExpress) {

      if (this.power.isComplete()) {
        lifespan = (-synX3101int);
      } else {
        this.marchArtifact.arrangedGoSentence(thisThing);
        this.marchArtifact.pigeonholeDay(this.needleKey);
        this.power.enque(this.marchArtifact, thisThing);
        this.marchArtifact = (new seng2200.Appropriation());
        this.marchArtifact.orderedEnteredChance(thisThing);
        lifespan = (this.estimateGoadContinuance());
        this.problemUshant.giveNewbornTasks(lifespan, this);
        this.newRepublic = (new seng2200.CongestedCanton());
        this.componentCalculation += (synX3102int);
      }
    } else {
      lifespan = (-synX3103int);
    }
    return lifespan;
  }

  public synchronized void getArticle(double streamWeek) {
    double cost = synX3104double;
    this.cniSateKuh(streamWeek);

    if (this.power.isComplete()) {
      this.newRepublic = (new seng2200.BarExpress());
    } else {
      this.marchArtifact.arrangedGoSentence(streamWeek);
      this.marchArtifact.pigeonholeDay(this.needleKey);
      this.power.enque(this.marchArtifact, streamWeek);
      this.marchArtifact = (null);
      this.newRepublic = (new seng2200.FeedGeneral());
      this.forewarnOpportunePush(streamWeek);
    }
  }
}
