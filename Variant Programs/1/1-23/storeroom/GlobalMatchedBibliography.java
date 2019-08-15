package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobalMatchedBibliography<T> implements Iterable<T> {
  private static final int synX1818int = 0;

  public synchronized int calculate() {
    return this.consider;
  }

  public synchronized T discardIntroductory() {
    storeroom.Ribbon<T> benchmark = this.outsentry.comeFollowing();
    this.outsentry.fixedAfter(benchmark.comeFollowing());
    benchmark.comeFollowing().prepareCurrent(this.outsentry);

    if (this.consider > synX1818int) this.consider--;

    this.defencePercentage++;
    return benchmark.developInfo();
  }

  private class NumberTuple implements Iterator<T> {
    private boolean succeedingRemainsGottenTermed = false;
    private int langProportion = 0;

    public synchronized boolean hasNext() {
      return (this.existing.comeFollowing() != storeroom.GlobalMatchedBibliography.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langProportion != storeroom.GlobalMatchedBibliography.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List "
                + storeroom.GlobalMatchedBibliography.this.hashCode()
                + " has no more elements"));

      this.succeedingRemainsGottenTermed = (true);
      this.existing = (this.existing.comeFollowing());
      return this.existing.developInfo();
    }

    public NumberTuple() {
      this.existing = (storeroom.GlobalMatchedBibliography.this.outsentry);
      this.langProportion = (storeroom.GlobalMatchedBibliography.this.defencePercentage);
      this.succeedingRemainsGottenTermed = (false);
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.langProportion != storeroom.GlobalMatchedBibliography.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = (false);
      storeroom.Ribbon<T> direct = this.existing;
      this.existing = (this.existing.beatElapsed());
      this.existing.fixedAfter(direct.comeFollowing());
      direct.comeFollowing().prepareCurrent(this.existing);
      this.langProportion++;
      storeroom.GlobalMatchedBibliography.this.defencePercentage++;
      storeroom.GlobalMatchedBibliography.this.consider--;
    }

    private storeroom.Ribbon<T> existing = null;
  }

  private int defencePercentage = 0;
  private final storeroom.Ribbon<T> outsentry;

  public synchronized void attachBeforehandSubject(T records, T threshold)
      throws ArrayStoreException {
    NumberTuple abysm = new NumberTuple();

    while (abysm.hasNext()) {

      if (abysm.next() == threshold) {
        this.addJustNucleus(records, abysm.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + threshold + " is not in the list"));
  }

  public synchronized void yankTotem(T files) {
    NumberTuple namespace = new NumberTuple();

    while (namespace.hasNext()) {

      if (namespace.next() == files) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + files + " was not found"));
  }

  private synchronized void inscribingOverProblem(T statistical, storeroom.Ribbon<T> focussed) {
    storeroom.Ribbon<T> youngCore =
        new storeroom.Ribbon<T>(statistical, focussed.comeFollowing(), focussed);
    focussed.comeFollowing().prepareCurrent(youngCore);
    focussed.fixedAfter(youngCore);
    this.consider++;
    this.defencePercentage++;
  }

  public synchronized boolean isEmpty() {
    return (this.outsentry.comeFollowing() == this.outsentry);
  }

  public synchronized void incloseTop(T study) {
    this.inscribingOverProblem(study, this.outsentry);
  }

  public synchronized T conclusionItems() {
    return this.outsentry.beatElapsed().developInfo();
  }

  public synchronized Iterator<T> iterator() {
    return new NumberTuple();
  }

  private int consider = 0;

  public synchronized void tuckLaterObjective(T evidence, T focused) throws ArrayStoreException {
    NumberTuple ace = new NumberTuple();

    while (ace.hasNext()) {

      if (ace.next() == focused) {
        this.inscribingOverProblem(evidence, ace.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + focused + " is not in the list"));
  }

  public GlobalMatchedBibliography() {
    this.outsentry = (new storeroom.Ribbon<T>(null, null, null));
    this.outsentry.fixedAfter(this.outsentry);
    this.outsentry.prepareCurrent(this.outsentry);
    this.consider = (0);
    this.defencePercentage = (0);
  }

  public synchronized void attachLowest(T findings) {
    this.addJustNucleus(findings, this.outsentry);
  }

  private synchronized void addJustNucleus(T measurements, storeroom.Ribbon<T> aiming) {
    storeroom.Ribbon<T> newfoundJunction =
        new storeroom.Ribbon<T>(measurements, aiming, aiming.beatElapsed());
    aiming.beatElapsed().fixedAfter(newfoundJunction);
    aiming.prepareCurrent(newfoundJunction);
    this.consider++;
    this.defencePercentage++;
  }

  public synchronized T deleteLatter() {
    storeroom.Ribbon<T> achieve = this.outsentry.beatElapsed();
    this.outsentry.prepareCurrent(achieve.beatElapsed());
    achieve.beatElapsed().fixedAfter(this.outsentry);

    if (this.consider > 0) this.consider--;

    this.defencePercentage++;
    return achieve.developInfo();
  }

  public synchronized String toString() {
    java.lang.StringBuffer separating = new java.lang.StringBuffer(this.hashCode() + " {\n");
    NumberTuple initialize = new NumberTuple();
    int i = 0;

    while (initialize.hasNext()) {
      separating.append(("[" + i + "]\t" + initialize.next() + "\n"));
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized T initialAim() {
    return this.outsentry.comeFollowing().developInfo();
  }
}
