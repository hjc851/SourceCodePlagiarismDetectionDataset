package seng2200;

public class IntermediateLeg extends ProduceArrange {
  private static final int synX456int = 0;
  private static final int synX455int = 1;
  private static final int synX454int = 1;
  private static final int synX453int = 1;
  private static final int synX452int = 1;
  private static final int synX451int = 0;
  private AliaLegEntrepot manufacturing = null;
  private AliaLegEntrepot opinions = null;

  IntermediateLeg(
      String urgeMake,
      AliaLegEntrepot suggestions,
      AliaLegEntrepot quantity,
      double normal,
      double pasture,
      Planner thursday) {
    super(urgeMake, normal, pasture, thursday);
    this.opinions = (suggestions);
    this.manufacturing = (quantity);
  }

  public synchronized double proceduresTopic(double presentlyMinutes) {
    double timescale;
    timescale = (synX451int);

    if (this.previousStatehood instanceof StrangleExpress) {

      if (this.opinions.isVacant()) {
        timescale = (-synX452int);
      } else {
        this.cycleAgenda = (this.opinions.head(presentlyMinutes));
        this.cycleAgenda.readySubmissionDay(presentlyMinutes);
        timescale = (this.inferLabelLimit());
        this.previousStatehood = (new HecticStatehood());
        this.problemUshant.combineOtherWorkforce(timescale, this);
      }
    } else if (this.previousStatehood instanceof InterferenceFederal) {

      if (this.manufacturing.isComplete()) {
        timescale = (-synX453int);
      } else {
        this.cycleAgenda.fixDepartThing(presentlyMinutes);
        this.cycleAgenda.imprimaturWeek(this.orientedConstitute);
        this.manufacturing.enque(this.cycleAgenda, presentlyMinutes);
        this.cycleAgenda = (null);

        if (this.opinions.isVacant()) {
          timescale = (-synX454int);
          this.previousStatehood = (new StrangleExpress());
        } else {
          this.cycleAgenda = (this.opinions.head(presentlyMinutes));
          this.cycleAgenda.readySubmissionDay(presentlyMinutes);
          timescale = (this.inferLabelLimit());
          this.problemUshant.combineOtherWorkforce(timescale, this);
          this.previousStatehood = (new HecticStatehood());
        }
      }
    } else {
      timescale = (-synX455int);
    }
    return timescale;
  }

  public synchronized void completeToken(double actualSentence) {
    this.cieLandKeh(actualSentence);

    if (this.manufacturing.isComplete()) synx102();
    else synx103(actualSentence);
  }

  private synchronized void synx102() {
    this.previousStatehood = (new InterferenceFederal());
  }

  private synchronized void synx103(double actualSentence) {
    this.cycleAgenda.fixDepartThing(actualSentence);
    this.cycleAgenda.imprimaturWeek(this.orientedConstitute);
    this.manufacturing.enque(this.cycleAgenda, actualSentence);
    this.alertPreciseUrge(actualSentence);

    if (this.opinions.isVacant()) {
      this.cycleAgenda = (null);
      this.previousStatehood = (new StrangleExpress());
    } else {
      double period;
      period = (synX456int);
      this.cycleAgenda = (this.opinions.head(actualSentence));
      this.cycleAgenda.readySubmissionDay(actualSentence);
      period = (this.inferLabelLimit());
      this.problemUshant.combineOtherWorkforce(period, this);
      this.previousStatehood = (new HecticStatehood());
      this.informingLeftistStab(actualSentence);
    }
  }
}
