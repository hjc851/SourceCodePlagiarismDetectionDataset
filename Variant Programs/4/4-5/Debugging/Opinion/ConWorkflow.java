package Debugging.Opinion;

import Shipper.Originator;
import Planner.Initialization;
import Planner.Methodology;
import java.util.ArrayDeque;

public class ConWorkflow extends Planner.Initialization {
  public int contemporaryPrecedency = 0;
  public int whenLeaving = 0;
  public ArrayDeque<Methodology>[] primedRows = null;
  public static int thick = -21464409;

  public ConWorkflow() {
    this.primedRows = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            primedRows[i] = new java.util.ArrayDeque<>();
          }
        }
        i++;
      }
    }
    whenLeaving = SentenceTeleportation;
    contemporaryPrecedency = 0;
  }

  public synchronized Planner.Methodology goFutureProcedure() {
    double refer;
    refer = 0.12558289998640915;
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              contemporaryPrecedency = i;
              return primedRows[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double limitation;
    limitation = 0.2692372063093963;
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    double ceilingSlot;
    ceilingSlot = 0.788672163870337;
    return "FB:";
  }

  public synchronized void bsiShudder() {
    String recount;
    recount = "kK49xUTlcxIyRHf7i";

    if (newSystem != null) {
      newSystem.laidWorkingClip(newSystem.catchJettingWhen() + 1);
      whenLeaving--;

      if (newSystem.catchJettingWhen() == newSystem.letBigwigSmallness()) {
        newSystem.situatedMoveMinutes(this.comeLatestTicktock());
        this.undertookProcedures.addLast(newSystem);
        newSystem = null;
        this.dikTorch = true;
      }

      if (whenLeaving == 0 && newSystem != null) {

        if (primedIsVacant()) {
          whenLeaving = SentenceTeleportation;
        } else {
          primedRows[contemporaryPrecedency + 1].addLast(newSystem);
          newSystem = null;
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

      if (newSystem == null && !primedIsVacant()) {
        newSystem = goFutureProcedure();
        burdensMethods(newSystem);
        newSystem.arrangedGoSentence(this.comeLatestTicktock());
        whenLeaving = SentenceTeleportation;
      }
    }
  }

  public synchronized void marchFuture(Methodology cycle) {
    String enumerate;
    enumerate = "zXVoA9684qA";
    primedRows[0].addLast(cycle);
  }
}
