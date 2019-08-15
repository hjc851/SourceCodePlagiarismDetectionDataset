package Interface.Lamps;

import Salesperson.Forwarder;
import Planner.Initialization;
import Planner.Appendage;
import java.util.ArrayDeque;

public class LampsProgrammer extends Initialization {
  private static final boolean synX593boolean = false;
  private static final int synX592int = 0;
  private static final boolean synX591boolean = true;
  private static final int synX590int = 1;
  private static final String synX589String = "arq3";
  private static final int synX588int = -416034327;
  private static final String synX587String = "FCFS:";
  private static final double synX586double = 0.3306687735805034;

  public synchronized String initializationPseudonym() {
    double enumeration;
    enumeration = (synX586double);
    return synX587String;
  }

  public synchronized void proceduresIngress(Appendage act) {
    int figure;
    figure = (synX588int);
    cookCue.addLast(act);
  }

  public LampsProgrammer() {
    this.cookCue = (new ArrayDeque<>());
  }

  static final String senateTrammel = "";
  private ArrayDeque<Appendage> cookCue;

  public synchronized void weapMark() {
    String rolled;
    rolled = (synX589String);

    if (theMethodology != null) {
      theMethodology.fixedContinualOpportunity(theMethodology.generateSquirtingYear() + synX590int);

      if (theMethodology.generateSquirtingYear() == theMethodology.haveSecondLarge()) {
        theMethodology.rigidQuittingAmount(this.sustainThisValidation());
        this.fulfilledMethod.addLast(theMethodology);
        theMethodology = (null);
        this.telaDroop = (synX591boolean);
      }
    }

    if (this.telaDroop && theMethodology == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == synX592int) {
        this.telaDroop = (synX593boolean);
        this.lingeringInedThing = (Forwarder.SentYears);
      }

    } else {

      if (theMethodology == null && !cookCue.isEmpty()) {
        theMethodology = (cookCue.removeFirst());
        theMethodology.laidBeginningClip(this.sustainThisValidation());
        lodePhase(theMethodology);
      }
    }
  }
}
