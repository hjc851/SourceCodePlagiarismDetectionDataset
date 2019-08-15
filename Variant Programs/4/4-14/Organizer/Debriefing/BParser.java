package Organizer.Debriefing;

import Yardmaster.Originator;
import Workflow.Workspace;
import Workflow.Operation;
import java.util.ArrayDeque;

public class BParser extends Workspace {
  public ArrayDeque<Operation>[] preparingRanks;
  public int momentUnexhausted;
  public int rifePrioritizing;

  public BParser() {
    this.preparingRanks = new ArrayDeque[6];
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          {
            preparingRanks[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    momentUnexhausted = AgainGiant;
    rifePrioritizing = 0;
  }

  public synchronized Operation produceSecondMethod() {
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          {
            if (!preparingRanks[i].isEmpty()) {
              rifePrioritizing = i;
              return preparingRanks[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          {
            if (!preparingRanks[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String organizerList() {
    return "FB:";
  }

  public synchronized void nbsClick() {

    if (newSystem != null) {
      newSystem.rigidWalkingAmount(newSystem.letStreamingHours() + 1);
      momentUnexhausted--;

      if (newSystem.letStreamingHours() == newSystem.fetchManagerVastness()) {
        newSystem.fixedEscapeOpportunity(this.findActualRetick());
        this.conductedServe.addLast(newSystem);
        newSystem = null;
        this.leviPennant = true;
      }

      if (momentUnexhausted == 0 && newSystem != null) {

        if (primedIsVacant()) {
          momentUnexhausted = AgainGiant;
        } else {
          preparingRanks[rifePrioritizing + 1].addLast(newSystem);
          newSystem = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && newSystem == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.leviPennant = false;
        this.unexhaustedTelaMoment = Originator.DespatchClock;
      }

    } else {

      if (newSystem == null && !primedIsVacant()) {
        newSystem = produceSecondMethod();
        consignmentTreat(newSystem);
        newSystem.settledDepartPeriods(this.findActualRetick());
        momentUnexhausted = AgainGiant;
      }
    }
  }

  public synchronized void phaseEntry(Operation methodology) {
    preparingRanks[0].addLast(methodology);
  }
}
