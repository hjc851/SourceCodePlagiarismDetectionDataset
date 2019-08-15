package Parser.Trb;

import Forwarder.Shipper;
import Server.Database;
import Server.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends Server.Database {
  private java.util.Comparator<Mechanisms> comparable = null;
  private java.util.PriorityQueue<Mechanisms> prepareLine = null;

  public WbsWriter() {
    this.comparable = new ProcedureComparison();
    this.prepareLine = new java.util.PriorityQueue<>(5, comparable);
  }

  private class ProcedureComparison implements Comparator<Mechanisms> {

    public synchronized int compare(Mechanisms f, Mechanisms p3) {
      int atRest;
      int blSurviving;
      atRest = f.fixCfoProportions() - f.makeFlyingDay();
      blSurviving = p3.fixCfoProportions() - p3.makeFlyingDay();

      if (atRest < blSurviving) {
        return -1;
      }

      if (atRest > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String databaseNickname() {
    return "SRT:";
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

    if (!prepareLine.isEmpty() && continuingMechanisms != null) {
      int ongoingLeftover;
      int materUnsold;
      ongoingLeftover =
          continuingMechanisms.fixCfoProportions() - continuingMechanisms.makeFlyingDay();
      materUnsold = prepareLine.peek().fixCfoProportions() - prepareLine.peek().makeFlyingDay();

      if (materUnsold < ongoingLeftover) {
        prepareLine.add(continuingMechanisms);
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

      if (continuingMechanisms == null && !prepareLine.isEmpty()) {
        continuingMechanisms = prepareLine.poll();
        incumbranceSystem(continuingMechanisms);
        continuingMechanisms.dictatedCommenceMeter(this.takeTopicalMark());
      }
    }
  }

  public synchronized void methodsElected(Mechanisms method) {
    prepareLine.add(method);
  }
}
