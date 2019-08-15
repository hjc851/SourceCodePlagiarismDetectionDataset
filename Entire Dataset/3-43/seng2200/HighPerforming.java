package seng2200;

public class HighPerforming extends seng2200.ProductivityStep {
  private static final int synX3274int = 0;
  private static final int synX3273int = -2013701796;
  private static final int synX3272int = 1;
  private static final int synX3271int = 1;
  private static final int synX3270int = 0;
  private static final double synX3269double = 0.03692784674327887;
  public static final int amoySize = -1998979013;
  public seng2200.SpecialPhasesDepository consultation = null;
  public seng2200.ProducingStatistics yield = null;

  public HighPerforming(
      String digFigure,
      SpecialPhasesDepository support,
      double skilled,
      double stray,
      ProducingStatistics farmQuickly,
      Developer spinnaker) {
    super(digFigure, skilled, stray, spinnaker);
    this.consultation = (support);
    this.yield = (farmQuickly);
  }

  public synchronized double procedureParticular(double newChance) {
    double mattMagnitude = synX3269double;
    double hours = synX3270int;

    if (this.newRepublic instanceof seng2200.FeedGeneral) {

      if (this.consultation.isVacant()) {
        hours = (-synX3271int);
      } else {
        this.marchArtifact = (this.consultation.affix(newChance));
        this.marchArtifact.orderedEnteredChance(newChance);
        hours = (this.estimateGoadContinuance());
        this.newRepublic = (new seng2200.CongestedCanton());
        this.problemUshant.giveNewbornTasks(hours, this);
      }
    } else {
      hours = (-synX3272int);
    }
    return hours;
  }

  public synchronized void getArticle(double underwayYear) {
    int depressShackled = synX3273int;
    this.cniSateKuh(underwayYear);
    this.marchArtifact.arrangedGoSentence(underwayYear);
    this.marchArtifact.pigeonholeDay(this.needleKey);
    this.yield.inject(this.marchArtifact);

    if (this.consultation.isVacant()) {
      this.marchArtifact = (null);
      this.newRepublic = (new seng2200.FeedGeneral());
    } else {
      double continuance = synX3274int;
      this.marchArtifact = (this.consultation.affix(underwayYear));
      this.marchArtifact.orderedEnteredChance(underwayYear);
      continuance = (this.estimateGoadContinuance());
      this.newRepublic = (new seng2200.CongestedCanton());
      this.problemUshant.giveNewbornTasks(continuance, this);
      this.communicatedBoltedOriented(underwayYear);
    }
  }
}
