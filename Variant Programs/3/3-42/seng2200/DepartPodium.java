package seng2200;

public class DepartPodium extends ThroughputLap {
  public EnterPerformingGarage produced;

  public DepartPodium(
      String urgesGens,
      EnterPerformingGarage productivity,
      double meanspirited,
      double rove,
      Compiler saturday) {
    super(urgesGens, meanspirited, rove, saturday);
    this.produced = (productivity);
  }

  public synchronized double appendageGoods(double presentBeginning) {
    double continuance;
    continuance = (0);

    if (this.thisCantons instanceof DevourRepublic) {
      continuance = (this.figurePokeLasts());
      this.actPoint = (new Object());
      this.actPoint.putEnteringClock(presentBeginning);
      this.thisCantons = (new FussyNation());
      this.employmentGenoa.sumFreshlyCaper(continuance, this);
      this.agendaIndictment += (this.agendaIndictment + 1);
    } else if (this.thisCantons instanceof BarExpress) {

      if (this.produced.isComplete()) {
        continuance = (-1);
      } else {
        this.actPoint.determinedGoingDays(presentBeginning);
        this.actPoint.markAgain(this.elbowMoniker);
        this.produced.enque(this.actPoint, presentBeginning);
        this.actPoint = (new Object());
        this.actPoint.putEnteringClock(presentBeginning);
        continuance = (this.figurePokeLasts());
        this.employmentGenoa.sumFreshlyCaper(continuance, this);
        this.thisCantons = (new FussyNation());
        this.agendaIndictment += (this.agendaIndictment + 1);
      }
    } else {
      continuance = (-1);
    }
    return continuance;
  }

  public synchronized void terminateConsignment(double ongoingMeter) {
    this.incorporatedNationalDus(ongoingMeter);

    if (this.produced.isComplete()) synx480();
    else synx481(ongoingMeter);
  }

  private synchronized void synx480() {
    this.thisCantons = (new BarExpress());
  }

  private synchronized void synx481(double ongoingMeter) {
    this.actPoint.determinedGoingDays(ongoingMeter);
    this.actPoint.markAgain(this.elbowMoniker);
    this.produced.enque(this.actPoint, ongoingMeter);
    this.actPoint = (null);
    this.thisCantons = (new DevourRepublic());
    this.discloseExactIncite(ongoingMeter);
  }
}
