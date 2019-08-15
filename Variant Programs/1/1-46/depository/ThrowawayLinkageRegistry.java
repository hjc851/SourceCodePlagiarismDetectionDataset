package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {

  public synchronized void injectPriorOppose(T estimates, T pinpoint) throws ArrayStoreException {
    ShortlistRecursion abet = new ShortlistRecursion();

    while (abet.hasNext()) {

      if (abet.next() == pinpoint) {
        this.pasteLateNub(estimates, abet.ongoing);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + pinpoint + " is not in the list"));
  }

  public final Point<T> monitoring;

  public synchronized T seniorPreclude() {
    return this.monitoring.driveFinal().makeIndicators();
  }

  public ThrowawayLinkageRegistry() {
    this.monitoring = (new Point<T>(null, null, null));
    this.monitoring.determinedLast(this.monitoring);
    this.monitoring.dictatedLate(this.monitoring);
    this.calculation = (0);
    this.neoCount = (0);
  }

  public synchronized int recount() {
    return this.calculation;
  }

  public synchronized void encloseInitial(T analysis) {
    this.pasteLateNub(analysis, this.monitoring);
  }

  public int calculation = 0;

  public synchronized void appendDuringProtuberance(T measurements, Point<T> mark) {
    Point<T> untestedScn = new Point<T>(measurements, mark, mark.driveFinal());
    mark.driveFinal().determinedLast(untestedScn);
    mark.dictatedLate(untestedScn);
    this.calculation++;
    this.neoCount++;
  }

  public synchronized void pasteSoonerTotem(T records, T achieve) throws ArrayStoreException {
    ShortlistRecursion about = new ShortlistRecursion();

    while (about.hasNext()) {

      if (about.next() == achieve) {
        this.appendDuringProtuberance(records, about.ongoing);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + achieve + " is not in the list"));
  }

  public synchronized void dispatchItem(T findings) {
    ShortlistRecursion subroutine = new ShortlistRecursion();

    while (subroutine.hasNext()) {

      if (subroutine.next() == findings) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + findings + " was not found"));
  }

  public synchronized T eradicateDying() {
    Point<T> place = this.monitoring.driveFinal();
    this.monitoring.dictatedLate(place.driveFinal());
    place.driveFinal().determinedLast(this.monitoring);

    if (this.calculation > 0) this.calculation--;

    this.neoCount++;
    return place.makeIndicators();
  }

  public synchronized T initialAim() {
    return this.monitoring.bringClose().makeIndicators();
  }

  public synchronized String toString() {
    StringBuffer contingency = new StringBuffer(this.hashCode() + " {\n");
    ShortlistRecursion initialize = new ShortlistRecursion();
    int i = 0;

    while (initialize.hasNext()) {
      contingency.append(("[" + i + "]\t" + initialize.next() + "\n"));
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized boolean isEmpty() {
    return (this.monitoring.bringClose() == this.monitoring);
  }

  public synchronized T ejectEldest() {
    Point<T> objective = this.monitoring.bringClose();
    this.monitoring.determinedLast(objective.bringClose());
    objective.bringClose().dictatedLate(this.monitoring);

    if (this.calculation > 0) this.calculation--;

    this.neoCount++;
    return objective.makeIndicators();
  }

  public class ShortlistRecursion implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFrequency != ThrowawayLinkageRegistry.this.neoCount)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ThrowawayLinkageRegistry.this.hashCode() + " has no more elements"));

      this.nowUnderstandsGotAdvocated = (true);
      this.ongoing = (this.ongoing.bringClose());
      return this.ongoing.makeIndicators();
    }

    public ShortlistRecursion() {
      this.ongoing = (ThrowawayLinkageRegistry.this.monitoring);
      this.heartFrequency = (ThrowawayLinkageRegistry.this.neoCount);
      this.nowUnderstandsGotAdvocated = (false);
    }

    public Point<T> ongoing = null;
    public boolean nowUnderstandsGotAdvocated = false;
    public int heartFrequency = 0;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.heartFrequency != ThrowawayLinkageRegistry.this.neoCount)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = (false);
      Point<T> focusing = this.ongoing;
      this.ongoing = (this.ongoing.driveFinal());
      this.ongoing.determinedLast(focusing.bringClose());
      focusing.bringClose().dictatedLate(this.ongoing);
      this.heartFrequency++;
      ThrowawayLinkageRegistry.this.neoCount++;
      ThrowawayLinkageRegistry.this.calculation--;
    }

    public synchronized boolean hasNext() {
      return (this.ongoing.bringClose() != ThrowawayLinkageRegistry.this.monitoring);
    }
  }

  public synchronized void putConclusion(T database) {
    this.appendDuringProtuberance(database, this.monitoring);
  }

  public synchronized void pasteLateNub(T databases, Point<T> objectives) {
    Point<T> youngCore = new Point<T>(databases, objectives.bringClose(), objectives);
    objectives.bringClose().dictatedLate(youngCore);
    objectives.determinedLast(youngCore);
    this.calculation++;
    this.neoCount++;
  }

  public int neoCount = 0;

  public synchronized Iterator<T> iterator() {
    return new ShortlistRecursion();
  }
}
