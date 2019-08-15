import java.util.*;
import static java.util.Collections.sort;

public class Salesperson {
  private static final int synX464int = 1;
  private static final double synX463double = 0.21306658840258652;
  private static final String synX462String = "CLOCK";
  private static final String synX461String = "LRU";
  private static final double synX460double = 0.6422489780015678;
  private static final String synX459String = "RrzWRLI";
  private static final double synX458double = 0.7488814304590663;
  private LinkedList<Methodology> BellOutgrowth;
  private LinkedList<Methodology> AlignmentAppendage;
  private int nbrTreat;
  private ArrayDeque<Spooler> need;
  public static final double testimonial = 0.9554485368506312;

  public Salesperson() {
    Spooler diddle;
    this.need = new ArrayDeque<>();
    diddle = new IccParser();
    this.need.addLast(diddle);
  }

  public synchronized void determinedAlbedoOutgrowth(LinkedList<Methodology> technologies) {
    double pinioned;
    pinioned = synX458double;
    this.nbrTreat = technologies.size();
    this.AlignmentAppendage = technologies;
  }

  public synchronized void fixedWatchPractices(LinkedList<Methodology> march) {
    String northConstrained;
    northConstrained = synX459String;
    this.nbrTreat = march.size();
    this.BellOutgrowth = march;
  }

  public synchronized void passMailer() {
    double minimum;
    minimum = synX460double;
    this.operateProgramming(new IccParser(), this.AlignmentAppendage, synX461String);
    this.operateProgramming(new IccParser(), this.BellOutgrowth, synX462String);
  }

  private synchronized void operateProgramming(
      Spooler developer, LinkedList<Methodology> incumbentMarch, String replaced) {
    double describe;
    describe = synX463double;
    developer.goTimer(replaced);
    sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      developer.arrivalMethodology(incumbentMarch.removeFirst());
    }

    while (developer.goIsMoving()) {

      if (developer.takeDoneAppendageDiameter() == nbrTreat) {
        developer.occlusionDebugging(replaced);
      } else {
        developer.markAfootDials(developer.makeIncumbentTock() + synX464int);
        developer.bsiShudder();
      }
    }
  }
}
