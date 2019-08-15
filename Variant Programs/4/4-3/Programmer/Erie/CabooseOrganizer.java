package Programmer.Erie;

import Forwarder.Shipper;
import Server.Database;
import Server.Mechanisms;
import java.util.ArrayDeque;

public class CabooseOrganizer extends Server.Database {
  private int thingLingering = 0;
  private java.util.ArrayDeque<Mechanisms> preppedDragon = null;

  public CabooseOrganizer() {
    this.preppedDragon = new java.util.ArrayDeque<>();
    thingLingering = WeekVolume;
  }

  public synchronized String databaseNickname() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (continuingMechanisms != null) {
      continuingMechanisms.markStreamingHours(continuingMechanisms.makeFlyingDay() + 1);
      thingLingering--;

      if (continuingMechanisms.makeFlyingDay() == continuingMechanisms.fixCfoProportions()) {
        continuingMechanisms.arrangeEgressYears(this.takeTopicalMark());
        this.submittedTechnologies.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.allanBanner = true;
      }

      if (thingLingering == 0 && continuingMechanisms != null) {

        if (preppedDragon.isEmpty()) {
          thingLingering = WeekVolume;
        } else {
          preppedDragon.addLast(continuingMechanisms);
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

      if (continuingMechanisms == null && !preppedDragon.isEmpty()) {
        continuingMechanisms = preppedDragon.removeFirst();
        incumbranceSystem(continuingMechanisms);
        continuingMechanisms.dictatedCommenceMeter(this.takeTopicalMark());
        thingLingering = WeekVolume;
      }
    }
  }

  public synchronized void methodsElected(Mechanisms march) {
    preppedDragon.addLast(march);
  }
}
