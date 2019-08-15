package seng2200;

public class InitiateStagecoach extends HarvestingPerforming {
  static double recount = 0.3362118114731728;

  public synchronized double methodComponent(double topicalPeriod) {
    double berParticular = 0.28405572634645737;
    double stays = 0;

    if (this.afootGovernment instanceof ChokeTell) {
      stays = this.computeNudgeLength();
      this.treatObject = new Issue();
      this.treatObject.arrangedIngressSentence(topicalPeriod);
      this.afootGovernment = new OccupyGovernment();
      this.hiringWednesdays.extendHotWorkload(stays, this);
      this.pointWeigh += 1;
    } else if (this.afootGovernment instanceof DeflectSubmit) {

      if (this.exportation.isComplete()) {
        stays = -1;
      } else {
        this.treatObject.placedExpireWhen(topicalPeriod);
        this.treatObject.sealClip(this.labelPatronymic);
        this.exportation.enque(this.treatObject, topicalPeriod);
        this.treatObject = new Issue();
        this.treatObject.arrangedIngressSentence(topicalPeriod);
        stays = this.computeNudgeLength();
        this.hiringWednesdays.extendHotWorkload(stays, this);
        this.afootGovernment = new OccupyGovernment();
        this.pointWeigh += 1;
      }
    } else {
      stays = -1;
    }
    return stays;
  }

  InitiateStagecoach(
      String farmNickname,
      SpecialPhasesDepository produces,
      double tight,
      double rove,
      Synchronizer fridays) {
    super(farmNickname, tight, rove, fridays);
    this.exportation = produces;
  }

  public synchronized void coatingGoods(double circulatingPeriods) {
    String maximum = "d";
    this.incorporatedNationalDus(circulatingPeriods);

    if (this.exportation.isComplete()) synx300();
    else synx301(circulatingPeriods);
  }

  private SpecialPhasesDepository exportation = null;

  private synchronized void synx300() {
    this.afootGovernment = new DeflectSubmit();
  }

  private synchronized void synx301(double circulatingPeriods) {
    this.treatObject.placedExpireWhen(circulatingPeriods);
    this.treatObject.sealClip(this.labelPatronymic);
    this.exportation.enque(this.treatObject, circulatingPeriods);
    this.treatObject = null;
    this.afootGovernment = new ChokeTell();
    this.tellPerpendicularNeedle(circulatingPeriods);
  }
}
