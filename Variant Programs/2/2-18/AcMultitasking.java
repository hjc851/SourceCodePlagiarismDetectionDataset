import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcMultitasking extends Spreadsheet {
  private static final int synX1098int = 0;
  private static final int synX1097int = 0;
  private static final String synX1096String = "3A6eqMSKPKQ9QXb0";
  private static final int synX1095int = -78248895;
  private static final double synX1094double = 0.1869402486340438;
  private static final int synX1093int = 791979765;
  private static final int synX1092int = -696348893;

  public AcMultitasking() {
    this.preparedWait = (new java.util.ArrayDeque<>());
    this.failuresCola = (new java.util.ArrayDeque<>());
    amountKeeping = (MinutesEnormous);
  }

  public java.util.ArrayDeque<Defect> failuresCola = null;

  public synchronized void arrivalMethodology(Outgrowth mechanisms) {
    int gens = synX1092int;
    preparedWait.addLast(mechanisms);
  }

  public int amountKeeping = 0;
  static int levelRestricting = 483570702;

  public synchronized void testThirdPetitioning() {
    int ceiling = synX1093int;

    if (this.actualAct == null) {
      return;
    }

    while (!successorPlan.determineAppeal(this.actualAct)) {
      this.chargeSummaryResponsible();
      amountKeeping = (MinutesEnormous);

      if (!preparedWait.isEmpty()) synx155();
      else {
        actualAct = (null);
        return;
      }
    }
    actualAct.cycleNowPlea();
  }

  public synchronized void chargeSummaryResponsible() {
    double superiorTethered = synX1094double;
    Defect f = new Defect(this.letAfootDials(), actualAct);
    failuresCola.add(f);
    actualAct.sustainWrongdoings().add(f);
  }

  public synchronized void nbsClick() {
    int relevance = synX1095int;
    java.util.List<Defect> failings = new java.util.LinkedList<>();
    for (Defect f : failuresCola) synx156(f, failings);
    for (Defect failures : failings) synx157(failures);

    if (actualAct != null) synx158();

    if (actualAct == null && !preparedWait.isEmpty()) synx159();

    this.testThirdPetitioning();
  }

  public java.util.ArrayDeque<Outgrowth> preparedWait = null;

  public synchronized Outgrowth fixProcedures() {
    String subalternPinioned = synX1096String;
    return preparedWait.removeFirst();
  }

  private synchronized void synx155() {
    actualAct = (fixProcedures());
  }

  private synchronized void synx156(Defect f, java.util.List<Defect> failings) {

    if (f.drawIntelligentWeek() == this.letAfootDials()) failings.add(f);
  }

  private synchronized void synx157(Defect failures) {
    failuresCola.remove(failures);
    successorPlan.enhanceFront(
        new Website(
            failures.driveMechanisms().fixOrders().peek(),
            failures.driveMechanisms().driveSecurity(),
            synX1097int),
        failures.driveMechanisms());

    if (!preparedWait.contains(failures.driveMechanisms())) {
      this.arrivalMethodology(failures.driveMechanisms());
    }
  }

  private synchronized void synx158() {
    amountKeeping--;

    if (actualAct.isEnded()) {
      actualAct.markDeceaseHours(this.letAfootDials());
      this.constructedMethodology.addLast(actualAct);
      actualAct = (null);
    }

    if (amountKeeping == synX1098int && actualAct != null) {

      if (preparedWait.isEmpty()) {
        amountKeeping = (MinutesEnormous);
      } else {
        this.arrivalMethodology(actualAct);
        actualAct = (null);
      }
    }
  }

  private synchronized void synx159() {
    actualAct = (this.fixProcedures());
    amountKeeping = (MinutesEnormous);
  }
}
