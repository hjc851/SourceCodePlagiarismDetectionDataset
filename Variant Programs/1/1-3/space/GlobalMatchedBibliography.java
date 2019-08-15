package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobalMatchedBibliography<T> implements Iterable<T> {

  public synchronized T eraseGo() {
    space.Problem<T> goals;
    goals = this.controlled.sustainPre();
    this.controlled.fitPrior(goals.sustainPre());
    goals.sustainPre().laidFollowing(this.controlled);

    if (this.indictment > 0) this.indictment--;

    this.boldHandful++;
    return goals.developInfo();
  }

  public class LitanyOperand implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveNumerous != space.GlobalMatchedBibliography.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.GlobalMatchedBibliography.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.actual = this.actual.goFuture();
      return this.actual.developInfo();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      space.Problem<T> achieve;

      if (this.braveNumerous != space.GlobalMatchedBibliography.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      achieve = this.actual;
      this.actual = this.actual.sustainPre();
      this.actual.laidFollowing(achieve.goFuture());
      achieve.goFuture().fitPrior(this.actual);
      this.braveNumerous++;
      space.GlobalMatchedBibliography.this.boldHandful++;
      space.GlobalMatchedBibliography.this.indictment--;
    }

    public boolean lastBoastsRemainedLabeled = false;

    public LitanyOperand() {
      this.actual = space.GlobalMatchedBibliography.this.controlled;
      this.braveNumerous = space.GlobalMatchedBibliography.this.boldHandful;
      this.lastBoastsRemainedLabeled = false;
    }

    public int braveNumerous = 0;
    public space.Problem<T> actual = null;

    public synchronized boolean hasNext() {
      return (this.actual.goFuture() != space.GlobalMatchedBibliography.this.controlled);
    }
  }

  public synchronized boolean isEmpty() {
    return (this.controlled.goFuture() == this.controlled);
  }

  public synchronized void injectWithoutJunction(T files, space.Problem<T> direct) {
    space.Problem<T> babyNoose;
    babyNoose = new space.Problem<T>(files, direct, direct.sustainPre());
    direct.sustainPre().laidFollowing(babyNoose);
    direct.fitPrior(babyNoose);
    this.indictment++;
    this.boldHandful++;
  }

  public GlobalMatchedBibliography() {
    this.controlled = new space.Problem<T>(null, null, null);
    this.controlled.laidFollowing(this.controlled);
    this.controlled.fitPrior(this.controlled);
    this.indictment = 0;
    this.boldHandful = 0;
  }

  public synchronized void removalResist(T database) {
    LitanyOperand concatenate;
    concatenate = new LitanyOperand();

    while (concatenate.hasNext()) {

      if (concatenate.next() == database) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized void embedLatest(T numbers) {
    this.injectWithoutJunction(numbers, this.controlled);
  }

  public synchronized T eraseFirstborn() {
    space.Problem<T> priority;
    priority = this.controlled.goFuture();
    this.controlled.laidFollowing(priority.goFuture());
    priority.goFuture().fitPrior(this.controlled);

    if (this.indictment > 0) this.indictment--;

    this.boldHandful++;
    return priority.developInfo();
  }

  public synchronized T laterTarget() {
    return this.controlled.sustainPre().developInfo();
  }

  public int boldHandful = 0;
  public int indictment = 0;

  public synchronized void enterAfterwardsAntenna(T readings, space.Problem<T> threshold) {
    space.Problem<T> freshlyGanglion;
    freshlyGanglion = new space.Problem<T>(readings, threshold.goFuture(), threshold);
    threshold.goFuture().fitPrior(freshlyGanglion);
    threshold.laidFollowing(freshlyGanglion);
    this.indictment++;
    this.boldHandful++;
  }

  public final space.Problem<T> controlled;

  public synchronized Iterator<T> iterator() {
    return new LitanyOperand();
  }

  public synchronized void tuckEarlierObjective(T measurements, T focus)
      throws ArrayStoreException {
    LitanyOperand above;
    above = new LitanyOperand();

    while (above.hasNext()) {

      if (above.next() == focus) {
        this.injectWithoutJunction(measurements, above.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focus + " is not in the list");
  }

  public synchronized int total() {
    return this.indictment;
  }

  public synchronized String toString() {
    java.lang.StringBuffer spacer;
    LitanyOperand initialisation;
    int i;
    spacer = new java.lang.StringBuffer(this.hashCode() + " {\n");
    initialisation = new LitanyOperand();
    i = 0;

    while (initialisation.hasNext()) synx25(spacer, i, initialisation);
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized T basicOpposes() {
    return this.controlled.goFuture().developInfo();
  }

  public synchronized void deleteThenPurpose(T computer, T aiming) throws ArrayStoreException {
    LitanyOperand wrap;
    wrap = new LitanyOperand();

    while (wrap.hasNext()) {

      if (wrap.next() == aiming) {
        this.enterAfterwardsAntenna(computer, wrap.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public synchronized void encloseInitial(T results) {
    this.enterAfterwardsAntenna(results, this.controlled);
  }

  private synchronized void synx25(StringBuffer spacer, int i, LitanyOperand initialisation) {
    spacer.append("[" + i + "]\t" + initialisation.next() + "\n");
    i++;
  }
}
