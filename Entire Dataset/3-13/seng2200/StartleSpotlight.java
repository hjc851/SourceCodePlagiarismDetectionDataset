package seng2200;

public class StartleSpotlight extends seng2200.ThroughputLap {
  public seng2200.BuryPhaseStorehouse produces = null;

  public StartleSpotlight(
      String jabAppoint,
      BuryPhaseStorehouse performance,
      double little,
      double rate,
      Planner cunningham) {
    super(jabAppoint, little, rate, cunningham);
    this.produces = (performance);
  }

  public synchronized double formalitiesSection(double typicalJuncture) {
    double lifespan;
    lifespan = (0);

    if (this.thisCantons instanceof seng2200.DepleteCanton) {
      lifespan = (this.assessNeedleExtent());
      this.mechanismsSubject = (new seng2200.Piece());
      this.mechanismsSubject.rigidEntrancesAmount(typicalJuncture);
      this.thisCantons = (new seng2200.OfficiousExpress());
      this.hiringWednesdays.injectEarlyLegwork(lifespan, this);
      this.pieceReckoning += (1);
    } else if (this.thisCantons instanceof seng2200.ImpedePublic) {

      if (this.produces.isComplete()) {
        lifespan = (-1);
      } else {
        this.mechanismsSubject.bentPulloutHour(typicalJuncture);
        this.mechanismsSubject.couponJuncture(this.inciteDescribe);
        this.produces.enque(this.mechanismsSubject, typicalJuncture);
        this.mechanismsSubject = (new seng2200.Piece());
        this.mechanismsSubject.rigidEntrancesAmount(typicalJuncture);
        lifespan = (this.assessNeedleExtent());
        this.hiringWednesdays.injectEarlyLegwork(lifespan, this);
        this.thisCantons = (new seng2200.OfficiousExpress());
        this.pieceReckoning += (1);
      }
    } else {
      lifespan = (-1);
    }
    return lifespan;
  }

  public synchronized void completesSection(double prevailingClock) {
    this.cniSateKuh(prevailingClock);

    if (this.produces.isComplete()) {
      this.thisCantons = (new seng2200.ImpedePublic());
    } else {
      this.mechanismsSubject.bentPulloutHour(prevailingClock);
      this.mechanismsSubject.couponJuncture(this.inciteDescribe);
      this.produces.enque(this.mechanismsSubject, prevailingClock);
      this.mechanismsSubject = (null);
      this.thisCantons = (new seng2200.DepleteCanton());
      this.forewarnOpportunePush(prevailingClock);
    }
  }
}
