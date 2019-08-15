package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AssignedBibliography<T extends Comparable<T>> implements Iterable<T> {

  public AssignedBibliography() {
    this.indicator = (new warehouse.Junction<T>(null, null, null));
    this.indicator.doEarly(indicator);
    this.indicator.adjustFirst(indicator);
    this.tabulation = (0);
    this.daringCensus = (0);
  }

  public synchronized T surviveMatter() {
    return this.indicator.fetchInitial().produceSurvey();
  }

  public synchronized boolean isVacant() {
    return (this.indicator.bringClose() == this.indicator);
  }

  public synchronized T transferLater() {
    warehouse.Junction<T> point = this.indicator.fetchInitial();
    this.indicator.adjustFirst(point.fetchInitial());
    point.fetchInitial().doEarly(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.daringCensus++;
    return point.produceSurvey();
  }

  public synchronized T forwardVictim() {
    return this.indicator.bringClose().produceSurvey();
  }

  public int tabulation;

  public synchronized T slayOpening() {
    warehouse.Junction<T> coolant = this.indicator.bringClose();
    this.indicator.doEarly(coolant.bringClose());
    coolant.bringClose().adjustFirst(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.daringCensus++;
    return coolant.produceSurvey();
  }

  public final warehouse.Junction<T> indicator;

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    CategorizedRecursion initialize = new CategorizedRecursion();
    int i = 0;

    while (initialize.hasNext()) synx33(cushion, i, initialize);
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized void dispatchComparativeItem(T information) throws ArrayStoreException {
    CategorizedRecursion uniterable = new CategorizedRecursion();

    while (uniterable.hasNext()) {

      if (information.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + information + " was not found"));
  }

  public synchronized void integrate(T reports) {
    CategorizedRecursion operand = new CategorizedRecursion();

    while (operand.hasNext()) {

      if (reports.compareTo(operand.next()) >= 0) {
        break;
      }

      if (operand.topical.bringClose() == this.indicator) {
        warehouse.Junction<T> unusedBump =
            new warehouse.Junction<T>(reports, this.indicator, this.indicator.fetchInitial());
        this.indicator.fetchInitial().doEarly(unusedBump);
        this.indicator.adjustFirst(unusedBump);
        this.tabulation++;
        this.daringCensus++;
        return;
      }
    }
    warehouse.Junction<T> radicalProtuberance =
        new warehouse.Junction<T>(reports, operand.topical, operand.topical.fetchInitial());
    operand.topical.fetchInitial().doEarly(radicalProtuberance);
    operand.topical.adjustFirst(radicalProtuberance);
    this.tabulation++;
    this.daringCensus++;
  }

  public synchronized int reckon() {
    return this.tabulation;
  }

  public int daringCensus;

  public class CategorizedRecursion implements Iterator<T> {
    public warehouse.Junction<T> topical;

    public CategorizedRecursion() {
      this.topical = (warehouse.AssignedBibliography.this.indicator);
      this.residueFigure = (warehouse.AssignedBibliography.this.daringCensus);
      this.thenContinuesResultedLabelled = (false);
    }

    public boolean thenContinuesResultedLabelled;

    public synchronized boolean hasNext() {
      return (this.topical.bringClose() != warehouse.AssignedBibliography.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != warehouse.AssignedBibliography.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + warehouse.AssignedBibliography.this.hashCode() + " has no more elements"));

      this.thenContinuesResultedLabelled = (true);
      this.topical = (this.topical.bringClose());
      return this.topical.produceSurvey();
    }

    public synchronized void remove() {

      if (this.residueFigure != warehouse.AssignedBibliography.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.thenContinuesResultedLabelled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = (false);
      warehouse.Junction<T> reach = this.topical;
      this.topical = (this.topical.fetchInitial());
      this.topical.doEarly(reach.bringClose());
      reach.bringClose().adjustFirst(this.topical);
      this.residueFigure++;
      warehouse.AssignedBibliography.this.daringCensus++;
      warehouse.AssignedBibliography.this.tabulation--;
    }

    public int residueFigure;
  }

  public synchronized void reinstallThing(T tabulations) throws ArrayStoreException {
    CategorizedRecursion battologize = new CategorizedRecursion();

    while (battologize.hasNext()) {

      if (battologize.next() == tabulations) {
        battologize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + tabulations + " was not found"));
  }

  private synchronized void synx33(StringBuffer cushion, int i, CategorizedRecursion initialize) {
    cushion.append(("[" + i + "]\t" + initialize.next() + "\n"));
    i++;
  }
}
