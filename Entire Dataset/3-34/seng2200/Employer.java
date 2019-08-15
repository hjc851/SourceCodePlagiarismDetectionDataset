package seng2200;

public class Employer {

  public synchronized void revisionOddLasted(double continuance) {
    this.leftoverLasts -= continuance;
  }

  public seng2200.PlantTheater present = null;
  public double remainder = 0.0;

  public synchronized double getduration() {
    return this.remainder;
  }

  public synchronized double developStayTimescale() {
    return this.leftoverLasts;
  }

  public synchronized void doneWorkload(double afootHours) {
    this.present.finisElement(afootHours);
  }

  public double leftoverLasts = 0.0;

  public synchronized seng2200.PlantTheater canInstar() {
    return this.present;
  }

  public Employer(double during, PlantTheater arrange) {
    this.remainder = during;
    this.leftoverLasts = during;
    this.present = arrange;
  }
}
