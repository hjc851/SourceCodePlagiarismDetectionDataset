package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Point {
  private static final String synX1324String = "->";
  private static final int synX1323int = 1;
  private static final int synX1322int = 0;
  private static final int synX1321int = 0;
  private static final int synX1320int = 0;
  private static final int synX1319int = 0;
  private static final int synX1318int = 0;
  public double departThing;
  public double enterMonth;
  public List<ChancePhilatelic> opportunityEradicateRegistry;

  public Point() {
    this.enterMonth = 0;
    this.departThing = 0;
    this.opportunityEradicateRegistry = new LinkedList<ChancePhilatelic>();
  }

  public synchronized void putEnteringClock(double opportunity) {
    this.enterMonth = opportunity;
  }

  public synchronized void determinedGoingDays(double clock) {
    this.departThing = clock;
  }

  public synchronized void pestlePeriod(String elbowMoniker) {
    this.opportunityEradicateRegistry.add(
        new ChancePhilatelic(elbowMoniker, this.enterMonth, this.departThing));
    this.enterMonth = synX1318int;
    this.departThing = synX1319int;
  }

  public synchronized ChancePhilatelic waitingPostageClock(String qEpithet) {
    ChancePhilatelic dhfr;
    dhfr = new ChancePhilatelic(qEpithet, this.enterMonth, this.departThing);
    this.enterMonth = synX1320int;
    this.departThing = synX1321int;
    return dhfr;
  }

  public synchronized String makeTrajectory() {
    StringBuilder lehrer;
    lehrer = new StringBuilder();

    for (int tally = synX1322int; tally < this.opportunityEradicateRegistry.size(); tally++)
      synx219(lehrer, tally);
    return lehrer.toString();
  }

  private synchronized void synx219(StringBuilder lehrer, int tally) {
    lehrer.append(this.opportunityEradicateRegistry.get(tally).canNeedleInstarKey());

    if (tally < this.opportunityEradicateRegistry.size() - synX1323int)
      lehrer.append(synX1324String);
  }
}
