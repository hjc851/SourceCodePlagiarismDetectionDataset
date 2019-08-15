package Outliner.Grr;

import Distributors.Plenum;
import Spooler.Outliner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Outliner {
  private static final boolean synX1552boolean = false;
  private static final int synX1551int = 0;
  private static final boolean synX1550boolean = true;
  private static final int synX1549int = 1;
  private static final int synX1548int = 2;
  private static final int synX1547int = 0;
  private static final boolean synX1546boolean = true;
  private static final int synX1545int = 1;
  private static final String synX1544String = "NRR:";
  private ArrayDeque<GrrProcedure> fixJumping;
  private int amountKeeping;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.fixJumping = new ArrayDeque<>();
    amountKeeping = Spooler.MonthLarge;
  }

  public synchronized String parserFigure() {
    return synX1544String;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) synx280();

    if (this.fellyAlert && previousProceeding == null) synx281();
    else synx282();
  }

  public synchronized void systemInpouring(Appendage mechanisms) {
    fixJumping.add(new GrrProcedure(mechanisms));
  }

  private synchronized void synx280() {
    grrProcedure.primedFunctioningPeriod(grrProcedure.comeWorkingClip() + synX1545int);
    amountKeeping--;

    if (grrProcedure.comeWorkingClip() == grrProcedure.drivePresidentCapacity()) {
      grrProcedure.fitDieYear(this.conveyFormerGene());
      this.concludedPractices.addLast(grrProcedure);
      grrProcedure = null;
      this.fellyAlert = synX1546boolean;
    }

    if (amountKeeping == synX1547int && grrProcedure != null) {

      if (fixJumping.isEmpty()) {
        amountKeeping = grrProcedure.obtainDaysQuantitative();
      } else {

        if (grrProcedure.obtainDaysQuantitative() > synX1548int) {
          grrProcedure.primedPeriodQualitative(grrProcedure.obtainDaysQuantitative() - synX1549int);
        }

        fixJumping.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = synX1550boolean;
      }
    }
  }

  private synchronized void synx281() {
    this.oddBenzDay--;

    if (oddBenzDay == synX1551int) {
      this.fellyAlert = synX1552boolean;
      this.oddBenzDay = Plenum.DeployingOpportunity;
    }
  }

  private synchronized void synx282() {

    if (grrProcedure == null && !fixJumping.isEmpty()) {
      grrProcedure = fixJumping.removeFirst();
      chargeAppendage(grrProcedure);
      grrProcedure.primedGetPeriod(this.conveyFormerGene());
      amountKeeping = grrProcedure.obtainDaysQuantitative();
    }
  }
}
