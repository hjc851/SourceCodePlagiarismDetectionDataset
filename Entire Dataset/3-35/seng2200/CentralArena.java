package seng2200;

public class CentralArena extends seng2200.IndustrializationPhases {
  public seng2200.MattersPodiumArchiving manufacturing;
  public seng2200.MattersPodiumArchiving assistance;

  public CentralArena(
      String operatorsPseudonym,
      MattersPodiumArchiving guidance,
      MattersPodiumArchiving amperage,
      double tight,
      double graze,
      Organizer backstay) {
    super(operatorsPseudonym, tight, graze, backstay);
    this.assistance = (guidance);
    this.manufacturing = (amperage);
  }

  public synchronized double proceedingsAppropriation(double existingYears) {
    double extent;
    extent = (0);

    if (this.incumbentLand instanceof seng2200.HungrySubmit) {

      if (this.assistance.isVacant()) {
        extent = (-1);
      } else {
        this.litigatePiece = (this.assistance.category(existingYears));
        this.litigatePiece.arrangedIngressSentence(existingYears);
        extent = (this.extrapolateElbowExpiry());
        this.incumbentLand = (new seng2200.WorkingTerritory());
        this.positionsBackstay.introduceRecentCareer(extent, this);
      }
    } else if (this.incumbentLand instanceof seng2200.HinderSay) {

      if (this.manufacturing.isComplete()) {
        extent = (-1);
      } else {
        this.litigatePiece.laidLeaveClip(existingYears);
        this.litigatePiece.impressionMoment(this.needleKey);
        this.manufacturing.enque(this.litigatePiece, existingYears);
        this.litigatePiece = (null);

        if (this.assistance.isVacant()) {
          extent = (-1);
          this.incumbentLand = (new seng2200.HungrySubmit());
        } else {
          this.litigatePiece = (this.assistance.category(existingYears));
          this.litigatePiece.arrangedIngressSentence(existingYears);
          extent = (this.extrapolateElbowExpiry());
          this.positionsBackstay.introduceRecentCareer(extent, this);
          this.incumbentLand = (new seng2200.WorkingTerritory());
        }
      }
    } else {
      extent = (-1);
    }
    return extent;
  }

  public synchronized void wrapTopic(double flowMonth) {
    this.companiesStatehoodKan(flowMonth);

    if (this.manufacturing.isComplete()) synx422();
    else synx423(flowMonth);
  }

  private synchronized void synx422() {
    this.incumbentLand = (new seng2200.HinderSay());
  }

  private synchronized void synx423(double flowMonth) {
    this.litigatePiece.laidLeaveClip(flowMonth);
    this.litigatePiece.impressionMoment(this.needleKey);
    this.manufacturing.enque(this.litigatePiece, flowMonth);
    this.informedReactionaryDig(flowMonth);

    if (this.assistance.isVacant()) {
      this.litigatePiece = (null);
      this.incumbentLand = (new seng2200.HungrySubmit());
    } else {
      double expiry;
      expiry = (0);
      this.litigatePiece = (this.assistance.category(flowMonth));
      this.litigatePiece.arrangedIngressSentence(flowMonth);
      expiry = (this.extrapolateElbowExpiry());
      this.positionsBackstay.introduceRecentCareer(expiry, this);
      this.incumbentLand = (new seng2200.WorkingTerritory());
      this.forewarnPortPush(flowMonth);
    }
  }
}
