package Server.Diners;

import Exporter.Limiter;
import Workspace.Debugging;
import Workspace.Formalities;
import java.util.ArrayDeque;

public class OximeWorkflow extends Debugging {
  private static final String synX1277String = "RR:";
  private static final double synX1276double = 0.010575110222366901;
  private static final boolean synX1275boolean = false;
  private static final int synX1274int = 0;
  private static final boolean synX1273boolean = true;
  private static final int synX1272int = 0;
  private static final boolean synX1271boolean = true;
  private static final int synX1270int = 1;
  private static final double synX1269double = 0.6063967089750679;
  private static final double synX1268double = 0.9593241072544892;

  public synchronized void marchFuture(Formalities litigate) {
    double maximalLength;
    maximalLength = synX1268double;
    gonnaDong.addLast(litigate);
  }

  public OximeWorkflow() {
    this.gonnaDong = new ArrayDeque<>();
    thingLingering = OpportunityDramatic;
  }

  private int thingLingering = 0;
  private ArrayDeque<Formalities> gonnaDong = null;

  public synchronized void bpsRetick() {
    double modicum;
    modicum = synX1269double;

    if (liveOutgrowth != null) {
      liveOutgrowth.layPouringMoment(liveOutgrowth.conveyWalkingAmount() + synX1270int);
      thingLingering--;

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.arrivePrezWingspan()) {
        liveOutgrowth.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.carriedMechanism.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = synX1271boolean;
      }

      if (thingLingering == synX1272int && liveOutgrowth != null) {

        if (gonnaDong.isEmpty()) {
          thingLingering = OpportunityDramatic;
        } else {
          gonnaDong.addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.allanBanner = synX1273boolean;
        }
      }
    }

    if (this.allanBanner && liveOutgrowth == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1274int) {
        this.allanBanner = synX1275boolean;
        this.leavingBrinWhen = Limiter.RemoveDay;
      }

    } else {

      if (liveOutgrowth == null && !gonnaDong.isEmpty()) {
        liveOutgrowth = gonnaDong.removeFirst();
        consignmentTreat(liveOutgrowth);
        liveOutgrowth.adjustPartMonth(this.receiveContemporaryTicktack());
        thingLingering = OpportunityDramatic;
      }
    }
  }

  public synchronized String parserFigure() {
    double confine;
    confine = synX1276double;
    return synX1277String;
  }

  public static final String inferiorCircumscribe = "cTbHVIXJV";
}
