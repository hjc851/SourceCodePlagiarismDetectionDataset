package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ScreenedRosters<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2457int = 0;
  private static final int synX2456int = 0;
  private static final String synX2455String = "}\n";
  private static final int synX2454int = 0;
  private static final String synX2453String = " {\n";
  private static final String synX2452String = " was not found";
  private static final String synX2451String = "Object ";
  private static final int synX2450int = 0;
  private static final int synX2449int = 0;
  private static final int synX2448int = 0;
  private static final int synX2447int = 0;

  public synchronized T premiereBody() {
    return this.locational.driveEarly().bringStatistics();
  }

  public synchronized void delete(T information) {
    IndexedSubstring inode;
    garage.Ribbon<T> radicalProtuberance;
    inode = new IndexedSubstring();

    while (inode.hasNext()) {

      if (information.compareTo(inode.next()) >= synX2447int) {
        break;
      }

      if (inode.underway.driveEarly() == this.locational) {
        garage.Ribbon<T> risingCarrefour;
        risingCarrefour =
            new garage.Ribbon<T>(information, this.locational, this.locational.sustainPre());
        this.locational.sustainPre().rigidCome(risingCarrefour);
        this.locational.situatedLatest(risingCarrefour);
        this.calculate++;
        this.dodCharge++;
        return;
      }
    }
    radicalProtuberance =
        new garage.Ribbon<T>(information, inode.underway, inode.underway.sustainPre());
    inode.underway.sustainPre().rigidCome(radicalProtuberance);
    inode.underway.situatedLatest(radicalProtuberance);
    this.calculate++;
    this.dodCharge++;
  }

  public synchronized T latestCavil() {
    return this.locational.sustainPre().bringStatistics();
  }

  public synchronized T installSenior() {
    garage.Ribbon<T> focussed;
    focussed = this.locational.sustainPre();
    this.locational.situatedLatest(focussed.sustainPre());
    focussed.sustainPre().rigidCome(this.locational);

    if (this.calculate > synX2448int) this.calculate--;

    this.dodCharge++;
    return focussed.bringStatistics();
  }

  public int calculate = 0;

  public synchronized T yankCommencement() {
    garage.Ribbon<T> temporal;
    temporal = this.locational.driveEarly();
    this.locational.rigidCome(temporal.driveEarly());
    temporal.driveEarly().situatedLatest(this.locational);

    if (this.calculate > synX2449int) this.calculate--;

    this.dodCharge++;
    return temporal.bringStatistics();
  }

  public int dodCharge = 0;

  public synchronized void transferComparisonTarget(T files) throws ArrayStoreException {
    IndexedSubstring uniterable;
    uniterable = new IndexedSubstring();

    while (uniterable.hasNext()) {

      if (files.compareTo(uniterable.next()) == synX2450int) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2451String + files + synX2452String);
  }

  public synchronized boolean isVacant() {
    return (this.locational.driveEarly() == this.locational);
  }

  public synchronized Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  public final garage.Ribbon<T> locational;

  public synchronized String toString() {
    java.lang.StringBuffer extra;
    IndexedSubstring integer;
    int i;
    extra = new java.lang.StringBuffer(this.hashCode() + synX2453String);
    integer = new IndexedSubstring();
    i = synX2454int;

    while (integer.hasNext()) synx186(extra, i, integer);
    extra.append(synX2455String);
    return extra.toString();
  }

  public ScreenedRosters() {
    this.locational = new garage.Ribbon<T>(null, null, null);
    this.locational.rigidCome(locational);
    this.locational.situatedLatest(locational);
    this.calculate = synX2456int;
    this.dodCharge = synX2457int;
  }

  public synchronized int tabulation() {
    return this.calculate;
  }

  public class IndexedSubstring implements Iterator<T> {
    public boolean thirdRepresentsStartedTelephoned = false;
    public garage.Ribbon<T> underway = null;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernEnumerate != garage.ScreenedRosters.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + garage.ScreenedRosters.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.underway = this.underway.driveEarly();
      return this.underway.bringStatistics();
    }

    public synchronized boolean hasNext() {
      return (this.underway.driveEarly() != garage.ScreenedRosters.this.locational);
    }

    public IndexedSubstring() {
      this.underway = garage.ScreenedRosters.this.locational;
      this.modernEnumerate = garage.ScreenedRosters.this.dodCharge;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public int modernEnumerate = 0;

    public synchronized void remove() {
      garage.Ribbon<T> aim;

      if (this.modernEnumerate != garage.ScreenedRosters.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      aim = this.underway;
      this.underway = this.underway.sustainPre();
      this.underway.rigidCome(aim.driveEarly());
      aim.driveEarly().situatedLatest(this.underway);
      this.modernEnumerate++;
      garage.ScreenedRosters.this.dodCharge++;
      garage.ScreenedRosters.this.calculate--;
    }
  }

  public synchronized void installPreclude(T stats) throws ArrayStoreException {
    IndexedSubstring substring;
    substring = new IndexedSubstring();

    while (substring.hasNext()) {

      if (substring.next() == stats) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  private synchronized void synx186(StringBuffer extra, int i, IndexedSubstring integer) {
    extra.append("[" + i + "]\t" + integer.next() + "\n");
    i++;
  }
}
