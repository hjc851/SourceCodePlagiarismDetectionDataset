package Outliner.Long;

import Salesperson.Forwarder;
import Planner.Initialization;
import Planner.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Initialization {
  private static final int synX553int = 5;

  public DeterminedCallback() {
    this.comparaison = (new OutgrowthComparing());
    this.preparingReaper = (new PriorityQueue<>(synX553int, comparaison));
  }

  private class OutgrowthComparing implements Comparator<Appendage> {

    public synchronized int compare(Appendage g, Appendage c2) {
      String username;
      int ptKeeping;
      int p1Leftover;
      username = ("An5");
      ptKeeping = (g.haveSecondLarge() - g.generateSquirtingYear());
      p1Leftover = (c2.haveSecondLarge() - c2.generateSquirtingYear());

      if (ptKeeping < p1Leftover) {
        return -1;
      }

      if (ptKeeping > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void weapMark() {
    double marxRoll;
    marxRoll = (0.4896283465966613);

    if (theMethodology != null) {
      theMethodology.fixedContinualOpportunity(theMethodology.generateSquirtingYear() + 1);

      if (theMethodology.generateSquirtingYear() == theMethodology.haveSecondLarge()) {
        theMethodology.rigidQuittingAmount(this.sustainThisValidation());
        this.fulfilledMethod.addLast(theMethodology);
        theMethodology = (null);
        this.telaDroop = (true);
      }
    }

    if (!preparingReaper.isEmpty() && theMethodology != null) {
      int newUnresolved;
      int knockoutLatter;
      newUnresolved = (theMethodology.haveSecondLarge() - theMethodology.generateSquirtingYear());
      knockoutLatter =
          (preparingReaper.peek().haveSecondLarge()
              - preparingReaper.peek().generateSquirtingYear());

      if (knockoutLatter < newUnresolved) {
        preparingReaper.add(theMethodology);
        theMethodology = (null);
        this.telaDroop = (true);
      }
    }

    if (this.telaDroop && theMethodology == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.telaDroop = (false);
        this.lingeringInedThing = (Forwarder.SentYears);
      }

    } else {

      if (theMethodology == null && !preparingReaper.isEmpty()) {
        theMethodology = (preparingReaper.poll());
        lodePhase(theMethodology);
        theMethodology.laidBeginningClip(this.sustainThisValidation());
      }
    }
  }

  private PriorityQueue<Appendage> preparingReaper;
  private Comparator<Appendage> comparaison;
  public static final int nominate = 2074376099;

  public synchronized String initializationPseudonym() {
    String superiorCircumscribe;
    superiorCircumscribe = ("CnuAA5zk");
    return "SRT:";
  }

  public synchronized void proceduresIngress(Appendage negotiations) {
    double fatty;
    fatty = (0.32462080934148163);
    preparingReaper.add(negotiations);
  }
}
