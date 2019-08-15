package Organizer.Views;

import Yardmaster.Regulator;
import Synchronization.Timer;
import Synchronization.Appendage;
import java.util.ArrayDeque;

public class DownstreamCallback extends Timer {

  public synchronized String plannerNominate() {
    return "FB:";
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < intelligentFronts.length) {
        {
          {
            if (!intelligentFronts[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  private int continuingPressing;

  public synchronized void workElect(Appendage procedures) {
    intelligentFronts[0].addLast(procedures);
  }

  private synchronized Appendage comeFollowingOperation() {
    {
      int i = 0;

      while (i < intelligentFronts.length) {
        {
          {
            if (!intelligentFronts[i].isEmpty()) {
              continuingPressing = i;
              return intelligentFronts[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized void addTock() {

    if (rifeSue != null) synx420();

    if (this.dblPin && rifeSue == null) synx421();
    else synx422();
  }

  private int againPending;
  private ArrayDeque<Appendage>[] intelligentFronts;

  public DownstreamCallback() {
    this.intelligentFronts = new ArrayDeque[6];
    {
      int i = 0;

      while (i < intelligentFronts.length) {
        {
          synx423(i);
        }
        i++;
      }
    }
    againPending = MomentAmounts;
    continuingPressing = 0;
  }

  private synchronized void synx420() {
    rifeSue.fixGoingThing(rifeSue.drawSpurtingWeek() + 1);
    againPending--;

    if (rifeSue.drawSpurtingWeek() == rifeSue.findImplementationSmall()) {
      rifeSue.situatedMoveMinutes(this.receiveContemporaryTicktack());
      this.undergoneMethodologies.addLast(rifeSue);
      rifeSue = null;
      this.dblPin = true;
    }

    if (againPending == 0 && rifeSue != null) {

      if (primedIsVacant()) {
        againPending = MomentAmounts;
      } else {
        intelligentFronts[continuingPressing + 1].addLast(rifeSue);
        rifeSue = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx421() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.dblPin = false;
      this.latterSthMinutes = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx422() {

    if (rifeSue == null && !primedIsVacant()) {
      rifeSue = comeFollowingOperation();
      freightMarch(rifeSue);
      rifeSue.arrangedGoSentence(this.receiveContemporaryTicktack());
      againPending = MomentAmounts;
    }
  }

  private synchronized void synx423(int i) {
    intelligentFronts[i] = new ArrayDeque<>();
  }
}
