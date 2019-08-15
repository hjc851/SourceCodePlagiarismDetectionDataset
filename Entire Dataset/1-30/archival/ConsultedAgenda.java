package archival;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX2185String = " was not found";
  private static final String synX2184String = "Object ";
  private static final int synX2183int = 0;
  private static final int synX2182int = 0;
  private static final String synX2181String = "}\n";
  private static final int synX2180int = 0;
  private static final String synX2179String = " {\n";

  public synchronized String toString() {
    java.lang.StringBuffer mitigate;
    ClassedBool parser;
    int i;
    mitigate = new java.lang.StringBuffer(this.hashCode() + synX2179String);
    parser = new ClassedBool();
    i = synX2180int;

    while (parser.hasNext()) synx159(mitigate, i, parser);
    mitigate.append(synX2181String);
    return mitigate.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ClassedBool();
  }

  public synchronized T banishPrime() {
    archival.Nub<T> thermometer;
    thermometer = this.keeper.fetchThird();
    this.keeper.readyAdjacent(thermometer.fetchThird());
    thermometer.fetchThird().arrangeAgo(this.keeper);

    if (this.enumerate > synX2182int) this.enumerate--;

    this.pentagonReckon++;
    return thermometer.obtainMeasurements();
  }

  public synchronized void eliminateMeasuredSubject(T figures) throws ArrayStoreException {
    ClassedBool integer;
    integer = new ClassedBool();

    while (integer.hasNext()) {

      if (figures.compareTo(integer.next()) == synX2183int) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2184String + figures + synX2185String);
  }

  private int pentagonReckon;

  public synchronized boolean isVacant() {
    return (this.keeper.fetchThird() == this.keeper);
  }

  private class ClassedBool implements Iterator<T> {
    private archival.Nub<T> prevalent;

    public synchronized void remove() {
      archival.Nub<T> aim;

      if (this.stylishTally != archival.ConsultedAgenda.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      aim = this.prevalent;
      this.prevalent = this.prevalent.obtainPremature();
      this.prevalent.readyAdjacent(aim.fetchThird());
      aim.fetchThird().arrangeAgo(this.prevalent);
      this.stylishTally++;
      archival.ConsultedAgenda.this.pentagonReckon++;
      archival.ConsultedAgenda.this.enumerate--;
    }

    private int stylishTally;

    public ClassedBool() {
      this.prevalent = archival.ConsultedAgenda.this.keeper;
      this.stylishTally = archival.ConsultedAgenda.this.pentagonReckon;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != archival.ConsultedAgenda.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archival.ConsultedAgenda.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.prevalent = this.prevalent.fetchThird();
      return this.prevalent.obtainMeasurements();
    }

    public synchronized boolean hasNext() {
      return (this.prevalent.fetchThird() != archival.ConsultedAgenda.this.keeper);
    }

    private boolean firstNeedsBegunNicknamed;
  }

  public synchronized T seniorPreclude() {
    return this.keeper.obtainPremature().obtainMeasurements();
  }

  private int enumerate;

  public synchronized int calculate() {
    return this.enumerate;
  }

  public synchronized T kickoffItems() {
    return this.keeper.fetchThird().obtainMeasurements();
  }

  public synchronized void tuck(T indicators) {
    ClassedBool uniterable;
    archival.Nub<T> freshlyGanglion;
    uniterable = new ClassedBool();

    while (uniterable.hasNext()) {

      if (indicators.compareTo(uniterable.next()) >= 0) {
        break;
      }

      if (uniterable.prevalent.fetchThird() == this.keeper) {
        archival.Nub<T> revolutionaryGanglia;
        revolutionaryGanglia =
            new archival.Nub<T>(indicators, this.keeper, this.keeper.obtainPremature());
        this.keeper.obtainPremature().readyAdjacent(revolutionaryGanglia);
        this.keeper.arrangeAgo(revolutionaryGanglia);
        this.enumerate++;
        this.pentagonReckon++;
        return;
      }
    }
    freshlyGanglion =
        new archival.Nub<T>(
            indicators, uniterable.prevalent, uniterable.prevalent.obtainPremature());
    uniterable.prevalent.obtainPremature().readyAdjacent(freshlyGanglion);
    uniterable.prevalent.arrangeAgo(freshlyGanglion);
    this.enumerate++;
    this.pentagonReckon++;
  }

  public ConsultedAgenda() {
    this.keeper = new archival.Nub<T>(null, null, null);
    this.keeper.readyAdjacent(keeper);
    this.keeper.arrangeAgo(keeper);
    this.enumerate = 0;
    this.pentagonReckon = 0;
  }

  public synchronized void ejectMatter(T readings) throws ArrayStoreException {
    ClassedBool operand;
    operand = new ClassedBool();

    while (operand.hasNext()) {

      if (operand.next() == readings) {
        operand.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized T dislodgeFinish() {
    archival.Nub<T> mark;
    mark = this.keeper.obtainPremature();
    this.keeper.arrangeAgo(mark.obtainPremature());
    mark.obtainPremature().readyAdjacent(this.keeper);

    if (this.enumerate > 0) this.enumerate--;

    this.pentagonReckon++;
    return mark.obtainMeasurements();
  }

  private final archival.Nub<T> keeper;

  private synchronized void synx159(StringBuffer mitigate, int i, ClassedBool parser) {
    mitigate.append("[" + i + "]\t" + parser.next() + "\n");
    i++;
  }
}
