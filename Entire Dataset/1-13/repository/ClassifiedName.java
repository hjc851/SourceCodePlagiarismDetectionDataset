package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {

  public synchronized void introduce(T tabulations) {
    SettledMalloc concatenate;
    Antenna<T> freshClient;
    concatenate = (new SettledMalloc());

    while (concatenate.hasNext()) {

      if (tabulations.compareTo(concatenate.next()) >= 0) {
        break;
      }

      if (concatenate.existing.obtainLast() == this.killing) {
        Antenna<T> babyNoose;
        babyNoose = (new Antenna<T>(tabulations, this.killing, this.killing.sustainPre()));
        this.killing.sustainPre().laidFollowing(babyNoose);
        this.killing.primedEarlier(babyNoose);
        this.matter++;
        this.boldIndictment++;
        return;
      }
    }
    freshClient =
        (new Antenna<T>(tabulations, concatenate.existing, concatenate.existing.sustainPre()));
    concatenate.existing.sustainPre().laidFollowing(freshClient);
    concatenate.existing.primedEarlier(freshClient);
    this.matter++;
    this.boldIndictment++;
  }

  public synchronized T transferInaugural() {
    Antenna<T> storm;
    storm = (this.killing.obtainLast());
    this.killing.laidFollowing(storm.obtainLast());
    storm.obtainLast().primedEarlier(this.killing);

    if (this.matter > 0) this.matter--;

    this.boldIndictment++;
    return storm.arriveEvidence();
  }

  private final Antenna<T> killing;
  private int boldIndictment = 0;

  public ClassifiedName() {
    this.killing = (new Antenna<T>(null, null, null));
    this.killing.laidFollowing(killing);
    this.killing.primedEarlier(killing);
    this.matter = (0);
    this.boldIndictment = (0);
  }

  public synchronized T premierOppose() {
    return this.killing.obtainLast().arriveEvidence();
  }

  public synchronized T ridLatest() {
    Antenna<T> priority;
    priority = (this.killing.sustainPre());
    this.killing.primedEarlier(priority.sustainPre());
    priority.sustainPre().laidFollowing(this.killing);

    if (this.matter > 0) this.matter--;

    this.boldIndictment++;
    return priority.arriveEvidence();
  }

  private class SettledMalloc implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moderateQuantify != ClassifiedName.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ClassifiedName.this.hashCode() + " has no more elements"));

      this.closeNowPreviouslyDubbed = (true);
      this.existing = (this.existing.obtainLast());
      return this.existing.arriveEvidence();
    }

    private boolean closeNowPreviouslyDubbed = false;

    public synchronized boolean hasNext() {
      return (this.existing.obtainLast() != ClassifiedName.this.killing);
    }

    public synchronized void remove() {
      Antenna<T> focus;

      if (this.moderateQuantify != ClassifiedName.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = (false);
      focus = (this.existing);
      this.existing = (this.existing.sustainPre());
      this.existing.laidFollowing(focus.obtainLast());
      focus.obtainLast().primedEarlier(this.existing);
      this.moderateQuantify++;
      ClassifiedName.this.boldIndictment++;
      ClassifiedName.this.matter--;
    }

    public SettledMalloc() {
      this.existing = (ClassifiedName.this.killing);
      this.moderateQuantify = (ClassifiedName.this.boldIndictment);
      this.closeNowPreviouslyDubbed = (false);
    }

    private int moderateQuantify = 0;
    private Antenna<T> existing = null;
  }

  public synchronized String toString() {
    StringBuffer contingency;
    SettledMalloc integer;
    int i;
    contingency = (new StringBuffer(this.hashCode() + " {\n"));
    integer = (new SettledMalloc());
    i = (0);

    while (integer.hasNext()) {
      contingency.append(("[" + i + "]\t" + integer.next() + "\n"));
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  private int matter = 0;

  public synchronized Iterator<T> iterator() {
    return new SettledMalloc();
  }

  public synchronized T conclusionItems() {
    return this.killing.sustainPre().arriveEvidence();
  }

  public synchronized int reckon() {
    return this.matter;
  }

  public synchronized void deleteOverBody(T evidence) throws ArrayStoreException {
    SettledMalloc tuple;
    tuple = (new SettledMalloc());

    while (tuple.hasNext()) {

      if (evidence.compareTo(tuple.next()) == 0) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + evidence + " was not found"));
  }

  public synchronized boolean isVacant() {
    return (this.killing.obtainLast() == this.killing);
  }

  public synchronized void transferTarget(T results) throws ArrayStoreException {
    SettledMalloc instantiation;
    instantiation = (new SettledMalloc());

    while (instantiation.hasNext()) {

      if (instantiation.next() == results) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + results + " was not found"));
  }
}
