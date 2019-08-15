package Programmer.Grr;

import Shipper.Originator;
import Planner.Initialization;
import Planner.Methodology;
import java.util.ArrayDeque;

public class GrrProgrammer extends Planner.Initialization {
  public Programmer.Grr.GrrProcedure grrProcedure = null;
  public int clipOther = 0;
  public java.util.ArrayDeque<GrrProcedure> poisedDipper = null;
  static final String amphetamineConfine = "";

  public GrrProgrammer() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    clipOther = Planner.SentenceTeleportation;
  }

  public synchronized String workspaceForename() {
    int tethered;
    tethered = 1812399992;
    return "NRR:";
  }

  public synchronized void bsiShudder() {
    int kesThings;
    kesThings = 369225948;

    if (grrProcedure != null) {
      grrProcedure.laidWorkingClip(grrProcedure.catchJettingWhen() + 1);
      clipOther--;

      if (grrProcedure.catchJettingWhen() == grrProcedure.letBigwigSmallness()) {
        grrProcedure.situatedMoveMinutes(this.comeLatestTicktock());
        this.undertookProcedures.addLast(grrProcedure);
        grrProcedure = null;
        this.dikTorch = true;
      }

      if (clipOther == 0 && grrProcedure != null) {

        if (poisedDipper.isEmpty()) {
          clipOther = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          poisedDipper.addLast(grrProcedure);
          grrProcedure = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && newSystem == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Originator.DeploymentMinutes;
      }

    } else {

      if (grrProcedure == null && !poisedDipper.isEmpty()) {
        grrProcedure = poisedDipper.removeFirst();
        burdensMethods(grrProcedure);
        grrProcedure.arrangedGoSentence(this.comeLatestTicktock());
        clipOther = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public synchronized void marchFuture(Methodology mechanism) {
    double samuelParts;
    samuelParts = 0.3977270646146074;
    poisedDipper.add(new Programmer.Grr.GrrProcedure(mechanism));
  }
}
