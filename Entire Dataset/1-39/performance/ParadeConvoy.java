package performance;

import caching.GradedCompendium;

public class ParadeConvoy {
  public static ParadeConvoy typicalCola;

  public synchronized MakerCelebration theExposition() {
    return this.gatheringRosters.eliminateBest();
  }

  public ParadeConvoy() {
    this.gatheringRosters = new GradedCompendium<MakerCelebration>();
    typicalCola = this;
  }

  public GradedCompendium<MakerCelebration> gatheringRosters;

  public synchronized String toString() {
    return this.gatheringRosters.toString();
  }

  public synchronized int number() {
    return this.gatheringRosters.census();
  }

  public static synchronized ParadeConvoy latestWait() {
    return typicalCola;
  }

  public synchronized MakerCelebration readAhead() {
    return this.gatheringRosters.firstbornArgue();
  }

  public synchronized void deleteRace(MakerCelebration refreshingSeminar) {
    this.gatheringRosters.incorporate(refreshingSeminar);
  }
}
