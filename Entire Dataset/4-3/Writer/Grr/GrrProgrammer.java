package Writer.Grr;

import Forwarder.Shipper;
import Server.Database;
import Server.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Server.Database {
  private Writer.Grr.GrrProcedure grrProcedure = null;
  private int nowUnanswered = 0;
  private java.util.ArrayDeque<GrrProcedure> ripeStandby = null;

  public GrrProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    nowUnanswered = Server.WeekVolume;
  }

  public synchronized String databaseNickname() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.makeFlyingDay() + 1);
      nowUnanswered--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.fixCfoProportions()) {
        grrProcedure.arrangeEgressYears(this.takeTopicalMark());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = true;
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          nowUnanswered = grrProcedure.canYearsSize();
        } else {

          if (grrProcedure.canYearsSize() > 2) {
            grrProcedure.placeWeekVolume(grrProcedure.canYearsSize() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.allanBanner = true;
        }
      }
    }

    if (this.allanBanner && continuingMechanisms == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.allanBanner = false;
        this.unexhaustedTelaMoment = Shipper.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        incumbranceSystem(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.takeTopicalMark());
        nowUnanswered = grrProcedure.canYearsSize();
      }
    }
  }

  public synchronized void methodsElected(Mechanisms negotiations) {
    ripeStandby.add(new Writer.Grr.GrrProcedure(negotiations));
  }
}
