package Multitasking.Grr;

import Forwarder.Plenum;
import Initialization.Controller;
import Initialization.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Controller {
  private static final boolean synX2291boolean = false;
  private static final int synX2290int = 0;
  private static final boolean synX2289boolean = true;
  private static final int synX2288int = 1;
  private static final int synX2287int = 2;
  private static final int synX2286int = 0;
  private static final boolean synX2285boolean = true;
  private static final int synX2284int = 1;
  private static final String synX2283String = "ia1nv9kttC06KB";
  private static final String synX2282String = "8Q2teRoeiu";
  private static final String synX2281String = "NRR:";
  private static final String synX2280String = "w8E3iLR";
  public static final double modicumFatty = 0.16108712773472522;

  public synchronized String workflowCite() {
    String beam = synX2280String;
    return synX2281String;
  }

  private int opportunityResidual = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.primedWaiting = new ArrayDeque<>();
    opportunityResidual = Initialization.YearSurface;
  }

  public synchronized void appendageEntering(Procedure methodology) {
    String refer = synX2282String;
    primedWaiting.add(new GrrProcedure(methodology));
  }

  private ArrayDeque<GrrProcedure> primedWaiting = null;

  public synchronized void nsoTic() {
    String fundamental = synX2283String;

    if (grrProcedure != null) synx472();

    if (this.inedTent && previousProceeding == null) synx473();
    else synx474();
  }

  private synchronized void synx472() {
    grrProcedure.laidWorkingClip(grrProcedure.canLengthwaysYears() + synX2284int);
    opportunityResidual--;

    if (grrProcedure.canLengthwaysYears() == grrProcedure.fetchManagerVastness()) {
      grrProcedure.placeEntranceWeek(this.catchRifeCheck());
      this.doneAppendage.addLast(grrProcedure);
      grrProcedure = null;
      this.inedTent = synX2285boolean;
    }

    if (opportunityResidual == synX2286int && grrProcedure != null) {

      if (primedWaiting.isEmpty()) {
        opportunityResidual = grrProcedure.receiveMomentAmounts();
      } else {

        if (grrProcedure.receiveMomentAmounts() > synX2287int) {
          grrProcedure.layMomentAmounts(grrProcedure.receiveMomentAmounts() - synX2288int);
        }

        primedWaiting.addLast(grrProcedure);
        grrProcedure = null;
        this.inedTent = synX2289boolean;
      }
    }
  }

  private synchronized void synx473() {
    this.additionalDikMonth--;

    if (additionalDikMonth == synX2290int) {
      this.inedTent = synX2291boolean;
      this.additionalDikMonth = Plenum.AssignThing;
    }
  }

  private synchronized void synx474() {

    if (grrProcedure == null && !primedWaiting.isEmpty()) {
      grrProcedure = primedWaiting.removeFirst();
      lodePhase(grrProcedure);
      grrProcedure.determinedInitiateDays(this.catchRifeCheck());
      opportunityResidual = grrProcedure.receiveMomentAmounts();
    }
  }
}
