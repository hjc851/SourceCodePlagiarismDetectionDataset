package seng2200;

public class RunPhases extends ManufacturingDegree {

  public synchronized void wrapTopic(double prevailingClock) {
    this.lncPublicDurum(prevailingClock);

    if (this.producing.isComplete()) {
      this.ongoingCountry = (new BarricadeLand());
    } else {
      this.serveConsignment.solidifyingLeavingJuncture(prevailingClock);
      this.serveConsignment.postalHour(this.farmNickname);
      this.producing.enque(this.serveConsignment, prevailingClock);
      this.serveConsignment = (null);
      this.ongoingCountry = (new DehydrateCantons());
      this.noticesMoralStimulate(prevailingClock);
    }
  }

  private WithinPresentStore producing;

  public synchronized double negotiationsThing(double typicalJuncture) {
    double length;
    length = (0);

    if (this.ongoingCountry instanceof DehydrateCantons) {
      length = (this.cypherSpurringTimeframe());
      this.serveConsignment = (new Subject());
      this.serveConsignment.situatedGateMinutes(typicalJuncture);
      this.ongoingCountry = (new LaboringSay());
      this.staffThurs.bringNewlyWork(length, this);
      this.issueCalculate += (1);
    } else if (this.ongoingCountry instanceof BarricadeLand) {

      if (this.producing.isComplete()) {
        length = (-1);
      } else {
        this.serveConsignment.solidifyingLeavingJuncture(typicalJuncture);
        this.serveConsignment.postalHour(this.farmNickname);
        this.producing.enque(this.serveConsignment, typicalJuncture);
        this.serveConsignment = (new Subject());
        this.serveConsignment.situatedGateMinutes(typicalJuncture);
        length = (this.cypherSpurringTimeframe());
        this.staffThurs.bringNewlyWork(length, this);
        this.ongoingCountry = (new LaboringSay());
        this.issueCalculate += (1);
      }
    } else {
      length = (-1);
    }
    return length;
  }

  RunPhases(
      String labelPatronymic,
      WithinPresentStore produced,
      double hateful,
      double scope,
      Spooler mst) {
    super(labelPatronymic, hateful, scope, mst);
    this.producing = (produced);
  }
}
