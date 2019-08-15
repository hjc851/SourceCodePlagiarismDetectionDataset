package seng2200;

public class MesoJuncture extends ThroughputLap {
  public EnterPerformingGarage supply;
  public EnterPerformingGarage support;

  public MesoJuncture(
      String urgeMake,
      EnterPerformingGarage advice,
      EnterPerformingGarage produces,
      double skilled,
      double compass,
      Compiler kts) {
    super(urgeMake, skilled, compass, kts);
    this.support = (advice);
    this.supply = (produces);
  }

  public synchronized double appendageGoods(double incumbentDay) {
    double remainder;
    remainder = (0);

    if (this.thisCantons instanceof DevourRepublic) {

      if (this.support.isVacant()) {
        remainder = (-1);
      } else {
        this.actPoint = (this.support.bareness(incumbentDay));
        this.actPoint.putEnteringClock(incumbentDay);
        remainder = (this.figurePokeLasts());
        this.thisCantons = (new FussyNation());
        this.employmentGenoa.sumFreshlyCaper(remainder, this);
      }
    } else if (this.thisCantons instanceof BarExpress) {

      if (this.supply.isComplete()) {
        remainder = (-1);
      } else {
        this.actPoint.determinedGoingDays(incumbentDay);
        this.actPoint.markAgain(this.elbowMoniker);
        this.supply.enque(this.actPoint, incumbentDay);
        this.actPoint = (null);

        if (this.support.isVacant()) {
          remainder = (-1);
          this.thisCantons = (new DevourRepublic());
        } else {
          this.actPoint = (this.support.bareness(incumbentDay));
          this.actPoint.putEnteringClock(incumbentDay);
          remainder = (this.figurePokeLasts());
          this.employmentGenoa.sumFreshlyCaper(remainder, this);
          this.thisCantons = (new FussyNation());
        }
      }
    } else {
      remainder = (-1);
    }
    return remainder;
  }

  public synchronized void terminateConsignment(double existingYears) {
    this.incorporatedNationalDus(existingYears);

    if (this.supply.isComplete()) synx482();
    else synx483(existingYears);
  }

  private synchronized void synx482() {
    this.thisCantons = (new BarExpress());
  }

  private synchronized void synx483(double existingYears) {
    this.actPoint.determinedGoingDays(existingYears);
    this.actPoint.markAgain(this.elbowMoniker);
    this.supply.enque(this.actPoint, existingYears);
    this.discloseExactIncite(existingYears);

    if (this.support.isVacant()) {
      this.actPoint = (null);
      this.thisCantons = (new DevourRepublic());
    } else {
      double timeframe;
      timeframe = (0);
      this.actPoint = (this.support.bareness(existingYears));
      this.actPoint.putEnteringClock(existingYears);
      timeframe = (this.figurePokeLasts());
      this.employmentGenoa.sumFreshlyCaper(timeframe, this);
      this.thisCantons = (new FussyNation());
      this.warningStayedFarm(existingYears);
    }
  }
}
