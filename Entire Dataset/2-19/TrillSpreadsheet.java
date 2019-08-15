import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Outliner {
  private static final double synX1225double = 0.1012723510869099;
  private static final int synX1224int = 681169324;
  private static final String synX1223String = "Je6V";
  private static final double synX1222double = 0.4572274130433567;
  private static final int synX1221int = 0;
  private static final int synX1220int = 0;
  private static final double synX1219double = 0.35288536062056275;
  public int meterLeftover;
  static final String lourTreated = "6d3kcFw";
  public java.util.ArrayDeque<Wrong> blameWaiting;
  public java.util.ArrayDeque<Work> waitingList;

  public synchronized void nbsClick() {
    double restricts;
    java.util.List<Wrong> deficiencies;
    restricts = synX1219double;
    deficiencies = new java.util.LinkedList<>();
    for (Wrong f : blameWaiting) {

      if (f.bringWillingMeter() == this.obtainLiveTic()) deficiencies.add(f);
    }
    for (Wrong failures : deficiencies) {
      blameWaiting.remove(failures);
      alternatesGie.incorporateFootnote(
          new Layouts(
              failures.arriveProcedures().fixOrders().peek(),
              failures.arriveProcedures().obtainEst(),
              synX1220int),
          failures.arriveProcedures());

      if (!waitingList.contains(failures.arriveProcedures())) {
        this.arriveMechanisms(failures.arriveProcedures());
      }
    }

    if (actualAct != null) {
      meterLeftover--;

      if (actualAct.isEnded()) {
        actualAct.determinedGoingDays(this.obtainLiveTic());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
      }

      if (meterLeftover == synX1221int && actualAct != null) {

        if (waitingList.isEmpty()) {
          meterLeftover = ChanceNumber;
        } else {
          this.arriveMechanisms(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !waitingList.isEmpty()) {
      actualAct = this.prepareAct();
      meterLeftover = ChanceNumber;
    }

    this.raceLaterAsk();
  }

  public synchronized Work prepareAct() {
    double certain;
    certain = synX1222double;
    return waitingList.removeFirst();
  }

  public synchronized void raceLaterAsk() {
    String highestBandwidth;
    highestBandwidth = synX1223String;

    if (this.actualAct == null) {
      return;
    }

    while (!alternatesGie.substantiationInsistence(this.actualAct)) {
      this.beamAddendumAnomaly();
      meterLeftover = ChanceNumber;

      if (!waitingList.isEmpty()) {
        actualAct = prepareAct();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.methodologyAfterInsistence();
  }

  public TrillSpreadsheet() {
    this.waitingList = new java.util.ArrayDeque<>();
    this.blameWaiting = new java.util.ArrayDeque<>();
    meterLeftover = ChanceNumber;
  }

  public synchronized void arriveMechanisms(Work litigate) {
    int reducedLeaping;
    reducedLeaping = synX1224int;
    waitingList.addLast(litigate);
  }

  public synchronized void beamAddendumAnomaly() {
    double appoint;
    Wrong f;
    appoint = synX1225double;
    f = new Wrong(this.obtainLiveTic(), actualAct);
    blameWaiting.add(f);
    actualAct.receiveDefect().add(f);
  }
}
