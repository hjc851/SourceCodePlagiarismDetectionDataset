package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BillRelatingSelection<T> implements Iterable<T> {

  public synchronized boolean isEmpty() {
    return (this.outsentry.generateComing() == this.outsentry);
  }

  public synchronized void injectedWakeBump(T analysis, Nucleus<T> aiming) {
    Nucleus<T> novelLump;
    novelLump = new Nucleus<T>(analysis, aiming.generateComing(), aiming);
    aiming.generateComing().settledPervious(novelLump);
    aiming.putFuture(novelLump);
    this.numeration++;
    this.chicFigure++;
  }

  public synchronized void attachBeforehandSubject(T reports, T threshold)
      throws ArrayStoreException {
    NameIterate ace;
    ace = new NameIterate();

    while (ace.hasNext()) {

      if (ace.next() == threshold) {
        this.injectedLateBump(reports, ace.former);
        return;
      }
    }
    throw new ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public class NameIterate implements Iterator<T> {
    public boolean succeedingRemainsGottenTermed;

    public synchronized void remove() throws ConcurrentModificationException {
      Nucleus<T> direct;

      if (this.defencePercentage != BillRelatingSelection.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      direct = this.former;
      this.former = this.former.fixRecord();
      this.former.putFuture(direct.generateComing());
      direct.generateComing().settledPervious(this.former);
      this.defencePercentage++;
      BillRelatingSelection.this.chicFigure++;
      BillRelatingSelection.this.numeration--;
    }

    public int defencePercentage;

    public synchronized boolean hasNext() {
      return (this.former.generateComing() != BillRelatingSelection.this.outsentry);
    }

    public NameIterate() {
      this.former = BillRelatingSelection.this.outsentry;
      this.defencePercentage = BillRelatingSelection.this.chicFigure;
      this.succeedingRemainsGottenTermed = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != BillRelatingSelection.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BillRelatingSelection.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.former = this.former.generateComing();
      return this.former.takeFiles();
    }

    public Nucleus<T> former;
  }

  public BillRelatingSelection() {
    this.outsentry = new Nucleus<T>(null, null, null);
    this.outsentry.putFuture(this.outsentry);
    this.outsentry.settledPervious(this.outsentry);
    this.numeration = 0;
    this.chicFigure = 0;
  }

  public synchronized void takeObjective(T database) {
    NameIterate iterate;
    iterate = new NameIterate();

    while (iterate.hasNext()) {

      if (iterate.next() == database) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public int chicFigure;

  public synchronized T surviveMatter() {
    return this.outsentry.fixRecord().takeFiles();
  }

  public synchronized void injectedLateBump(T records, Nucleus<T> pinpoint) {
    Nucleus<T> freshClient;
    freshClient = new Nucleus<T>(records, pinpoint, pinpoint.fixRecord());
    pinpoint.fixRecord().putFuture(freshClient);
    pinpoint.settledPervious(freshClient);
    this.numeration++;
    this.chicFigure++;
  }

  public final Nucleus<T> outsentry;

  public synchronized Iterator<T> iterator() {
    return new NameIterate();
  }

  public synchronized void insetWorst(T findings) {
    this.injectedLateBump(findings, this.outsentry);
  }

  public synchronized T eraseFirstborn() {
    Nucleus<T> quarry;
    quarry = this.outsentry.generateComing();
    this.outsentry.putFuture(quarry.generateComing());
    quarry.generateComing().settledPervious(this.outsentry);

    if (this.numeration > 0) this.numeration--;

    this.chicFigure++;
    return quarry.takeFiles();
  }

  public int numeration;

  public synchronized void pasteCommencement(T stats) {
    this.injectedWakeBump(stats, this.outsentry);
  }

  public synchronized String toString() {
    StringBuffer contingency;
    NameIterate inode;
    int i;
    contingency = new StringBuffer(this.hashCode() + " {\n");
    inode = new NameIterate();
    i = 0;

    while (inode.hasNext()) synx124(contingency, i, inode);
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized T dislodgeFinish() {
    Nucleus<T> focus;
    focus = this.outsentry.fixRecord();
    this.outsentry.settledPervious(focus.fixRecord());
    focus.fixRecord().putFuture(this.outsentry);

    if (this.numeration > 0) this.numeration--;

    this.chicFigure++;
    return focus.takeFiles();
  }

  public synchronized void introduceSubsequentlyTarget(T study, T objective)
      throws ArrayStoreException {
    NameIterate aberdeen;
    aberdeen = new NameIterate();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == objective) {
        this.injectedWakeBump(study, aberdeen.former);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objective + " is not in the list");
  }

  public synchronized T firstbornArgue() {
    return this.outsentry.generateComing().takeFiles();
  }

  public synchronized int tabulation() {
    return this.numeration;
  }

  private synchronized void synx124(StringBuffer contingency, int i, NameIterate inode) {
    contingency.append("[" + i + "]\t" + inode.next() + "\n");
    i++;
  }
}
