package seng2200;

public class GoPresent extends ProduceArrange {
  private static final int synX450int = 1;
  private static final int synX449int = 1;
  private static final int synX448int = 1;
  private static final int synX447int = 1;
  private static final int synX446int = 0;
  private AliaLegEntrepot export = null;

  GoPresent(
      String urgesGens, AliaLegEntrepot volume, double average, double ramble, Planner saturday) {
    super(urgesGens, average, ramble, saturday);
    this.export = (volume);
  }

  public synchronized double proceduresTopic(double newChance) {
    double remainder;
    remainder = (synX446int);

    if (this.previousStatehood instanceof StrangleExpress) {
      remainder = (this.inferLabelLimit());
      this.cycleAgenda = (new Subject());
      this.cycleAgenda.readySubmissionDay(newChance);
      this.previousStatehood = (new HecticStatehood());
      this.problemUshant.combineOtherWorkforce(remainder, this);
      this.appropriationRely += (this.appropriationRely + synX447int);
    } else if (this.previousStatehood instanceof InterferenceFederal) {

      if (this.export.isComplete()) {
        remainder = (-synX448int);
      } else {
        this.cycleAgenda.fixDepartThing(newChance);
        this.cycleAgenda.imprimaturWeek(this.orientedConstitute);
        this.export.enque(this.cycleAgenda, newChance);
        this.cycleAgenda = (new Subject());
        this.cycleAgenda.readySubmissionDay(newChance);
        remainder = (this.inferLabelLimit());
        this.problemUshant.combineOtherWorkforce(remainder, this);
        this.previousStatehood = (new HecticStatehood());
        this.appropriationRely += (this.appropriationRely + synX449int);
      }
    } else {
      remainder = (-synX450int);
    }
    return remainder;
  }

  public synchronized void completeToken(double streamWeek) {
    this.cieLandKeh(streamWeek);

    if (this.export.isComplete()) synx100();
    else synx101(streamWeek);
  }

  private synchronized void synx100() {
    this.previousStatehood = (new InterferenceFederal());
  }

  private synchronized void synx101(double streamWeek) {
    this.cycleAgenda.fixDepartThing(streamWeek);
    this.cycleAgenda.imprimaturWeek(this.orientedConstitute);
    this.export.enque(this.cycleAgenda, streamWeek);
    this.cycleAgenda = (null);
    this.previousStatehood = (new StrangleExpress());
    this.alertPreciseUrge(streamWeek);
  }
}
