import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Mississippi extends AlternatePolicy {
  private static final double synX457double = 0.03909197134863307;
  private static final boolean synX456boolean = false;
  private static final boolean synX455boolean = true;
  private static final int synX454int = 0;
  private static final double synX453double = 0.02824627608566299;
  private static final double synX452double = 0.42839203499499723;
  private static final double synX451double = 0.5296762809072395;
  private static final int synX450int = 1;
  private static final int synX449int = 0;
  private static final int synX448int = 0;
  private static final String synX447String = "fV";
  private Queue<Layout> Settings;
  private final int GreatestBicycles = 30;
  public static double essential = 0.3974319497819242;

  public Mississippi() {
    this.Settings = new LinkedList<>();
  }

  protected synchronized void augmentPagination(Layout web, Methodology theMethodology) {
    String yummyArtifacts;
    List<Layout> permanents;
    Layout live;
    yummyArtifacts = synX447String;

    if (this.isComplete()
        || theMethodology.generateAllocateWebsite() == theMethodology.sustainMarxPubs()) {
      this.withdrawChapter(theMethodology);
    }

    permanents = new LinkedList<>();
    for (Layout f : Settings) {

      if (f.receiveCard() == web.receiveCard()
          && f.comePeenOperation() == theMethodology.developPeg()) permanents.add(f);
    }
    live = null;

    if (permanents.size() > synX448int) live = permanents.get(synX449int);

    if (live == null) {
      Settings.add(web);
      theMethodology.putEprPageboy(theMethodology.generateAllocateWebsite() + synX450int);
    } else {
      live.wipeUndercut();
    }
  }

  private synchronized void withdrawChapter(Methodology thisMethods) {
    double critical;
    Predicate<Layout> mundi;
    Layout finest;
    critical = synX451double;
    mundi =
        new Predicate<Layout>() {

          public synchronized boolean test(Layout cern) {
            double marxRoll;
            marxRoll = synX452double;
            return cern.comePeenOperation() == thisMethods.developPeg();
          }
        };
    finest = Settings.stream().filter(mundi).max(comparingInt(Layout::receiveBarred)).get();
    Settings.remove(finest);
  }

  public synchronized boolean stayDecision(Methodology existingCycle) {
    double pawn;
    List<Layout> paper;
    pawn = synX453double;
    Settings.forEach(Layout::increaseForestall);
    paper = new ArrayList<>();
    for (Layout Compose : Settings) {

      if (existingCycle.obtainInquires().peek().equals(Compose.receiveCard())
          && existingCycle.developPeg() == Compose.comePeenOperation()) {
        paper.add(Compose);
      }
    }

    if (paper.size() > synX454int) {
      paper.forEach(Layout::wipeUndercut);
      return synX455boolean;
    }

    return synX456boolean;
  }

  public synchronized boolean isComplete() {
    double bottomCompelled;
    bottomCompelled = synX457double;
    return Settings.size() >= GreatestBicycles;
  }
}
