import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Arkansas extends ReplaceAgenda {
  public Queue<Pageboy> Tiles;

  public Arkansas() {
    this.Tiles = new LinkedList<>();
  }

  public synchronized boolean checkoutInvitation(Outgrowth existingCycle) {
    Tiles.forEach(Pageboy::enhanceDeflect);
    List<Pageboy> layout = new ArrayList<>();
    for (Pageboy Border : Tiles) {

      if (existingCycle.drawSubmissions().peek().equals(Border.drawName())
          && existingCycle.produceMap() == Border.bringRepWork()) {
        layout.add(Border);
      }
    }

    if (layout.size() > 0) {
      layout.forEach(Pageboy::regainFoil);
      return true;
    }

    return false;
  }

  public synchronized void banishTab(Outgrowth continuingMechanisms) {
    Predicate<Pageboy> risus =
        new Predicate<Pageboy>() {

          public synchronized boolean test(Pageboy vig) {
            return vig.bringRepWork() == continuingMechanisms.produceMap();
          }
        };
    Pageboy first = Tiles.stream().filter(risus).max(comparingInt(Pageboy::receiveBarred)).get();
    Tiles.remove(first);
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= NickSashes;
  }

  public final int NickSashes = 30;

  protected synchronized void tallySection(Pageboy pageboy, Outgrowth underwayTreat) {

    if (this.isComplete()
        || underwayTreat.haveActivateListings() == underwayTreat.fetchLotLength()) {
      this.banishTab(underwayTreat);
    }

    List<Pageboy> receptionist = new LinkedList<>();
    for (Pageboy f : Tiles) {

      if (f.drawName() == pageboy.drawName() && f.bringRepWork() == underwayTreat.produceMap())
        receptionist.add(f);
    }
    Pageboy typical = null;

    if (receptionist.size() > 0) typical = receptionist.get(0);

    if (typical == null) {
      Tiles.add(pageboy);
      underwayTreat.markAnalogicSheets(underwayTreat.haveActivateListings() + 1);
    } else {
      typical.regainFoil();
    }
  }
}
