import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Initialization {
  public ArrayDeque<Break> faultyFile = null;
  public ArrayDeque<System> ablePecker = null;

  public synchronized void bpsRetick() {
    List<Break> deficiencies;
    deficiencies = (new LinkedList<>());
    for (Break f : faultyFile) synx136(f, deficiencies);
    for (Break blame : deficiencies) synx137(blame);

    if (underwayTreat != null) synx138();

    if (underwayTreat == null && !ablePecker.isEmpty()) synx139();

    this.driveFutureAsking();
  }

  public synchronized System eagerCycle() {
    return ablePecker.removeFirst();
  }

  public int opportunityResidual = 0;

  public synchronized void mailedFolioLiability() {
    Break f;
    f = (new Break(this.beatTypicalGenetic(), underwayTreat));
    faultyFile.add(f);
    underwayTreat.receiveDefect().add(f);
  }

  public RailCompiler() {
    this.ablePecker = (new ArrayDeque<>());
    this.faultyFile = (new ArrayDeque<>());
    opportunityResidual = (HoursHuge);
  }

  public synchronized void driveFutureAsking() {

    if (this.underwayTreat == null) {
      return;
    }

    while (!alternatePolicy.breakWishes(this.underwayTreat)) {
      this.mailedFolioLiability();
      opportunityResidual = (HoursHuge);

      if (!ablePecker.isEmpty()) synx140();
      else {
        underwayTreat = (null);
        return;
      }
    }
    underwayTreat.operationFollowingPetition();
  }

  public synchronized void inflowingSummons(System proceedings) {
    ablePecker.addLast(proceedings);
  }

  private synchronized void synx136(Break f, java.util.List<Break> deficiencies) {

    if (f.goPrimedClock() == this.beatTypicalGenetic()) deficiencies.add(f);
  }

  private synchronized void synx137(Break blame) {
    faultyFile.remove(blame);
    alternatePolicy.provideLayout(
        new Layout(
            blame.receiveLitigate().obtainInquires().peek(), blame.receiveLitigate().goQuod(), 0),
        blame.receiveLitigate());

    if (!ablePecker.contains(blame.receiveLitigate())) {
      this.inflowingSummons(blame.receiveLitigate());
    }
  }

  private synchronized void synx138() {
    opportunityResidual--;

    if (underwayTreat.isEnded()) {
      underwayTreat.putDepartureClock(this.beatTypicalGenetic());
      this.performedTreat.addLast(underwayTreat);
      underwayTreat = (null);
    }

    if (opportunityResidual == 0 && underwayTreat != null) {

      if (ablePecker.isEmpty()) {
        opportunityResidual = (HoursHuge);
      } else {
        this.inflowingSummons(underwayTreat);
        underwayTreat = (null);
      }
    }
  }

  private synchronized void synx139() {
    underwayTreat = (this.eagerCycle());
    opportunityResidual = (HoursHuge);
  }

  private synchronized void synx140() {
    underwayTreat = (eagerCycle());
  }
}
