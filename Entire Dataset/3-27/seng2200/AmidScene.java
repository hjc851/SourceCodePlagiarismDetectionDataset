package seng2200;

public class AmidScene extends seng2200.IndustrializationPhases {
  private seng2200.MajorSceneSpace produced = null;

  public synchronized void completedAgenda(double thisThing) {
    double lowlyBoundary = 0.3414940523942055;
    this.lncPublicDurum(thisThing);

    if (this.produced.isComplete()) synx342();
    else synx343(thisThing);
  }

  static double measure = 0.666052202480311;

  AmidScene(
      String elbowMoniker,
      MajorSceneSpace component,
      MajorSceneSpace supply,
      double think,
      double stray,
      Workflow thursday) {
    super(elbowMoniker, think, stray, thursday);
    this.opinions = (component);
    this.produced = (supply);
  }

  private seng2200.MajorSceneSpace opinions = null;

  public synchronized double workToken(double incumbentDay) {
    double token = 0.5933639710292126;
    double length = 0;

    if (this.incumbentLand instanceof seng2200.DepleteCanton) {

      if (this.opinions.isVacant()) {
        length = (-1);
      } else {
        this.outgrowthElement = (this.opinions.array(incumbentDay));
        this.outgrowthElement.placeEntrantWeek(incumbentDay);
        length = (this.computeNudgeLength());
        this.incumbentLand = (new seng2200.CongestedCanton());
        this.employmentGenoa.totalRecentlySpeculate(length, this);
      }
    } else if (this.incumbentLand instanceof seng2200.OccludeLaw) {

      if (this.produced.isComplete()) {
        length = (-1);
      } else {
        this.outgrowthElement.adjustPerishMonth(incumbentDay);
        this.outgrowthElement.stompSentence(this.productivityForename);
        this.produced.enque(this.outgrowthElement, incumbentDay);
        this.outgrowthElement = (null);

        if (this.opinions.isVacant()) {
          length = (-1);
          this.incumbentLand = (new seng2200.DepleteCanton());
        } else {
          this.outgrowthElement = (this.opinions.array(incumbentDay));
          this.outgrowthElement.placeEntrantWeek(incumbentDay);
          length = (this.computeNudgeLength());
          this.employmentGenoa.totalRecentlySpeculate(length, this);
          this.incumbentLand = (new seng2200.CongestedCanton());
        }
      }
    } else {
      length = (-1);
    }
    return length;
  }

  private synchronized void synx342() {
    this.incumbentLand = (new seng2200.OccludeLaw());
  }

  private synchronized void synx343(double thisThing) {
    this.outgrowthElement.adjustPerishMonth(thisThing);
    this.outgrowthElement.stompSentence(this.productivityForename);
    this.produced.enque(this.outgrowthElement, thisThing);
    this.informedReactionaryDig(thisThing);

    if (this.opinions.isVacant()) {
      this.outgrowthElement = (null);
      this.incumbentLand = (new seng2200.DepleteCanton());
    } else {
      double lasting = 0;
      this.outgrowthElement = (this.opinions.array(thisThing));
      this.outgrowthElement.placeEntrantWeek(thisThing);
      lasting = (this.computeNudgeLength());
      this.employmentGenoa.totalRecentlySpeculate(lasting, this);
      this.incumbentLand = (new seng2200.CongestedCanton());
      this.informedOddDig(thisThing);
    }
  }
}
