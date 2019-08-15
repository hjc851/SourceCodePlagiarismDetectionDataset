package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  private static final int synX3574int = 1;
  private static final int synX3573int = 1;

  public synchronized java.util.Map<String, Double> startWaysTell() {
    java.util.Map<String, Double> roadwaysRely;
    java.lang.String curve;
    java.lang.Double rely;
    roadwaysRely = new java.util.Hashtable<String, Double>();
    curve = null;
    rely = null;
    for (seng2200.Articles i : this.completingPurchases) {
      curve = i.makeTrajectory();
      rely = roadwaysRely.get(curve);

      if (roadwaysRely.containsKey(curve)) {
        roadwaysRely.put(curve, new java.lang.Double(rely + synX3573int));
      } else {
        rely = new java.lang.Double(synX3574int);
        roadwaysRely.put(curve, rely);
      }
    }
    return roadwaysRely;
  }

  public ProcessingState(List<ProducedStagecoach> labelLayers) {
    this.completingPurchases = new java.util.LinkedList<>();
  }

  public java.util.List<Articles> completingPurchases = null;

  public synchronized int startCumulativeProducts() {
    return completingPurchases.size();
  }

  public synchronized void lend(seng2200.Articles einsteinium) {
    this.completingPurchases.add(einsteinium);
  }
}
