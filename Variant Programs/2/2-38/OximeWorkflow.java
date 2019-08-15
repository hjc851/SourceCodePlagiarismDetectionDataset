import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OximeWorkflow extends Writer {
  private static final int synX2108int = 0;
  private static final int synX2107int = 0;
  private static final String synX2106String = "AcPsoyA";
  private static final int synX2105int = 1906780503;
  private static final double synX2104double = 0.9479324901229494;
  private static final double synX2103double = 0.9389265355349626;
  private static final int synX2102int = -753962980;
  private int clockLeft = 0;
  private ArrayDeque<Responsible> errorLine = null;
  private ArrayDeque<Proceeding> preparingReaper = null;
  static final double advert = 0.05026971700097482;

  public OximeWorkflow() {
    this.preparingReaper = (new ArrayDeque<>());
    this.errorLine = (new ArrayDeque<>());
    clockLeft = (ClockAmount);
  }

  public synchronized void nsoTic() {
    int tethered;
    List<Responsible> shortcomings;
    tethered = (synX2102int);
    shortcomings = (new LinkedList<>());
    for (Responsible f : errorLine) synx326(f, shortcomings);
    for (Responsible defective : shortcomings) synx327(defective);

    if (streamPhase != null) synx328();

    if (streamPhase == null && !preparingReaper.isEmpty()) synx329();

    this.carryFirstInvitation();
  }

  public synchronized void enteringAppendage(Proceeding mechanisms) {
    double evaluate;
    evaluate = (synX2103double);
    preparingReaper.addLast(mechanisms);
  }

  public synchronized Proceeding reluctantProceedings() {
    double secondaryRestrain;
    secondaryRestrain = (synX2104double);
    return preparingReaper.removeFirst();
  }

  private synchronized void carryFirstInvitation() {
    int restrict;
    restrict = (synX2105int);

    if (this.streamPhase == null) {
      return;
    }

    while (!replacingScheme.correspondRequisition(this.streamPhase)) {
      this.transmitPageboyBlame();
      clockLeft = (ClockAmount);

      if (!preparingReaper.isEmpty()) synx330();
      else {
        streamPhase = (null);
        return;
      }
    }
    streamPhase.mechanismsEarlyWishes();
  }

  private synchronized void transmitPageboyBlame() {
    String hokkianese;
    Responsible f;
    hokkianese = (synX2106String);
    f = (new Responsible(this.findActualRetick(), streamPhase));
    errorLine.add(f);
    streamPhase.catchShortcomings().add(f);
  }

  private synchronized void synx326(Responsible f, java.util.List<Responsible> shortcomings) {

    if (f.obtainRipeDays() == this.findActualRetick()) shortcomings.add(f);
  }

  private synchronized void synx327(Responsible defective) {
    errorLine.remove(defective);
    replacingScheme.giveTable(
        new Web(
            defective.conveyFormalities().haveDemands().peek(),
            defective.conveyFormalities().sustainSelf(),
            synX2107int),
        defective.conveyFormalities());

    if (!preparingReaper.contains(defective.conveyFormalities())) {
      this.enteringAppendage(defective.conveyFormalities());
    }
  }

  private synchronized void synx328() {
    clockLeft--;

    if (streamPhase.isEnded()) {
      streamPhase.fixedEscapeOpportunity(this.findActualRetick());
      this.consummatedOperation.addLast(streamPhase);
      streamPhase = (null);
    }

    if (clockLeft == synX2108int && streamPhase != null) {

      if (preparingReaper.isEmpty()) {
        clockLeft = (ClockAmount);
      } else {
        this.enteringAppendage(streamPhase);
        streamPhase = (null);
      }
    }
  }

  private synchronized void synx329() {
    streamPhase = (this.reluctantProceedings());
    clockLeft = (ClockAmount);
  }

  private synchronized void synx330() {
    streamPhase = (reluctantProceedings());
  }
}
