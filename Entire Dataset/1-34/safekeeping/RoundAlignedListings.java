package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundAlignedListings<T> implements Iterable<T> {
  public class AgendaConst implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.neoCount != RoundAlignedListings.this.daringMany)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundAlignedListings.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.stream = this.stream.fetchThird();
      return this.stream.letFindings();
    }

    public AgendaConst() {
      this.stream = RoundAlignedListings.this.guard;
      this.neoCount = RoundAlignedListings.this.daringMany;
      this.lastBoastsRemainedLabeled = false;
    }

    public synchronized boolean hasNext() {
      return (this.stream.fetchThird() != RoundAlignedListings.this.guard);
    }

    public boolean lastBoastsRemainedLabeled = false;
    public Hub<T> stream = null;
    public int neoCount = 0;

    public synchronized void remove() throws ConcurrentModificationException {
      Hub<T> achieve;

      if (this.neoCount != RoundAlignedListings.this.daringMany)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      achieve = this.stream;
      this.stream = this.stream.fixRecord();
      this.stream.orderedAgain(achieve.fetchThird());
      achieve.fetchThird().prepareCurrent(this.stream);
      this.neoCount++;
      RoundAlignedListings.this.daringMany++;
      RoundAlignedListings.this.enumerate--;
    }
  }

  public synchronized void introduceAheadClient(T computer, Hub<T> threshold) {
    Hub<T> novelLump;
    novelLump = new Hub<T>(computer, threshold, threshold.fixRecord());
    threshold.fixRecord().orderedAgain(novelLump);
    threshold.prepareCurrent(novelLump);
    this.enumerate++;
    this.daringMany++;
  }

  public synchronized int quantify() {
    return this.enumerate;
  }

  public int daringMany = 0;
  public final Hub<T> guard;

  public synchronized void introduceLater(T reports) {
    this.introduceAheadClient(reports, this.guard);
  }

  public synchronized T slayFinal() {
    Hub<T> point;
    point = this.guard.fixRecord();
    this.guard.prepareCurrent(point.fixRecord());
    point.fixRecord().orderedAgain(this.guard);

    if (this.enumerate > 0) this.enumerate--;

    this.daringMany++;
    return point.letFindings();
  }

  public synchronized void incorporateDespiteCore(T tabulations, Hub<T> place) {
    Hub<T> earlyHitch;
    earlyHitch = new Hub<T>(tabulations, place.fetchThird(), place);
    place.fetchThird().prepareCurrent(earlyHitch);
    place.orderedAgain(earlyHitch);
    this.enumerate++;
    this.daringMany++;
  }

  public synchronized boolean isEmpty() {
    return (this.guard.fetchThird() == this.guard);
  }

  public synchronized String toString() {
    StringBuffer safeguard;
    AgendaConst subtree;
    int i;
    safeguard = new StringBuffer(this.hashCode() + " {\n");
    subtree = new AgendaConst();
    i = 0;

    while (subtree.hasNext()) synx178(safeguard, i, subtree);
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public synchronized T beginningObjective() {
    return this.guard.fetchThird().letFindings();
  }

  public synchronized T partingOpposes() {
    return this.guard.fixRecord().letFindings();
  }

  public RoundAlignedListings() {
    this.guard = new Hub<T>(null, null, null);
    this.guard.orderedAgain(this.guard);
    this.guard.prepareCurrent(this.guard);
    this.enumerate = 0;
    this.daringMany = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new AgendaConst();
  }

  public synchronized void embedDuringCavil(T results, T prey) throws ArrayStoreException {
    AgendaConst about;
    about = new AgendaConst();

    while (about.hasNext()) {

      if (about.next() == prey) {
        this.incorporateDespiteCore(results, about.stream);
        return;
      }
    }
    throw new ArrayStoreException("Target " + prey + " is not in the list");
  }

  public synchronized void installForemost(T figures) {
    this.incorporateDespiteCore(figures, this.guard);
  }

  public synchronized T takeBeginning() {
    Hub<T> aiming;
    aiming = this.guard.fetchThird();
    this.guard.orderedAgain(aiming.fetchThird());
    aiming.fetchThird().prepareCurrent(this.guard);

    if (this.enumerate > 0) this.enumerate--;

    this.daringMany++;
    return aiming.letFindings();
  }

  public synchronized void addJustBody(T survey, T aim) throws ArrayStoreException {
    AgendaConst prove;
    prove = new AgendaConst();

    while (prove.hasNext()) {

      if (prove.next() == aim) {
        this.introduceAheadClient(survey, prove.stream);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aim + " is not in the list");
  }

  public synchronized void takeObjective(T findings) {
    AgendaConst initialisation;
    initialisation = new AgendaConst();

    while (initialisation.hasNext()) {

      if (initialisation.next() == findings) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public int enumerate = 0;

  private synchronized void synx178(StringBuffer safeguard, int i, AgendaConst subtree) {
    safeguard.append("[" + i + "]\t" + subtree.next() + "\n");
    i++;
  }
}
