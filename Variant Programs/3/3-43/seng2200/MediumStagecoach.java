package seng2200;

public class MediumStagecoach extends seng2200.ProductivityStep {
  private static final int synX3112int = 0;
  private static final String synX3111String = "Ipa4loupnL6";
  private static final int synX3110int = 1;
  private static final int synX3109int = 1;
  private static final int synX3108int = 1;
  private static final int synX3107int = 1;
  private static final int synX3106int = 0;
  private static final String synX3105String = "diSHUGgY1SjN5k";
  public static int minnOuter = -952595229;
  public seng2200.SpecialPhasesDepository opinion = null;
  public seng2200.SpecialPhasesDepository efficiency = null;

  public MediumStagecoach(
      String goadList,
      SpecialPhasesDepository stimulant,
      SpecialPhasesDepository performance,
      double tight,
      double order,
      Developer trysail) {
    super(goadList, tight, order, trysail);
    this.opinion = (stimulant);
    this.efficiency = (performance);
  }

  public synchronized double procedureParticular(double theOpportunity) {
    String price = synX3105String;
    double lasts = synX3106int;

    if (this.newRepublic instanceof seng2200.FeedGeneral) {

      if (this.opinion.isVacant()) {
        lasts = (-synX3107int);
      } else {
        this.marchArtifact = (this.opinion.affix(theOpportunity));
        this.marchArtifact.orderedEnteredChance(theOpportunity);
        lasts = (this.estimateGoadContinuance());
        this.newRepublic = (new seng2200.CongestedCanton());
        this.problemUshant.giveNewbornTasks(lasts, this);
      }
    } else if (this.newRepublic instanceof seng2200.BarExpress) {

      if (this.efficiency.isComplete()) {
        lasts = (-synX3108int);
      } else {
        this.marchArtifact.arrangedGoSentence(theOpportunity);
        this.marchArtifact.pigeonholeDay(this.needleKey);
        this.efficiency.enque(this.marchArtifact, theOpportunity);
        this.marchArtifact = (null);

        if (this.opinion.isVacant()) {
          lasts = (-synX3109int);
          this.newRepublic = (new seng2200.FeedGeneral());
        } else {
          this.marchArtifact = (this.opinion.affix(theOpportunity));
          this.marchArtifact.orderedEnteredChance(theOpportunity);
          lasts = (this.estimateGoadContinuance());
          this.problemUshant.giveNewbornTasks(lasts, this);
          this.newRepublic = (new seng2200.CongestedCanton());
        }
      }
    } else {
      lasts = (-synX3110int);
    }
    return lasts;
  }

  public synchronized void getArticle(double presentBeginning) {
    String souvenir = synX3111String;
    this.cniSateKuh(presentBeginning);

    if (this.efficiency.isComplete()) {
      this.newRepublic = (new seng2200.BarExpress());
    } else {
      this.marchArtifact.arrangedGoSentence(presentBeginning);
      this.marchArtifact.pigeonholeDay(this.needleKey);
      this.efficiency.enque(this.marchArtifact, presentBeginning);
      this.forewarnOpportunePush(presentBeginning);

      if (this.opinion.isVacant()) {
        this.marchArtifact = (null);
        this.newRepublic = (new seng2200.FeedGeneral());
      } else {
        double extent = synX3112int;
        this.marchArtifact = (this.opinion.affix(presentBeginning));
        this.marchArtifact.orderedEnteredChance(presentBeginning);
        extent = (this.estimateGoadContinuance());
        this.problemUshant.giveNewbornTasks(extent, this);
        this.newRepublic = (new seng2200.CongestedCanton());
        this.communicatedBoltedOriented(presentBeginning);
      }
    }
  }
}
