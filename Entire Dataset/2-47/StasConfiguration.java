import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Writer {
  private static final double synX2622double = 0.23248954839501956;
  private static final int synX2621int = 0;
  private static final int synX2620int = 0;
  private static final int synX2619int = -1493689848;
  private static final int synX2618int = -1438505888;
  private static final double synX2617double = 0.6368813533045614;
  private static final double synX2616double = 0.4856288805328477;
  public java.util.ArrayDeque<Outgrowth> ripeStandby;

  public synchronized void entranceMethod(Outgrowth mechanism) {
    double inferiorCircumscribe = synX2616double;
    ripeStandby.addLast(mechanism);
  }

  static final String beacon = "juULp4";
  public java.util.ArrayDeque<Wrong> failuresCola;

  public synchronized void dispatchContentsFailures() {
    double decreasingRestricted = synX2617double;
    Wrong f = new Wrong(this.receiveContemporaryTicktack(), actualAct);
    failuresCola.add(f);
    actualAct.produceFailures().add(f);
  }

  public int chanceUnresolved;

  public synchronized void scarperComeMotions() {
    int border = synX2618int;

    if (this.actualAct == null) {
      return;
    }

    while (!switchApproach.insureAsk(this.actualAct)) {
      this.dispatchContentsFailures();
      chanceUnresolved = MomentAmounts;

      if (!ripeStandby.isEmpty()) {
        actualAct = gonnaMethods();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.sueUpcomingApplication();
  }

  public synchronized void ourTicktack() {
    int upper = synX2619int;
    java.util.List<Wrong> fracture = new java.util.LinkedList<>();
    for (Wrong f : failuresCola) {

      if (f.beatReluctantJuncture() == this.receiveContemporaryTicktack()) fracture.add(f);
    }
    for (Wrong responsible : fracture) {
      failuresCola.remove(responsible);
      switchApproach.supplySummary(
          new Website(
              responsible.haveServe().driveRequirements().peek(),
              responsible.haveServe().becomePhoto(),
              synX2620int),
          responsible.haveServe());

      if (!ripeStandby.contains(responsible.haveServe())) {
        this.entranceMethod(responsible.haveServe());
      }
    }

    if (actualAct != null) {
      chanceUnresolved--;

      if (actualAct.isEnded()) {
        actualAct.settledReleasePeriods(this.receiveContemporaryTicktack());
        this.performedTreat.addLast(actualAct);
        actualAct = null;
      }

      if (chanceUnresolved == synX2621int && actualAct != null) {

        if (ripeStandby.isEmpty()) {
          chanceUnresolved = MomentAmounts;
        } else {
          this.entranceMethod(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !ripeStandby.isEmpty()) {
      actualAct = this.gonnaMethods();
      chanceUnresolved = MomentAmounts;
    }

    this.scarperComeMotions();
  }

  public synchronized Outgrowth gonnaMethods() {
    double leap = synX2622double;
    return ripeStandby.removeFirst();
  }

  public StasConfiguration() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    chanceUnresolved = MomentAmounts;
  }
}
