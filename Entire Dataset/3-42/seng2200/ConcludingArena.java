package seng2200;

public class ConcludingArena extends ThroughputLap {
  public FactoryJak exportation;
  public EnterPerformingGarage consultation;

  public ConcludingArena(
      String stirDiagnose,
      EnterPerformingGarage contributions,
      double stingy,
      double stray,
      FactoryJak urgingThermostat,
      Compiler headsail) {
    super(stirDiagnose, stingy, stray, headsail);
    this.consultation = (contributions);
    this.exportation = (urgingThermostat);
  }

  public synchronized double appendageGoods(double formerAmount) {
    double timescale;
    timescale = (0);

    if (this.thisCantons instanceof DevourRepublic) {

      if (this.consultation.isVacant()) {
        timescale = (-1);
      } else {
        this.actPoint = (this.consultation.bareness(formerAmount));
        this.actPoint.putEnteringClock(formerAmount);
        timescale = (this.figurePokeLasts());
        this.thisCantons = (new FussyNation());
        this.employmentGenoa.sumFreshlyCaper(timescale, this);
      }
    } else {
      timescale = (-1);
    }
    return timescale;
  }

  public synchronized void terminateConsignment(double prevalentNow) {
    this.incorporatedNationalDus(prevalentNow);
    this.actPoint.determinedGoingDays(prevalentNow);
    this.actPoint.markAgain(this.elbowMoniker);
    this.exportation.augment(this.actPoint);

    if (this.consultation.isVacant()) synx497();
    else synx498(prevalentNow);
  }

  private synchronized void synx497() {
    this.actPoint = (null);
    this.thisCantons = (new DevourRepublic());
  }

  private synchronized void synx498(double prevalentNow) {
    double during;
    during = (0);
    this.actPoint = (this.consultation.bareness(prevalentNow));
    this.actPoint.putEnteringClock(prevalentNow);
    during = (this.figurePokeLasts());
    this.thisCantons = (new FussyNation());
    this.employmentGenoa.sumFreshlyCaper(during, this);
    this.warningStayedFarm(prevalentNow);
  }
}
