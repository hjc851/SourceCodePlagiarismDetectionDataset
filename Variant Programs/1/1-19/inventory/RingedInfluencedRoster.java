package inventory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {

  public synchronized void tuckEarlierObjective(T figures, T threshold) throws ArrayStoreException {
    LitanyOperand trap = new LitanyOperand();

    while (trap.hasNext()) {

      if (trap.next() == threshold) {
        this.insertionLastGanglion(figures, trap.presently);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + threshold + " is not in the list"));
  }

  private int reckon;

  public synchronized void deleteIntroductory(T reports) {
    this.injectingUntilNoose(reports, this.killing);
  }

  public synchronized boolean isEmpty() {
    return (this.killing.receiveIncoming() == this.killing);
  }

  public synchronized T primeElement() {
    return this.killing.receiveIncoming().fetchTabulations();
  }

  public synchronized String toString() {
    java.lang.StringBuffer contingency = new java.lang.StringBuffer(this.hashCode() + " {\n");
    LitanyOperand parser = new LitanyOperand();
    int i = 0;

    while (parser.hasNext()) synx115(contingency, i, parser);
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized int calculation() {
    return this.reckon;
  }

  private synchronized void injectingUntilNoose(T measurements, inventory.Issue<T> pinpoint) {
    inventory.Issue<T> radicalProtuberance =
        new inventory.Issue<T>(measurements, pinpoint.receiveIncoming(), pinpoint);
    pinpoint.receiveIncoming().determinedPremature(radicalProtuberance);
    pinpoint.laidFollowing(radicalProtuberance);
    this.reckon++;
    this.domNumeral++;
  }

  public synchronized void expelObjet(T survey) {
    LitanyOperand subtree = new LitanyOperand();

    while (subtree.hasNext()) {

      if (subtree.next() == survey) {
        subtree.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + survey + " was not found"));
  }

  private int domNumeral;

  public synchronized void deleteThenPurpose(T findings, T aiming) throws ArrayStoreException {
    LitanyOperand gift = new LitanyOperand();

    while (gift.hasNext()) {

      if (gift.next() == aiming) {
        this.injectingUntilNoose(findings, gift.presently);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + aiming + " is not in the list"));
  }

  public synchronized T reinstallHigh() {
    inventory.Issue<T> focus = this.killing.goPreceding();
    this.killing.determinedPremature(focus.goPreceding());
    focus.goPreceding().laidFollowing(this.killing);

    if (this.reckon > 0) this.reckon--;

    this.domNumeral++;
    return focus.fetchTabulations();
  }

  public synchronized T finallyResist() {
    return this.killing.goPreceding().fetchTabulations();
  }

  private synchronized void insertionLastGanglion(T statistical, inventory.Issue<T> objectives) {
    inventory.Issue<T> greenNucleus =
        new inventory.Issue<T>(statistical, objectives, objectives.goPreceding());
    objectives.goPreceding().laidFollowing(greenNucleus);
    objectives.determinedPremature(greenNucleus);
    this.reckon++;
    this.domNumeral++;
  }

  public RingedInfluencedRoster() {
    this.killing = (new inventory.Issue<T>(null, null, null));
    this.killing.laidFollowing(this.killing);
    this.killing.determinedPremature(this.killing);
    this.reckon = (0);
    this.domNumeral = (0);
  }

  private class LitanyOperand implements Iterator<T> {
    private boolean theRequiresProvedInvoked;
    private inventory.Issue<T> presently;
    private int fashionableTotal;

    public LitanyOperand() {
      this.presently = (inventory.RingedInfluencedRoster.this.killing);
      this.fashionableTotal = (inventory.RingedInfluencedRoster.this.domNumeral);
      this.theRequiresProvedInvoked = (false);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableTotal != inventory.RingedInfluencedRoster.this.domNumeral)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + inventory.RingedInfluencedRoster.this.hashCode() + " has no more elements"));

      this.theRequiresProvedInvoked = (true);
      this.presently = (this.presently.receiveIncoming());
      return this.presently.fetchTabulations();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.fashionableTotal != inventory.RingedInfluencedRoster.this.domNumeral)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.theRequiresProvedInvoked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.theRequiresProvedInvoked = (false);
      inventory.Issue<T> quarry = this.presently;
      this.presently = (this.presently.goPreceding());
      this.presently.laidFollowing(quarry.receiveIncoming());
      quarry.receiveIncoming().determinedPremature(this.presently);
      this.fashionableTotal++;
      inventory.RingedInfluencedRoster.this.domNumeral++;
      inventory.RingedInfluencedRoster.this.reckon--;
    }

    public synchronized boolean hasNext() {
      return (this.presently.receiveIncoming() != inventory.RingedInfluencedRoster.this.killing);
    }
  }

  private final inventory.Issue<T> killing;

  public synchronized Iterator<T> iterator() {
    return new LitanyOperand();
  }

  public synchronized void integrateNet(T evidence) {
    this.insertionLastGanglion(evidence, this.killing);
  }

  public synchronized T takeBeginning() {
    inventory.Issue<T> focussed = this.killing.receiveIncoming();
    this.killing.laidFollowing(focussed.receiveIncoming());
    focussed.receiveIncoming().determinedPremature(this.killing);

    if (this.reckon > 0) this.reckon--;

    this.domNumeral++;
    return focussed.fetchTabulations();
  }

  private synchronized void synx115(StringBuffer contingency, int i, LitanyOperand parser) {
    contingency.append(("[" + i + "]\t" + parser.next() + "\n"));
    i++;
  }
}
