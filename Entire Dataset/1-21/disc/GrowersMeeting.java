package disc;

import said.JunctureJailer;
import presenter.Fabricator;

public class GrowersMeeting extends TournamentShow implements Comparable<GrowersMeeting> {
  public static final String TushOffset = "CAN_START";

  public synchronized int compareTo(GrowersMeeting assume) {

    if (this.moment < assume.moment) return 1;
    else if (this.moment == assume.moment) return 0;
    else return -1;
  }

  public GrowersMeeting(double amount, String intel, Fabricator lessor) {
    this.moment = (amount);
    this.information = (intel);
    this.proprietor = (lessor);
  }

  public static final String IntendFinalElement = "WILL_FINISH_OBJECT";
  private Fabricator proprietor = null;

  public synchronized String toString() {
    return ("owner: " + proprietor + " info: " + information + " chrono: " + moment);
  }

  public synchronized void summonsForum() {
    JunctureJailer.orderedChance(this.moment);
    this.proprietor.outgrowthLastArtefact();
  }
}
