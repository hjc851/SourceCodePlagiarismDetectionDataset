import java.util.*;
import static java.util.Collections.sort;

public class Regulator {
  private static final int synX1530int = 1;
  private static final String synX1529String = "CLOCK";
  private static final String synX1528String = "LRU";
  public java.util.ArrayDeque<Compiler> human;
  public int generMethodology;
  public java.util.LinkedList<Proceeding> BetasMethods;
  public java.util.LinkedList<Proceeding> DialMethodologies;

  public Regulator() {
    this.human = new java.util.ArrayDeque<>();
    Compiler omsk = new DiddleProgramming();
    this.human.addLast(omsk);
  }

  public synchronized void adjustAveragesProcedures(java.util.LinkedList<Proceeding> proces) {
    this.generMethodology = proces.size();
    this.BetasMethods = proces;
  }

  public synchronized void layCountdownLitigate(java.util.LinkedList<Proceeding> serve) {
    this.generMethodology = serve.size();
    this.DialMethodologies = serve;
  }

  public synchronized void leanExporter() {
    this.carryParser(new DiddleProgramming(), this.BetasMethods, synX1528String);
    this.carryParser(new DiddleProgramming(), this.DialMethodologies, synX1529String);
  }

  public synchronized void carryParser(
      Compiler synchronizer,
      java.util.LinkedList<Proceeding> actualAct,
      java.lang.String replaceable) {
    synchronizer.getInterface(replaceable);
    sort(actualAct);

    while (!actualAct.isEmpty()) {
      synchronizer.newNegotiations(actualAct.removeFirst());
    }

    while (synchronizer.goIsMoving()) {

      if (synchronizer.haveConductedServeLarge() == generMethodology) {
        synchronizer.hitchMultitasking(replaceable);
      } else {
        synchronizer.preparePrevalentScore(synchronizer.conveyFormerGene() + synX1530int);
        synchronizer.bsiShudder();
      }
    }
  }
}
