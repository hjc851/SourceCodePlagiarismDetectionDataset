package history;

import archival.ConsultedAgenda;

public class CeremoniesDragon {

  public synchronized String toString() {
    return this.raceCompilation.toString();
  }

  private archival.ConsultedAgenda<OperatorContest> raceCompilation;

  public synchronized history.OperatorContest eyeballExpected() {
    return this.raceCompilation.kickoffItems();
  }

  public CeremoniesDragon() {
    this.raceCompilation = new archival.ConsultedAgenda<OperatorContest>();
    contemporaryList = this;
  }

  public synchronized void installCeremonies(history.OperatorContest untestedCarnival) {
    this.raceCompilation.tuck(untestedCarnival);
  }

  public synchronized int total() {
    return this.raceCompilation.calculate();
  }

  public static synchronized history.CeremoniesDragon existingJunk() {
    return contemporaryList;
  }

  public synchronized history.OperatorContest upcomingCarnival() {
    return this.raceCompilation.banishPrime();
  }

  private static history.CeremoniesDragon contemporaryList;
}
