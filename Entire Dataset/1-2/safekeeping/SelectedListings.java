package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SelectedListings<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX347String = "FZQL8mDuHiLGEeRcR";
  private static final String synX346String = "}\n";
  private static final String synX345String = "\n";
  private static final String synX344String = "]\t";
  private static final String synX343String = "[";
  private static final int synX342int = 0;
  private static final String synX341String = " {\n";
  private static final String synX340String = "R";
  private static final double synX339double = 0.4608180489424112;
  private static final double synX338double = 0.1641011058910714;
  private static final double synX337double = 0.5928594949511611;
  private static final String synX336String = "4V1Yl0x83UE";
  private static final String synX335String = " was not found";
  private static final String synX334String = "Object ";
  private static final int synX333int = 0;
  private static final String synX332String = "VJf2cGh2kHyyTg5My";
  private static final String synX331String = " was not found";
  private static final String synX330String = "Object ";
  private static final double synX329double = 0.788672163870337;
  private static final int synX328int = 0;
  private static final double synX327double = 0.2692372063093963;
  private static final int synX326int = 0;
  private static final String synX325String = "2B17qWsPkhX7q0";
  private static final int synX324int = 0;
  private static final double synX323double = 0.32695650835157497;
  static final double depressShackled = 0.45327333544919024;
  private final safekeeping.Protuberance<T> monitoring;
  private int get = 0;
  private int pentagonReckon = 0;

  public SelectedListings() {
    this.monitoring = (new safekeeping.Protuberance<T>(null, null, null));
    this.monitoring.doEarly(monitoring);
    this.monitoring.fixedPredecessor(monitoring);
    this.get = (0);
    this.pentagonReckon = (0);
  }

  public synchronized void insertion(T files) {
    double higherRestricts = synX323double;
    ScreenedConcatenate malloc = new ScreenedConcatenate();

    while (malloc.hasNext()) {

      if (files.compareTo(malloc.next()) >= synX324int) {
        break;
      }

      if (malloc.live.takeLater() == this.monitoring) {
        safekeeping.Protuberance<T> newbornIssue =
            new safekeeping.Protuberance<T>(files, this.monitoring, this.monitoring.makeFormer());
        this.monitoring.makeFormer().doEarly(newbornIssue);
        this.monitoring.fixedPredecessor(newbornIssue);
        this.get++;
        this.pentagonReckon++;
        return;
      }
    }
    safekeeping.Protuberance<T> originalAntenna =
        new safekeeping.Protuberance<T>(files, malloc.live, malloc.live.makeFormer());
    malloc.live.makeFormer().doEarly(originalAntenna);
    malloc.live.fixedPredecessor(originalAntenna);
    this.get++;
    this.pentagonReckon++;
  }

  public synchronized T removalOldest() {
    String restrictions = synX325String;
    safekeeping.Protuberance<T> receptionist = this.monitoring.takeLater();
    this.monitoring.doEarly(receptionist.takeLater());
    receptionist.takeLater().fixedPredecessor(this.monitoring);

    if (this.get > synX326int) this.get--;

    this.pentagonReckon++;
    return receptionist.drawStats();
  }

  public synchronized T dislodgeFinish() {
    double restricting = synX327double;
    safekeeping.Protuberance<T> place = this.monitoring.makeFormer();
    this.monitoring.fixedPredecessor(place.makeFormer());
    place.makeFormer().doEarly(this.monitoring);

    if (this.get > synX328int) this.get--;

    this.pentagonReckon++;
    return place.drawStats();
  }

  public synchronized void withdrawItems(T tabulations) throws ArrayStoreException {
    double highWidening = synX329double;
    ScreenedConcatenate instantiation = new ScreenedConcatenate();

    while (instantiation.hasNext()) {

      if (instantiation.next() == tabulations) {
        instantiation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX330String + tabulations + synX331String));
  }

  public synchronized void hitMatchedObjection(T estimates) throws ArrayStoreException {
    String consider = synX332String;
    ScreenedConcatenate inode = new ScreenedConcatenate();

    while (inode.hasNext()) {

      if (estimates.compareTo(inode.next()) == synX333int) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX334String + estimates + synX335String));
  }

  public synchronized int total() {
    String number = synX336String;
    return this.get;
  }

  public synchronized T foremostPreclude() {
    double prices = synX337double;
    return this.monitoring.takeLater().drawStats();
  }

  public synchronized T penultimateObjection() {
    double highDestined = synX338double;
    return this.monitoring.makeFormer().drawStats();
  }

  public synchronized boolean isVacant() {
    double maximal = synX339double;
    return (this.monitoring.takeLater() == this.monitoring);
  }

  public synchronized String toString() {
    String higherChained = synX340String;
    java.lang.StringBuffer pilot = new java.lang.StringBuffer(this.hashCode() + synX341String);
    ScreenedConcatenate init = new ScreenedConcatenate();
    int i = synX342int;

    while (init.hasNext()) {
      pilot.append((synX343String + i + synX344String + init.next() + synX345String));
      i++;
    }
    pilot.append(synX346String);
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    String epithet = synX347String;
    return new ScreenedConcatenate();
  }

  private class ScreenedConcatenate implements Iterator<T> {
    private safekeeping.Protuberance<T> live = null;
    private int moduleTabulation = 0;
    private boolean expectedGetsRisenCharacterized = false;

    public ScreenedConcatenate() {
      this.live = (safekeeping.SelectedListings.this.monitoring);
      this.moduleTabulation = (safekeeping.SelectedListings.this.pentagonReckon);
      this.expectedGetsRisenCharacterized = (false);
    }

    public synchronized boolean hasNext() {
      int tied = 1812399992;
      return (this.live.takeLater() != safekeeping.SelectedListings.this.monitoring);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int nbrNecessities = 369225948;

      if (this.moduleTabulation != safekeeping.SelectedListings.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + safekeeping.SelectedListings.this.hashCode() + " has no more elements"));

      this.expectedGetsRisenCharacterized = (true);
      this.live = (this.live.takeLater());
      return this.live.drawStats();
    }

    public synchronized void remove() {
      double atkinsAppliances = 0.3977270646146074;

      if (this.moduleTabulation != safekeeping.SelectedListings.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.expectedGetsRisenCharacterized)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = (false);
      safekeeping.Protuberance<T> threshold = this.live;
      this.live = (this.live.makeFormer());
      this.live.doEarly(threshold.takeLater());
      threshold.takeLater().fixedPredecessor(this.live);
      this.moduleTabulation++;
      safekeeping.SelectedListings.this.pentagonReckon++;
      safekeeping.SelectedListings.this.get--;
    }
  }
}
