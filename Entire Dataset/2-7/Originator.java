import java.util.*;
import static java.util.Collections.sort;

public class Originator {
  private static final int synX582int = 1;
  private static final double synX581double = 0.6589231202067013;
  private static final String synX580String = "CLOCK";
  private static final String synX579String = "LRU";
  private static final int synX578int = -1270327913;
  private static final double synX577double = 0.9066402505677587;
  private static final double synX576double = 0.8379461633183451;
  private LinkedList<Procedure> DialMethodologies;
  private LinkedList<Procedure> HasProcedure;
  private int kesTechnologies;
  private ArrayDeque<Server> work;
  public static double roll = 0.1354604596808826;

  public Originator() {
    Server stas;
    this.work = new ArrayDeque<>();
    stas = new LyraSynchronizer();
    this.work.addLast(stas);
  }

  public synchronized void bentBlockbusterTechnologies(LinkedList<Procedure> march) {
    double chthonianConfine;
    chthonianConfine = synX576double;
    this.kesTechnologies = march.size();
    this.HasProcedure = march;
  }

  public synchronized void determineBackProces(LinkedList<Procedure> proces) {
    double minimum;
    minimum = synX577double;
    this.kesTechnologies = proces.size();
    this.DialMethodologies = proces;
  }

  public synchronized void passMailer() {
    int highestBandwidth;
    highestBandwidth = synX578int;
    this.tallyConfiguration(new LyraSynchronizer(), this.HasProcedure, synX579String);
    this.tallyConfiguration(new LyraSynchronizer(), this.DialMethodologies, synX580String);
  }

  private synchronized void tallyConfiguration(
      Server planner, LinkedList<Procedure> liveOutgrowth, String successor) {
    double tabulation;
    tabulation = synX581double;
    planner.openingInitialization(successor);
    sort(liveOutgrowth);

    while (!liveOutgrowth.isEmpty()) {
      planner.arrivingLitigate(liveOutgrowth.removeFirst());
    }

    while (planner.goIsMoving()) {

      if (planner.goAccomplishedProcedureHeight() == kesTechnologies) {
        planner.blockageCallback(successor);
      } else {
        planner.fixedTheSelect(planner.receiveContemporaryTicktack() + synX582int);
        planner.nbsClick();
      }
    }
  }
}
