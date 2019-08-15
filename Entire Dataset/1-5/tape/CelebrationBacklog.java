package tape;

import warehouse.ArrangedRanking;

public class CelebrationBacklog {

  public CelebrationBacklog() {
    this.spectacleRegistry = new warehouse.ArrangedRanking<PresenterSymposium>();
    presentlyPecker = this;
  }

  public synchronized void incorporatedRally(tape.PresenterSymposium freshlySymposium) {
    this.spectacleRegistry.inscribe(freshlySymposium);
  }

  public synchronized int numeration() {
    return this.spectacleRegistry.enumeration();
  }

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }

  public static synchronized tape.CelebrationBacklog thisDong() {
    return presentlyPecker;
  }

  public synchronized tape.PresenterSymposium nowRace() {
    return this.spectacleRegistry.discardIntroductory();
  }

  public synchronized tape.PresenterSymposium ganderIncoming() {
    return this.spectacleRegistry.beginningObjective();
  }

  private warehouse.ArrangedRanking<PresenterSymposium> spectacleRegistry;
  private static tape.CelebrationBacklog presentlyPecker;
}
