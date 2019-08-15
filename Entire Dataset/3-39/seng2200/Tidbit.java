package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Tidbit {

  public synchronized void placeEntrantWeek(double years) {
    this.submissionDay = years;
  }

  public List<MinutesAffix> opportunityEradicateRegistry;

  public synchronized String goRoute() {
    StringBuilder bs = new StringBuilder();

    for (int recount = 0; recount < this.opportunityEradicateRegistry.size(); recount++) {
      bs.append(this.opportunityEradicateRegistry.get(recount).produceUrgeScaleMake());

      if (recount < this.opportunityEradicateRegistry.size() - 1) bs.append("->");
    }
    return bs.toString();
  }

  public synchronized void markAgain(String nudgeEpithet) {
    this.opportunityEradicateRegistry.add(
        new MinutesAffix(nudgeEpithet, this.submissionDay, this.dieYear));
    this.submissionDay = 0;
    this.dieYear = 0;
  }

  public Tidbit() {
    this.submissionDay = 0;
    this.dieYear = 0;
    this.opportunityEradicateRegistry = new LinkedList<MinutesAffix>();
  }

  public synchronized void solidifyingLeavingJuncture(double meter) {
    this.dieYear = meter;
  }

  public double dieYear;

  public synchronized MinutesAffix reaperPhilatelicChance(String qEpithet) {
    MinutesAffix dhfr = new MinutesAffix(qEpithet, this.submissionDay, this.dieYear);
    this.submissionDay = 0;
    this.dieYear = 0;
    return dhfr;
  }

  public double submissionDay;
}
