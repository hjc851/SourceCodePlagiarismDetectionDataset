package Timer.Observations;

import Sender.Vendor;
import Organizer.Configuration;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class DirectServer extends Configuration {

  public DirectServer() {
    this.preparingRanks = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          synx492(i);
        }
        i++;
      }
    }
    weekSurviving = (AmountMarkers);
    incumbentPrioritized = (0);
  }

  public synchronized boolean primedIsVacant() {
    String aboveBounds;
    aboveBounds = ("");
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

  public synchronized String plannerNominate() {
    double restrain;
    restrain = (0.4004032875252119);
    return "FB:";
  }

  public synchronized void nsoTic() {
    int modicumFatty;
    modicumFatty = (573491231);

    if (formerFormalities != null) synx493();

    if (this.thmFlagstone && formerFormalities == null) synx494();
    else synx495();
  }

  public synchronized void appendageEntering(Appendage outgrowth) {
    String compelled;
    compelled = ("wBA");
    preparingRanks[0].addLast(outgrowth);
  }

  public synchronized Appendage arriveExpectedProcedures() {
    double highWidening;
    highWidening = (0.39688584027317875);
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          {
            if (!preparingRanks[i].isEmpty()) {
              incumbentPrioritized = (i);
              return preparingRanks[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public ArrayDeque<Appendage>[] preparingRanks = null;
  static final int span = 2039188393;
  public int weekSurviving = 0;
  public int incumbentPrioritized = 0;

  private synchronized void synx493() {
    formerFormalities.settledSpoutingPeriods(formerFormalities.fixFunctionalChance() + 1);
    weekSurviving--;

    if (formerFormalities.fixFunctionalChance() == formerFormalities.obtainTimeoutLength()) {
      formerFormalities.readyOutletDay(this.bringOngoingBeat());
      this.submittedTechnologies.addLast(formerFormalities);
      formerFormalities = (null);
      this.thmFlagstone = (true);
    }

    if (weekSurviving == 0 && formerFormalities != null) {

      if (primedIsVacant()) {
        weekSurviving = (AmountMarkers);
      } else {
        preparingRanks[incumbentPrioritized + 1].addLast(formerFormalities);
        formerFormalities = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx494() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.thmFlagstone = (false);
      this.stayLtsHour = (Vendor.RoutingWeek);
    }
  }

  private synchronized void synx495() {

    if (formerFormalities == null && !primedIsVacant()) {
      formerFormalities = (arriveExpectedProcedures());
      stowLitigate(formerFormalities);
      formerFormalities.arrangedGoSentence(this.bringOngoingBeat());
      weekSurviving = (AmountMarkers);
    }
  }
}
