package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  public final Nucleus<T> scout;

  public synchronized T beginningObjective() {
    return this.scout.generateComing().takeFiles();
  }

  public synchronized Iterator<T> iterator() {
    return new ScannedInteger();
  }

  public synchronized void incorporated(T figures) {
    ScannedInteger recursion;
    Nucleus<T> revolutionaryGanglia;
    recursion = new ScannedInteger();

    while (recursion.hasNext()) {

      if (figures.compareTo(recursion.next()) >= 0) {
        break;
      }

      if (recursion.presently.generateComing() == this.scout) {
        Nucleus<T> newbornIssue;
        newbornIssue = new Nucleus<T>(figures, this.scout, this.scout.fixRecord());
        this.scout.fixRecord().putFuture(newbornIssue);
        this.scout.settledPervious(newbornIssue);
        this.charge++;
        this.pentagonReckon++;
        return;
      }
    }
    revolutionaryGanglia =
        new Nucleus<T>(figures, recursion.presently, recursion.presently.fixRecord());
    recursion.presently.fixRecord().putFuture(revolutionaryGanglia);
    recursion.presently.settledPervious(revolutionaryGanglia);
    this.charge++;
    this.pentagonReckon++;
  }

  public int pentagonReckon;

  public synchronized boolean isVacant() {
    return (this.scout.generateComing() == this.scout);
  }

  public synchronized String toString() {
    StringBuffer absorb;
    ScannedInteger bool;
    int i;
    absorb = new StringBuffer(this.hashCode() + " {\n");
    bool = new ScannedInteger();
    i = 0;

    while (bool.hasNext()) synx123(absorb, i, bool);
    absorb.append("}\n");
    return absorb.toString();
  }

  public synchronized void absentAim(T readings) throws ArrayStoreException {
    ScannedInteger namespace;
    namespace = new ScannedInteger();

    while (namespace.hasNext()) {

      if (namespace.next() == readings) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int numbers() {
    return this.charge;
  }

  public synchronized T goArgue() {
    return this.scout.fixRecord().takeFiles();
  }

  public OrganizedSelection() {
    this.scout = new Nucleus<T>(null, null, null);
    this.scout.putFuture(scout);
    this.scout.settledPervious(scout);
    this.charge = 0;
    this.pentagonReckon = 0;
  }

  public class ScannedInteger implements Iterator<T> {
    public int daringCensus;

    public synchronized void remove() {
      Nucleus<T> goal;

      if (this.daringCensus != OrganizedSelection.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      goal = this.presently;
      this.presently = this.presently.fixRecord();
      this.presently.putFuture(goal.generateComing());
      goal.generateComing().settledPervious(this.presently);
      this.daringCensus++;
      OrganizedSelection.this.pentagonReckon++;
      OrganizedSelection.this.charge--;
    }

    public boolean nowUnderstandsGotAdvocated;

    public synchronized boolean hasNext() {
      return (this.presently.generateComing() != OrganizedSelection.this.scout);
    }

    public Nucleus<T> presently;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.daringCensus != OrganizedSelection.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.presently = this.presently.generateComing();
      return this.presently.takeFiles();
    }

    public ScannedInteger() {
      this.presently = OrganizedSelection.this.scout;
      this.daringCensus = OrganizedSelection.this.pentagonReckon;
      this.nowUnderstandsGotAdvocated = false;
    }
  }

  public int charge;

  public synchronized T eliminateBest() {
    Nucleus<T> storm;
    storm = this.scout.generateComing();
    this.scout.putFuture(storm.generateComing());
    storm.generateComing().settledPervious(this.scout);

    if (this.charge > 0) this.charge--;

    this.pentagonReckon++;
    return storm.takeFiles();
  }

  public synchronized void installConfrontedPreclude(T measurements) throws ArrayStoreException {
    ScannedInteger instantiation;
    instantiation = new ScannedInteger();

    while (instantiation.hasNext()) {

      if (measurements.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + measurements + " was not found");
  }

  public synchronized T removalFinally() {
    Nucleus<T> objectives;
    objectives = this.scout.fixRecord();
    this.scout.settledPervious(objectives.fixRecord());
    objectives.fixRecord().putFuture(this.scout);

    if (this.charge > 0) this.charge--;

    this.pentagonReckon++;
    return objectives.takeFiles();
  }

  private synchronized void synx123(StringBuffer absorb, int i, ScannedInteger bool) {
    absorb.append("[" + i + "]\t" + bool.next() + "\n");
    i++;
  }
}
