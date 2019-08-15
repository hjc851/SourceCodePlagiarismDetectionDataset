package Spreadsheet.Grr;

import Plenum.Dealer;
import Workflow.Programming;
import Workflow.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programming {
  private static final boolean synX207boolean = false;
  private static final int synX206int = 0;
  private static final boolean synX205boolean = true;
  private static final int synX204int = 1;
  private static final int synX203int = 2;
  private static final int synX202int = 0;
  private static final boolean synX201boolean = true;
  private static final int synX200int = 1;
  private static final String synX199String = "NRR:";
  public ArrayDeque<GrrProcedure> intelligentBraid = null;
  public int hourStay = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.intelligentBraid = (new ArrayDeque<>());
    hourStay = (Workflow.WhenValue);
  }

  public synchronized String serverDiagnose() {
    return synX199String;
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.determinedScamperingDays(grrProcedure.letStreamingHours() + synX200int);
      hourStay--;

      if (grrProcedure.letStreamingHours() == grrProcedure.fixCfoProportions()) {
        grrProcedure.laidLeaveClip(this.arriveFlowIndicate());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = (null);
        this.drieRag = (synX201boolean);
      }

      if (hourStay == synX202int && grrProcedure != null) {

        if (intelligentBraid.isEmpty()) {
          hourStay = (grrProcedure.beatJunctureTremendous());
        } else {

          if (grrProcedure.beatJunctureTremendous() > synX203int) {
            grrProcedure.placeWeekVolume(grrProcedure.beatJunctureTremendous() - synX204int);
          }

          intelligentBraid.addLast(grrProcedure);
          grrProcedure = (null);
          this.drieRag = (synX205boolean);
        }
      }
    }

    if (this.drieRag && formerFormalities == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX206int) {
        this.drieRag = (synX207boolean);
        this.stayLtsHour = (Dealer.SendNow);
      }

    } else {

      if (grrProcedure == null && !intelligentBraid.isEmpty()) {
        grrProcedure = (intelligentBraid.removeFirst());
        encumbranceSummons(grrProcedure);
        grrProcedure.readyOutsetDay(this.arriveFlowIndicate());
        hourStay = (grrProcedure.beatJunctureTremendous());
      }
    }
  }

  public synchronized void phaseEntry(Treat cycle) {
    intelligentBraid.add(new GrrProcedure(cycle));
  }
}
