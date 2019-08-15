package read;

import depositional.WeekGoverness;
import farmer.Breeder;

public class ProduceTriathlon extends read.SeminarRead
    implements java.lang.Comparable<ProduceTriathlon> {
  private static final String synX2782String = " chrono: ";
  private static final String synX2781String = " info: ";
  private static final String synX2780String = "owner: ";
  private static final int synX2779int = 1;
  private static final int synX2778int = 0;
  private static final int synX2777int = 1;
  public static final java.lang.String WishEndTarget = "WILL_FINISH_OBJECT";

  public ProduceTriathlon(double meter, String briefing, Breeder homeowner) {
    this.juncture = (meter);
    this.learn = (briefing);
    this.tenant = (homeowner);
  }

  public synchronized void procedureCase() {
    depositional.WeekGoverness.prepareNow(this.juncture);
    this.tenant.phaseSoonBody();
  }

  public static final java.lang.String TailResume = "CAN_START";

  public synchronized int compareTo(ProduceTriathlon know) {

    if (this.juncture < know.juncture) return synX2777int;
    else if (this.juncture == know.juncture) return synX2778int;
    else return -synX2779int;
  }

  private farmer.Breeder tenant = null;

  public synchronized String toString() {
    return (synX2780String + tenant + synX2781String + learn + synX2782String + juncture);
  }
}
