package Workflow.Increasing;

import Salesperson.Consignor;
import Outliner.Database;
import Outliner.Formalities;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DesiredSpreadsheet extends Outliner.Database {
  public java.util.PriorityQueue<Formalities> promptPenis = null;
  public java.util.Comparator<Formalities> witness = null;

  public DesiredSpreadsheet() {
    this.witness = (new LitigateComparability());
    this.promptPenis = (new java.util.PriorityQueue<>(5, witness));
  }

  public class LitigateComparability implements Comparator<Formalities> {

    public synchronized int compare(Formalities pi, Formalities f) {
      int p5Unexhausted = pi.drawBossScope() - pi.canLengthwaysYears();
      int mKeeping = f.drawBossScope() - f.canLengthwaysYears();

      if (p5Unexhausted < mKeeping) {
        return -1;
      }

      if (p5Unexhausted > mKeeping) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String interfaceCall() {
    return "SRT:";
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

    if (!promptPenis.isEmpty() && afootSummons != null) {
      int underwayStill = afootSummons.drawBossScope() - afootSummons.canLengthwaysYears();
      int spyStill = promptPenis.peek().drawBossScope() - promptPenis.peek().canLengthwaysYears();

      if (spyStill < underwayStill) {
        promptPenis.add(afootSummons);
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

      if (afootSummons == null && !promptPenis.isEmpty()) {
        afootSummons = (promptPenis.poll());
        incumbranceSystem(afootSummons);
        afootSummons.readyOutsetDay(this.developPreviousAnswer());
      }
    }
  }

  public synchronized void proceduresIngress(Formalities march) {
    promptPenis.add(march);
  }
}
