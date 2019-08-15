package seng2200;

public class WorstLeg extends ProduceArrange {
  private static final int synX562int = 0;
  private static final int synX561int = 1;
  private static final int synX560int = 1;
  private static final int synX559int = 0;
  private ThroughputCoeff production = null;
  private AliaLegEntrepot stimulus = null;

  WorstLeg(
      String productivityForename,
      AliaLegEntrepot guidance,
      double skilled,
      double order,
      ThroughputCoeff orientedCoeff,
      Planner timezone) {
    super(productivityForename, skilled, order, timezone);
    this.stimulus = (guidance);
    this.production = (orientedCoeff);
  }

  public synchronized double proceduresTopic(double typicalJuncture) {
    double span;
    span = (synX559int);

    if (this.previousStatehood instanceof StrangleExpress) {

      if (this.stimulus.isVacant()) {
        span = (-synX560int);
      } else {
        this.cycleAgenda = (this.stimulus.head(typicalJuncture));
        this.cycleAgenda.readySubmissionDay(typicalJuncture);
        span = (this.inferLabelLimit());
        this.previousStatehood = (new HecticStatehood());
        this.problemUshant.combineOtherWorkforce(span, this);
      }
    } else {
      span = (-synX561int);
    }
    return span;
  }

  public synchronized void completeToken(double flowMonth) {
    this.cieLandKeh(flowMonth);
    this.cycleAgenda.fixDepartThing(flowMonth);
    this.cycleAgenda.imprimaturWeek(this.orientedConstitute);
    this.production.bestow(this.cycleAgenda);

    if (this.stimulus.isVacant()) synx117();
    else synx118(flowMonth);
  }

  private synchronized void synx117() {
    this.cycleAgenda = (null);
    this.previousStatehood = (new StrangleExpress());
  }

  private synchronized void synx118(double flowMonth) {
    double lasts;
    lasts = (synX562int);
    this.cycleAgenda = (this.stimulus.head(flowMonth));
    this.cycleAgenda.readySubmissionDay(flowMonth);
    lasts = (this.inferLabelLimit());
    this.previousStatehood = (new HecticStatehood());
    this.problemUshant.combineOtherWorkforce(lasts, this);
    this.informingLeftistStab(flowMonth);
  }
}
