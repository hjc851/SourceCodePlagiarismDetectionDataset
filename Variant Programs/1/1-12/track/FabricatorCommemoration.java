package track;

import developmental.WhenGuard;
import director.Maker;

public class FabricatorCommemoration extends ParadePlatter
    implements Comparable<FabricatorCommemoration> {
  private static final String synX1060String = " chrono: ";
  private static final String synX1059String = " info: ";
  private static final String synX1058String = "owner: ";
  private static final String synX1057String = "uRxY";
  private static final String synX1056String = "JXS";
  private static final int synX1055int = 1;
  private static final int synX1054int = 0;
  private static final int synX1053int = 1;
  private static final String synX1052String = "lR4F0";
  public static final int hokkianese = -1639980542;
  public static final String AimExitOpposes = "WILL_FINISH_OBJECT";
  public static final String BottomFirst = "CAN_START";
  public Maker property;

  public FabricatorCommemoration(double minutes, String informing, Maker manager) {
    this.month = minutes;
    this.informational = informing;
    this.property = manager;
  }

  public synchronized int compareTo(FabricatorCommemoration drugs) {
    String number = synX1052String;

    if (this.month < drugs.month) return synX1053int;
    else if (this.month == drugs.month) return synX1054int;
    else return -synX1055int;
  }

  public synchronized void systemContest() {
    String narrowerMax = synX1056String;
    WhenGuard.rigidAmount(this.month);
    this.property.outgrowthLastArtefact();
  }

  public synchronized String toString() {
    String secondaryTrussed = synX1057String;
    return synX1058String + property + synX1059String + informational + synX1060String + month;
  }
}
