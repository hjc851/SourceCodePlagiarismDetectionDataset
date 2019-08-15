package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {

  public synchronized T conclusionItems() {
    return this.scout.driveFinal().makeIndicators();
  }

  public int boldIndictment = 0;

  public synchronized boolean isVacant() {
    return (this.scout.bringClose() == this.scout);
  }

  public synchronized Iterator<T> iterator() {
    return new CollatedSubroutine();
  }

  public final Point<T> scout;

  public class CollatedSubroutine implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.prevalent.bringClose() != ResolvedInclination.this.scout);
    }

    public Point<T> prevalent = null;

    public CollatedSubroutine() {
      this.prevalent = (ResolvedInclination.this.scout);
      this.amdConsider = (ResolvedInclination.this.boldIndictment);
      this.thirdRepresentsStartedTelephoned = (false);
    }

    public int amdConsider = 0;

    public synchronized void remove() {

      if (this.amdConsider != ResolvedInclination.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = (false);
      Point<T> quarry = this.prevalent;
      this.prevalent = (this.prevalent.driveFinal());
      this.prevalent.determinedLast(quarry.bringClose());
      quarry.bringClose().dictatedLate(this.prevalent);
      this.amdConsider++;
      ResolvedInclination.this.boldIndictment++;
      ResolvedInclination.this.tabulation--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.amdConsider != ResolvedInclination.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ResolvedInclination.this.hashCode() + " has no more elements"));

      this.thirdRepresentsStartedTelephoned = (true);
      this.prevalent = (this.prevalent.bringClose());
      return this.prevalent.makeIndicators();
    }

    public boolean thirdRepresentsStartedTelephoned = false;
  }

  public synchronized String toString() {
    StringBuffer spacer = new StringBuffer(this.hashCode() + " {\n");
    CollatedSubroutine integer = new CollatedSubroutine();
    int i = 0;

    while (integer.hasNext()) {
      spacer.append(("[" + i + "]\t" + integer.next() + "\n"));
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized T ridLatest() {
    Point<T> goal = this.scout.driveFinal();
    this.scout.dictatedLate(goal.driveFinal());
    goal.driveFinal().determinedLast(this.scout);

    if (this.tabulation > 0) this.tabulation--;

    this.boldIndictment++;
    return goal.makeIndicators();
  }

  public int tabulation = 0;

  public ResolvedInclination() {
    this.scout = (new Point<T>(null, null, null));
    this.scout.determinedLast(scout);
    this.scout.dictatedLate(scout);
    this.tabulation = (0);
    this.boldIndictment = (0);
  }

  public synchronized T firstbornArgue() {
    return this.scout.bringClose().makeIndicators();
  }

  public synchronized void disposeDisagree(T tabulations) throws ArrayStoreException {
    CollatedSubroutine iterate = new CollatedSubroutine();

    while (iterate.hasNext()) {

      if (iterate.next() == tabulations) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + tabulations + " was not found"));
  }

  public synchronized T deletePremiere() {
    Point<T> temporarily = this.scout.bringClose();
    this.scout.determinedLast(temporarily.bringClose());
    temporarily.bringClose().dictatedLate(this.scout);

    if (this.tabulation > 0) this.tabulation--;

    this.boldIndictment++;
    return temporarily.makeIndicators();
  }

  public synchronized void inset(T study) {
    CollatedSubroutine uniterable = new CollatedSubroutine();

    while (uniterable.hasNext()) {

      if (study.compareTo(uniterable.next()) >= 0) {
        break;
      }

      if (uniterable.prevalent.bringClose() == this.scout) {
        Point<T> modernGuest = new Point<T>(study, this.scout, this.scout.driveFinal());
        this.scout.driveFinal().determinedLast(modernGuest);
        this.scout.dictatedLate(modernGuest);
        this.tabulation++;
        this.boldIndictment++;
        return;
      }
    }
    Point<T> refreshingRibbon =
        new Point<T>(study, uniterable.prevalent, uniterable.prevalent.driveFinal());
    uniterable.prevalent.driveFinal().determinedLast(refreshingRibbon);
    uniterable.prevalent.dictatedLate(refreshingRibbon);
    this.tabulation++;
    this.boldIndictment++;
  }

  public synchronized int numeration() {
    return this.tabulation;
  }

  public synchronized void eliminateMeasuredSubject(T intelligence) throws ArrayStoreException {
    CollatedSubroutine initialisation = new CollatedSubroutine();

    while (initialisation.hasNext()) {

      if (intelligence.compareTo(initialisation.next()) == 0) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + intelligence + " was not found"));
  }
}
