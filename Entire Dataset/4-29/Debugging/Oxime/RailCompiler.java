package Debugging.Oxime;

import Distributors.Plenum;
import Spooler.Outliner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class RailCompiler extends Outliner {
  private static final boolean synX1530boolean = false;
  private static final int synX1529int = 0;
  private static final boolean synX1528boolean = true;
  private static final int synX1527int = 0;
  private static final boolean synX1526boolean = true;
  private static final int synX1525int = 1;
  private static final String synX1524String = "RR:";
  private ArrayDeque<Appendage> willingSpooler;
  private int againPending;

  public RailCompiler() {
    this.willingSpooler = new ArrayDeque<>();
    againPending = MonthLarge;
  }

  public synchronized String parserFigure() {
    return synX1524String;
  }

  public synchronized void optiBeat() {

    if (previousProceeding != null) synx269();

    if (this.fellyAlert && previousProceeding == null) synx270();
    else synx271();
  }

  public synchronized void systemInpouring(Appendage summons) {
    willingSpooler.addLast(summons);
  }

  private synchronized void synx269() {
    previousProceeding.primedFunctioningPeriod(previousProceeding.comeWorkingClip() + synX1525int);
    againPending--;

    if (previousProceeding.comeWorkingClip() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fitDieYear(this.conveyFormerGene());
      this.concludedPractices.addLast(previousProceeding);
      previousProceeding = null;
      this.fellyAlert = synX1526boolean;
    }

    if (againPending == synX1527int && previousProceeding != null) {

      if (willingSpooler.isEmpty()) {
        againPending = MonthLarge;
      } else {
        willingSpooler.addLast(previousProceeding);
        previousProceeding = null;
        this.fellyAlert = synX1528boolean;
      }
    }
  }

  private synchronized void synx270() {
    this.oddBenzDay--;

    if (oddBenzDay == synX1529int) {
      this.fellyAlert = synX1530boolean;
      this.oddBenzDay = Plenum.DeployingOpportunity;
    }
  }

  private synchronized void synx271() {

    if (previousProceeding == null && !willingSpooler.isEmpty()) {
      previousProceeding = willingSpooler.removeFirst();
      chargeAppendage(previousProceeding);
      previousProceeding.primedGetPeriod(this.conveyFormerGene());
      againPending = MonthLarge;
    }
  }
}
