package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private static final String synX1512String = "}\n";
  private static final String synX1511String = "\n";
  private static final String synX1510String = "]\t";
  private static final String synX1509String = "[";
  private static final int synX1508int = 0;
  private static final String synX1507String = " {\n";
  private static final String synX1506String = " is not in the list";
  private static final String synX1505String = "Target ";
  private final Hub<T> guerite;

  public synchronized void putConclusion(T estimates) {
    this.pasteSoonerNub(estimates, this.guerite);
  }

  private synchronized void injectingUntilNoose(T databases, Hub<T> priority) {
    Hub<T> untriedHub;
    untriedHub = (new Hub<T>(databases, priority.drawSoon(), priority));
    priority.drawSoon().placedLast(untriedHub);
    priority.orderedAgain(untriedHub);
    this.numbers++;
    this.modeEnumerate++;
  }

  public synchronized void tuckLaterObjective(T results, T focussed) throws ArrayStoreException {
    RegistryBattologize abysm;
    abysm = (new RegistryBattologize());

    while (abysm.hasNext()) {

      if (abysm.next() == focussed) {
        this.injectingUntilNoose(results, abysm.prevailing);
        return;
      }
    }
    throw new ArrayStoreException((synX1505String + focussed + synX1506String));
  }

  public synchronized String toString() {
    StringBuffer fender;
    RegistryBattologize subroutine;
    int i;
    fender = (new StringBuffer(this.hashCode() + synX1507String));
    subroutine = (new RegistryBattologize());
    i = (synX1508int);

    while (subroutine.hasNext()) {
      fender.append((synX1509String + i + synX1510String + subroutine.next() + synX1511String));
      i++;
    }
    fender.append(synX1512String);
    return fender.toString();
  }

  private class RegistryBattologize implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Hub<T> benchmark;

      if (this.iloBit != BroadsheetRelationRosters.this.modeEnumerate)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.adjacentPossessesPastDescribed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = (false);
      benchmark = (this.prevailing);
      this.prevailing = (this.prevailing.havePervious());
      this.prevailing.orderedAgain(benchmark.drawSoon());
      benchmark.drawSoon().placedLast(this.prevailing);
      this.iloBit++;
      BroadsheetRelationRosters.this.modeEnumerate++;
      BroadsheetRelationRosters.this.numbers--;
    }

    private int iloBit = 0;

    public synchronized boolean hasNext() {
      return (this.prevailing.drawSoon() != BroadsheetRelationRosters.this.guerite);
    }

    public RegistryBattologize() {
      this.prevailing = (BroadsheetRelationRosters.this.guerite);
      this.iloBit = (BroadsheetRelationRosters.this.modeEnumerate);
      this.adjacentPossessesPastDescribed = (false);
    }

    private boolean adjacentPossessesPastDescribed = false;
    private Hub<T> prevailing = null;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != BroadsheetRelationRosters.this.modeEnumerate)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements"));

      this.adjacentPossessesPastDescribed = (true);
      this.prevailing = (this.prevailing.drawSoon());
      return this.prevailing.makeIndicators();
    }
  }

  private synchronized void pasteSoonerNub(T tabulations, Hub<T> achieve) {
    Hub<T> originalAntenna;
    originalAntenna = (new Hub<T>(tabulations, achieve, achieve.havePervious()));
    achieve.havePervious().orderedAgain(originalAntenna);
    achieve.placedLast(originalAntenna);
    this.numbers++;
    this.modeEnumerate++;
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.drawSoon() == this.guerite);
  }

  public synchronized T disposeNet() {
    Hub<T> point;
    point = (this.guerite.havePervious());
    this.guerite.placedLast(point.havePervious());
    point.havePervious().orderedAgain(this.guerite);

    if (this.numbers > 0) this.numbers--;

    this.modeEnumerate++;
    return point.makeIndicators();
  }

  private int numbers = 0;

  public BroadsheetRelationRosters() {
    this.guerite = (new Hub<T>(null, null, null));
    this.guerite.orderedAgain(this.guerite);
    this.guerite.placedLast(this.guerite);
    this.numbers = (0);
    this.modeEnumerate = (0);
  }

  public synchronized int reckoning() {
    return this.numbers;
  }

  public synchronized T seniorPreclude() {
    return this.guerite.havePervious().makeIndicators();
  }

  public synchronized void tuckEarlierObjective(T statistical, T aiming)
      throws ArrayStoreException {
    RegistryBattologize ace;
    ace = (new RegistryBattologize());

    while (ace.hasNext()) {

      if (ace.next() == aiming) {
        this.pasteSoonerNub(statistical, ace.prevailing);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + aiming + " is not in the list"));
  }

  public synchronized void transferTarget(T information) {
    RegistryBattologize struct;
    struct = (new RegistryBattologize());

    while (struct.hasNext()) {

      if (struct.next() == information) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + information + " was not found"));
  }

  public synchronized void embedOutset(T study) {
    this.injectingUntilNoose(study, this.guerite);
  }

  public synchronized Iterator<T> iterator() {
    return new RegistryBattologize();
  }

  public synchronized T undoBasic() {
    Hub<T> prey;
    prey = (this.guerite.drawSoon());
    this.guerite.orderedAgain(prey.drawSoon());
    prey.drawSoon().placedLast(this.guerite);

    if (this.numbers > 0) this.numbers--;

    this.modeEnumerate++;
    return prey.makeIndicators();
  }

  private int modeEnumerate = 0;

  public synchronized T forwardVictim() {
    return this.guerite.drawSoon().makeIndicators();
  }
}
