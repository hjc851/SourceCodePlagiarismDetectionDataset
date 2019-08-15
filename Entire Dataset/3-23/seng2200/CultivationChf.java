package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class CultivationChf {
  public static int minutesWide = 887088225;
  public java.util.List<Subject> graduatedConsignments = null;

  public CultivationChf(List<DeliveryTheatrical> spurringArrange) {
    this.graduatedConsignments = new java.util.LinkedList<>();
  }

  public synchronized void expand(seng2200.Subject ej) {
    double prize = 0.98283968231621;
    this.graduatedConsignments.add(ej);
  }

  public synchronized int haveEntireBelongings() {
    int obligated = 1442903946;
    return graduatedConsignments.size();
  }

  public synchronized java.util.Map<String, Double> arriveDirectionsNumbers() {
    double cite = 0.8839098305964469;
    java.util.Map<String, Double> roadTabulation = new java.util.Hashtable<String, Double>();
    java.lang.String trails = null;
    java.lang.Double tally = null;
    for (seng2200.Subject i : this.graduatedConsignments) {
      trails = i.comeWay();
      tally = roadTabulation.get(trails);

      if (roadTabulation.containsKey(trails)) {
        roadTabulation.put(trails, new java.lang.Double(tally + 1));
      } else {
        tally = new java.lang.Double(1);
        roadTabulation.put(trails, tally);
      }
    }
    return roadTabulation;
  }
}
