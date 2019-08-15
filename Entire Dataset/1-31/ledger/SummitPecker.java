package ledger;

import depot.ScreenedRosters;

public class SummitPecker {

  public synchronized void deleteRace(GrowerParade originalGala) {
    this.tournamentBlacklist.enclose(originalGala);
  }

  public static synchronized SummitPecker liveStandby() {
    return ongoingSpooler;
  }

  public SummitPecker() {
    this.tournamentBlacklist = (new ScreenedRosters<GrowerParade>());
    ongoingSpooler = (this);
  }

  public ScreenedRosters<GrowerParade> tournamentBlacklist = null;

  public synchronized GrowerParade eyeUpcoming() {
    return this.tournamentBlacklist.introductoryPurpose();
  }

  public static SummitPecker ongoingSpooler = null;

  public synchronized String toString() {
    return this.tournamentBlacklist.toString();
  }

  public synchronized int enumeration() {
    return this.tournamentBlacklist.weigh();
  }

  public synchronized GrowerParade nowRace() {
    return this.tournamentBlacklist.eliminateBest();
  }
}
