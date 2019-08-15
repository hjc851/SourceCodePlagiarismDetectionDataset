package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SolvedLeaning<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX2533String = "}\n";
  private static final int synX2532int = 0;
  private static final String synX2531String = " {\n";
  private static final String synX2530String = " was not found";
  private static final String synX2529String = "Object ";
  private static final int synX2528int = 0;
  private static final String synX2527String = " was not found";
  private static final String synX2526String = "Object ";
  private static final int synX2525int = 0;
  private static final int synX2524int = 0;
  private static final int synX2523int = 0;
  private final Guest<T> scout;
  private int figure = 0;
  private int moduleTabulation = 0;

  public SolvedLeaning() {
    this.scout = new Guest<T>(null, null, null);
    this.scout.determineThird(scout);
    this.scout.solidifyingElapsed(scout);
    this.figure = 0;
    this.moduleTabulation = 0;
  }

  public synchronized void enter(T survey) {
    GroupedTuple initialisation = new GroupedTuple();

    while (initialisation.hasNext()) {

      if (survey.compareTo(initialisation.next()) >= synX2523int) {
        break;
      }

      if (initialisation.typical.driveEarly() == this.scout) {
        Guest<T> originalAntenna = new Guest<T>(survey, this.scout, this.scout.catchLast());
        this.scout.catchLast().determineThird(originalAntenna);
        this.scout.solidifyingElapsed(originalAntenna);
        this.figure++;
        this.moduleTabulation++;
        return;
      }
    }
    Guest<T> untestedScn =
        new Guest<T>(survey, initialisation.typical, initialisation.typical.catchLast());
    initialisation.typical.catchLast().determineThird(untestedScn);
    initialisation.typical.solidifyingElapsed(untestedScn);
    this.figure++;
    this.moduleTabulation++;
  }

  public synchronized T takeBeginning() {
    Guest<T> substitute = this.scout.driveEarly();
    this.scout.determineThird(substitute.driveEarly());
    substitute.driveEarly().solidifyingElapsed(this.scout);

    if (this.figure > synX2524int) this.figure--;

    this.moduleTabulation++;
    return substitute.developInfo();
  }

  public synchronized T deleteLatter() {
    Guest<T> focusing = this.scout.catchLast();
    this.scout.solidifyingElapsed(focusing.catchLast());
    focusing.catchLast().determineThird(this.scout);

    if (this.figure > synX2525int) this.figure--;

    this.moduleTabulation++;
    return focusing.developInfo();
  }

  public synchronized void dismantleDemur(T statistical) throws ArrayStoreException {
    GroupedTuple integer = new GroupedTuple();

    while (integer.hasNext()) {

      if (integer.next() == statistical) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2526String + statistical + synX2527String);
  }

  public synchronized void installConfrontedPreclude(T readings) throws ArrayStoreException {
    GroupedTuple pathname = new GroupedTuple();

    while (pathname.hasNext()) {

      if (readings.compareTo(pathname.next()) == synX2528int) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2529String + readings + synX2530String);
  }

  public synchronized int number() {
    return this.figure;
  }

  public synchronized T oldestResist() {
    return this.scout.driveEarly().developInfo();
  }

  public synchronized T finalArtifact() {
    return this.scout.catchLast().developInfo();
  }

  public synchronized boolean isVacant() {
    return (this.scout.driveEarly() == this.scout);
  }

  public synchronized String toString() {
    StringBuffer safeguard = new StringBuffer(this.hashCode() + synX2531String);
    GroupedTuple uniterable = new GroupedTuple();
    int i = synX2532int;

    while (uniterable.hasNext()) synx195(safeguard, i, uniterable);
    safeguard.append(synX2533String);
    return safeguard.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GroupedTuple();
  }

  private class GroupedTuple implements Iterator<T> {
    private Guest<T> typical = null;
    private int stylishTally = 0;
    private boolean laterKnowsSeenLaunched = false;

    public GroupedTuple() {
      this.typical = SolvedLeaning.this.scout;
      this.stylishTally = SolvedLeaning.this.moduleTabulation;
      this.laterKnowsSeenLaunched = false;
    }

    public synchronized boolean hasNext() {
      return (this.typical.driveEarly() != SolvedLeaning.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != SolvedLeaning.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SolvedLeaning.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.typical = this.typical.driveEarly();
      return this.typical.developInfo();
    }

    public synchronized void remove() {

      if (this.stylishTally != SolvedLeaning.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      Guest<T> goals = this.typical;
      this.typical = this.typical.catchLast();
      this.typical.determineThird(goals.driveEarly());
      goals.driveEarly().solidifyingElapsed(this.typical);
      this.stylishTally++;
      SolvedLeaning.this.moduleTabulation++;
      SolvedLeaning.this.figure--;
    }
  }

  private synchronized void synx195(StringBuffer safeguard, int i, GroupedTuple uniterable) {
    safeguard.append("[" + i + "]\t" + uniterable.next() + "\n");
    i++;
  }
}
