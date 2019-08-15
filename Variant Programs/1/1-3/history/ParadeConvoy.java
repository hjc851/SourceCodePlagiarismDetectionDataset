package history;

import space.CleanedTilt;

public class ParadeConvoy {

  public static synchronized history.ParadeConvoy liveStandby() {
    return previousDipper;
  }

  public synchronized void injectCeremony(history.OperatorContest modernFestival) {
    this.contestDocket.embedded(modernFestival);
  }

  public ParadeConvoy() {
    this.contestDocket = new space.CleanedTilt<OperatorContest>();
    previousDipper = this;
  }

  public synchronized String toString() {
    return this.contestDocket.toString();
  }

  public synchronized int tabulation() {
    return this.contestDocket.get();
  }

  public space.CleanedTilt<OperatorContest> contestDocket = null;

  public synchronized history.OperatorContest thirdCeremonies() {
    return this.contestDocket.dismantleFreshman();
  }

  public synchronized history.OperatorContest cheatingAfter() {
    return this.contestDocket.firstbornArgue();
  }

  public static history.ParadeConvoy previousDipper = null;
}
