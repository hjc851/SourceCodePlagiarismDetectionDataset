package archival;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrbicularRelatedTilt<T> implements Iterable<T> {
  private static final int synX2191int = 0;
  private static final String synX2190String = " was not found";
  private static final String synX2189String = "Object ";
  private static final String synX2188String = "}\n";
  private static final int synX2187int = 0;
  private static final String synX2186String = " {\n";

  public synchronized T startArtefact() {
    return this.guerite.fetchThird().obtainMeasurements();
  }

  public synchronized void insetMaiden(T survey) {
    this.incorporateDespiteCore(survey, this.guerite);
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.fetchThird() == this.guerite);
  }

  public synchronized int tabulation() {
    return this.reckon;
  }

  public synchronized String toString() {
    java.lang.StringBuffer stabilization;
    PlaylistParser concatenate;
    int i;
    stabilization = new java.lang.StringBuffer(this.hashCode() + synX2186String);
    concatenate = new PlaylistParser();
    i = synX2187int;

    while (concatenate.hasNext()) synx160(stabilization, i, concatenate);
    stabilization.append(synX2188String);
    return stabilization.toString();
  }

  public synchronized void dismantleDemur(T tabulations) {
    PlaylistParser substring;
    substring = new PlaylistParser();

    while (substring.hasNext()) {

      if (substring.next() == tabulations) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2189String + tabulations + synX2190String);
  }

  private synchronized void tuckEarlierKnob(T analysis, archival.Nub<T> objective) {
    archival.Nub<T> unprecedentedNub;
    unprecedentedNub = new archival.Nub<T>(analysis, objective, objective.obtainPremature());
    objective.obtainPremature().readyAdjacent(unprecedentedNub);
    objective.arrangeAgo(unprecedentedNub);
    this.reckon++;
    this.stylishAmount++;
  }

  private synchronized void incorporateDespiteCore(T files, archival.Nub<T> focused) {
    archival.Nub<T> newlyKnob;
    newlyKnob = new archival.Nub<T>(files, focused.fetchThird(), focused);
    focused.fetchThird().arrangeAgo(newlyKnob);
    focused.readyAdjacent(newlyKnob);
    this.reckon++;
    this.stylishAmount++;
  }

  public synchronized T expelConcluding() {
    archival.Nub<T> focussed;
    focussed = this.guerite.obtainPremature();
    this.guerite.arrangeAgo(focussed.obtainPremature());
    focussed.obtainPremature().readyAdjacent(this.guerite);

    if (this.reckon > synX2191int) this.reckon--;

    this.stylishAmount++;
    return focussed.obtainMeasurements();
  }

  public synchronized T closeDemur() {
    return this.guerite.obtainPremature().obtainMeasurements();
  }

  private final archival.Nub<T> guerite;

  public synchronized void addLatter(T database) {
    this.tuckEarlierKnob(database, this.guerite);
  }

  private class PlaylistParser implements Iterator<T> {

    public PlaylistParser() {
      this.live = archival.OrbicularRelatedTilt.this.guerite;
      this.boldlyCaseload = archival.OrbicularRelatedTilt.this.stylishAmount;
      this.newOffersEnduredSuggested = false;
    }

    private int boldlyCaseload;
    private archival.Nub<T> live;

    public synchronized void remove() throws ConcurrentModificationException {
      archival.Nub<T> objectives;

      if (this.boldlyCaseload != archival.OrbicularRelatedTilt.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      objectives = this.live;
      this.live = this.live.obtainPremature();
      this.live.readyAdjacent(objectives.fetchThird());
      objectives.fetchThird().arrangeAgo(this.live);
      this.boldlyCaseload++;
      archival.OrbicularRelatedTilt.this.stylishAmount++;
      archival.OrbicularRelatedTilt.this.reckon--;
    }

    private boolean newOffersEnduredSuggested;

    public synchronized boolean hasNext() {
      return (this.live.fetchThird() != archival.OrbicularRelatedTilt.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != archival.OrbicularRelatedTilt.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archival.OrbicularRelatedTilt.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.live = this.live.fetchThird();
      return this.live.obtainMeasurements();
    }
  }

  private int stylishAmount;

  public synchronized Iterator<T> iterator() {
    return new PlaylistParser();
  }

  public synchronized T eraseFirstborn() {
    archival.Nub<T> goal;
    goal = this.guerite.fetchThird();
    this.guerite.readyAdjacent(goal.fetchThird());
    goal.fetchThird().arrangeAgo(this.guerite);

    if (this.reckon > 0) this.reckon--;

    this.stylishAmount++;
    return goal.obtainMeasurements();
  }

  public synchronized void insertionLastResist(T statistical, T place) throws ArrayStoreException {
    PlaylistParser above;
    above = new PlaylistParser();

    while (above.hasNext()) {

      if (above.next() == place) {
        this.tuckEarlierKnob(statistical, above.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + place + " is not in the list");
  }

  public synchronized void injectedWakeMatter(T measurements, T pinpoint)
      throws ArrayStoreException {
    PlaylistParser date;
    date = new PlaylistParser();

    while (date.hasNext()) {

      if (date.next() == pinpoint) {
        this.incorporateDespiteCore(measurements, date.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public OrbicularRelatedTilt() {
    this.guerite = new archival.Nub<T>(null, null, null);
    this.guerite.readyAdjacent(this.guerite);
    this.guerite.arrangeAgo(this.guerite);
    this.reckon = 0;
    this.stylishAmount = 0;
  }

  private int reckon;

  private synchronized void synx160(StringBuffer stabilization, int i, PlaylistParser concatenate) {
    stabilization.append("[" + i + "]\t" + concatenate.next() + "\n");
    i++;
  }
}
