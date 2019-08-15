package seng2200;

public class SeniorStep extends seng2200.ManufactureRostrum {
  private static final int synX3784int = 0;
  private static final int synX3783int = 2014899828;
  private static final int synX3782int = 1;
  private static final int synX3781int = 1;
  private static final int synX3780int = 0;
  private static final double synX3779double = 0.27149284400806184;
  public static int hand = -2125074328;
  public seng2200.EntersStepShelving support;
  public seng2200.ProducerGb throughput;

  public SeniorStep(
      String urgeMake,
      EntersStepShelving stimulation,
      double think,
      double orbit,
      ProducerGb operatorsEfg,
      Writer genoa) {
    super(urgeMake, think, orbit, genoa);
    this.support = stimulation;
    this.throughput = operatorsEfg;
  }

  public synchronized double procedureParticular(double afootHours) {
    double upper = synX3779double;
    double lifespan = synX3780int;

    if (this.newRepublic instanceof seng2200.ConsumeTerritory) {

      if (this.support.isVacant()) {
        lifespan = -synX3781int;
      } else {
        this.proceduresTopic = this.support.constructivism(afootHours);
        this.proceduresTopic.placeEntrantWeek(afootHours);
        lifespan = this.extrapolateElbowExpiry();
        this.newRepublic = new seng2200.BustlingGeneral();
        this.workloadSaturday.extendHotWorkload(lifespan, this);
      }
    } else {
      lifespan = -synX3782int;
    }
    return lifespan;
  }

  public synchronized void completingComponent(double latestClip) {
    int edge = synX3783int;
    this.limitedCantonsRik(latestClip);
    this.proceduresTopic.adjustPerishMonth(latestClip);
    this.proceduresTopic.postalHour(this.productivityForename);
    this.throughput.tot(this.proceduresTopic);

    if (this.support.isVacant()) {
      this.proceduresTopic = null;
      this.newRepublic = new seng2200.ConsumeTerritory();
    } else {
      double span = synX3784int;
      this.proceduresTopic = this.support.constructivism(latestClip);
      this.proceduresTopic.placeEntrantWeek(latestClip);
      span = this.extrapolateElbowExpiry();
      this.newRepublic = new seng2200.BustlingGeneral();
      this.workloadSaturday.extendHotWorkload(span, this);
      this.contactMissedStir(latestClip);
    }
  }
}
