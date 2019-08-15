package Debugging.Submissions;

import Forwarder.Shipper;
import Server.Database;
import Server.Mechanisms;
import java.util.ArrayDeque;

public class ApDeveloper extends Server.Database {
  private int topicalPrioritize = 0;
  private int minutesLatter = 0;
  private ArrayDeque<Mechanisms>[] primedRows = null;

  public ApDeveloper() {
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
    minutesLatter = WeekVolume;
    topicalPrioritize = 0;
  }

  private synchronized Server.Mechanisms haveFirstServe() {
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              topicalPrioritize = i;
              return primedRows[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
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

  public synchronized String databaseNickname() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (continuingMechanisms != null) {
      continuingMechanisms.markStreamingHours(continuingMechanisms.makeFlyingDay() + 1);
      minutesLatter--;

      if (continuingMechanisms.makeFlyingDay() == continuingMechanisms.fixCfoProportions()) {
        continuingMechanisms.arrangeEgressYears(this.takeTopicalMark());
        this.submittedTechnologies.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.allanBanner = true;
      }

      if (minutesLatter == 0 && continuingMechanisms != null) {

        if (primedIsVacant()) {
          minutesLatter = WeekVolume;
        } else {
          primedRows[topicalPrioritize + 1].addLast(continuingMechanisms);
          continuingMechanisms = null;
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

      if (continuingMechanisms == null && !primedIsVacant()) {
        continuingMechanisms = haveFirstServe();
        incumbranceSystem(continuingMechanisms);
        continuingMechanisms.dictatedCommenceMeter(this.takeTopicalMark());
        minutesLatter = WeekVolume;
      }
    }
  }

  public synchronized void methodsElected(Mechanisms formalities) {
    primedRows[0].addLast(formalities);
  }
}
