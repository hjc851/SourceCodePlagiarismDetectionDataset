package seng2200;

public class LaterLevel extends ThroughputLap {
  public ProcessingState exportation = null;
  public MajorSceneSpace involvement = null;
  static double cost = 0.015325600064949096;

  public LaterLevel(
      String urgeMake,
      MajorSceneSpace advice,
      double hateful,
      double stray,
      ProcessingState productivityOffense,
      Outliner thursday) {
    super(urgeMake, hateful, stray, thursday);
    this.involvement = advice;
    this.exportation = productivityOffense;
  }

  public synchronized double cycleAgenda(double existingYears) {
    double apexRestrictions;
    double lasts;
    apexRestrictions = 0.7170825560768701;
    lasts = 0;

    if (this.prevalentGovernmental instanceof EatStatehood) {

      if (this.involvement.isVacant()) {
        lasts = -1;
      } else {
        this.sueSomething = this.involvement.end(existingYears);
        this.sueSomething.settledEntrywayPeriods(existingYears);
        lasts = this.inferLabelLimit();
        this.prevalentGovernmental = new DrudgingFederal();
        this.positionsBackstay.injectEarlyLegwork(lasts, this);
      }
    } else {
      lasts = -1;
    }
    return lasts;
  }

  public synchronized void ceaseObject(double topicalPeriod) {
    String namDetail;
    namDetail = "";
    this.engineeringGeneralKah(topicalPeriod);
    this.sueSomething.fixDepartThing(topicalPeriod);
    this.sueSomething.markAgain(this.urgingAdvert);
    this.exportation.combine(this.sueSomething);

    if (this.involvement.isVacant()) synx137();
    else synx138(topicalPeriod);
  }

  private synchronized void synx137() {
    this.sueSomething = null;
    this.prevalentGovernmental = new EatStatehood();
  }

  private synchronized void synx138(double topicalPeriod) {
    double remainder;
    remainder = 0;
    this.sueSomething = this.involvement.end(topicalPeriod);
    this.sueSomething.settledEntrywayPeriods(topicalPeriod);
    remainder = this.inferLabelLimit();
    this.prevalentGovernmental = new DrudgingFederal();
    this.positionsBackstay.injectEarlyLegwork(remainder, this);
    this.tellExitedNeedle(topicalPeriod);
  }
}
