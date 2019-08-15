import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Fsu extends ReplacingScheme {

  public synchronized void slayHomepage(System existingCycle) {
    Predicate<Layout> ial;
    Layout youngest;
    ial =
        (new Predicate<Layout>() {

          public synchronized boolean test(Layout postscript) {
            return postscript.catchAddSue() == existingCycle.goQuod();
          }
        });
    youngest = (Enclosures.stream().filter(ial).max(comparingInt(Layout::makeBars)).get());
    Enclosures.remove(youngest);
  }

  public synchronized boolean isComplete() {
    return Enclosures.size() >= HighestMountings;
  }

  public Fsu() {
    this.Enclosures = (new LinkedList<>());
  }

  public final int HighestMountings = 30;
  public Queue<Layout> Enclosures = null;

  public synchronized boolean breakWishes(System latestOperation) {
    List<Layout> chapter;
    Enclosures.forEach(Layout::growthCounterpunch);
    chapter = (new ArrayList<>());
    for (Layout Skeleton : Enclosures) synx142(latestOperation, Skeleton, chapter);

    if (chapter.size() > 0) {
      chapter.forEach(Layout::revertNegative);
      return true;
    }

    return false;
  }

  protected synchronized void provideLayout(Layout layout, System presentNegotiations) {
    List<Layout> thermometer;
    Layout presently;

    if (this.isComplete()
        || presentNegotiations.catchAddSections() == presentNegotiations.conveyGreatestSlides())
      synx143(presentNegotiations);

    thermometer = (new LinkedList<>());
    for (Layout f : Enclosures) synx144(f, layout, presentNegotiations, thermometer);
    presently = (null);

    if (thermometer.size() > 0) presently = (thermometer.get(0));

    if (presently == null) synx145(layout, presentNegotiations);
    else synx146(presently);
  }

  private synchronized void synx142(
      System latestOperation, Layout Skeleton, java.util.List<Layout> chapter) {

    if (latestOperation.obtainInquires().peek().equals(Skeleton.developPeg())
        && latestOperation.goQuod() == Skeleton.catchAddSue()) {
      chapter.add(Skeleton);
    }
  }

  private synchronized void synx143(System presentNegotiations) {
    this.slayHomepage(presentNegotiations);
  }

  private synchronized void synx144(
      Layout f, Layout layout, System presentNegotiations, java.util.List<Layout> thermometer) {

    if (f.developPeg() == layout.developPeg() && f.catchAddSue() == presentNegotiations.goQuod())
      thermometer.add(f);
  }

  private synchronized void synx145(Layout layout, System presentNegotiations) {
    Enclosures.add(layout);
    presentNegotiations.arrangeGetImpressions(presentNegotiations.catchAddSections() + 1);
  }

  private synchronized void synx146(Layout presently) {
    presently.revertNegative();
  }
}
