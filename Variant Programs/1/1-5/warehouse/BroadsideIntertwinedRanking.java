package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsideIntertwinedRanking<T> implements Iterable<T> {
  private static final int synX515int = 0;
  private static final int synX514int = 0;
  private static final String synX513String = " is not in the list";
  private static final String synX512String = "Target ";
  private static final String synX511String = " was not found";
  private static final String synX510String = "Object ";
  private static final String synX509String = "}\n";
  private static final int synX508int = 0;
  private static final String synX507String = " {\n";
  private static final int synX506int = 0;
  private static final String synX505String = " is not in the list";
  private static final String synX504String = "Target ";
  private static final int synX503int = 0;

  public synchronized T ejectSurvive() {
    warehouse.Point<T> achieve = this.arbovirus.makeFormer();
    this.arbovirus.bentOriginal(achieve.makeFormer());
    achieve.makeFormer().dictatedClose(this.arbovirus);

    if (this.tell > synX503int) this.tell--;

    this.fashionTurn++;
    return achieve.becomeStudy();
  }

  public synchronized void introduceInaugural(T information) {
    this.putFromPoint(information, this.arbovirus);
  }

  private synchronized void appendDuringProtuberance(T stats, warehouse.Point<T> focused) {
    warehouse.Point<T> recentPoint = new warehouse.Point<T>(stats, focused, focused.makeFormer());
    focused.makeFormer().dictatedClose(recentPoint);
    focused.bentOriginal(recentPoint);
    this.tell++;
    this.fashionTurn++;
  }

  private synchronized void putFromPoint(T evidence, warehouse.Point<T> butt) {
    warehouse.Point<T> refreshingRibbon =
        new warehouse.Point<T>(evidence, butt.startForthcoming(), butt);
    butt.startForthcoming().bentOriginal(refreshingRibbon);
    butt.dictatedClose(refreshingRibbon);
    this.tell++;
    this.fashionTurn++;
  }

  public synchronized T finishOppose() {
    return this.arbovirus.makeFormer().becomeStudy();
  }

  public synchronized boolean isEmpty() {
    return (this.arbovirus.startForthcoming() == this.arbovirus);
  }

  public synchronized void integrateWithinDisagree(T study, T benchmark)
      throws ArrayStoreException {
    BlacklistSubroutine ace = new BlacklistSubroutine();

    while (ace.hasNext()) {

      if (ace.next() == benchmark) {
        this.putFromPoint(study, ace.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX504String + benchmark + synX505String);
  }

  public synchronized T undoBasic() {
    warehouse.Point<T> goals = this.arbovirus.startForthcoming();
    this.arbovirus.dictatedClose(goals.startForthcoming());
    goals.startForthcoming().bentOriginal(this.arbovirus);

    if (this.tell > synX506int) this.tell--;

    this.fashionTurn++;
    return goals.becomeStudy();
  }

  private int fashionTurn;
  private int tell;
  private final warehouse.Point<T> arbovirus;

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + synX507String);
    BlacklistSubroutine subtree = new BlacklistSubroutine();
    int i = synX508int;

    while (subtree.hasNext()) synx43(barrier, i, subtree);
    barrier.append(synX509String);
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new BlacklistSubroutine();
  }

  public synchronized void installPreclude(T estimates) {
    BlacklistSubroutine init = new BlacklistSubroutine();

    while (init.hasNext()) {

      if (init.next() == estimates) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX510String + estimates + synX511String);
  }

  public synchronized T maidenItem() {
    return this.arbovirus.startForthcoming().becomeStudy();
  }

  public synchronized void incorporatedGo(T readings) {
    this.appendDuringProtuberance(readings, this.arbovirus);
  }

  public synchronized void integrateSwiftlyDisagree(T measurements, T point)
      throws ArrayStoreException {
    BlacklistSubroutine fad = new BlacklistSubroutine();

    while (fad.hasNext()) {

      if (fad.next() == point) {
        this.appendDuringProtuberance(measurements, fad.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX512String + point + synX513String);
  }

  public BroadsideIntertwinedRanking() {
    this.arbovirus = new warehouse.Point<T>(null, null, null);
    this.arbovirus.dictatedClose(this.arbovirus);
    this.arbovirus.bentOriginal(this.arbovirus);
    this.tell = synX514int;
    this.fashionTurn = synX515int;
  }

  public synchronized int quantify() {
    return this.tell;
  }

  private class BlacklistSubroutine implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.iloBit != warehouse.BroadsideIntertwinedRanking.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      warehouse.Point<T> place = this.prevailing;
      this.prevailing = this.prevailing.makeFormer();
      this.prevailing.dictatedClose(place.startForthcoming());
      place.startForthcoming().bentOriginal(this.prevailing);
      this.iloBit++;
      warehouse.BroadsideIntertwinedRanking.this.fashionTurn++;
      warehouse.BroadsideIntertwinedRanking.this.tell--;
    }

    private int iloBit;

    public BlacklistSubroutine() {
      this.prevailing = warehouse.BroadsideIntertwinedRanking.this.arbovirus;
      this.iloBit = warehouse.BroadsideIntertwinedRanking.this.fashionTurn;
      this.againOwesArisenChristened = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != warehouse.BroadsideIntertwinedRanking.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + warehouse.BroadsideIntertwinedRanking.this.hashCode()
                + " has no more elements");

      this.againOwesArisenChristened = true;
      this.prevailing = this.prevailing.startForthcoming();
      return this.prevailing.becomeStudy();
    }

    private boolean againOwesArisenChristened;
    private warehouse.Point<T> prevailing;

    public synchronized boolean hasNext() {
      return (this.prevailing.startForthcoming()
          != warehouse.BroadsideIntertwinedRanking.this.arbovirus);
    }
  }

  private synchronized void synx43(StringBuffer barrier, int i, BlacklistSubroutine subtree) {
    barrier.append("[" + i + "]\t" + subtree.next() + "\n");
    i++;
  }
}
