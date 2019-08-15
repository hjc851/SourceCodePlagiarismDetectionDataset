import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Workspace {
  private static final int synX2232int = 0;
  private static final int synX2231int = 0;
  private static final double synX2230double = 0.6353836387425666;
  private static final int synX2229int = -1598512449;
  private static final double synX2228double = 0.14520066661006426;
  private static final String synX2227String = "5aQo56flaQy";
  private static final int synX2226int = -278652726;
  public int daysRemainder;
  public java.util.ArrayDeque<Operation> primedWaiting;
  public java.util.ArrayDeque<Error> mistakeWait;
  public static String frontRolled = "R8uRycZal";

  public synchronized void mailVarletMistake() {
    int hour;
    Error f;
    hour = (synX2226int);
    f = (new Error(this.goPrevailingClick(), afootSummons));
    mistakeWait.add(f);
    afootSummons.makeFracture().add(f);
  }

  public synchronized void inflowingSummons(Operation system) {
    String handler;
    handler = (synX2227String);
    primedWaiting.addLast(system);
  }

  public synchronized void ourTicktack() {
    double esteem;
    java.util.List<Error> lapses;
    esteem = (synX2228double);
    lapses = (new java.util.LinkedList<>());
    for (Error f : mistakeWait) synx345(f, lapses);
    for (Error demerit : lapses) synx346(demerit);

    if (afootSummons != null) synx347();

    if (afootSummons == null && !primedWaiting.isEmpty()) synx348();

    this.playSucceedingBespeak();
  }

  public synchronized void playSucceedingBespeak() {
    int depressShackled;
    depressShackled = (synX2229int);

    if (this.afootSummons == null) {
      return;
    }

    while (!switchApproach.correspondRequisition(this.afootSummons)) {
      this.mailVarletMistake();
      daysRemainder = (MeterMeasure);

      if (!primedWaiting.isEmpty()) synx349();
      else {
        afootSummons = (null);
        return;
      }
    }
    afootSummons.methodSecondDecision();
  }

  public StaOutliner() {
    this.primedWaiting = (new java.util.ArrayDeque<>());
    this.mistakeWait = (new java.util.ArrayDeque<>());
    daysRemainder = (MeterMeasure);
  }

  public synchronized Operation ripeOutgrowth() {
    double price;
    price = (synX2230double);
    return primedWaiting.removeFirst();
  }

  private synchronized void synx345(Error f, java.util.List<Error> lapses) {

    if (f.drawIntelligentWeek() == this.goPrevailingClick()) lapses.add(f);
  }

  private synchronized void synx346(Error demerit) {
    mistakeWait.remove(demerit);
    switchApproach.augmentPagination(
        new Sheet(
            demerit.produceMethod().driveRequirements().peek(),
            demerit.produceMethod().beatUser(),
            synX2231int),
        demerit.produceMethod());

    if (!primedWaiting.contains(demerit.produceMethod())) {
      this.inflowingSummons(demerit.produceMethod());
    }
  }

  private synchronized void synx347() {
    daysRemainder--;

    if (afootSummons.isEnded()) {
      afootSummons.adjustPerishMonth(this.goPrevailingClick());
      this.undertakenMarch.addLast(afootSummons);
      afootSummons = (null);
    }

    if (daysRemainder == synX2232int && afootSummons != null) {

      if (primedWaiting.isEmpty()) {
        daysRemainder = (MeterMeasure);
      } else {
        this.inflowingSummons(afootSummons);
        afootSummons = (null);
      }
    }
  }

  private synchronized void synx348() {
    afootSummons = (this.ripeOutgrowth());
    daysRemainder = (MeterMeasure);
  }

  private synchronized void synx349() {
    afootSummons = (ripeOutgrowth());
  }
}
