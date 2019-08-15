package Spooler.Evaluation;

import Device.Regulator;
import Developer.Planner;
import Developer.Proceedings;
import java.util.ArrayDeque;

public class ComSynchronization extends Planner {
  public static final double carolineConsignments = 0.6712909815106759;
  private ArrayDeque<Proceedings>[] preparedLines;
  private int thingLingering;
  private int latestAntecedence;

  public ComSynchronization() {
    this.preparedLines = new ArrayDeque[6];
    {
      int i = 0;

      while (i < preparedLines.length) {
        {
          synx372(i);
        }
        i++;
      }
    }
    thingLingering = HoursHuge;
    latestAntecedence = 0;
  }

  private synchronized Proceedings conveyComeFormalities() {
    double occasion = 0.4198035687274366;
    {
      int i = 0;

      while (i < preparedLines.length) {
        {
          {
            if (!preparedLines[i].isEmpty()) {
              latestAntecedence = i;
              return preparedLines[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double tabulation = 0.4866581641765192;
    {
      int i = 0;

      while (i < preparedLines.length) {
        {
          {
            if (!preparedLines[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String serverDiagnose() {
    String depth = "CwxQsbUkp7OaGqteYu";
    return "FB:";
  }

  public synchronized void weapMark() {
    double thick = 0.6681608635171636;

    if (presentlyMechanism != null) synx373();

    if (this.allanBanner && presentlyMechanism == null) synx374();
    else synx375();
  }

  public synchronized void proceedingsMortar(Proceedings cycle) {
    double make = 0.21256295909001333;
    preparedLines[0].addLast(cycle);
  }

  private synchronized void synx373() {
    presentlyMechanism.prepareGushingNow(presentlyMechanism.catchJettingWhen() + 1);
    thingLingering--;

    if (presentlyMechanism.catchJettingWhen() == presentlyMechanism.drivePresidentCapacity()) {
      presentlyMechanism.determinedGoingDays(this.receiveContemporaryTicktack());
      this.attainedProces.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.allanBanner = true;
    }

    if (thingLingering == 0 && presentlyMechanism != null) {

      if (primedIsVacant()) {
        thingLingering = HoursHuge;
      } else {
        preparedLines[latestAntecedence + 1].addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx374() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.allanBanner = false;
      this.keepingOrdeAmount = Regulator.RoutingWeek;
    }
  }

  private synchronized void synx375() {

    if (presentlyMechanism == null && !primedIsVacant()) {
      presentlyMechanism = conveyComeFormalities();
      offloadProceedings(presentlyMechanism);
      presentlyMechanism.determineBegunBeginning(this.receiveContemporaryTicktack());
      thingLingering = HoursHuge;
    }
  }
}
