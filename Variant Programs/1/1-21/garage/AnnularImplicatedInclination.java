package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnularImplicatedInclination<T> implements Iterable<T> {

  public synchronized T eldestMatter() {
    return this.controlled.receiveIncoming().produceSurvey();
  }

  public synchronized void eraseArgue(T statistical) {
    AgendaConst init = new AgendaConst();

    while (init.hasNext()) {

      if (init.next() == statistical) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + statistical + " was not found"));
  }

  public synchronized int numeration() {
    return this.recount;
  }

  public synchronized T eradicateDying() {
    Client<T> threshold = this.controlled.beatElapsed();
    this.controlled.solidifyingElapsed(threshold.beatElapsed());
    threshold.beatElapsed().determinedLast(this.controlled);

    if (this.recount > 0) this.recount--;

    this.modernList++;
    return threshold.produceSurvey();
  }

  private class AgendaConst implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.present.receiveIncoming() != AnnularImplicatedInclination.this.controlled);
    }

    private int consSeveral = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.consSeveral != AnnularImplicatedInclination.this.modernList)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + AnnularImplicatedInclination.this.hashCode() + " has no more elements"));

      this.comingDeservesFallenUrged = (true);
      this.present = (this.present.receiveIncoming());
      return this.present.produceSurvey();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.consSeveral != AnnularImplicatedInclination.this.modernList)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = (false);
      Client<T> focusing = this.present;
      this.present = (this.present.beatElapsed());
      this.present.determinedLast(focusing.receiveIncoming());
      focusing.receiveIncoming().solidifyingElapsed(this.present);
      this.consSeveral++;
      AnnularImplicatedInclination.this.modernList++;
      AnnularImplicatedInclination.this.recount--;
    }

    private Client<T> present = null;

    public AgendaConst() {
      this.present = (AnnularImplicatedInclination.this.controlled);
      this.consSeveral = (AnnularImplicatedInclination.this.modernList);
      this.comingDeservesFallenUrged = (false);
    }

    private boolean comingDeservesFallenUrged = false;
  }

  public synchronized boolean isEmpty() {
    return (this.controlled.receiveIncoming() == this.controlled);
  }

  public AnnularImplicatedInclination() {
    this.controlled = (new Client<T>(null, null, null));
    this.controlled.determinedLast(this.controlled);
    this.controlled.solidifyingElapsed(this.controlled);
    this.recount = (0);
    this.modernList = (0);
  }

  public synchronized void appendDuringElement(T numbers, T objective) throws ArrayStoreException {
    AgendaConst sign = new AgendaConst();

    while (sign.hasNext()) {

      if (sign.next() == objective) {
        this.inscribeSoonRibbon(numbers, sign.present);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + objective + " is not in the list"));
  }

  public synchronized T latterBody() {
    return this.controlled.beatElapsed().produceSurvey();
  }

  private synchronized void inscribeSoonRibbon(T readings, Client<T> aiming) {
    Client<T> newfoundJunction = new Client<T>(readings, aiming, aiming.beatElapsed());
    aiming.beatElapsed().determinedLast(newfoundJunction);
    aiming.solidifyingElapsed(newfoundJunction);
    this.recount++;
    this.modernList++;
  }

  public synchronized String toString() {
    StringBuffer separating = new StringBuffer(this.hashCode() + " {\n");
    AgendaConst initialize = new AgendaConst();
    int i = 0;

    while (initialize.hasNext()) synx133(separating, i, initialize);
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new AgendaConst();
  }

  private synchronized void attachAgoHub(T stats, Client<T> objectives) {
    Client<T> novelLump = new Client<T>(stats, objectives.receiveIncoming(), objectives);
    objectives.receiveIncoming().solidifyingElapsed(novelLump);
    objectives.determinedLast(novelLump);
    this.recount++;
    this.modernList++;
  }

  public synchronized void insetAftItem(T tabulations, T place) throws ArrayStoreException {
    AgendaConst aberdeen = new AgendaConst();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == place) {
        this.attachAgoHub(tabulations, aberdeen.present);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + place + " is not in the list"));
  }

  public synchronized void incloseTop(T results) {
    this.attachAgoHub(results, this.controlled);
  }

  private int recount = 0;
  private int modernList = 0;

  public synchronized T absentInitial() {
    Client<T> butt = this.controlled.receiveIncoming();
    this.controlled.determinedLast(butt.receiveIncoming());
    butt.receiveIncoming().solidifyingElapsed(this.controlled);

    if (this.recount > 0) this.recount--;

    this.modernList++;
    return butt.produceSurvey();
  }

  private final Client<T> controlled;

  public synchronized void inscribeConcluding(T intelligence) {
    this.inscribeSoonRibbon(intelligence, this.controlled);
  }

  private synchronized void synx133(StringBuffer separating, int i, AgendaConst initialize) {
    separating.append(("[" + i + "]\t" + initialize.next() + "\n"));
    i++;
  }
}
