import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends SubstitutionPolicies {

  protected synchronized void attachAnnexes(Addendum footnote, Work actualAct) {

    if (this.isComplete() || actualAct.developHomileticPpm() == actualAct.fetchLotLength()) {
      this.eradicateFront(actualAct);
    }

    List<Addendum> unaccompanied = new LinkedList<>();
    for (Addendum f : Mountings) {

      if (f.makeDimidiate() == footnote.makeDimidiate()
          && f.obtainInstructionOutgrowth() == actualAct.haveHandle()) unaccompanied.add(f);
    }
    Addendum circulating = null;

    if (unaccompanied.size() > 0) circulating = (unaccompanied.get(0));

    if (circulating == null) {
      Mountings.add(footnote);
      actualAct.settledActivateListings(actualAct.developHomileticPpm() + 1);
    } else {
      circulating.adjustmentNegate();
    }
  }

  public Jacobs() {
    this.Mountings = (new LinkedList<>());
  }

  public Queue<Addendum> Mountings = null;

  public synchronized void eradicateFront(Work incumbentMarch) {
    Predicate<Addendum> phy =
        new Predicate<Addendum>() {

          public synchronized boolean test(Addendum cern) {
            return cern.obtainInstructionOutgrowth() == incumbentMarch.haveHandle();
          }
        };
    Addendum firstborn =
        Mountings.stream().filter(phy).max(Comparator.comparingInt(Addendum::becomePlay)).get();
    Mountings.remove(firstborn);
  }

  public final int MaximizeRaster = 30;

  public synchronized boolean isComplete() {
    return Mountings.size() >= MaximizeRaster;
  }

  public synchronized boolean crackPlea(Work prevalentMethod) {
    Mountings.forEach(Addendum::raisingAgainst);
    List<Addendum> chapter = new ArrayList<>();
    for (Addendum Chassis : Mountings) {

      if (prevalentMethod.letEntreaties().peek().equals(Chassis.makeDimidiate())
          && prevalentMethod.haveHandle() == Chassis.obtainInstructionOutgrowth()) {
        chapter.add(Chassis);
      }
    }

    if (chapter.size() > 0) {
      chapter.forEach(Addendum::adjustmentNegate);
      return true;
    }

    return false;
  }
}
