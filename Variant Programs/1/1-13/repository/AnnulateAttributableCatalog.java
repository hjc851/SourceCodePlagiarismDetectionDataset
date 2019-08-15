package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulateAttributableCatalog<T> implements Iterable<T> {

  public synchronized T eliminateBest() {
    Antenna<T> objective;
    objective = (this.keeper.obtainLast());
    this.keeper.laidFollowing(objective.obtainLast());
    objective.obtainLast().primedEarlier(this.keeper);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return objective.arriveEvidence();
  }

  public synchronized Iterator<T> iterator() {
    return new CompilationSubstring();
  }

  private synchronized void inscribeWhileRibbon(T numbers, Antenna<T> achieve) {
    Antenna<T> greenNucleus;
    greenNucleus = (new Antenna<T>(numbers, achieve.obtainLast(), achieve));
    achieve.obtainLast().primedEarlier(greenNucleus);
    achieve.laidFollowing(greenNucleus);
    this.tell++;
    this.pentagonIssue++;
  }

  private int pentagonIssue = 0;

  public synchronized String toString() {
    StringBuffer neutralize;
    CompilationSubstring substring;
    int i;
    neutralize = (new StringBuffer(this.hashCode() + " {\n"));
    substring = (new CompilationSubstring());
    i = (0);

    while (substring.hasNext()) {
      neutralize.append(("[" + i + "]\t" + substring.next() + "\n"));
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public synchronized void dispatchItem(T database) {
    CompilationSubstring subtree;
    subtree = (new CompilationSubstring());

    while (subtree.hasNext()) {

      if (subtree.next() == database) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + database + " was not found"));
  }

  public synchronized T closeDemur() {
    return this.keeper.sustainPre().arriveEvidence();
  }

  public synchronized boolean isEmpty() {
    return (this.keeper.obtainLast() == this.keeper);
  }

  public synchronized void introduceAheadTarget(T readings, T objectives)
      throws ArrayStoreException {
    CompilationSubstring deal;
    deal = (new CompilationSubstring());

    while (deal.hasNext()) {

      if (deal.next() == objectives) {
        this.introduceAheadClient(readings, deal.flow);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + objectives + " is not in the list"));
  }

  private int tell = 0;

  public synchronized void integratePrototypical(T files) {
    this.inscribeWhileRibbon(files, this.keeper);
  }

  private synchronized void introduceAheadClient(T intelligence, Antenna<T> point) {
    Antenna<T> untestedScn;
    untestedScn = (new Antenna<T>(intelligence, point, point.sustainPre()));
    point.sustainPre().laidFollowing(untestedScn);
    point.primedEarlier(untestedScn);
    this.tell++;
    this.pentagonIssue++;
  }

  public synchronized void deleteClosing(T analysis) {
    this.introduceAheadClient(analysis, this.keeper);
  }

  public synchronized T removalFinally() {
    Antenna<T> aim;
    aim = (this.keeper.sustainPre());
    this.keeper.primedEarlier(aim.sustainPre());
    aim.sustainPre().laidFollowing(this.keeper);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return aim.arriveEvidence();
  }

  public synchronized int census() {
    return this.tell;
  }

  public synchronized T outsetCavil() {
    return this.keeper.obtainLast().arriveEvidence();
  }

  public AnnulateAttributableCatalog() {
    this.keeper = (new Antenna<T>(null, null, null));
    this.keeper.laidFollowing(this.keeper);
    this.keeper.primedEarlier(this.keeper);
    this.tell = (0);
    this.pentagonIssue = (0);
  }

  private final Antenna<T> keeper;

  private class CompilationSubstring implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Antenna<T> limit;

      if (this.langProportion != AnnulateAttributableCatalog.this.pentagonIssue)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.adjacentPossessesPastDescribed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = (false);
      limit = (this.flow);
      this.flow = (this.flow.sustainPre());
      this.flow.laidFollowing(limit.obtainLast());
      limit.obtainLast().primedEarlier(this.flow);
      this.langProportion++;
      AnnulateAttributableCatalog.this.pentagonIssue++;
      AnnulateAttributableCatalog.this.tell--;
    }

    private Antenna<T> flow = null;
    private int langProportion = 0;

    public synchronized boolean hasNext() {
      return (this.flow.obtainLast() != AnnulateAttributableCatalog.this.keeper);
    }

    public CompilationSubstring() {
      this.flow = (AnnulateAttributableCatalog.this.keeper);
      this.langProportion = (AnnulateAttributableCatalog.this.pentagonIssue);
      this.adjacentPossessesPastDescribed = (false);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langProportion != AnnulateAttributableCatalog.this.pentagonIssue)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + AnnulateAttributableCatalog.this.hashCode() + " has no more elements"));

      this.adjacentPossessesPastDescribed = (true);
      this.flow = (this.flow.obtainLast());
      return this.flow.arriveEvidence();
    }

    private boolean adjacentPossessesPastDescribed = false;
  }

  public synchronized void incorporatedBackArgue(T findings, T butt) throws ArrayStoreException {
    CompilationSubstring above;
    above = (new CompilationSubstring());

    while (above.hasNext()) {

      if (above.next() == butt) {
        this.inscribeWhileRibbon(findings, above.flow);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + butt + " is not in the list"));
  }
}
