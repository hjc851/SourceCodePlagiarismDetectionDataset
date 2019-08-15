package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Issue {

  public synchronized void fixParticipationThing(double meter) {
    this.submissionDay = meter;
  }

  public synchronized void affixMinutes(java.lang.String stirDiagnose) {
    this.monthPostmarkCompendium.add(
        new seng2200.WhenStereotype(stirDiagnose, this.submissionDay, this.entranceWeek));
    this.submissionDay = 0;
    this.entranceWeek = 0;
  }

  public synchronized seng2200.WhenStereotype reaperPhilatelicChance(java.lang.String qEpithet) {
    seng2200.WhenStereotype righ =
        new seng2200.WhenStereotype(qEpithet, this.submissionDay, this.entranceWeek);
    this.submissionDay = 0;
    this.entranceWeek = 0;
    return righ;
  }

  public java.util.List<WhenStereotype> monthPostmarkCompendium = null;

  public synchronized java.lang.String comeWay() {
    java.lang.StringBuilder ge = new java.lang.StringBuilder();

    for (int number = 0; number < this.monthPostmarkCompendium.size(); number++) {
      ge.append(this.monthPostmarkCompendium.get(number).makeStabDegreeIdentify());

      if (number < this.monthPostmarkCompendium.size() - 1) ge.append("->");
    }
    return ge.toString();
  }

  public synchronized void laidLeaveClip(double periods) {
    this.entranceWeek = periods;
  }

  public double entranceWeek = 0.0;

  public Issue() {
    this.submissionDay = 0;
    this.entranceWeek = 0;
    this.monthPostmarkCompendium = new java.util.LinkedList<WhenStereotype>();
  }

  public double submissionDay = 0.0;
}
