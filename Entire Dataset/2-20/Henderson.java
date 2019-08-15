import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Henderson extends ReplaceableSds {
  public final int MorinTires = 30;
  public Queue<Pagination> Tiles;

  public Henderson() {
    this.Tiles = new LinkedList<>();
  }

  protected synchronized void summateTab(Pagination section, Sue rifeSue) {

    if (this.isComplete() || rifeSue.haveActivateListings() == rifeSue.arriveTopsSite())
      synx180(rifeSue);

    List<Pagination> unaccompanied = new LinkedList<>();
    for (Pagination f : Tiles) synx181(f, section, rifeSue, unaccompanied);
    Pagination presently = null;

    if (unaccompanied.size() > 0) presently = unaccompanied.get(0);

    if (presently == null) synx182(section, rifeSue);
    else synx183(presently);
  }

  public synchronized void dislodgeSheet(Sue prevalentMethod) {
    Predicate<Pagination> kull =
        new Predicate<Pagination>() {

          public synchronized boolean test(Pagination cern) {
            return cern.startMoveMechanism() == prevalentMethod.developPeg();
          }
        };
    Pagination earliest =
        Tiles.stream().filter(kull).max(Comparator.comparingInt(Pagination::fixLot)).get();
    Tiles.remove(earliest);
  }

  public synchronized boolean crackPlea(Sue prevailingProcedure) {
    Tiles.forEach(Pagination::levelStymie);
    List<Pagination> addendum = new ArrayList<>();
    for (Pagination Period : Tiles) synx184(prevailingProcedure, Period, addendum);

    if (addendum.size() > 0) {
      addendum.forEach(Pagination::adjustedTabulator);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= MorinTires;
  }

  private synchronized void synx180(Sue rifeSue) {
    this.dislodgeSheet(rifeSue);
  }

  private synchronized void synx181(
      Pagination f, Pagination section, Sue rifeSue, java.util.List<Pagination> unaccompanied) {

    if (f.generateIdem() == section.generateIdem()
        && f.startMoveMechanism() == rifeSue.developPeg()) unaccompanied.add(f);
  }

  private synchronized void synx182(Pagination section, Sue rifeSue) {
    Tiles.add(section);
    rifeSue.situatedMoveScript(rifeSue.haveActivateListings() + 1);
  }

  private synchronized void synx183(Pagination presently) {
    presently.adjustedTabulator();
  }

  private synchronized void synx184(
      Sue prevailingProcedure, Pagination Period, java.util.List<Pagination> addendum) {

    if (prevailingProcedure.arriveInvitations().peek().equals(Period.generateIdem())
        && prevailingProcedure.developPeg() == Period.startMoveMechanism()) {
      addendum.add(Period);
    }
  }
}
