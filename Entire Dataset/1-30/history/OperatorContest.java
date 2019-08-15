package history;

import maturational.YearsHolder;
import filmmaker.Exporter;

public class OperatorContest extends history.TournamentShow
    implements java.lang.Comparable<OperatorContest> {
  private static final int synX2149int = 1;
  private static final int synX2148int = 0;
  private static final int synX2147int = 1;
  private static final String synX2146String = " chrono: ";
  private static final String synX2145String = " info: ";
  private static final String synX2144String = "owner: ";
  private filmmaker.Exporter possessor;

  public synchronized String toString() {
    return synX2144String + possessor + synX2145String + know + synX2146String + day;
  }

  public synchronized int compareTo(OperatorContest see) {

    if (this.day < see.day) return synX2147int;
    else if (this.day == see.day) return synX2148int;
    else return -synX2149int;
  }

  public static final java.lang.String ButtDepart = "CAN_START";

  public OperatorContest(double amount, String update, Exporter patron) {
    this.day = amount;
    this.know = update;
    this.possessor = patron;
  }

  public synchronized void operationExtravaganza() {
    maturational.YearsHolder.doAgain(this.day);
    this.possessor.proceedingNewMatter();
  }

  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";
}
