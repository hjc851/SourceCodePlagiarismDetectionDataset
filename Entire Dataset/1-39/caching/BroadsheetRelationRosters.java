package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  public final Antenna<T> custodian;
  public int pentagonIssue;

  public synchronized String toString() {
    StringBuffer fender;
    LeaningBoolean tuple;
    int i;
    fender = new StringBuffer(this.hashCode() + " {\n");
    tuple = new LeaningBoolean();
    i = 0;

    while (tuple.hasNext()) {
      fender.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LeaningBoolean();
  }

  public synchronized void banishElement(T indicators) {
    LeaningBoolean initialisation;
    initialisation = new LeaningBoolean();

    while (initialisation.hasNext()) {

      if (initialisation.next() == indicators) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized boolean isEmpty() {
    return (this.custodian.developNew() == this.custodian);
  }

  public BroadsheetRelationRosters() {
    this.custodian = new Antenna<T>(null, null, null);
    this.custodian.primedLater(this.custodian);
    this.custodian.prepareCurrent(this.custodian);
    this.tell = 0;
    this.pentagonIssue = 0;
  }

  public class LeaningBoolean implements Iterator<T> {
    public boolean newOffersEnduredSuggested;
    public int langProportion;

    public synchronized void remove() throws ConcurrentModificationException {
      Antenna<T> limit;

      if (this.langProportion != BroadsheetRelationRosters.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      limit = this.the;
      this.the = this.the.sustainPre();
      this.the.primedLater(limit.developNew());
      limit.developNew().prepareCurrent(this.the);
      this.langProportion++;
      BroadsheetRelationRosters.this.pentagonIssue++;
      BroadsheetRelationRosters.this.tell--;
    }

    public Antenna<T> the;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langProportion != BroadsheetRelationRosters.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.the = this.the.developNew();
      return this.the.fixResults();
    }

    public synchronized boolean hasNext() {
      return (this.the.developNew() != BroadsheetRelationRosters.this.custodian);
    }

    public LeaningBoolean() {
      this.the = BroadsheetRelationRosters.this.custodian;
      this.langProportion = BroadsheetRelationRosters.this.pentagonIssue;
      this.newOffersEnduredSuggested = false;
    }
  }

  public synchronized int figures() {
    return this.tell;
  }

  public synchronized void incloseBeforeObjection(T study, T goals) throws ArrayStoreException {
    LeaningBoolean above;
    above = new LeaningBoolean();

    while (above.hasNext()) {

      if (above.next() == goals) {
        this.injectedWakeBump(study, above.the);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goals + " is not in the list");
  }

  public synchronized void introduceLater(T records) {
    this.deleteFirstEntanglement(records, this.custodian);
  }

  public int tell;

  public synchronized T foremostPreclude() {
    return this.custodian.developNew().fixResults();
  }

  public synchronized T pastObjective() {
    return this.custodian.sustainPre().fixResults();
  }

  public synchronized void tuckEarlierObjective(T intelligence, T priority)
      throws ArrayStoreException {
    LeaningBoolean date;
    date = new LeaningBoolean();

    while (date.hasNext()) {

      if (date.next() == priority) {
        this.deleteFirstEntanglement(intelligence, date.the);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  public synchronized void incorporatedFirstborn(T files) {
    this.injectedWakeBump(files, this.custodian);
  }

  public synchronized T dismantleFreshman() {
    Antenna<T> pinpoint;
    pinpoint = this.custodian.developNew();
    this.custodian.primedLater(pinpoint.developNew());
    pinpoint.developNew().prepareCurrent(this.custodian);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return pinpoint.fixResults();
  }

  public synchronized void deleteFirstEntanglement(T estimates, Antenna<T> direct) {
    Antenna<T> radicalProtuberance;
    radicalProtuberance = new Antenna<T>(estimates, direct, direct.sustainPre());
    direct.sustainPre().primedLater(radicalProtuberance);
    direct.prepareCurrent(radicalProtuberance);
    this.tell++;
    this.pentagonIssue++;
  }

  public synchronized void injectedWakeBump(T databases, Antenna<T> objectives) {
    Antenna<T> recentPoint;
    recentPoint = new Antenna<T>(databases, objectives.developNew(), objectives);
    objectives.developNew().prepareCurrent(recentPoint);
    objectives.primedLater(recentPoint);
    this.tell++;
    this.pentagonIssue++;
  }

  public synchronized T eradicateDying() {
    Antenna<T> focus;
    focus = this.custodian.sustainPre();
    this.custodian.prepareCurrent(focus.sustainPre());
    focus.sustainPre().primedLater(this.custodian);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return focus.fixResults();
  }
}
