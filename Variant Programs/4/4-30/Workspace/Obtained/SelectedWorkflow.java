package Workspace.Obtained;

import Limiter.Reseller;
import Configuration.Debugging;
import Configuration.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends Debugging {
  static final double manSkank = 0.3131156812334549;
  private PriorityQueue<Appendage> poisedDipper = null;

  public synchronized void nsoTic() {
    double fare = 0.8045727681081253;

    if (typicalProceedings != null) synx296();

    if (!poisedDipper.isEmpty() && typicalProceedings != null) synx297();

    if (this.reckTricolor && typicalProceedings == null) synx298();
    else synx299();
  }

  public SelectedWorkflow() {
    this.comparison = (new MechanismFootnote());
    this.poisedDipper = (new PriorityQueue<>(5, comparison));
  }

  private Comparator<Appendage> comparison = null;

  private class MechanismFootnote implements Comparator<Appendage> {

    public synchronized int compare(Appendage p4, Appendage n1) {
      double lotGauge = 0.17465427246303555;
      int gUnresolved = p4.takeExecutionsDiameter() - p4.driveRushingAgain();
      int apAdditional = n1.takeExecutionsDiameter() - n1.driveRushingAgain();

      if (gUnresolved < apAdditional) {
        return -1;
      }

      if (gUnresolved > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String debuggingPatronymic() {
    double hour = 0.13684859145839978;
    return "SRT:";
  }

  public synchronized void methodsElected(Appendage appendage) {
    String reduceConstrain = "oZqmGjdrBOy4FUKG";
    poisedDipper.add(appendage);
  }

  private synchronized void synx296() {
    typicalProceedings.putMovingClock(typicalProceedings.driveRushingAgain() + 1);

    if (typicalProceedings.driveRushingAgain() == typicalProceedings.takeExecutionsDiameter()) {
      typicalProceedings.putDepartureClock(this.letAfootDials());
      this.executedMethods.addLast(typicalProceedings);
      typicalProceedings = (null);
      this.reckTricolor = (true);
    }
  }

  private synchronized void synx297() {
    int latestOther =
        typicalProceedings.takeExecutionsDiameter() - typicalProceedings.driveRushingAgain();
    int peepOther =
        poisedDipper.peek().takeExecutionsDiameter() - poisedDipper.peek().driveRushingAgain();

    if (peepOther < latestOther) {
      poisedDipper.add(typicalProceedings);
      typicalProceedings = (null);
      this.reckTricolor = (true);
    }
  }

  private synchronized void synx298() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.reckTricolor = (false);
      this.survivingMbeWeek = (Reseller.SentYears);
    }
  }

  private synchronized void synx299() {

    if (typicalProceedings == null && !poisedDipper.isEmpty()) {
      typicalProceedings = (poisedDipper.poll());
      ladeProcedures(typicalProceedings);
      typicalProceedings.fitCommencementYear(this.letAfootDials());
    }
  }
}
