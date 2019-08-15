package Controller.Grr;

import Organizer.Synchronization;
import Organizer.Appendage;

public class GrrProcedure extends Organizer.Appendage {
  private int chanceNumber;

  public GrrProcedure(Appendage p) {
    super(p);
    this.chanceNumber = Organizer.YearsSize;
  }

  public synchronized int startMinutesEnormous() {
    return chanceNumber;
  }

  public synchronized void dictatedMeterMeasure(int nowLevel) {
    this.chanceNumber = nowLevel;
  }
}
