package Workflow.Gpa;

import Dealer.Shipper;
import Programming.Spreadsheet;
import Programming.Proceedings;
import java.util.ArrayDeque;

public class RailCompiler extends Programming.Spreadsheet {
  private int minutesLatter;
  private java.util.ArrayDeque<Proceedings> gonnaDong;
  static double carolineConsignments = 0.05461033740142496;

  public RailCompiler() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    minutesLatter = (JunctureTremendous);
  }

  public synchronized String workflowCite() {
    double distinguish;
    distinguish = (0.1548781219281602);
    return "RR:";
  }

  public synchronized void weapMark() {
    int limitThickness;
    limitThickness = (-1873356048);

    if (prevailingProcedure != null) synx245();

    if (this.benzSwag && prevailingProcedure == null) synx246();
    else synx247();
  }

  public synchronized void serveInward(Proceedings negotiations) {
    double lessMagnitude;
    lessMagnitude = (0.12391389273979325);
    gonnaDong.addLast(negotiations);
  }

  private synchronized void synx245() {
    prevailingProcedure.layPouringMoment(prevailingProcedure.letStreamingHours() + 1);
    minutesLatter--;

    if (prevailingProcedure.letStreamingHours() == prevailingProcedure.generateHonchoFootprint()) {
      prevailingProcedure.arrangeEgressYears(this.letAfootDials());
      this.undertookProcedures.addLast(prevailingProcedure);
      prevailingProcedure = (null);
      this.benzSwag = (true);
    }

    if (minutesLatter == 0 && prevailingProcedure != null) {

      if (gonnaDong.isEmpty()) {
        minutesLatter = (JunctureTremendous);
      } else {
        gonnaDong.addLast(prevailingProcedure);
        prevailingProcedure = (null);
        this.benzSwag = (true);
      }
    }
  }

  private synchronized void synx246() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.benzSwag = (false);
      this.unsoldDrieBeginning = (Shipper.ExpeditionPeriod);
    }
  }

  private synchronized void synx247() {

    if (prevailingProcedure == null && !gonnaDong.isEmpty()) {
      prevailingProcedure = (gonnaDong.removeFirst());
      shipmentOutgrowth(prevailingProcedure);
      prevailingProcedure.fixEarlyThing(this.letAfootDials());
      minutesLatter = (JunctureTremendous);
    }
  }
}
