package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {
  private static final int synX1885int = 0;
  private static final String synX1884String = " was not found";
  private static final String synX1883String = "Object ";
  private static final int synX1882int = 0;

  public synchronized void injectingDying(T stats) {
    this.incorporateOnceCore(stats, this.keeper);
  }

  public synchronized T takeBeginning() {
    Core<T> goal;
    goal = this.keeper.goFuture();
    this.keeper.arrangeNow(goal.goFuture());
    goal.goFuture().placedLast(this.keeper);

    if (this.matter > synX1882int) this.matter--;

    this.dodAct++;
    return goal.takeFiles();
  }

  public synchronized Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  public synchronized T premierOppose() {
    return this.keeper.goFuture().takeFiles();
  }

  public synchronized void installPreclude(T readings) {
    SelectionInitialisation bool;
    bool = new SelectionInitialisation();

    while (bool.hasNext()) {

      if (bool.next() == readings) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1883String + readings + synX1884String);
  }

  public synchronized int get() {
    return this.matter;
  }

  private final Core<T> keeper;
  private int dodAct = 0;
  private int matter = 0;

  public synchronized boolean isEmpty() {
    return (this.keeper.goFuture() == this.keeper);
  }

  public synchronized T disposeNet() {
    Core<T> objectives;
    objectives = this.keeper.fetchInitial();
    this.keeper.placedLast(objectives.fetchInitial());
    objectives.fetchInitial().arrangeNow(this.keeper);

    if (this.matter > synX1885int) this.matter--;

    this.dodAct++;
    return objectives.takeFiles();
  }

  private synchronized void incorporateOnceCore(T intelligence, Core<T> place) {
    Core<T> unprecedentedNub;
    unprecedentedNub = new Core<T>(intelligence, place, place.fetchInitial());
    place.fetchInitial().arrangeNow(unprecedentedNub);
    place.placedLast(unprecedentedNub);
    this.matter++;
    this.dodAct++;
  }

  private class SelectionInitialisation implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Core<T> aiming;

      if (this.boldlyCaseload != GlobularCorrelatedBlacklist.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.followingSeemsHasTitled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.followingSeemsHasTitled = false;
      aiming = this.underway;
      this.underway = this.underway.fetchInitial();
      this.underway.arrangeNow(aiming.goFuture());
      aiming.goFuture().placedLast(this.underway);
      this.boldlyCaseload++;
      GlobularCorrelatedBlacklist.this.dodAct++;
      GlobularCorrelatedBlacklist.this.matter--;
    }

    private boolean followingSeemsHasTitled = false;
    private Core<T> underway = null;

    public synchronized boolean hasNext() {
      return (this.underway.goFuture() != GlobularCorrelatedBlacklist.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != GlobularCorrelatedBlacklist.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements");

      this.followingSeemsHasTitled = true;
      this.underway = this.underway.goFuture();
      return this.underway.takeFiles();
    }

    private int boldlyCaseload = 0;

    public SelectionInitialisation() {
      this.underway = GlobularCorrelatedBlacklist.this.keeper;
      this.boldlyCaseload = GlobularCorrelatedBlacklist.this.dodAct;
      this.followingSeemsHasTitled = false;
    }
  }

  public synchronized T penultimateObjection() {
    return this.keeper.fetchInitial().takeFiles();
  }

  public synchronized void tuckLaterObjective(T findings, T aim) throws ArrayStoreException {
    SelectionInitialisation fad;
    fad = new SelectionInitialisation();

    while (fad.hasNext()) {

      if (fad.next() == aim) {
        this.injectingUntilNoose(findings, fad.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aim + " is not in the list");
  }

  public synchronized String toString() {
    StringBuffer soften;
    SelectionInitialisation struct;
    int i;
    soften = new StringBuffer(this.hashCode() + " {\n");
    struct = new SelectionInitialisation();
    i = 0;

    while (struct.hasNext()) synx142(soften, i, struct);
    soften.append("}\n");
    return soften.toString();
  }

  public GlobularCorrelatedBlacklist() {
    this.keeper = new Core<T>(null, null, null);
    this.keeper.arrangeNow(this.keeper);
    this.keeper.placedLast(this.keeper);
    this.matter = 0;
    this.dodAct = 0;
  }

  private synchronized void injectingUntilNoose(T indicators, Core<T> butt) {
    Core<T> freshlyGanglion;
    freshlyGanglion = new Core<T>(indicators, butt.goFuture(), butt);
    butt.goFuture().placedLast(freshlyGanglion);
    butt.arrangeNow(freshlyGanglion);
    this.matter++;
    this.dodAct++;
  }

  public synchronized void injectedLateMatter(T databases, T direct) throws ArrayStoreException {
    SelectionInitialisation about;
    about = new SelectionInitialisation();

    while (about.hasNext()) {

      if (about.next() == direct) {
        this.incorporateOnceCore(databases, about.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + direct + " is not in the list");
  }

  public synchronized void encloseInitial(T reports) {
    this.injectingUntilNoose(reports, this.keeper);
  }

  private synchronized void synx142(StringBuffer soften, int i, SelectionInitialisation struct) {
    soften.append("[" + i + "]\t" + struct.next() + "\n");
    i++;
  }
}
