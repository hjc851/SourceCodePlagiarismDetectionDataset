package Callback.Replies;

import Forwarder.Salesperson;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class IkWorkspace extends Controller.Parser {
  private static final boolean synX96boolean = false;
  private static final int synX95int = 0;
  private static final boolean synX94boolean = true;
  private static final int synX93int = 1;
  private static final int synX92int = 0;
  private static final boolean synX91boolean = true;
  private static final int synX90int = 1;
  private static final int synX89int = 0;
  private static final double synX88double = 0.21775045026242468;
  private static final String synX87String = "";
  private static final String synX86String = "FB:";
  private static final double synX85double = 0.04067378646504061;
  private static final boolean synX84boolean = true;
  private static final boolean synX83boolean = false;
  private static final int synX82int = 0;
  private static final int synX81int = -298228243;
  private static final int synX80int = 0;
  private static final String synX79String = "";
  public int incumbentPrioritized;
  public int beginningUnsold;
  public ArrayDeque<Cycle>[] cookFiles;
  public static final String restriction = "6PxZ43EZdkaG8dj";

  public IkWorkspace() {
    this.cookFiles = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < cookFiles.length; i++) synx12(i);
    beginningUnsold = (PeriodQualitative);
    incumbentPrioritized = (0);
  }

  public synchronized Controller.Cycle goFutureProcedure() {
    String outer;
    outer = (synX79String);

    for (int i = synX80int; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        incumbentPrioritized = (i);
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int significance;
    significance = (synX81int);

    for (int i = synX82int; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return synX83boolean;
      }
    }
    return synX84boolean;
  }

  public synchronized String organizerList() {
    double highDestined;
    highDestined = (synX85double);
    return synX86String;
  }

  public synchronized void weapMark() {
    String minimal;
    minimal = (synX87String);

    if (latestOperation != null) synx13();

    if (this.variWaving && latestOperation == null) synx14();
    else synx15();
  }

  public synchronized void formalitiesImpending(Cycle method) {
    double elevationIndentured;
    elevationIndentured = (synX88double);
    cookFiles[synX89int].addLast(method);
  }

  private synchronized void synx13() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + synX90int);
    beginningUnsold--;

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (synX91boolean);
    }

    if (beginningUnsold == synX92int && latestOperation != null) {

      if (primedIsVacant()) {
        beginningUnsold = (PeriodQualitative);
      } else {
        cookFiles[incumbentPrioritized + synX93int].addLast(latestOperation);
        latestOperation = (null);
        this.variWaving = (synX94boolean);
      }
    }
  }

  private synchronized void synx14() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX95int) {
      this.variWaving = (synX96boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx15() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = (goFutureProcedure());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
      beginningUnsold = (PeriodQualitative);
    }
  }
}
