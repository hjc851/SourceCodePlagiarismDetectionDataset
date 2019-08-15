package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Consignment {
  private static final String synX2465String = "->";
  private static final int synX2464int = 1;
  private static final int synX2463int = 0;
  private static final int synX2462int = 0;
  private static final int synX2461int = 0;
  private static final int synX2460int = 0;
  private static final int synX2459int = 0;
  public double goingDays;
  public double accessOpportunity;
  public List<AgainMark> periodPestleChecklist;

  public Consignment() {
    this.accessOpportunity = (0);
    this.goingDays = (0);
    this.periodPestleChecklist = (new LinkedList<AgainMark>());
  }

  public synchronized void adjustEnterMonth(double period) {
    this.accessOpportunity = (period);
  }

  public synchronized void rigidQuittingAmount(double chance) {
    this.goingDays = (chance);
  }

  public synchronized void affixMinutes(String impelDiscover) {
    this.periodPestleChecklist.add(
        new AgainMark(impelDiscover, this.accessOpportunity, this.goingDays));
    this.accessOpportunity = (synX2459int);
    this.goingDays = (synX2460int);
  }

  public synchronized AgainMark colaCouponJuncture(String qEpithet) {
    AgainMark righ;
    righ = (new AgainMark(qEpithet, this.accessOpportunity, this.goingDays));
    this.accessOpportunity = (synX2461int);
    this.goingDays = (synX2462int);
    return righ;
  }

  public synchronized String becomeDestiny() {
    StringBuilder al;
    al = (new StringBuilder());

    for (int rely = synX2463int; rely < this.periodPestleChecklist.size(); rely++)
      synx399(al, rely);
    return al.toString();
  }

  private synchronized void synx399(StringBuilder al, int rely) {
    al.append(this.periodPestleChecklist.get(rely).comeGoadLevelList());

    if (rely < this.periodPestleChecklist.size() - synX2464int) al.append(synX2465String);
  }
}
