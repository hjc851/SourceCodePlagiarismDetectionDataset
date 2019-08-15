package Spooler.Questionnaire;

import Starter.Distributors;
import Parser.Timer;
import Parser.Method;
import java.util.ArrayDeque;

public class NealOrganizer extends Parser.Timer {
  private static final int synX1157int = 0;
  private static final int synX1156int = -157784846;
  private static final boolean synX1155boolean = false;
  private static final int synX1154int = 0;
  private static final boolean synX1153boolean = true;
  private static final int synX1152int = 1;
  private static final int synX1151int = 0;
  private static final boolean synX1150boolean = true;
  private static final int synX1149int = 1;
  private static final double synX1148double = 0.549565688374555;
  private static final String synX1147String = "FB:";
  private static final double synX1146double = 0.18781689761105103;
  private static final boolean synX1145boolean = true;
  private static final boolean synX1144boolean = false;
  private static final int synX1143int = 0;
  private static final double synX1142double = 0.45104103856548783;
  private static final int synX1141int = 0;
  private static final String synX1140String = "pasaHt";
  static double manSkank = 0.05463228194615355;
  public ArrayDeque<Method>[] wantCongestion;
  public int momentUnexhausted;
  public int newImportant;

  public NealOrganizer() {
    this.wantCongestion = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            wantCongestion[i] = new java.util.ArrayDeque<>();
          }
        }
        i++;
      }
    }
    momentUnexhausted = PeriodsGigantic;
    newImportant = 0;
  }

  public synchronized Parser.Method canNowCycle() {
    String speedRestrain = synX1140String;
    {
      int i = synX1141int;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              newImportant = i;
              return wantCongestion[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double significance = synX1142double;
    {
      int i = synX1143int;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              return synX1144boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1145boolean;
  }

  public synchronized String interfaceCall() {
    double minutes = synX1146double;
    return synX1147String;
  }

  public synchronized void nsoTic() {
    double treasure = synX1148double;

    if (liveOutgrowth != null) {
      liveOutgrowth.primedFunctioningPeriod(liveOutgrowth.arriveFleeingMonth() + synX1149int);
      momentUnexhausted--;

      if (liveOutgrowth.arriveFleeingMonth() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.orderedWithdrawalChance(this.letAfootDials());
        this.accomplishedProcedure.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.whinAdmiral = synX1150boolean;
      }

      if (momentUnexhausted == synX1151int && liveOutgrowth != null) {

        if (primedIsVacant()) {
          momentUnexhausted = PeriodsGigantic;
        } else {
          wantCongestion[newImportant + synX1152int].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.whinAdmiral = synX1153boolean;
        }
      }
    }

    if (this.whinAdmiral && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1154int) {
        this.whinAdmiral = synX1155boolean;
        this.residualFraserOpportunity = Distributors.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = canNowCycle();
        stowLitigate(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.letAfootDials());
        momentUnexhausted = PeriodsGigantic;
      }
    }
  }

  public synchronized void methodEntrance(Method methodology) {
    int premium = synX1156int;
    wantCongestion[synX1157int].addLast(methodology);
  }
}
