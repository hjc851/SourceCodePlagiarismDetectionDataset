package Planner.Required;

import Forwarder.Salesperson;
import Controller.Parser;
import Controller.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends Controller.Parser {
  public java.util.Comparator<Cycle> comparable;
  public java.util.PriorityQueue<Cycle> fitBacklog;
  static double lowlyBoundary = 0.33372967718458435;

  public MinimumController() {
    this.comparable = (new ProceedingCrosswalk());
    this.fitBacklog = (new java.util.PriorityQueue<>(5, comparable));
  }

  public class ProceedingCrosswalk implements Comparator<Cycle> {

    public synchronized int compare(Cycle c, Cycle p4) {
      String marquez;
      int flSurviving;
      int p3Unexpended;
      marquez = ("x4Ym8avg207PNmYXsB");
      flSurviving = (c.takeExecutionsDiameter() - c.becomeContinualOpportunity());
      p3Unexpended = (p4.takeExecutionsDiameter() - p4.becomeContinualOpportunity());

      if (flSurviving < p3Unexpended) {
        return -1;
      }

      if (flSurviving > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String organizerList() {
    String isterWidening;
    isterWidening = ("ypvYBTBz9em3MC6j2I");
    return "SRT:";
  }

  public synchronized void weapMark() {
    double indentured;
    indentured = (0.13087099859994689);

    if (latestOperation != null) synx8();

    if (!fitBacklog.isEmpty() && latestOperation != null) synx9();

    if (this.variWaving && latestOperation == null) synx10();
    else synx11();
  }

  public synchronized void formalitiesImpending(Cycle cycle) {
    double kesThings;
    kesThings = (0.8922236965205332);
    fitBacklog.add(cycle);
  }

  private synchronized void synx8() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + 1);

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx9() {
    int liveRemainder;
    int seeFinal;
    liveRemainder =
        (latestOperation.takeExecutionsDiameter() - latestOperation.becomeContinualOpportunity());
    seeFinal =
        (fitBacklog.peek().takeExecutionsDiameter()
            - fitBacklog.peek().becomeContinualOpportunity());

    if (seeFinal < liveRemainder) {
      fitBacklog.add(latestOperation);
      latestOperation = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx10() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.variWaving = (false);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx11() {

    if (latestOperation == null && !fitBacklog.isEmpty()) {
      latestOperation = (fitBacklog.poll());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
    }
  }

  private synchronized void synx12(int i) {
    cookFiles[i] = (new java.util.ArrayDeque<>());
  }
}
