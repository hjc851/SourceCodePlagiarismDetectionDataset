package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2324int = 0;
  private static final String synX2323String = "}\n";
  private static final int synX2322int = 0;
  private static final String synX2321String = " {\n";
  private static final int synX2320int = 0;
  private static final String synX2319String = " was not found";
  private static final String synX2318String = "Object ";
  private static final int synX2317int = 0;
  private static final int synX2316int = 0;
  private static final int synX2315int = 0;
  private static final int synX2314int = 0;
  public int figure = 0;
  public int moderateQuantify = 0;

  public synchronized boolean isVacant() {
    return (this.custodian.fetchThird() == this.custodian);
  }

  public synchronized int numeration() {
    return this.figure;
  }

  public OrganizedSelection() {
    this.custodian = new Hub<T>(null, null, null);
    this.custodian.orderedAgain(custodian);
    this.custodian.prepareCurrent(custodian);
    this.figure = synX2314int;
    this.moderateQuantify = synX2315int;
  }

  public synchronized T disposeNet() {
    Hub<T> pinpoint;
    pinpoint = this.custodian.fixRecord();
    this.custodian.prepareCurrent(pinpoint.fixRecord());
    pinpoint.fixRecord().orderedAgain(this.custodian);

    if (this.figure > synX2316int) this.figure--;

    this.moderateQuantify++;
    return pinpoint.letFindings();
  }

  public final Hub<T> custodian;

  public synchronized void hitMatchedObjection(T evidence) throws ArrayStoreException {
    SeparatedInitialise subroutine;
    subroutine = new SeparatedInitialise();

    while (subroutine.hasNext()) {

      if (evidence.compareTo(subroutine.next()) == synX2317int) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2318String + evidence + synX2319String);
  }

  public synchronized T foremostPreclude() {
    return this.custodian.fetchThird().letFindings();
  }

  public synchronized void embed(T statistical) {
    SeparatedInitialise pathname;
    Hub<T> newlyKnob;
    pathname = new SeparatedInitialise();

    while (pathname.hasNext()) {

      if (statistical.compareTo(pathname.next()) >= synX2320int) {
        break;
      }

      if (pathname.topical.fetchThird() == this.custodian) {
        Hub<T> newfangledNodal;
        newfangledNodal = new Hub<T>(statistical, this.custodian, this.custodian.fixRecord());
        this.custodian.fixRecord().orderedAgain(newfangledNodal);
        this.custodian.prepareCurrent(newfangledNodal);
        this.figure++;
        this.moderateQuantify++;
        return;
      }
    }
    newlyKnob = new Hub<T>(statistical, pathname.topical, pathname.topical.fixRecord());
    pathname.topical.fixRecord().orderedAgain(newlyKnob);
    pathname.topical.prepareCurrent(newlyKnob);
    this.figure++;
    this.moderateQuantify++;
  }

  public synchronized Iterator<T> iterator() {
    return new SeparatedInitialise();
  }

  public synchronized String toString() {
    StringBuffer extra;
    SeparatedInitialise init;
    int i;
    extra = new StringBuffer(this.hashCode() + synX2321String);
    init = new SeparatedInitialise();
    i = synX2322int;

    while (init.hasNext()) synx177(extra, i, init);
    extra.append(synX2323String);
    return extra.toString();
  }

  public synchronized T dispatchMaiden() {
    Hub<T> thermostat;
    thermostat = this.custodian.fetchThird();
    this.custodian.orderedAgain(thermostat.fetchThird());
    thermostat.fetchThird().prepareCurrent(this.custodian);

    if (this.figure > synX2324int) this.figure--;

    this.moderateQuantify++;
    return thermostat.letFindings();
  }

  public synchronized T latterBody() {
    return this.custodian.fixRecord().letFindings();
  }

  public class SeparatedInitialise implements Iterator<T> {

    public synchronized void remove() {
      Hub<T> goal;

      if (this.fashionNumeration != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.followingSeemsHasTitled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.followingSeemsHasTitled = false;
      goal = this.topical;
      this.topical = this.topical.fixRecord();
      this.topical.orderedAgain(goal.fetchThird());
      goal.fetchThird().prepareCurrent(this.topical);
      this.fashionNumeration++;
      OrganizedSelection.this.moderateQuantify++;
      OrganizedSelection.this.figure--;
    }

    public Hub<T> topical = null;

    public synchronized boolean hasNext() {
      return (this.topical.fetchThird() != OrganizedSelection.this.custodian);
    }

    public SeparatedInitialise() {
      this.topical = OrganizedSelection.this.custodian;
      this.fashionNumeration = OrganizedSelection.this.moderateQuantify;
      this.followingSeemsHasTitled = false;
    }

    public boolean followingSeemsHasTitled = false;
    public int fashionNumeration = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.followingSeemsHasTitled = true;
      this.topical = this.topical.fetchThird();
      return this.topical.letFindings();
    }
  }

  public synchronized void transferTarget(T readings) throws ArrayStoreException {
    SeparatedInitialise namespace;
    namespace = new SeparatedInitialise();

    while (namespace.hasNext()) {

      if (namespace.next() == readings) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  private synchronized void synx177(StringBuffer extra, int i, SeparatedInitialise init) {
    extra.append("[" + i + "]\t" + init.next() + "\n");
    i++;
  }
}
