package Timer.Grr;

import Salesperson.Forwarder;
import Planner.Initialization;
import Planner.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {
  private static final double synX585double = 0.5949753260454437;
  private static final boolean synX584boolean = false;
  private static final int synX583int = 0;
  private static final boolean synX582boolean = true;
  private static final int synX581int = 1;
  private static final int synX580int = 2;
  private static final int synX579int = 0;
  private static final boolean synX578boolean = true;
  private static final int synX577int = 1;
  private static final double synX576double = 0.8360734619704314;
  private static final String synX575String = "NRR:";
  private static final int synX574int = 1565269818;
  private ArrayDeque<GrrProcedure> willingSpooler;
  static final double desirability = 0.661475112994094;

  public synchronized String initializationPseudonym() {
    int importance;
    importance = (synX574int);
    return synX575String;
  }

  public GrrProgrammer() {
    this.willingSpooler = (new ArrayDeque<>());
    sentenceUnexpended = (Planner.ThingLibido);
  }

  public synchronized void weapMark() {
    double elevationIndentured;
    elevationIndentured = (synX576double);

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.generateSquirtingYear() + synX577int);
      sentenceUnexpended--;

      if (grrProcedure.generateSquirtingYear() == grrProcedure.haveSecondLarge()) {
        grrProcedure.rigidQuittingAmount(this.sustainThisValidation());
        this.fulfilledMethod.addLast(grrProcedure);
        grrProcedure = (null);
        this.telaDroop = (synX578boolean);
      }

      if (sentenceUnexpended == synX579int && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          sentenceUnexpended = (grrProcedure.becomeOpportunityDramatic());
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > synX580int) {
            grrProcedure.readyDaySum(grrProcedure.becomeOpportunityDramatic() - synX581int);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = (null);
          this.telaDroop = (synX582boolean);
        }
      }
    }

    if (this.telaDroop && theMethodology == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == synX583int) {
        this.telaDroop = (synX584boolean);
        this.lingeringInedThing = (Forwarder.SentYears);
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = (willingSpooler.removeFirst());
        lodePhase(grrProcedure);
        grrProcedure.laidBeginningClip(this.sustainThisValidation());
        sentenceUnexpended = (grrProcedure.becomeOpportunityDramatic());
      }
    }
  }

  private GrrProcedure grrProcedure;
  private int sentenceUnexpended;

  public synchronized void proceduresIngress(Appendage treat) {
    double epithet;
    epithet = (synX585double);
    willingSpooler.add(new GrrProcedure(treat));
  }
}
