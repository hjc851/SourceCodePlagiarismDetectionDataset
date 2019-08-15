package tally;

import maturational.DaysHandler;
import fabricator.Manufacturer;

public class MakerCelebration extends RallyHigh implements Comparable<MakerCelebration> {
  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(MakerCelebration whatsoever) {

    if (this.years < whatsoever.years) return 1;
    else if (this.years == whatsoever.years) return 0;
    else return -1;
  }

  public synchronized String toString() {
    return ("owner: " + occupant + " info: " + know + " chrono: " + years);
  }

  public synchronized void formalitiesDemonstration() {
    DaysHandler.rigidAmount(this.years);
    this.occupant.phaseSoonBody();
  }

  public MakerCelebration(double clock, String dope, Manufacturer tenant) {
    this.years = (clock);
    this.know = (dope);
    this.occupant = (tenant);
  }

  public Manufacturer occupant = null;
  public static final String FundamentOriginate = "CAN_START";
}
