package Synchronization.Lamps;

import Forwarder.Shipper;
import Server.Database;
import Server.Mechanisms;
import java.util.ArrayDeque;

public class LampsProgrammer extends Server.Database {
  private java.util.ArrayDeque<Mechanisms> preparedWait = null;

  public LampsProgrammer() {
    this.preparedWait = new java.util.ArrayDeque<>();
  }

  public synchronized String databaseNickname() {
    return "FCFS:";
  }

  public synchronized void optiBeat() {

    if (continuingMechanisms != null) {
      continuingMechanisms.markStreamingHours(continuingMechanisms.makeFlyingDay() + 1);

      if (continuingMechanisms.makeFlyingDay() == continuingMechanisms.fixCfoProportions()) {
        continuingMechanisms.arrangeEgressYears(this.takeTopicalMark());
        this.submittedTechnologies.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.allanBanner = true;
      }
    }

    if (this.allanBanner && continuingMechanisms == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.allanBanner = false;
        this.unexhaustedTelaMoment = Shipper.DeployingOpportunity;
      }

    } else {

      if (continuingMechanisms == null && !preparedWait.isEmpty()) {
        continuingMechanisms = preparedWait.removeFirst();
        continuingMechanisms.dictatedCommenceMeter(this.takeTopicalMark());
        incumbranceSystem(continuingMechanisms);
      }
    }
  }

  public synchronized void methodsElected(Mechanisms work) {
    preparedWait.addLast(work);
  }
}
