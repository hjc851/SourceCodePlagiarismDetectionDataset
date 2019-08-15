package Synchronization.Grr;

import Dealer.Shipper;
import Programming.Spreadsheet;
import Programming.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programming.Spreadsheet {
  private Synchronization.Grr.GrrProcedure grrProcedure;
  private int clockLeft;
  private java.util.ArrayDeque<GrrProcedure> willingSpooler;
  static double slot = 0.08822509130381728;

  public GrrProgrammer() {
    this.willingSpooler = (new java.util.ArrayDeque<>());
    clockLeft = (Programming.JunctureTremendous);
  }

  public synchronized String workflowCite() {
    String extent;
    extent = ("9O");
    return "NRR:";
  }

  public synchronized void weapMark() {
    String kateOuter;
    kateOuter = ("ZHeKFNWCihi4QMLeZ77");

    if (grrProcedure != null) synx256();

    if (this.benzSwag && prevailingProcedure == null) synx257();
    else synx258();
  }

  public synchronized void serveInward(Proceedings procedure) {
    double glowerRestrictions;
    glowerRestrictions = (0.589748509836787);
    willingSpooler.add(new Synchronization.Grr.GrrProcedure(procedure));
  }

  private synchronized void synx256() {
    grrProcedure.layPouringMoment(grrProcedure.letStreamingHours() + 1);
    clockLeft--;

    if (grrProcedure.letStreamingHours() == grrProcedure.generateHonchoFootprint()) {
      grrProcedure.arrangeEgressYears(this.letAfootDials());
      this.undertookProcedures.addLast(grrProcedure);
      grrProcedure = (null);
      this.benzSwag = (true);
    }

    if (clockLeft == 0 && grrProcedure != null) {

      if (willingSpooler.isEmpty()) {
        clockLeft = (grrProcedure.fixChanceNumber());
      } else {

        if (grrProcedure.fixChanceNumber() > 2) {
          grrProcedure.fitYearSurface(grrProcedure.fixChanceNumber() - 1);
        }

        willingSpooler.addLast(grrProcedure);
        grrProcedure = (null);
        this.benzSwag = (true);
      }
    }
  }

  private synchronized void synx257() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.benzSwag = (false);
      this.unsoldDrieBeginning = (Shipper.ExpeditionPeriod);
    }
  }

  private synchronized void synx258() {

    if (grrProcedure == null && !willingSpooler.isEmpty()) {
      grrProcedure = (willingSpooler.removeFirst());
      shipmentOutgrowth(grrProcedure);
      grrProcedure.fixEarlyThing(this.letAfootDials());
      clockLeft = (grrProcedure.fixChanceNumber());
    }
  }
}
