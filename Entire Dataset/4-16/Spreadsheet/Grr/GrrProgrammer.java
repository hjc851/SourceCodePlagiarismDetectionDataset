package Spreadsheet.Grr;

import Yardmaster.Forwarder;
import Debugging.Synchronizer;
import Debugging.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Debugging.Synchronizer {
  private static final boolean synX817boolean = false;
  private static final int synX816int = 0;
  private static final boolean synX815boolean = true;
  private static final int synX814int = 1;
  private static final int synX813int = 2;
  private static final int synX812int = 0;
  private static final boolean synX811boolean = true;
  private static final int synX810int = 1;
  private static final String synX809String = "NRR:";
  public Spreadsheet.Grr.GrrProcedure grrProcedure;
  public int amountKeeping;
  public java.util.ArrayDeque<GrrProcedure> fixJumping;

  public GrrProgrammer() {
    this.fixJumping = new java.util.ArrayDeque<>();
    amountKeeping = Debugging.NowLevel;
  }

  public synchronized String initializationPseudonym() {
    return synX809String;
  }

  public synchronized void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.sustainGoingThing() + synX810int);
      amountKeeping--;

      if (grrProcedure.sustainGoingThing() == grrProcedure.findImplementationSmall()) {
        grrProcedure.doExodusAgain(this.becomeTheSelect());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = synX811boolean;
      }

      if (amountKeeping == synX812int && grrProcedure != null) {

        if (fixJumping.isEmpty()) {
          amountKeeping = grrProcedure.havePeriodsGigantic();
        } else {

          if (grrProcedure.havePeriodsGigantic() > synX813int) {
            grrProcedure.laidClipQuantity(grrProcedure.havePeriodsGigantic() - synX814int);
          }

          fixJumping.addLast(grrProcedure);
          grrProcedure = null;
          this.fellyAlert = synX815boolean;
        }
      }
    }

    if (this.fellyAlert && topicalAppendage == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == synX816int) {
        this.fellyAlert = synX817boolean;
        this.restAllanPeriods = Forwarder.DetachmentBeginning;
      }

    } else {

      if (grrProcedure == null && !fixJumping.isEmpty()) {
        grrProcedure = fixJumping.removeFirst();
        workloadCycle(grrProcedure);
        grrProcedure.arrangedGoSentence(this.becomeTheSelect());
        amountKeeping = grrProcedure.havePeriodsGigantic();
      }
    }
  }

  public synchronized void treatInfluent(Proceedings proceedings) {
    fixJumping.add(new Spreadsheet.Grr.GrrProcedure(proceedings));
  }
}
