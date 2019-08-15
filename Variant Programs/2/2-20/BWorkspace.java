import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Configuration {
  public ArrayDeque<Sue> eagerJunk;
  public ArrayDeque<Faulty> responsibilityPecker;
  public int amountKeeping;

  public BWorkspace() {
    this.eagerJunk = new ArrayDeque<>();
    this.responsibilityPecker = new ArrayDeque<>();
    amountKeeping = ChanceNumber;
  }

  public synchronized void optiBeat() {
    List<Faulty> blunders = new LinkedList<>();
    for (Faulty f : responsibilityPecker) synx174(f, blunders);
    for (Faulty fracture : blunders) synx175(fracture);

    if (streamPhase != null) synx176();

    if (streamPhase == null && !eagerJunk.isEmpty()) synx177();

    this.driveFutureAsking();
  }

  public synchronized void inboundOperation(Sue formalities) {
    eagerJunk.addLast(formalities);
  }

  public synchronized Sue waitingLitigate() {
    return eagerJunk.removeFirst();
  }

  public synchronized void driveFutureAsking() {

    if (this.streamPhase == null) {
      return;
    }

    while (!replacesFramework.crackPlea(this.streamPhase)) {
      this.dispatchContentsFailures();
      amountKeeping = ChanceNumber;

      if (!eagerJunk.isEmpty()) synx178();
      else {
        streamPhase = null;
        return;
      }
    }
    streamPhase.methodsThenCalls();
  }

  public synchronized void dispatchContentsFailures() {
    Faulty f = new Faulty(this.conveyFormerGene(), streamPhase);
    responsibilityPecker.add(f);
    streamPhase.comeMistake().add(f);
  }

  private synchronized void synx174(Faulty f, java.util.List<Faulty> blunders) {

    if (f.comePreparedClip() == this.conveyFormerGene()) blunders.add(f);
  }

  private synchronized void synx175(Faulty fracture) {
    responsibilityPecker.remove(fracture);
    replacesFramework.summateTab(
        new Pagination(
            fracture.bringWork().arriveInvitations().peek(), fracture.bringWork().developPeg(), 0),
        fracture.bringWork());

    if (!eagerJunk.contains(fracture.bringWork())) {
      this.inboundOperation(fracture.bringWork());
    }
  }

  private synchronized void synx176() {
    amountKeeping--;

    if (streamPhase.isEnded()) {
      streamPhase.primedExpirationPeriod(this.conveyFormerGene());
      this.constructedMethodology.addLast(streamPhase);
      streamPhase = null;
    }

    if (amountKeeping == 0 && streamPhase != null) {

      if (eagerJunk.isEmpty()) {
        amountKeeping = ChanceNumber;
      } else {
        this.inboundOperation(streamPhase);
        streamPhase = null;
      }
    }
  }

  private synchronized void synx177() {
    streamPhase = this.waitingLitigate();
    amountKeeping = ChanceNumber;
  }

  private synchronized void synx178() {
    streamPhase = waitingLitigate();
  }
}
