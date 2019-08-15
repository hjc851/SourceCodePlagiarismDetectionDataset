package ledger;

import ontogenetic.PeriodWarden;
import farm.Growers;

public class FarmExposition extends CaseBest implements Comparable<FarmExposition> {
  private static final String synX2220String = " chrono: ";
  private static final String synX2219String = " info: ";
  private static final String synX2218String = "owner: ";
  private static final int synX2217int = 1;
  private static final int synX2216int = 0;
  private static final int synX2215int = 1;
  public static final String WannaEndsPreclude = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(FarmExposition ensure) {

    if (this.sentence < ensure.sentence) return synX2215int;
    else if (this.sentence == ensure.sentence) return synX2216int;
    else return -synX2217int;
  }

  public synchronized String toString() {
    return synX2218String + tenant + synX2219String + stuff + synX2220String + sentence;
  }

  public static final String BumGet = "CAN_START";
  public Growers tenant = null;

  public synchronized void methodologySpectacle() {
    PeriodWarden.placeWeek(this.sentence);
    this.tenant.proceduresExpectedObjet();
  }

  public FarmExposition(double moment, String media, Growers landlord) {
    this.sentence = moment;
    this.stuff = media;
    this.tenant = landlord;
  }
}
