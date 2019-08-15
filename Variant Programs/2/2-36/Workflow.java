import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Workflow {

  public synchronized int developSubmittedTechnologiesStature() {

    if (performedTreat.isEmpty()) {
      return 0;
    } else {
      return performedTreat.size();
    }
  }

  public synchronized double beatHalfTurnJuncture() {
    return (double) this.levelSpikeThing / this.performedTreat.size();
  }

  public LinkedList<Work> performedTreat = null;
  public int movingClock = 0;
  public int prevailingClick = 0;

  public synchronized double obtainIntermediateBideDays() {
    return (double) this.levelJustThing / this.performedTreat.size();
  }

  public Work contemporaryLitigate = null;

  public synchronized int becomeTheSelect() {
    return prevailingClick;
  }

  public int levelSpikeThing = 0;

  public Workflow() {
    this.isMoving = (false);
    this.movingClock = (0);
    this.awaitSentence = (0);
    this.levelJustThing = (0);
    this.levelSpikeThing = (0);
    this.prevailingClick = (-1);
    this.performedTreat = (new LinkedList<>());
  }

  public synchronized void openingInitialization(String replacing) {
    this.isMoving = (true);

    switch (replacing) {
      case "LRU":
        this.surrogateVision = (new Jacobs());
        break;
      case "CLOCK":
        this.surrogateVision = (new Stopwatch());
        break;
      default:
        break;
    }
    this.bsiDepart();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized void bsiDepart() {}

  public abstract Work poisedProceeding();

  public synchronized void catalogReview(String alternatesGie) {

    try {
      Collections.sort(performedTreat);
      MethodImpactor.PerformanceArchives.write("\n");
      out.println();
      String qualification = alternatesGie + " - Fixed";
      MethodImpactor.PerformanceArchives.write(qualification + "\n");
      out.println(qualification);
      String usb =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodImpactor.PerformanceArchives.write(usb + "\n");
      out.println(usb);
      for (Work writes : performedTreat) {
        String mechanismsTabu =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.haveHandle(),
                writes.arriveCite(),
                writes.fixWithdrawalChance(),
                writes.comeMistake().size(),
                writes.bringFlawDays());
        MethodImpactor.PerformanceArchives.write(mechanismsTabu + "\n");
        out.println(mechanismsTabu);
      }
      MethodImpactor.PerformanceArchives.write("\n");
      out.println();
      String splitter = new String(new char[50]).replace("\0", "-");
      MethodImpactor.PerformanceArchives.write(splitter + "\n");
      out.println(splitter);
    } catch (IOException exwife) {
      out.println("Unable to write to file.");
    }
  }

  public abstract void nextSue(Work treat);

  public synchronized void fixThisValidation(int circulatingShudder) {
    this.prevailingClick = (circulatingShudder);
  }

  public int awaitSentence = 0;
  public int levelJustThing = 0;
  public boolean isMoving = false;
  public static final int WhenValue = 3;

  public abstract void optiBeat();

  public SubstitutionPolicies surrogateVision = null;

  public synchronized void terminateWriter(String substitutes) {
    this.isMoving = (false);
    this.catalogReview(substitutes);
  }
}
