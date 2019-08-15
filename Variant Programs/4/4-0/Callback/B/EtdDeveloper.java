package Callback.B;

import Forwarder.Salesperson;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class EtdDeveloper extends Controller.Parser {
  private static final boolean synX78boolean = false;
  private static final int synX77int = 0;
  private static final boolean synX76boolean = true;
  private static final int synX75int = 0;
  private static final boolean synX74boolean = true;
  private static final int synX73int = 1;
  private static final double synX72double = 0.25659563443281563;
  private static final int synX71int = -779918512;
  private static final String synX70String = "RR:";
  private static final double synX69double = 0.11388202463766328;
  public int hoursRetaining;
  public java.util.ArrayDeque<Cycle> wantGlue;
  public static final double northernThrottle = 0.6586717264519448;

  public EtdDeveloper() {
    this.wantGlue = (new java.util.ArrayDeque<>());
    hoursRetaining = (PeriodQualitative);
  }

  public synchronized String organizerList() {
    double inferiorCircumscribe;
    inferiorCircumscribe = (synX69double);
    return synX70String;
  }

  public synchronized void weapMark() {
    int list;
    list = (synX71int);

    if (latestOperation != null) synx5();

    if (this.variWaving && latestOperation == null) synx6();
    else synx7();
  }

  public synchronized void formalitiesImpending(Cycle procedures) {
    double less;
    less = (synX72double);
    wantGlue.addLast(procedures);
  }

  private synchronized void synx5() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + synX73int);
    hoursRetaining--;

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (synX74boolean);
    }

    if (hoursRetaining == synX75int && latestOperation != null) {

      if (wantGlue.isEmpty()) {
        hoursRetaining = (PeriodQualitative);
      } else {
        wantGlue.addLast(latestOperation);
        latestOperation = (null);
        this.variWaving = (synX76boolean);
      }
    }
  }

  private synchronized void synx6() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX77int) {
      this.variWaving = (synX78boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx7() {

    if (latestOperation == null && !wantGlue.isEmpty()) {
      latestOperation = (wantGlue.removeFirst());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
      hoursRetaining = (PeriodQualitative);
    }
  }
}
