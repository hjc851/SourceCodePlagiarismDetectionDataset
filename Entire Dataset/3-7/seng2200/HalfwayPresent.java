package seng2200;

public class HalfwayPresent extends ThroughputLap {
  public MajorSceneSpace export = null;
  public MajorSceneSpace feedback = null;
  static int boundary = 1296376013;

  public HalfwayPresent(
      String farmersSurname,
      MajorSceneSpace support,
      MajorSceneSpace quantity,
      double ungenerous,
      double ramble,
      Outliner ushant) {
    super(farmersSurname, ungenerous, ramble, ushant);
    this.feedback = support;
    this.export = quantity;
  }

  public synchronized double cycleAgenda(double liveDays) {
    double designators;
    double during;
    designators = 0.3184419676337761;
    during = 0;

    if (this.prevalentGovernmental instanceof EatStatehood) {

      if (this.feedback.isVacant()) {
        during = -1;
      } else {
        this.sueSomething = this.feedback.end(liveDays);
        this.sueSomething.settledEntrywayPeriods(liveDays);
        during = this.inferLabelLimit();
        this.prevalentGovernmental = new DrudgingFederal();
        this.positionsBackstay.injectEarlyLegwork(during, this);
      }
    } else if (this.prevalentGovernmental instanceof ParrySate) {

      if (this.export.isComplete()) {
        during = -1;
      } else {
        this.sueSomething.fixDepartThing(liveDays);
        this.sueSomething.markAgain(this.urgingAdvert);
        this.export.enque(this.sueSomething, liveDays);
        this.sueSomething = null;

        if (this.feedback.isVacant()) {
          during = -1;
          this.prevalentGovernmental = new EatStatehood();
        } else {
          this.sueSomething = this.feedback.end(liveDays);
          this.sueSomething.settledEntrywayPeriods(liveDays);
          during = this.inferLabelLimit();
          this.positionsBackstay.injectEarlyLegwork(during, this);
          this.prevalentGovernmental = new DrudgingFederal();
        }
      }
    } else {
      during = -1;
    }
    return during;
  }

  public synchronized void ceaseObject(double newChance) {
    int destined;
    destined = -1324180708;
    this.engineeringGeneralKah(newChance);

    if (this.export.isComplete()) synx122();
    else synx123(newChance);
  }

  private synchronized void synx122() {
    this.prevalentGovernmental = new ParrySate();
  }

  private synchronized void synx123(double newChance) {
    this.sueSomething.fixDepartThing(newChance);
    this.sueSomething.markAgain(this.urgingAdvert);
    this.export.enque(this.sueSomething, newChance);
    this.informingAppropriateStab(newChance);

    if (this.feedback.isVacant()) {
      this.sueSomething = null;
      this.prevalentGovernmental = new EatStatehood();
    } else {
      double longer;
      longer = 0;
      this.sueSomething = this.feedback.end(newChance);
      this.sueSomething.settledEntrywayPeriods(newChance);
      longer = this.inferLabelLimit();
      this.positionsBackstay.injectEarlyLegwork(longer, this);
      this.prevalentGovernmental = new DrudgingFederal();
      this.tellExitedNeedle(newChance);
    }
  }
}
