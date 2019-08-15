package Programmer.Paps;

import Salesperson.Consignor;
import Outliner.Database;
import Outliner.Formalities;
import java.util.ArrayDeque;

public class UsingProgramming extends Outliner.Database {
  public java.util.ArrayDeque<Formalities> quickSufferance = null;

  public UsingProgramming() {
    this.quickSufferance = (new java.util.ArrayDeque<>());
  }

  public synchronized String interfaceCall() {
    return "FCFS:";
  }

  public synchronized void bsiShudder() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.canLengthwaysYears() + 1);

      if (afootSummons.canLengthwaysYears() == afootSummons.drawBossScope()) {
        afootSummons.doExodusAgain(this.developPreviousAnswer());
        this.carriedMechanism.addLast(afootSummons);
        afootSummons = (null);
        this.fraserHoisting = (true);
      }
    }

    if (this.fraserHoisting && afootSummons == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.fraserHoisting = (false);
        this.maintainingBallaJuncture = (Consignor.SentYears);
      }

    } else {

      if (afootSummons == null && !quickSufferance.isEmpty()) {
        afootSummons = (quickSufferance.removeFirst());
        afootSummons.readyOutsetDay(this.developPreviousAnswer());
        incumbranceSystem(afootSummons);
      }
    }
  }

  public synchronized void proceduresIngress(Formalities cycle) {
    quickSufferance.addLast(cycle);
  }
}
