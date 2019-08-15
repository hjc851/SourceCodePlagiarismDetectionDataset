import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Alabama extends SubstitutionPolicies {
  private static final boolean synX2258boolean = false;
  private static final boolean synX2257boolean = true;
  private static final int synX2256int = 0;
  private static final int synX2255int = -394469617;
  private static final int synX2254int = 0;
  private static final int synX2253int = 0;
  private static final String synX2252String = "JQvQlnMFvGMlnl";
  private static final double synX2251double = 0.7988059260984327;
  private static final int synX2250int = 411129652;
  private static final String synX2249String = "1bY6XasBAvPjlL";

  public Alabama() {
    this.Matrices = (new java.util.LinkedList<>());
  }

  public synchronized void undoContents(Operation contemporaryLitigate) {
    String enumerate;
    java.util.function.Predicate<Sheet> ial;
    Sheet firstborn;
    enumerate = (synX2249String);
    ial =
        (new java.util.function.Predicate<Sheet>() {

          public synchronized boolean test(Sheet cern) {
            int levelPinioned;
            levelPinioned = (synX2250int);
            return cern.bringRepWork() == contemporaryLitigate.beatUser();
          }
        });
    firstborn = (Matrices.stream().filter(ial).max(comparingInt(Sheet::receiveBarred)).get());
    Matrices.remove(firstborn);
  }

  public synchronized boolean isComplete() {
    double upwardLeaping;
    upwardLeaping = (synX2251double);
    return Matrices.size() >= HighestMountings;
  }

  public final int HighestMountings = 30;

  protected synchronized void augmentPagination(Sheet pagination, Operation actualAct) {
    String highest;
    java.util.List<Sheet> temporal;
    Sheet latest;
    highest = (synX2252String);

    if (this.isComplete() || actualAct.beatWaitSlips() == actualAct.catchFullSections())
      synx351(actualAct);

    temporal = (new java.util.LinkedList<>());
    for (Sheet f : Matrices) synx352(f, pagination, actualAct, temporal);
    latest = (null);

    if (temporal.size() > synX2253int) latest = (temporal.get(synX2254int));

    if (latest == null) synx353(pagination, actualAct);
    else synx354(latest);
  }

  public synchronized boolean correspondRequisition(Operation prevailingProcedure) {
    int certain;
    java.util.List<Sheet> web;
    certain = (synX2255int);
    Matrices.forEach(Sheet::raiseCounteract);
    web = (new java.util.ArrayList<>());
    for (Sheet Cast : Matrices) synx355(prevailingProcedure, Cast, web);

    if (web.size() > synX2256int) {
      web.forEach(Sheet::eraseAgainst);
      return synX2257boolean;
    }

    return synX2258boolean;
  }

  public java.util.Queue<Sheet> Matrices;
  static final double minus = 0.6268580207382809;

  private synchronized void synx351(Operation actualAct) {
    this.undoContents(actualAct);
  }

  private synchronized void synx352(
      Sheet f, Sheet pagination, Operation actualAct, java.util.List<Sheet> temporal) {

    if (f.becomePhoto() == pagination.becomePhoto() && f.bringRepWork() == actualAct.beatUser())
      temporal.add(f);
  }

  private synchronized void synx353(Sheet pagination, Operation actualAct) {
    Matrices.add(pagination);
    actualAct.settledActivateListings(actualAct.beatWaitSlips() + 1);
  }

  private synchronized void synx354(Sheet latest) {
    latest.eraseAgainst();
  }

  private synchronized void synx355(
      Operation prevailingProcedure, Sheet Cast, java.util.List<Sheet> web) {

    if (prevailingProcedure.driveRequirements().peek().equals(Cast.becomePhoto())
        && prevailingProcedure.beatUser() == Cast.bringRepWork()) {
      web.add(Cast);
    }
  }
}
