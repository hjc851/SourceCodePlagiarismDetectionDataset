package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundishJoinedLean<T> implements Iterable<T> {

  public RoundishJoinedLean() {
    this.guardian = (new Hitch<T>(null, null, null));
    this.guardian.arrangeNow(this.guardian);
    this.guardian.orderedRecord(this.guardian);
    this.numeration = (0);
    this.residueFewer = (0);
  }

  public synchronized void deleteThenEntanglement(T stats, Hitch<T> focus) {
    Hitch<T> hotProblem = new Hitch<T>(stats, focus.developNew(), focus);
    focus.developNew().orderedRecord(hotProblem);
    focus.arrangeNow(hotProblem);
    this.numeration++;
    this.residueFewer++;
  }

  public synchronized T expelConcluding() {
    Hitch<T> threshold = this.guardian.drawSuccessive();
    this.guardian.orderedRecord(threshold.drawSuccessive());
    threshold.drawSuccessive().arrangeNow(this.guardian);

    if (this.numeration > 0) this.numeration--;

    this.residueFewer++;
    return threshold.beatReadings();
  }

  public class ShortlistRecursion implements Iterator<T> {
    public Hitch<T> live = null;
    public boolean followingSeemsHasTitled = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != RoundishJoinedLean.this.residueFewer)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + RoundishJoinedLean.this.hashCode() + " has no more elements"));

      this.followingSeemsHasTitled = (true);
      this.live = (this.live.developNew());
      return this.live.beatReadings();
    }

    public ShortlistRecursion() {
      this.live = (RoundishJoinedLean.this.guardian);
      this.iloBit = (RoundishJoinedLean.this.residueFewer);
      this.followingSeemsHasTitled = (false);
    }

    public synchronized boolean hasNext() {
      return (this.live.developNew() != RoundishJoinedLean.this.guardian);
    }

    public int iloBit = 0;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.iloBit != RoundishJoinedLean.this.residueFewer)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.followingSeemsHasTitled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.followingSeemsHasTitled = (false);
      Hitch<T> quarry = this.live;
      this.live = (this.live.drawSuccessive());
      this.live.arrangeNow(quarry.developNew());
      quarry.developNew().orderedRecord(this.live);
      this.iloBit++;
      RoundishJoinedLean.this.residueFewer++;
      RoundishJoinedLean.this.numeration--;
    }
  }

  public final Hitch<T> guardian;

  public synchronized boolean isEmpty() {
    return (this.guardian.developNew() == this.guardian);
  }

  public synchronized void injectWithoutOppose(T records, T focussed) throws ArrayStoreException {
    ShortlistRecursion deal = new ShortlistRecursion();

    while (deal.hasNext()) {

      if (deal.next() == focussed) {
        this.addJustNucleus(records, deal.live);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + focussed + " is not in the list"));
  }

  public synchronized void appendPrime(T indicators) {
    this.deleteThenEntanglement(indicators, this.guardian);
  }

  public synchronized T closeDemur() {
    return this.guardian.drawSuccessive().beatReadings();
  }

  public synchronized T firstbornArgue() {
    return this.guardian.developNew().beatReadings();
  }

  public synchronized void takeObjective(T information) {
    ShortlistRecursion subroutine = new ShortlistRecursion();

    while (subroutine.hasNext()) {

      if (subroutine.next() == information) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + information + " was not found"));
  }

  public int numeration = 0;

  public synchronized void addJustNucleus(T statistical, Hitch<T> aiming) {
    Hitch<T> unusedBump = new Hitch<T>(statistical, aiming, aiming.drawSuccessive());
    aiming.drawSuccessive().arrangeNow(unusedBump);
    aiming.orderedRecord(unusedBump);
    this.numeration++;
    this.residueFewer++;
  }

  public synchronized int number() {
    return this.numeration;
  }

  public int residueFewer = 0;

  public synchronized void pasteLateTotem(T computer, T objective) throws ArrayStoreException {
    ShortlistRecursion about = new ShortlistRecursion();

    while (about.hasNext()) {

      if (about.next() == objective) {
        this.deleteThenEntanglement(computer, about.live);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + objective + " is not in the list"));
  }

  public synchronized String toString() {
    StringBuffer absorb = new StringBuffer(this.hashCode() + " {\n");
    ShortlistRecursion concatenate = new ShortlistRecursion();
    int i = 0;

    while (concatenate.hasNext()) synx169(absorb, i, concatenate);
    absorb.append("}\n");
    return absorb.toString();
  }

  public synchronized void addLatter(T analysis) {
    this.addJustNucleus(analysis, this.guardian);
  }

  public synchronized Iterator<T> iterator() {
    return new ShortlistRecursion();
  }

  public synchronized T ejectEldest() {
    Hitch<T> mark = this.guardian.developNew();
    this.guardian.arrangeNow(mark.developNew());
    mark.developNew().orderedRecord(this.guardian);

    if (this.numeration > 0) this.numeration--;

    this.residueFewer++;
    return mark.beatReadings();
  }

  private synchronized void synx169(StringBuffer absorb, int i, ShortlistRecursion concatenate) {
    absorb.append(("[" + i + "]\t" + concatenate.next() + "\n"));
    i++;
  }
}
