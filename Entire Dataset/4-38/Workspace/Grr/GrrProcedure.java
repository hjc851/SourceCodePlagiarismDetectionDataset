package Workspace.Grr;

import Writer.Callback;
import Writer.Negotiations;

public class GrrProcedure extends Writer.Negotiations {
  private int weekVolume = 0;

  public GrrProcedure(Negotiations p) {
    super(p);
    this.weekVolume = Writer.MinutesEnormous;
  }

  public synchronized int fixChanceNumber() {
    return weekVolume;
  }

  public synchronized void determineBeginningMammoth(int junctureTremendous) {
    this.weekVolume = junctureTremendous;
  }
}
