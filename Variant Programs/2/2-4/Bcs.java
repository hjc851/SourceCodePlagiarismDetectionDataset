import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bcs extends AlternatePolicy {

  public synchronized boolean isComplete() {
    return Cabinets.size() >= UpperBases;
  }

  protected synchronized void supplySummary(Layouts front, Outgrowth typicalProceedings) {
    List<Layouts> celsius;
    Layouts present;

    if (this.isComplete()
        || typicalProceedings.fetchReceiveLength() == typicalProceedings.conveyGreatestSlides())
      synx28(typicalProceedings);

    celsius = new LinkedList<>();
    for (Layouts f : Cabinets) synx29(f, front, typicalProceedings, celsius);
    present = null;

    if (celsius.size() > 0) present = celsius.get(0);

    if (present == null) synx30(front, typicalProceedings);
    else synx31(present);
  }

  public Bcs() {
    this.Cabinets = new LinkedList<>();
  }

  public synchronized boolean assureDemands(Outgrowth prevalentMethod) {
    List<Layouts> sheet;
    Cabinets.forEach(Layouts::increaseForestall);
    sheet = new ArrayList<>();
    for (Layouts Skeleton : Cabinets) synx32(prevalentMethod, Skeleton, sheet);

    if (sheet.size() > 0) {
      sheet.forEach(Layouts::reloadCounteract);
      return true;
    }

    return false;
  }

  public Queue<Layouts> Cabinets = null;

  public synchronized void dismantleAddendum(Outgrowth presentNegotiations) {
    Predicate<Layouts> initialism;
    Layouts tallest;
    initialism =
        new Predicate<Layouts>() {

          public synchronized boolean test(Layouts writes) {
            return writes.takeAbortAppendage() == presentNegotiations.sustainSelf();
          }
        };
    tallest =
        Cabinets.stream().filter(initialism).max(Comparator.comparingInt(Layouts::driveStem)).get();
    Cabinets.remove(tallest);
  }

  public final int UpperBases = 30;

  private synchronized void synx28(Outgrowth typicalProceedings) {
    this.dismantleAddendum(typicalProceedings);
  }

  private synchronized void synx29(
      Layouts f, Layouts front, Outgrowth typicalProceedings, java.util.List<Layouts> celsius) {

    if (f.driveSecurity() == front.driveSecurity()
        && f.takeAbortAppendage() == typicalProceedings.sustainSelf()) celsius.add(f);
  }

  private synchronized void synx30(Layouts front, Outgrowth typicalProceedings) {
    Cabinets.add(front);
    typicalProceedings.determineReceiveLength(typicalProceedings.fetchReceiveLength() + 1);
  }

  private synchronized void synx31(Layouts present) {
    present.reloadCounteract();
  }

  private synchronized void synx32(
      Outgrowth prevalentMethod, Layouts Skeleton, java.util.List<Layouts> sheet) {

    if (prevalentMethod.startApplication().peek().equals(Skeleton.driveSecurity())
        && prevalentMethod.sustainSelf() == Skeleton.takeAbortAppendage()) {
      sheet.add(Skeleton);
    }
  }
}
