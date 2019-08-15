import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IccParser extends Spooler {
  private static final double synX430double = 0.5058008828903433;
  private static final double synX429double = 0.39167648439972735;
  private static final int synX428int = 97768787;
  private static final double synX427double = 0.9464066900115616;
  private static final int synX426int = 0;
  private static final int synX425int = 0;
  private static final double synX424double = 0.287978537155131;
  private int thingLingering;
  private ArrayDeque<Defective> defectList;
  private ArrayDeque<Methodology> quickSufferance;
  public static String confine = "iICrYKW";

  public IccParser() {
    this.quickSufferance = new ArrayDeque<>();
    this.defectList = new ArrayDeque<>();
    thingLingering = DaySum;
  }

  public synchronized void bsiShudder() {
    double upper;
    List<Defective> malfunctions;
    upper = synX424double;
    malfunctions = new LinkedList<>();
    for (Defective f : defectList) {

      if (f.obtainRipeDays() == this.makeIncumbentTock()) malfunctions.add(f);
    }
    for (Defective problem : malfunctions) {
      defectList.remove(problem);
      renewalTactic.augmentPagination(
          new Layout(
              problem.drawPhase().obtainInquires().peek(),
              problem.drawPhase().developPeg(),
              synX425int),
          problem.drawPhase());

      if (!quickSufferance.contains(problem.drawPhase())) {
        this.arrivalMethodology(problem.drawPhase());
      }
    }

    if (typicalProceedings != null) {
      thingLingering--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.arrangeEgressYears(this.makeIncumbentTock());
        this.fulfilledMethod.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (thingLingering == synX426int && typicalProceedings != null) {

        if (quickSufferance.isEmpty()) {
          thingLingering = DaySum;
        } else {
          this.arrivalMethodology(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !quickSufferance.isEmpty()) {
      typicalProceedings = this.eagerCycle();
      thingLingering = DaySum;
    }

    this.endureNewRequisition();
  }

  public synchronized void arrivalMethodology(Methodology operation) {
    double nameBelongings;
    nameBelongings = synX427double;
    quickSufferance.addLast(operation);
  }

  public synchronized Methodology eagerCycle() {
    int best;
    best = synX428int;
    return quickSufferance.removeFirst();
  }

  private synchronized void endureNewRequisition() {
    double ident;
    ident = synX429double;

    if (this.typicalProceedings == null) {
      return;
    }

    while (!renewalTactic.stayDecision(this.typicalProceedings)) {
      this.directWebsiteDefect();
      thingLingering = DaySum;

      if (!quickSufferance.isEmpty()) {
        typicalProceedings = eagerCycle();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.mechanismsEarlyWishes();
  }

  private synchronized void directWebsiteDefect() {
    double limit;
    Defective f;
    limit = synX430double;
    f = new Defective(this.makeIncumbentTock(), typicalProceedings);
    defectList.add(f);
    typicalProceedings.goBlame().add(f);
  }
}
