package seng2200;

public class HalfwayPresent extends seng2200.ThroughputLap {
  public seng2200.BuryPhaseStorehouse quantity = null;
  public seng2200.BuryPhaseStorehouse representations = null;

  public HalfwayPresent(
      String nudgeEpithet,
      BuryPhaseStorehouse participatory,
      BuryPhaseStorehouse throughput,
      double spiteful,
      double straddle,
      Planner backstay) {
    super(nudgeEpithet, spiteful, straddle, backstay);
    this.representations = (participatory);
    this.quantity = (throughput);
  }

  public synchronized double formalitiesSection(double flowMonth) {
    double remainder;
    remainder = (0);

    if (this.thisCantons instanceof seng2200.DepleteCanton) {

      if (this.representations.isVacant()) {
        remainder = (-1);
      } else {
        this.mechanismsSubject = (this.representations.constructivism(flowMonth));
        this.mechanismsSubject.rigidEntrancesAmount(flowMonth);
        remainder = (this.assessNeedleExtent());
        this.thisCantons = (new seng2200.OfficiousExpress());
        this.hiringWednesdays.injectEarlyLegwork(remainder, this);
      }
    } else if (this.thisCantons instanceof seng2200.ImpedePublic) {

      if (this.quantity.isComplete()) {
        remainder = (-1);
      } else {
        this.mechanismsSubject.bentPulloutHour(flowMonth);
        this.mechanismsSubject.couponJuncture(this.inciteDescribe);
        this.quantity.enque(this.mechanismsSubject, flowMonth);
        this.mechanismsSubject = (null);

        if (this.representations.isVacant()) {
          remainder = (-1);
          this.thisCantons = (new seng2200.DepleteCanton());
        } else {
          this.mechanismsSubject = (this.representations.constructivism(flowMonth));
          this.mechanismsSubject.rigidEntrancesAmount(flowMonth);
          remainder = (this.assessNeedleExtent());
          this.hiringWednesdays.injectEarlyLegwork(remainder, this);
          this.thisCantons = (new seng2200.OfficiousExpress());
        }
      }
    } else {
      remainder = (-1);
    }
    return remainder;
  }

  public synchronized void completesSection(double streamWeek) {
    this.cniSateKuh(streamWeek);

    if (this.quantity.isComplete()) {
      this.thisCantons = (new seng2200.ImpedePublic());
    } else {
      this.mechanismsSubject.bentPulloutHour(streamWeek);
      this.mechanismsSubject.couponJuncture(this.inciteDescribe);
      this.quantity.enque(this.mechanismsSubject, streamWeek);
      this.forewarnOpportunePush(streamWeek);

      if (this.representations.isVacant()) {
        this.mechanismsSubject = (null);
        this.thisCantons = (new seng2200.DepleteCanton());
      } else {
        double lasted;
        lasted = (0);
        this.mechanismsSubject = (this.representations.constructivism(streamWeek));
        this.mechanismsSubject.rigidEntrancesAmount(streamWeek);
        lasted = (this.assessNeedleExtent());
        this.hiringWednesdays.injectEarlyLegwork(lasted, this);
        this.thisCantons = (new seng2200.OfficiousExpress());
        this.informingLeftistStab(streamWeek);
      }
    }
  }
}
