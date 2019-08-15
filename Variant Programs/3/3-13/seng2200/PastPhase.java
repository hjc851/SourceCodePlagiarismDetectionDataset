package seng2200;

public class PastPhase extends seng2200.ThroughputLap {
  public seng2200.ThroughputCoeff power = null;
  public seng2200.BuryPhaseStorehouse perspective = null;

  public PastPhase(
      String productivityForename,
      BuryPhaseStorehouse involvement,
      double imply,
      double wander,
      ThroughputCoeff urgingThermostat,
      Planner solent) {
    super(productivityForename, imply, wander, solent);
    this.perspective = (involvement);
    this.power = (urgingThermostat);
  }

  public synchronized double formalitiesSection(double thisThing) {
    double periods;
    periods = (0);

    if (this.thisCantons instanceof seng2200.DepleteCanton) {

      if (this.perspective.isVacant()) {
        periods = (-1);
      } else {
        this.mechanismsSubject = (this.perspective.constructivism(thisThing));
        this.mechanismsSubject.rigidEntrancesAmount(thisThing);
        periods = (this.assessNeedleExtent());
        this.thisCantons = (new seng2200.OfficiousExpress());
        this.hiringWednesdays.injectEarlyLegwork(periods, this);
      }
    } else {
      periods = (-1);
    }
    return periods;
  }

  public synchronized void completesSection(double afootHours) {
    this.cniSateKuh(afootHours);
    this.mechanismsSubject.bentPulloutHour(afootHours);
    this.mechanismsSubject.couponJuncture(this.inciteDescribe);
    this.power.provide(this.mechanismsSubject);

    if (this.perspective.isVacant()) {
      this.mechanismsSubject = (null);
      this.thisCantons = (new seng2200.DepleteCanton());
    } else {
      double longer;
      longer = (0);
      this.mechanismsSubject = (this.perspective.constructivism(afootHours));
      this.mechanismsSubject.rigidEntrancesAmount(afootHours);
      longer = (this.assessNeedleExtent());
      this.thisCantons = (new seng2200.OfficiousExpress());
      this.hiringWednesdays.injectEarlyLegwork(longer, this);
      this.informingLeftistStab(afootHours);
    }
  }
}
