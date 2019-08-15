import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fsu extends FallbackStrategist {
  private static final int synX1662int = 0;
  private static final int synX1661int = 0;
  private static final boolean synX1660boolean = false;
  private static final boolean synX1659boolean = true;
  private static final int synX1658int = 0;

  public Fsu() {
    this.Tires = new LinkedList<>();
  }

  public synchronized void discardScreen(System afootSummons) {
    Predicate<Web> gener;
    Web greatest;
    gener =
        new Predicate<Web>() {

          public synchronized boolean test(Web postscript) {
            return postscript.beatWaitProceedings() == afootSummons.arriveIdentifying();
          }
        };
    greatest = Tires.stream().filter(gener).max(Comparator.comparingInt(Web::haveChip)).get();
    Tires.remove(greatest);
  }

  public synchronized boolean breakWishes(System streamPhase) {
    List<Web> website;
    Tires.forEach(Web::growthCounterpunch);
    website = new ArrayList<>();
    for (Web Couch : Tires) synx218(streamPhase, Couch, website);

    if (website.size() > synX1658int) {
      website.forEach(Web::rebalanceHeel);
      return synX1659boolean;
    }

    return synX1660boolean;
  }

  public Queue<Web> Tires = null;

  public synchronized boolean isComplete() {
    return Tires.size() >= LimitImages;
  }

  protected synchronized void incorporateFootnote(Web webpage, System thisMethods) {
    List<Web> solvate;
    Web prevalent;

    if (this.isComplete()
        || thisMethods.obtainInstructionHomepage() == thisMethods.comeLimitVarlet())
      synx219(thisMethods);

    solvate = new LinkedList<>();
    for (Web f : Tires) synx220(f, webpage, thisMethods, solvate);
    prevalent = null;

    if (solvate.size() > synX1661int) prevalent = solvate.get(synX1662int);

    if (prevalent == null) synx221(webpage, thisMethods);
    else synx222(prevalent);
  }

  public final int LimitImages = 30;

  private synchronized void synx218(System streamPhase, Web Couch, java.util.List<Web> website) {

    if (streamPhase.arriveInvitations().peek().equals(Couch.produceMap())
        && streamPhase.arriveIdentifying() == Couch.beatWaitProceedings()) {
      website.add(Couch);
    }
  }

  private synchronized void synx219(System thisMethods) {
    this.discardScreen(thisMethods);
  }

  private synchronized void synx220(
      Web f, Web webpage, System thisMethods, java.util.List<Web> solvate) {

    if (f.produceMap() == webpage.produceMap()
        && f.beatWaitProceedings() == thisMethods.arriveIdentifying()) solvate.add(f);
  }

  private synchronized void synx221(Web webpage, System thisMethods) {
    Tires.add(webpage);
    thisMethods.laidPeenVarlet(thisMethods.obtainInstructionHomepage() + 1);
  }

  private synchronized void synx222(Web prevalent) {
    prevalent.rebalanceHeel();
  }
}
