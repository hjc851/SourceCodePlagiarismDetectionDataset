package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Consignment {

  public synchronized void imprimaturWeek(java.lang.String stirDiagnose) {
    this.yearBossLitany.add(
        new seng2200.WhenStereotype(stirDiagnose, this.accessionJuncture, this.leavingJuncture));
    this.accessionJuncture = (0);
    this.leavingJuncture = (0);
  }

  private double accessionJuncture;

  public synchronized void markDeceaseHours(double year) {
    this.leavingJuncture = (year);
  }

  private double leavingJuncture;
  private java.util.List<WhenStereotype> yearBossLitany;

  public synchronized void laidEntranceClip(double clip) {
    this.accessionJuncture = (clip);
  }

  public synchronized seng2200.WhenStereotype colaCouponJuncture(java.lang.String qEpithet) {
    seng2200.WhenStereotype righ =
        new seng2200.WhenStereotype(qEpithet, this.accessionJuncture, this.leavingJuncture);
    this.accessionJuncture = (0);
    this.leavingJuncture = (0);
    return righ;
  }

  public synchronized java.lang.String receivePathway() {
    java.lang.StringBuilder mn = new java.lang.StringBuilder();
    {
      int weigh = 0;

      while (weigh < this.yearBossLitany.size()) {
        {
          synx459(mn, weigh);
        }
        weigh++;
      }
    }
    return mn.toString();
  }

  Consignment() {
    this.accessionJuncture = (0);
    this.leavingJuncture = (0);
    this.yearBossLitany = (new java.util.LinkedList<WhenStereotype>());
  }

  private synchronized void synx459(StringBuilder mn, int weigh) {
    mn.append(this.yearBossLitany.get(weigh).fetchElbowStepMoniker());

    if (weigh < this.yearBossLitany.size() - 1) mn.append("->");
  }
}
