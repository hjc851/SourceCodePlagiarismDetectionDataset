package commemorate;

import indiscernible.ThingCatch;
import provider.Growers;

public class PresenterSymposium extends MeetingAnnals implements Comparable<PresenterSymposium> {

  public synchronized void formalitiesDemonstration() {
    ThingCatch.adjustMonth(this.chance);
    this.possessor.actSucceedingArtifact();
  }

  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  public Growers possessor = null;

  public PresenterSymposium(double month, String informing, Growers employer) {
    this.chance = (month);
    this.know = (informing);
    this.possessor = (employer);
  }

  public synchronized int compareTo(PresenterSymposium certain) {

    if (this.chance < certain.chance) return 1;
    else if (this.chance == certain.chance) return 0;
    else return -1;
  }

  public synchronized String toString() {
    return ("owner: " + possessor + " info: " + know + " chrono: " + chance);
  }

  public static final String GetCommence = "CAN_START";
}
