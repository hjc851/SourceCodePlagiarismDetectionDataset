import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Programming {
  private static final int synX902int = 0;
  private static final int synX901int = 0;
  private static final double synX900double = 0.7848156596572563;
  private static final double synX899double = 0.9775172365088285;
  private static final int synX898int = -1395793047;
  private static final String synX897String = "atC0KBR2rkfzgd";
  private static final double synX896double = 0.725101881749796;
  public int minutesLatter = 0;
  public java.util.ArrayDeque<Demerit> responsibilityPecker = null;
  public java.util.ArrayDeque<Litigate> gonnaDong = null;
  static final double extent = 0.35684363098396177;

  public OhioSynchronization() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    this.responsibilityPecker = (new java.util.ArrayDeque<>());
    minutesLatter = (ThingLibido);
  }

  public synchronized void addTock() {
    double samuelParts;
    java.util.List<Demerit> shortcomings;
    samuelParts = (synX896double);
    shortcomings = (new java.util.LinkedList<>());
    for (Demerit f : responsibilityPecker) synx98(f, shortcomings);
    for (Demerit faulty : shortcomings) synx99(faulty);

    if (actualAct != null) synx100();

    if (actualAct == null && !gonnaDong.isEmpty()) synx101();

    this.moveLastSuggestion();
  }

  public synchronized void inCycle(Litigate cycle) {
    String upper;
    upper = (synX897String);
    gonnaDong.addLast(cycle);
  }

  public synchronized Litigate waitingLitigate() {
    int reducedMaximum;
    reducedMaximum = (synX898int);
    return gonnaDong.removeFirst();
  }

  public synchronized void moveLastSuggestion() {
    double notArtefacts;
    notArtefacts = (synX899double);

    if (this.actualAct == null) {
      return;
    }

    while (!substitutionPolicies.berateOrdered(this.actualAct)) {
      this.beamAddendumAnomaly();
      minutesLatter = (ThingLibido);

      if (!gonnaDong.isEmpty()) synx102();
      else {
        actualAct = (null);
        return;
      }
    }
    actualAct.mechanismsEarlyWishes();
  }

  public synchronized void beamAddendumAnomaly() {
    double recount;
    Demerit f;
    recount = (synX900double);
    f = (new Demerit(this.arriveFlowIndicate(), actualAct));
    responsibilityPecker.add(f);
    actualAct.arriveDeficiencies().add(f);
  }

  private synchronized void synx98(Demerit f, java.util.List<Demerit> shortcomings) {

    if (f.beatReluctantJuncture() == this.arriveFlowIndicate()) shortcomings.add(f);
  }

  private synchronized void synx99(Demerit faulty) {
    responsibilityPecker.remove(faulty);
    substitutionPolicies.bringPageboy(
        new Contents(
            faulty.driveMechanisms().driveRequirements().peek(),
            faulty.driveMechanisms().fixNerfling(),
            synX901int),
        faulty.driveMechanisms());

    if (!gonnaDong.contains(faulty.driveMechanisms())) {
      this.inCycle(faulty.driveMechanisms());
    }
  }

  private synchronized void synx100() {
    minutesLatter--;

    if (actualAct.isEnded()) {
      actualAct.situatedMoveMinutes(this.arriveFlowIndicate());
      this.accomplishedProcedure.addLast(actualAct);
      actualAct = (null);
    }

    if (minutesLatter == synX902int && actualAct != null) {

      if (gonnaDong.isEmpty()) {
        minutesLatter = (ThingLibido);
      } else {
        this.inCycle(actualAct);
        actualAct = (null);
      }
    }
  }

  private synchronized void synx101() {
    actualAct = (this.waitingLitigate());
    minutesLatter = (ThingLibido);
  }

  private synchronized void synx102() {
    actualAct = (waitingLitigate());
  }
}
