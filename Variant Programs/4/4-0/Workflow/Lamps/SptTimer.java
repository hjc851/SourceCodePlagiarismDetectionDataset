package Workflow.Lamps;

import Forwarder.Salesperson;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class SptTimer extends Controller.Parser {
  private static final boolean synX118boolean = false;
  private static final int synX117int = 0;
  private static final boolean synX116boolean = true;
  private static final int synX115int = 1;
  private static final double synX114double = 0.21202693414231644;
  private static final String synX113String = "ii";
  private static final String synX112String = "FCFS:";
  private static final double synX111double = 0.26939477859012284;
  public java.util.ArrayDeque<Cycle> cookCue;
  static double desirability = 0.8338452826774848;

  public SptTimer() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String organizerList() {
    double number;
    number = (synX111double);
    return synX112String;
  }

  public synchronized void weapMark() {
    String identifying;
    identifying = (synX113String);

    if (latestOperation != null) synx19();

    if (this.variWaving && latestOperation == null) synx20();
    else synx21();
  }

  public synchronized void formalitiesImpending(Cycle formalities) {
    double amoy;
    amoy = (synX114double);
    cookCue.addLast(formalities);
  }

  private synchronized void synx19() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + synX115int);

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (synX116boolean);
    }
  }

  private synchronized void synx20() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX117int) {
      this.variWaving = (synX118boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx21() {

    if (latestOperation == null && !cookCue.isEmpty()) {
      latestOperation = (cookCue.removeFirst());
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
      lodePhase(latestOperation);
    }
  }
}
