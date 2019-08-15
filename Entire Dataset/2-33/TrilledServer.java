import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrilledServer extends Parser {
  public ArrayDeque<Act> preparingReaper = null;
  public ArrayDeque<Shortcoming> responsibleRow = null;
  public int hourStay = 0;

  public TrilledServer() {
    this.preparingReaper = (new ArrayDeque<>());
    this.responsibleRow = (new ArrayDeque<>());
    hourStay = (MomentAmounts);
  }

  public synchronized void ourTicktack() {
    List<Shortcoming> anomalies = new LinkedList<>();
    for (Shortcoming f : responsibleRow) synx269(f, anomalies);
    for (Shortcoming shortcoming : anomalies) synx270(shortcoming);

    if (latestOperation != null) synx271();

    if (latestOperation == null && !preparingReaper.isEmpty()) synx272();

    this.workExpectedMotion();
  }

  public synchronized void outboundProceeding(Act methods) {
    preparingReaper.addLast(methods);
  }

  public synchronized Act wantMechanisms() {
    return preparingReaper.removeFirst();
  }

  public synchronized void workExpectedMotion() {

    if (this.latestOperation == null) {
      return;
    }

    while (!replaceAgenda.ensureAppeals(this.latestOperation)) {
      this.getTableCriticize();
      hourStay = (MomentAmounts);

      if (!preparingReaper.isEmpty()) synx273();
      else {
        latestOperation = (null);
        return;
      }
    }
    latestOperation.mechanismsEarlyWishes();
  }

  public synchronized void getTableCriticize() {
    Shortcoming f = new Shortcoming(this.generateUnderwayWalk(), latestOperation);
    responsibleRow.add(f);
    latestOperation.fetchMistakes().add(f);
  }

  private synchronized void synx269(Shortcoming f, java.util.List<Shortcoming> anomalies) {

    if (f.arriveFixMonth() == this.generateUnderwayWalk()) anomalies.add(f);
  }

  private synchronized void synx270(Shortcoming shortcoming) {
    responsibleRow.remove(shortcoming);
    replaceAgenda.introduceChapter(
        new Layouts(
            shortcoming.makeMarch().sustainWishes().peek(),
            shortcoming.makeMarch().sustainSelf(),
            0),
        shortcoming.makeMarch());

    if (!preparingReaper.contains(shortcoming.makeMarch())) {
      this.outboundProceeding(shortcoming.makeMarch());
    }
  }

  private synchronized void synx271() {
    hourStay--;

    if (latestOperation.isEnded()) {
      latestOperation.putDepartureClock(this.generateUnderwayWalk());
      this.finalizeSue.addLast(latestOperation);
      latestOperation = (null);
    }

    if (hourStay == 0 && latestOperation != null) {

      if (preparingReaper.isEmpty()) {
        hourStay = (MomentAmounts);
      } else {
        this.outboundProceeding(latestOperation);
        latestOperation = (null);
      }
    }
  }

  private synchronized void synx272() {
    latestOperation = (this.wantMechanisms());
    hourStay = (MomentAmounts);
  }

  private synchronized void synx273() {
    latestOperation = (wantMechanisms());
  }
}
