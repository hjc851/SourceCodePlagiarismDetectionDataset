package seng2200;

public class CommencementRostrum extends seng2200.IndustrializationPhases {
  public seng2200.MattersPodiumArchiving producer;

  public CommencementRostrum(
      String inciteDescribe,
      MattersPodiumArchiving yield,
      double nasty,
      double browse,
      Organizer spinnaker) {
    super(inciteDescribe, nasty, browse, spinnaker);
    this.producer = (yield);
  }

  public synchronized double proceedingsAppropriation(double continuingAgain) {
    double longer;
    longer = (0);

    if (this.incumbentLand instanceof seng2200.HungrySubmit) {
      longer = (this.extrapolateElbowExpiry());
      this.litigatePiece = (new seng2200.Object());
      this.litigatePiece.arrangedIngressSentence(continuingAgain);
      this.incumbentLand = (new seng2200.WorkingTerritory());
      this.positionsBackstay.introduceRecentCareer(longer, this);
      this.consignmentReckon += (this.consignmentReckon + 1);
    } else if (this.incumbentLand instanceof seng2200.HinderSay) {

      if (this.producer.isComplete()) {
        longer = (-1);
      } else {
        this.litigatePiece.laidLeaveClip(continuingAgain);
        this.litigatePiece.impressionMoment(this.needleKey);
        this.producer.enque(this.litigatePiece, continuingAgain);
        this.litigatePiece = (new seng2200.Object());
        this.litigatePiece.arrangedIngressSentence(continuingAgain);
        longer = (this.extrapolateElbowExpiry());
        this.positionsBackstay.introduceRecentCareer(longer, this);
        this.incumbentLand = (new seng2200.WorkingTerritory());
        this.consignmentReckon += (this.consignmentReckon + 1);
      }
    } else {
      longer = (-1);
    }
    return longer;
  }

  public synchronized void wrapTopic(double thisThing) {
    this.companiesStatehoodKan(thisThing);

    if (this.producer.isComplete()) synx420();
    else synx421(thisThing);
  }

  private synchronized void synx420() {
    this.incumbentLand = (new seng2200.HinderSay());
  }

  private synchronized void synx421(double thisThing) {
    this.litigatePiece.laidLeaveClip(thisThing);
    this.litigatePiece.impressionMoment(this.needleKey);
    this.producer.enque(this.litigatePiece, thisThing);
    this.litigatePiece = (null);
    this.incumbentLand = (new seng2200.HungrySubmit());
    this.informedReactionaryDig(thisThing);
  }
}
