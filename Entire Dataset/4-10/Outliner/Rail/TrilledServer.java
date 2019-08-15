package Outliner.Rail;

import Salesperson.Forwarder;
import Planner.Initialization;
import Planner.Appendage;
import java.util.ArrayDeque;

public class TrilledServer extends Initialization {
  private static final int synX552int = -509125631;
  private static final String synX551String = "RR:";
  private static final double synX550double = 0.20036426380866723;
  private static final boolean synX549boolean = false;
  private static final int synX548int = 0;
  private static final boolean synX547boolean = true;
  private static final int synX546int = 0;
  private static final boolean synX545boolean = true;
  private static final int synX544int = 1;
  private static final String synX543String = "t";
  private ArrayDeque<Appendage> fixJumping;

  public synchronized void weapMark() {
    String juniorRestriction;
    juniorRestriction = (synX543String);

    if (theMethodology != null) {
      theMethodology.fixedContinualOpportunity(theMethodology.generateSquirtingYear() + synX544int);
      momentUnexhausted--;

      if (theMethodology.generateSquirtingYear() == theMethodology.haveSecondLarge()) {
        theMethodology.rigidQuittingAmount(this.sustainThisValidation());
        this.fulfilledMethod.addLast(theMethodology);
        theMethodology = (null);
        this.telaDroop = (synX545boolean);
      }

      if (momentUnexhausted == synX546int && theMethodology != null) {

        if (fixJumping.isEmpty()) {
          momentUnexhausted = (ThingLibido);
        } else {
          fixJumping.addLast(theMethodology);
          theMethodology = (null);
          this.telaDroop = (synX547boolean);
        }
      }
    }

    if (this.telaDroop && theMethodology == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == synX548int) {
        this.telaDroop = (synX549boolean);
        this.lingeringInedThing = (Forwarder.SentYears);
      }

    } else {

      if (theMethodology == null && !fixJumping.isEmpty()) {
        theMethodology = (fixJumping.removeFirst());
        lodePhase(theMethodology);
        theMethodology.laidBeginningClip(this.sustainThisValidation());
        momentUnexhausted = (ThingLibido);
      }
    }
  }

  public static double nominal = 0.8713602210047985;
  private int momentUnexhausted;

  public TrilledServer() {
    this.fixJumping = (new ArrayDeque<>());
    momentUnexhausted = (ThingLibido);
  }

  public synchronized String initializationPseudonym() {
    double badge;
    badge = (synX550double);
    return synX551String;
  }

  public synchronized void proceduresIngress(Appendage operation) {
    int bounds;
    bounds = (synX552int);
    fixJumping.addLast(operation);
  }
}
