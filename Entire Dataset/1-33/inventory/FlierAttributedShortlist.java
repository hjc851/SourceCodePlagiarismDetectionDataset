package inventory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class FlierAttributedShortlist<T> implements Iterable<T> {

  public synchronized void deleteIntroductory(T files) {
    this.appendAmidProtuberance(files, this.guerite);
  }

  public synchronized void inscribeSoonRibbon(T readings, Carrefour<T> mark) {
    Carrefour<T> refreshingRibbon = new Carrefour<T>(readings, mark, mark.produceCurrent());
    mark.produceCurrent().placeSoon(refreshingRibbon);
    mark.fitPrior(refreshingRibbon);
    this.numbers++;
    this.boldHandful++;
  }

  public synchronized T lateAim() {
    return this.guerite.produceCurrent().goInformation();
  }

  public int boldHandful;

  public synchronized T disposeNet() {
    Carrefour<T> focused = this.guerite.produceCurrent();
    this.guerite.fitPrior(focused.produceCurrent());
    focused.produceCurrent().placeSoon(this.guerite);

    if (this.numbers > 0) this.numbers--;

    this.boldHandful++;
    return focused.goInformation();
  }

  public synchronized Iterator<T> iterator() {
    return new BibliographyInode();
  }

  public synchronized void insetAftItem(T tabulations, T butt) throws ArrayStoreException {
    BibliographyInode girl = new BibliographyInode();

    while (girl.hasNext()) {

      if (girl.next() == butt) {
        this.appendAmidProtuberance(tabulations, girl.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + butt + " is not in the list");
  }

  public synchronized T commencementTotem() {
    return this.guerite.takeLater().goInformation();
  }

  public class BibliographyInode implements Iterator<T> {
    public Carrefour<T> incumbent;
    public boolean upcomingRetainsStayedSummoned;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.moduleRoutine != FlierAttributedShortlist.this.boldHandful)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      Carrefour<T> quarry = this.incumbent;
      this.incumbent = this.incumbent.produceCurrent();
      this.incumbent.placeSoon(quarry.takeLater());
      quarry.takeLater().fitPrior(this.incumbent);
      this.moduleRoutine++;
      FlierAttributedShortlist.this.boldHandful++;
      FlierAttributedShortlist.this.numbers--;
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.takeLater() != FlierAttributedShortlist.this.guerite);
    }

    public int moduleRoutine;

    public BibliographyInode() {
      this.incumbent = FlierAttributedShortlist.this.guerite;
      this.moduleRoutine = FlierAttributedShortlist.this.boldHandful;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleRoutine != FlierAttributedShortlist.this.boldHandful)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + FlierAttributedShortlist.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.incumbent = this.incumbent.takeLater();
      return this.incumbent.goInformation();
    }
  }

  public synchronized void tuckPast(T stats) {
    this.inscribeSoonRibbon(stats, this.guerite);
  }

  public int numbers;
  public final Carrefour<T> guerite;

  public FlierAttributedShortlist() {
    this.guerite = new Carrefour<T>(null, null, null);
    this.guerite.placeSoon(this.guerite);
    this.guerite.fitPrior(this.guerite);
    this.numbers = 0;
    this.boldHandful = 0;
  }

  public synchronized int enumerate() {
    return this.numbers;
  }

  public synchronized void installQuicklyPreclude(T computer, T threshold)
      throws ArrayStoreException {
    BibliographyInode trap = new BibliographyInode();

    while (trap.hasNext()) {

      if (trap.next() == threshold) {
        this.inscribeSoonRibbon(computer, trap.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public synchronized void appendAmidProtuberance(T study, Carrefour<T> goal) {
    Carrefour<T> youngCore = new Carrefour<T>(study, goal.takeLater(), goal);
    goal.takeLater().fitPrior(youngCore);
    goal.placeSoon(youngCore);
    this.numbers++;
    this.boldHandful++;
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.takeLater() == this.guerite);
  }

  public synchronized T banishPrime() {
    Carrefour<T> place = this.guerite.takeLater();
    this.guerite.placeSoon(place.takeLater());
    place.takeLater().fitPrior(this.guerite);

    if (this.numbers > 0) this.numbers--;

    this.boldHandful++;
    return place.goInformation();
  }

  public synchronized String toString() {
    StringBuffer fender = new StringBuffer(this.hashCode() + " {\n");
    BibliographyInode concatenate = new BibliographyInode();
    int i = 0;

    while (concatenate.hasNext()) {
      fender.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized void slayArtifact(T reports) {
    BibliographyInode pathname = new BibliographyInode();

    while (pathname.hasNext()) {

      if (pathname.next() == reports) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + reports + " was not found");
  }
}
