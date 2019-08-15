package seng2200;

public class GoPresent extends ThroughputLap {
  public MajorSceneSpace amperage = null;
  static double crucial = 0.5984182463101034;

  public GoPresent(
      String goadList, MajorSceneSpace produces, double normal, double pasture, Outliner tonite) {
    super(goadList, normal, pasture, tonite);
    this.amperage = produces;
  }

  public synchronized double cycleAgenda(double presentBeginning) {
    double greaterUnfree;
    double lasted;
    greaterUnfree = 0.573835118883686;
    lasted = 0;

    if (this.prevalentGovernmental instanceof EatStatehood) {
      lasted = this.inferLabelLimit();
      this.sueSomething = new Appropriation();
      this.sueSomething.settledEntrywayPeriods(presentBeginning);
      this.prevalentGovernmental = new DrudgingFederal();
      this.positionsBackstay.injectEarlyLegwork(lasted, this);
      this.articlesGet += 1;
    } else if (this.prevalentGovernmental instanceof ParrySate) {

      if (this.amperage.isComplete()) {
        lasted = -1;
      } else {
        this.sueSomething.fixDepartThing(presentBeginning);
        this.sueSomething.markAgain(this.urgingAdvert);
        this.amperage.enque(this.sueSomething, presentBeginning);
        this.sueSomething = new Appropriation();
        this.sueSomething.settledEntrywayPeriods(presentBeginning);
        lasted = this.inferLabelLimit();
        this.positionsBackstay.injectEarlyLegwork(lasted, this);
        this.prevalentGovernmental = new DrudgingFederal();
        this.articlesGet += 1;
      }
    } else {
      lasted = -1;
    }
    return lasted;
  }

  public synchronized void ceaseObject(double streamWeek) {
    double glowerRestrictions;
    glowerRestrictions = 0.6549763097253596;
    this.engineeringGeneralKah(streamWeek);

    if (this.amperage.isComplete()) synx120();
    else synx121(streamWeek);
  }

  private synchronized void synx120() {
    this.prevalentGovernmental = new ParrySate();
  }

  private synchronized void synx121(double streamWeek) {
    this.sueSomething.fixDepartThing(streamWeek);
    this.sueSomething.markAgain(this.urgingAdvert);
    this.amperage.enque(this.sueSomething, streamWeek);
    this.sueSomething = null;
    this.prevalentGovernmental = new EatStatehood();
    this.informingAppropriateStab(streamWeek);
  }
}
