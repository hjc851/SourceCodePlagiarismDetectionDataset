package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {

  public synchronized T absentLate() {
    warehouse.Junction<T> mark = this.guerite.fetchInitial();
    this.guerite.adjustFirst(mark.fetchInitial());
    mark.fetchInitial().doEarly(this.guerite);

    if (this.calculate > 0) this.calculate--;

    this.braveNumerous++;
    return mark.produceSurvey();
  }

  public synchronized String toString() {
    java.lang.StringBuffer fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    DirectoryBool inode = new DirectoryBool();
    int i = 0;

    while (inode.hasNext()) synx34(fender, i, inode);
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized void injectedWakeMatter(T database, T focusing) throws ArrayStoreException {
    DirectoryBool abyss = new DirectoryBool();

    while (abyss.hasNext()) {

      if (abyss.next() == focusing) {
        this.injectPriorJunction(database, abyss.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + focusing + " is not in the list"));
  }

  public synchronized T laterTarget() {
    return this.guerite.fetchInitial().produceSurvey();
  }

  public synchronized void injectPriorJunction(T estimates, warehouse.Junction<T> threshold) {
    warehouse.Junction<T> untriedHub =
        new warehouse.Junction<T>(estimates, threshold.bringClose(), threshold);
    threshold.bringClose().adjustFirst(untriedHub);
    threshold.doEarly(untriedHub);
    this.calculate++;
    this.braveNumerous++;
  }

  public synchronized void infixEnd(T files) {
    this.attachBeforehandHub(files, this.guerite);
  }

  public int calculate;

  public ThrowawayLinkageRegistry() {
    this.guerite = (new warehouse.Junction<T>(null, null, null));
    this.guerite.doEarly(this.guerite);
    this.guerite.adjustFirst(this.guerite);
    this.calculate = (0);
    this.braveNumerous = (0);
  }

  public synchronized int enumeration() {
    return this.calculate;
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.bringClose() == this.guerite);
  }

  public final warehouse.Junction<T> guerite;

  public class DirectoryBool implements Iterator<T> {

    public DirectoryBool() {
      this.actual = (warehouse.ThrowawayLinkageRegistry.this.guerite);
      this.chicFigure = (warehouse.ThrowawayLinkageRegistry.this.braveNumerous);
      this.firstNeedsBegunNicknamed = (false);
    }

    public warehouse.Junction<T> actual;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != warehouse.ThrowawayLinkageRegistry.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List "
                + warehouse.ThrowawayLinkageRegistry.this.hashCode()
                + " has no more elements"));

      this.firstNeedsBegunNicknamed = (true);
      this.actual = (this.actual.bringClose());
      return this.actual.produceSurvey();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.chicFigure != warehouse.ThrowawayLinkageRegistry.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = (false);
      warehouse.Junction<T> prey = this.actual;
      this.actual = (this.actual.fetchInitial());
      this.actual.doEarly(prey.bringClose());
      prey.bringClose().adjustFirst(this.actual);
      this.chicFigure++;
      warehouse.ThrowawayLinkageRegistry.this.braveNumerous++;
      warehouse.ThrowawayLinkageRegistry.this.calculate--;
    }

    public boolean firstNeedsBegunNicknamed;

    public synchronized boolean hasNext() {
      return (this.actual.bringClose() != warehouse.ThrowawayLinkageRegistry.this.guerite);
    }

    public int chicFigure;
  }

  public synchronized void injectingAgoVictim(T evidence, T achieve) throws ArrayStoreException {
    DirectoryBool prove = new DirectoryBool();

    while (prove.hasNext()) {

      if (prove.next() == achieve) {
        this.attachBeforehandHub(evidence, prove.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + achieve + " is not in the list"));
  }

  public synchronized void deleteBody(T readings) {
    DirectoryBool namespace = new DirectoryBool();

    while (namespace.hasNext()) {

      if (namespace.next() == readings) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + readings + " was not found"));
  }

  public synchronized void attachBeforehandHub(T stats, warehouse.Junction<T> aiming) {
    warehouse.Junction<T> earlyHitch =
        new warehouse.Junction<T>(stats, aiming, aiming.fetchInitial());
    aiming.fetchInitial().doEarly(earlyHitch);
    aiming.adjustFirst(earlyHitch);
    this.calculate++;
    this.braveNumerous++;
  }

  public synchronized T bestSubject() {
    return this.guerite.bringClose().produceSurvey();
  }

  public synchronized void injectedEldest(T results) {
    this.injectPriorJunction(results, this.guerite);
  }

  public int braveNumerous;

  public synchronized Iterator<T> iterator() {
    return new DirectoryBool();
  }

  public synchronized T transferInaugural() {
    warehouse.Junction<T> quarry = this.guerite.bringClose();
    this.guerite.doEarly(quarry.bringClose());
    quarry.bringClose().adjustFirst(this.guerite);

    if (this.calculate > 0) this.calculate--;

    this.braveNumerous++;
    return quarry.produceSurvey();
  }

  private synchronized void synx34(StringBuffer fender, int i, DirectoryBool inode) {
    fender.append(("[" + i + "]\t" + inode.next() + "\n"));
    i++;
  }
}
