import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrilledServer extends Synchronization {
  private static final int synX666int = 0;
  private static final int synX665int = 0;
  private static final double synX664double = 0.4344057752336856;
  private static final double synX663double = 0.23480328661247996;
  private static final double synX662double = 0.5396208031044519;
  private static final int synX661int = -613828899;
  private static final double synX660double = 0.31662441957964316;
  static final double symbolize = 0.9803276480107219;
  public ArrayDeque<Summons> availableFile;
  public ArrayDeque<Error> carelessnessDipper;
  public int minutesLatter;

  public TrilledServer() {
    this.availableFile = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    minutesLatter = MonthLarge;
  }

  public synchronized void bpsRetick() {
    double worth = synX660double;
    List<Error> blame = new LinkedList<>();
    for (Error f : carelessnessDipper) synx79(f, blame);
    for (Error culpability : blame) synx80(culpability);

    if (theMethodology != null) synx81();

    if (theMethodology == null && !availableFile.isEmpty()) synx82();

    this.outpouringTheOrdered();
  }

  public synchronized void inpouringSystem(Summons work) {
    int inferiorTethered = synX661int;
    availableFile.addLast(work);
  }

  public synchronized Summons wantMechanisms() {
    double ister = synX662double;
    return availableFile.removeFirst();
  }

  public synchronized void outpouringTheOrdered() {
    double thick = synX663double;

    if (this.theMethodology == null) {
      return;
    }

    while (!understudyStrategize.seePetition(this.theMethodology)) {
      this.stationFootnoteMalfunction();
      minutesLatter = MonthLarge;

      if (!availableFile.isEmpty()) synx83();
      else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.marchAdjacentAsked();
  }

  public synchronized void stationFootnoteMalfunction() {
    double cardinal = synX664double;
    Error f = new Error(this.bringOngoingBeat(), theMethodology);
    carelessnessDipper.add(f);
    theMethodology.comeMistake().add(f);
  }

  private synchronized void synx79(Error f, java.util.List<Error> blame) {

    if (f.produceCookNow() == this.bringOngoingBeat()) blame.add(f);
  }

  private synchronized void synx80(Error culpability) {
    carelessnessDipper.remove(culpability);
    understudyStrategize.sumSite(
        new Layouts(
            culpability.produceMethod().haveDemands().peek(),
            culpability.produceMethod().makeDimidiate(),
            synX665int),
        culpability.produceMethod());

    if (!availableFile.contains(culpability.produceMethod())) {
      this.inpouringSystem(culpability.produceMethod());
    }
  }

  private synchronized void synx81() {
    minutesLatter--;

    if (theMethodology.isEnded()) {
      theMethodology.fitDieYear(this.bringOngoingBeat());
      this.undertakenMarch.addLast(theMethodology);
      theMethodology = null;
    }

    if (minutesLatter == synX666int && theMethodology != null) {

      if (availableFile.isEmpty()) {
        minutesLatter = MonthLarge;
      } else {
        this.inpouringSystem(theMethodology);
        theMethodology = null;
      }
    }
  }

  private synchronized void synx82() {
    theMethodology = this.wantMechanisms();
    minutesLatter = MonthLarge;
  }

  private synchronized void synx83() {
    theMethodology = wantMechanisms();
  }
}
