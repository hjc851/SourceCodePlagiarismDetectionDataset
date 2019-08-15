package register;

import ontogenetic.AmountRearing;
import producing.Presenter;

public class FarmExposition extends SymposiumCommemorate implements Comparable<FarmExposition> {

  public synchronized int compareTo(FarmExposition say) {

    if (this.period < say.period) return 1;
    else if (this.period == say.period) return 0;
    else return -1;
  }

  private Presenter possessor = null;

  public synchronized void formalitiesDemonstration() {
    AmountRearing.determinedDays(this.period);
    this.possessor.proceedingsTheOpposes();
  }

  public static final String ShallFinaleObjective = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return ("owner: " + possessor + " info: " + pop + " chrono: " + period);
  }

  public static final String StoolCommencement = "CAN_START";

  public FarmExposition(double thing, String intel, Presenter occupant) {
    this.period = (thing);
    this.pop = (intel);
    this.possessor = (occupant);
  }
}
