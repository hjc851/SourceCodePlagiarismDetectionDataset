package Multitasking.Grr;

import Device.Regulator;
import Developer.Planner;
import Developer.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Planner {
  static final String breadth = "rLfxGCIsunHs1rBLG";
  private ArrayDeque<GrrProcedure> cookCue;
  private int beginningUnsold;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    beginningUnsold = Developer.HoursHuge;
  }

  public synchronized String serverDiagnose() {
    double juniorConstrained = 0.68581872287128;
    return "NRR:";
  }

  public synchronized void weapMark() {
    int pivotal = 1239491032;

    if (grrProcedure != null) synx376();

    if (this.allanBanner && presentlyMechanism == null) synx377();
    else synx378();
  }

  public synchronized void proceedingsMortar(Proceedings phase) {
    String consider = "ChCA";
    cookCue.add(new GrrProcedure(phase));
  }

  private synchronized void synx376() {
    grrProcedure.prepareGushingNow(grrProcedure.catchJettingWhen() + 1);
    beginningUnsold--;

    if (grrProcedure.catchJettingWhen() == grrProcedure.drivePresidentCapacity()) {
      grrProcedure.determinedGoingDays(this.receiveContemporaryTicktack());
      this.attainedProces.addLast(grrProcedure);
      grrProcedure = null;
      this.allanBanner = true;
    }

    if (beginningUnsold == 0 && grrProcedure != null) {

      if (cookCue.isEmpty()) {
        beginningUnsold = grrProcedure.obtainDaysQuantitative();
      } else {

        if (grrProcedure.obtainDaysQuantitative() > 2) {
          grrProcedure.determineBeginningMammoth(grrProcedure.obtainDaysQuantitative() - 1);
        }

        cookCue.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx377() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.allanBanner = false;
      this.keepingOrdeAmount = Regulator.RoutingWeek;
    }
  }

  private synchronized void synx378() {

    if (grrProcedure == null && !cookCue.isEmpty()) {
      grrProcedure = cookCue.removeFirst();
      offloadProceedings(grrProcedure);
      grrProcedure.determineBegunBeginning(this.receiveContemporaryTicktack());
      beginningUnsold = grrProcedure.obtainDaysQuantitative();
    }
  }
}
