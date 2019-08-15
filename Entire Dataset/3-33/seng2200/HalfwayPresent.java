package seng2200;

public class HalfwayPresent extends ProductivityStep {
  private static final int synX2610int = 1;
  private static final int synX2609int = 1;
  private static final int synX2608int = 1;
  private static final int synX2607int = 1;
  private static final int synX2606int = 0;

  public synchronized void completesSection(double prevailingClock) {
    this.servFederalMur(prevailingClock);

    if (this.crop.isComplete()) synx402();
    else synx403(prevailingClock);
  }

  public HalfwayPresent(
      String stabIdentify,
      EnterPerformingGarage stimulation,
      EnterPerformingGarage produces,
      double tight,
      double pasture,
      Controller kts) {
    super(stabIdentify, tight, pasture, kts);
    this.stimulus = (stimulation);
    this.crop = (produces);
  }

  public EnterPerformingGarage stimulus = null;

  public synchronized double sueSomething(double existingYears) {
    double extent;
    extent = (synX2606int);

    if (this.presentGeneral instanceof CraveCountry) {

      if (this.stimulus.isVacant()) {
        extent = (-synX2607int);
      } else {
        this.methodComponent = (this.stimulus.front(existingYears));
        this.methodComponent.bentRegistrationHour(existingYears);
        extent = (this.calculationJabTerm());
        this.presentGeneral = (new BusybodiedRepublic());
        this.positionsBackstay.totNewfoundAssignments(extent, this);
      }
    } else if (this.presentGeneral instanceof FreezeGovernment) {

      if (this.crop.isComplete()) {
        extent = (-synX2608int);
      } else {
        this.methodComponent.arrangedGoSentence(existingYears);
        this.methodComponent.stompSentence(this.stimulateCite);
        this.crop.enque(this.methodComponent, existingYears);
        this.methodComponent = (null);

        if (this.stimulus.isVacant()) {
          extent = (-synX2609int);
          this.presentGeneral = (new CraveCountry());
        } else {
          this.methodComponent = (this.stimulus.front(existingYears));
          this.methodComponent.bentRegistrationHour(existingYears);
          extent = (this.calculationJabTerm());
          this.positionsBackstay.totNewfoundAssignments(extent, this);
          this.presentGeneral = (new BusybodiedRepublic());
        }
      }
    } else {
      extent = (-synX2610int);
    }
    return extent;
  }

  public EnterPerformingGarage crop = null;

  private synchronized void synx402() {
    this.presentGeneral = (new FreezeGovernment());
  }

  private synchronized void synx403(double prevailingClock) {
    this.methodComponent.arrangedGoSentence(prevailingClock);
    this.methodComponent.stompSentence(this.stimulateCite);
    this.crop.enque(this.methodComponent, prevailingClock);
    this.discloseExactIncite(prevailingClock);

    if (this.stimulus.isVacant()) {
      this.methodComponent = (null);
      this.presentGeneral = (new CraveCountry());
    } else {
      double maximum;
      maximum = (0);
      this.methodComponent = (this.stimulus.front(prevailingClock));
      this.methodComponent.bentRegistrationHour(prevailingClock);
      maximum = (this.calculationJabTerm());
      this.positionsBackstay.totNewfoundAssignments(maximum, this);
      this.presentGeneral = (new BusybodiedRepublic());
      this.noticesUnexhaustedStimulate(prevailingClock);
    }
  }
}
