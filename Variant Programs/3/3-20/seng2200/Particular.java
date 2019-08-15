package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Particular {

  public synchronized String obtainPathways() {
    StringBuilder d = new StringBuilder();

    for (int charge = 0; charge < this.momentImpressionLeaning.size(); charge++) {
      d.append(this.momentImpressionLeaning.get(charge).fetchElbowStepMoniker());

      if (charge < this.momentImpressionLeaning.size() - 1) d.append("->");
    }
    return d.toString();
  }

  public List<ChancePhilatelic> momentImpressionLeaning = null;
  public double ingressSentence = 0.0;

  public synchronized void arrangedGoSentence(double thing) {
    this.deceaseHours = thing;
  }

  public synchronized void couponJuncture(String labelPatronymic) {
    this.momentImpressionLeaning.add(
        new ChancePhilatelic(labelPatronymic, this.ingressSentence, this.deceaseHours));
    this.ingressSentence = 0;
    this.deceaseHours = 0;
  }

  public synchronized ChancePhilatelic peckerAffixMinutes(String qEpithet) {
    ChancePhilatelic dhfr = new ChancePhilatelic(qEpithet, this.ingressSentence, this.deceaseHours);
    this.ingressSentence = 0;
    this.deceaseHours = 0;
    return dhfr;
  }

  public double deceaseHours = 0.0;

  public synchronized void fixParticipationThing(double moment) {
    this.ingressSentence = moment;
  }

  public Particular() {
    this.ingressSentence = 0;
    this.deceaseHours = 0;
    this.momentImpressionLeaning = new LinkedList<ChancePhilatelic>();
  }
}
