package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {

  public synchronized int calculate() {
    return this.indictment;
  }

  private int boldlyGet = 0;
  private final Core<T> surveillance;

  public DividedDocket() {
    this.surveillance = new Core<T>(null, null, null);
    this.surveillance.arrangeNow(surveillance);
    this.surveillance.placedLast(surveillance);
    this.indictment = 0;
    this.boldlyGet = 0;
  }

  private class SeparatedInitialise implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFigures != DividedDocket.this.boldlyGet)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + DividedDocket.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.contemporary = this.contemporary.goFuture();
      return this.contemporary.takeFiles();
    }

    private Core<T> contemporary = null;

    public SeparatedInitialise() {
      this.contemporary = DividedDocket.this.surveillance;
      this.heartFigures = DividedDocket.this.boldlyGet;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized void remove() {
      Core<T> focussed;

      if (this.heartFigures != DividedDocket.this.boldlyGet)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      focussed = this.contemporary;
      this.contemporary = this.contemporary.fetchInitial();
      this.contemporary.arrangeNow(focussed.goFuture());
      focussed.goFuture().placedLast(this.contemporary);
      this.heartFigures++;
      DividedDocket.this.boldlyGet++;
      DividedDocket.this.indictment--;
    }

    private int heartFigures = 0;
    private boolean firstNeedsBegunNicknamed = false;

    public synchronized boolean hasNext() {
      return (this.contemporary.goFuture() != DividedDocket.this.surveillance);
    }
  }

  public synchronized void eliminateSubject(T figures) throws ArrayStoreException {
    SeparatedInitialise namespace;
    namespace = new SeparatedInitialise();

    while (namespace.hasNext()) {

      if (namespace.next() == figures) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + figures + " was not found");
  }

  public synchronized boolean isVacant() {
    return (this.surveillance.goFuture() == this.surveillance);
  }

  public synchronized T eradicateDying() {
    Core<T> mark;
    mark = this.surveillance.fetchInitial();
    this.surveillance.placedLast(mark.fetchInitial());
    mark.fetchInitial().arrangeNow(this.surveillance);

    if (this.indictment > 0) this.indictment--;

    this.boldlyGet++;
    return mark.takeFiles();
  }

  public synchronized T foremostPreclude() {
    return this.surveillance.goFuture().takeFiles();
  }

  public synchronized void inject(T tabulations) {
    SeparatedInitialise battologize;
    Core<T> hotProblem;
    battologize = new SeparatedInitialise();

    while (battologize.hasNext()) {

      if (tabulations.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.contemporary.goFuture() == this.surveillance) {
        Core<T> newfoundJunction;
        newfoundJunction =
            new Core<T>(tabulations, this.surveillance, this.surveillance.fetchInitial());
        this.surveillance.fetchInitial().arrangeNow(newfoundJunction);
        this.surveillance.placedLast(newfoundJunction);
        this.indictment++;
        this.boldlyGet++;
        return;
      }
    }
    hotProblem =
        new Core<T>(tabulations, battologize.contemporary, battologize.contemporary.fetchInitial());
    battologize.contemporary.fetchInitial().arrangeNow(hotProblem);
    battologize.contemporary.placedLast(hotProblem);
    this.indictment++;
    this.boldlyGet++;
  }

  public synchronized T dispatchMaiden() {
    Core<T> unaccompanied;
    unaccompanied = this.surveillance.goFuture();
    this.surveillance.arrangeNow(unaccompanied.goFuture());
    unaccompanied.goFuture().placedLast(this.surveillance);

    if (this.indictment > 0) this.indictment--;

    this.boldlyGet++;
    return unaccompanied.takeFiles();
  }

  public synchronized void hitMatchedObjection(T numbers) throws ArrayStoreException {
    SeparatedInitialise uniterable;
    uniterable = new SeparatedInitialise();

    while (uniterable.hasNext()) {

      if (numbers.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + numbers + " was not found");
  }

  public synchronized String toString() {
    StringBuffer separating;
    SeparatedInitialise inode;
    int i;
    separating = new StringBuffer(this.hashCode() + " {\n");
    inode = new SeparatedInitialise();
    i = 0;

    while (inode.hasNext()) synx141(separating, i, inode);
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new SeparatedInitialise();
  }

  private int indictment = 0;

  public synchronized T unlikelyTotem() {
    return this.surveillance.fetchInitial().takeFiles();
  }

  private synchronized void synx141(StringBuffer separating, int i, SeparatedInitialise inode) {
    separating.append("[" + i + "]\t" + inode.next() + "\n");
    i++;
  }
}
