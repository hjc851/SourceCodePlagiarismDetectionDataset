package Interface.Reactions;

import Exporter.Limiter;
import Workspace.Debugging;
import Workspace.Formalities;
import java.util.ArrayDeque;

public class DcSpreadsheet extends Debugging {
  private static final int synX1306int = 0;
  private static final int synX1305int = 0;
  private static final int synX1304int = 6;
  private static final String synX1303String = "FB:";
  private static final String synX1302String = "1RJpRuCNsHU1";
  private static final int synX1301int = 0;
  private static final double synX1300double = 0.5744653513167741;
  private static final int synX1299int = 0;
  private static final double synX1298double = 4.669866057251948E-4;
  private static final boolean synX1297boolean = true;
  private static final boolean synX1296boolean = false;
  private static final int synX1295int = 0;
  private static final double synX1294double = 0.5685989597680878;
  private static final boolean synX1293boolean = false;
  private static final int synX1292int = 0;
  private static final boolean synX1291boolean = true;
  private static final int synX1290int = 1;
  private static final int synX1289int = 0;
  private static final boolean synX1288boolean = true;
  private static final int synX1287int = 1;
  private static final double synX1286double = 0.7105044381162923;
  private int liveParamount = 0;

  public synchronized void bpsRetick() {
    double consider;
    consider = synX1286double;

    if (liveOutgrowth != null) {
      liveOutgrowth.layPouringMoment(liveOutgrowth.conveyWalkingAmount() + synX1287int);
      sentenceUnexpended--;

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.arrivePrezWingspan()) {
        liveOutgrowth.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.carriedMechanism.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = synX1288boolean;
      }

      if (sentenceUnexpended == synX1289int && liveOutgrowth != null) {

        if (primedIsVacant()) {
          sentenceUnexpended = OpportunityDramatic;
        } else {
          preppedDelays[liveParamount + synX1290int].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.allanBanner = synX1291boolean;
        }
      }
    }

    if (this.allanBanner && liveOutgrowth == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1292int) {
        this.allanBanner = synX1293boolean;
        this.leavingBrinWhen = Limiter.RemoveDay;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = takeLaterAppendage();
        consignmentTreat(liveOutgrowth);
        liveOutgrowth.adjustPartMonth(this.receiveContemporaryTicktack());
        sentenceUnexpended = OpportunityDramatic;
      }
    }
  }

  private synchronized boolean primedIsVacant() {
    double secondRestricted;
    secondRestricted = synX1294double;
    {
      int i = synX1295int;

      while (i < preppedDelays.length) {
        {
          {
            if (!preppedDelays[i].isEmpty()) {
              return synX1296boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1297boolean;
  }

  private synchronized Formalities takeLaterAppendage() {
    double frownThrottle;
    frownThrottle = synX1298double;
    {
      int i = synX1299int;

      while (i < preppedDelays.length) {
        {
          {
            if (!preppedDelays[i].isEmpty()) {
              liveParamount = i;
              return preppedDelays[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public static final double compelled = 0.593257106497161;

  public synchronized void marchFuture(Formalities phase) {
    double momentsEdge;
    momentsEdge = synX1300double;
    preppedDelays[synX1301int].addLast(phase);
  }

  private int sentenceUnexpended = 0;

  public synchronized String parserFigure() {
    String minimum;
    minimum = synX1302String;
    return synX1303String;
  }

  public DcSpreadsheet() {
    this.preppedDelays = new ArrayDeque[synX1304int];
    {
      int i = synX1305int;

      while (i < preppedDelays.length) {
        {
          {
            preppedDelays[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    sentenceUnexpended = OpportunityDramatic;
    liveParamount = synX1306int;
  }

  private ArrayDeque<Formalities>[] preppedDelays = null;
}
