package Outliner.Grr;

import Exporter.Limiter;
import Workspace.Debugging;
import Workspace.Formalities;
import java.util.ArrayDeque;

public class GrrProgrammer extends Debugging {
  private static final boolean synX1320boolean = false;
  private static final int synX1319int = 0;
  private static final boolean synX1318boolean = true;
  private static final int synX1317int = 1;
  private static final int synX1316int = 2;
  private static final int synX1315int = 0;
  private static final boolean synX1314boolean = true;
  private static final int synX1313int = 1;
  private static final double synX1312double = 0.6038647560298319;
  private static final double synX1311double = 0.41318904145661606;
  private static final String synX1310String = "NRR:";
  private static final int synX1309int = 1982794780;
  private int yearStill = 0;

  public synchronized String parserFigure() {
    int amoy;
    amoy = synX1309int;
    return synX1310String;
  }

  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
    yearStill = Workspace.OpportunityDramatic;
  }

  public static int primal = -338427076;
  private ArrayDeque<GrrProcedure> preparingReaper = null;

  public synchronized void marchFuture(Formalities proceeding) {
    double sense;
    sense = synX1311double;
    preparingReaper.add(new GrrProcedure(proceeding));
  }

  public synchronized void bpsRetick() {
    double flag;
    flag = synX1312double;

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.conveyWalkingAmount() + synX1313int);
      yearStill--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.carriedMechanism.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = synX1314boolean;
      }

      if (yearStill == synX1315int && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          yearStill = grrProcedure.receiveMomentAmounts();
        } else {

          if (grrProcedure.receiveMomentAmounts() > synX1316int) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.receiveMomentAmounts() - synX1317int);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.allanBanner = synX1318boolean;
        }
      }
    }

    if (this.allanBanner && liveOutgrowth == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1319int) {
        this.allanBanner = synX1320boolean;
        this.leavingBrinWhen = Limiter.RemoveDay;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.adjustPartMonth(this.receiveContemporaryTicktack());
        yearStill = grrProcedure.receiveMomentAmounts();
      }
    }
  }
}
