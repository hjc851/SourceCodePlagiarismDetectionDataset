import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Lus extends ReinstatementProgramme {
  private static final boolean synX1461boolean = false;
  private static final boolean synX1460boolean = true;
  private static final int synX1459int = 0;
  private static final int synX1458int = 1;
  private static final int synX1457int = 0;
  private static final int synX1456int = 0;
  private final int LoadCabinets = 30;
  private Queue<Front> Racks;

  public Lus() {
    this.Racks = new LinkedList<>();
  }

  protected synchronized void additionsContents(Front website, Proceeding flowProcedures) {

    if (this.isComplete() || flowProcedures.startMoveScript() == flowProcedures.beatUpperSlips()) {
      this.dispatchWebsite(flowProcedures);
    }

    List<Front> fahrenheit = new LinkedList<>();
    for (Front f : Racks) {

      if (f.makeDimidiate() == website.makeDimidiate()
          && f.canGetCycle() == flowProcedures.conveyTag()) fahrenheit.add(f);
    }
    Front contemporary = null;

    if (fahrenheit.size() > synX1456int) contemporary = fahrenheit.get(synX1457int);

    if (contemporary == null) {
      Racks.add(website);
      flowProcedures.prepareApologeticLeafs(flowProcedures.startMoveScript() + synX1458int);
    } else {
      contemporary.restartThwart();
    }
  }

  private synchronized void dispatchWebsite(Proceeding liveOutgrowth) {
    Predicate<Front> effet =
        new Predicate<Front>() {

          public synchronized boolean test(Front postscript) {
            return postscript.canGetCycle() == liveOutgrowth.conveyTag();
          }
        };
    Front eldest = Racks.stream().filter(effet).max(comparingInt(Front::beatTile)).get();
    Racks.remove(eldest);
  }

  public synchronized boolean tabAsked(Proceeding typicalProceedings) {
    Racks.forEach(Front::augmentNeutralize);
    List<Front> annexes = new ArrayList<>();
    for (Front Bod : Racks) {

      if (typicalProceedings.fixOrders().peek().equals(Bod.makeDimidiate())
          && typicalProceedings.conveyTag() == Bod.canGetCycle()) {
        annexes.add(Bod);
      }
    }

    if (annexes.size() > synX1459int) {
      annexes.forEach(Front::restartThwart);
      return synX1460boolean;
    }

    return synX1461boolean;
  }

  public synchronized boolean isComplete() {
    return Racks.size() >= LoadCabinets;
  }
}
