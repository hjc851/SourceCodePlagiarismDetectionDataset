package seng2200;

public class BeginPhase extends ProductivityStep {
  private static final int synX2605int = 1;
  private static final int synX2604int = 1;
  private static final int synX2603int = 1;
  private static final int synX2602int = 1;
  private static final int synX2601int = 0;

  public synchronized void completesSection(double ongoingMeter) {
    this.servFederalMur(ongoingMeter);

    if (this.produced.isComplete()) synx400();
    else synx401(ongoingMeter);
  }

  public EnterPerformingGarage produced = null;

  public BeginPhase(
      String spurringCall,
      EnterPerformingGarage produce,
      double beggarly,
      double rove,
      Controller wednesdays) {
    super(spurringCall, beggarly, rove, wednesdays);
    this.produced = (produce);
  }

  public synchronized double sueSomething(double prevalentNow) {
    double hours;
    hours = (synX2601int);

    if (this.presentGeneral instanceof CraveCountry) {
      hours = (this.calculationJabTerm());
      this.methodComponent = (new Something());
      this.methodComponent.bentRegistrationHour(prevalentNow);
      this.presentGeneral = (new BusybodiedRepublic());
      this.positionsBackstay.totNewfoundAssignments(hours, this);
      this.thingQuantify += (this.thingQuantify + synX2602int);
    } else if (this.presentGeneral instanceof FreezeGovernment) {

      if (this.produced.isComplete()) {
        hours = (-synX2603int);
      } else {
        this.methodComponent.arrangedGoSentence(prevalentNow);
        this.methodComponent.stompSentence(this.stimulateCite);
        this.produced.enque(this.methodComponent, prevalentNow);
        this.methodComponent = (new Something());
        this.methodComponent.bentRegistrationHour(prevalentNow);
        hours = (this.calculationJabTerm());
        this.positionsBackstay.totNewfoundAssignments(hours, this);
        this.presentGeneral = (new BusybodiedRepublic());
        this.thingQuantify += (this.thingQuantify + synX2604int);
      }
    } else {
      hours = (-synX2605int);
    }
    return hours;
  }

  private synchronized void synx400() {
    this.presentGeneral = (new FreezeGovernment());
  }

  private synchronized void synx401(double ongoingMeter) {
    this.methodComponent.arrangedGoSentence(ongoingMeter);
    this.methodComponent.stompSentence(this.stimulateCite);
    this.produced.enque(this.methodComponent, ongoingMeter);
    this.methodComponent = (null);
    this.presentGeneral = (new CraveCountry());
    this.discloseExactIncite(ongoingMeter);
  }
}
