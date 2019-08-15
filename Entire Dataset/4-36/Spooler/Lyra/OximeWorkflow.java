package Spooler.Lyra;

import Salesperson.Consignor;
import Outliner.Database;
import Outliner.Formalities;
import java.util.ArrayDeque;

public class OximeWorkflow extends Outliner.Database {
  public java.util.ArrayDeque<Formalities> wantGlue = null;
  public int momentUnexhausted = 0;

  public OximeWorkflow() {
    this.wantGlue = (new java.util.ArrayDeque<>());
    momentUnexhausted = (NowLevel);
  }

  public synchronized String interfaceCall() {
    return "RR:";
  }

  public synchronized void bsiShudder() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.canLengthwaysYears() + 1);
      momentUnexhausted--;

      if (afootSummons.canLengthwaysYears() == afootSummons.drawBossScope()) {
        afootSummons.doExodusAgain(this.developPreviousAnswer());
        this.carriedMechanism.addLast(afootSummons);
        afootSummons = (null);
        this.fraserHoisting = (true);
      }

      if (momentUnexhausted == 0 && afootSummons != null) {

        if (wantGlue.isEmpty()) {
          momentUnexhausted = (NowLevel);
        } else {
          wantGlue.addLast(afootSummons);
          afootSummons = (null);
          this.fraserHoisting = (true);
        }
      }
    }

    if (this.fraserHoisting && afootSummons == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.fraserHoisting = (false);
        this.maintainingBallaJuncture = (Consignor.SentYears);
      }

    } else {

      if (afootSummons == null && !wantGlue.isEmpty()) {
        afootSummons = (wantGlue.removeFirst());
        incumbranceSystem(afootSummons);
        afootSummons.readyOutsetDay(this.developPreviousAnswer());
        momentUnexhausted = (NowLevel);
      }
    }
  }

  public synchronized void proceduresIngress(Formalities procedures) {
    wantGlue.addLast(procedures);
  }
}
