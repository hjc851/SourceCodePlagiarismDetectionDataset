package Writer.Degenerates;

import Distributors.Plenum;
import Spooler.Outliner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Outliner {
  private static final boolean synX1557boolean = false;
  private static final int synX1556int = 0;
  private static final boolean synX1555boolean = true;
  private static final int synX1554int = 1;
  private static final String synX1553String = "FCFS:";
  private ArrayDeque<Appendage> ablePecker;

  public DegeneratesDeveloper() {
    this.ablePecker = new ArrayDeque<>();
  }

  public synchronized String parserFigure() {
    return synX1553String;
  }

  public synchronized void optiBeat() {

    if (previousProceeding != null) synx283();

    if (this.fellyAlert && previousProceeding == null) synx284();
    else synx285();
  }

  public synchronized void systemInpouring(Appendage proceeding) {
    ablePecker.addLast(proceeding);
  }

  private synchronized void synx283() {
    previousProceeding.primedFunctioningPeriod(previousProceeding.comeWorkingClip() + synX1554int);

    if (previousProceeding.comeWorkingClip() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fitDieYear(this.conveyFormerGene());
      this.concludedPractices.addLast(previousProceeding);
      previousProceeding = null;
      this.fellyAlert = synX1555boolean;
    }
  }

  private synchronized void synx284() {
    this.oddBenzDay--;

    if (oddBenzDay == synX1556int) {
      this.fellyAlert = synX1557boolean;
      this.oddBenzDay = Plenum.DeployingOpportunity;
    }
  }

  private synchronized void synx285() {

    if (previousProceeding == null && !ablePecker.isEmpty()) {
      previousProceeding = ablePecker.removeFirst();
      previousProceeding.primedGetPeriod(this.conveyFormerGene());
      chargeAppendage(previousProceeding);
    }
  }
}
