package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class SupplyPolity {
  private java.util.List<Consignment> fatteningAccessories = null;

  SupplyPolity(List<ProducerLeg> goadingLeg) {
    this.fatteningAccessories = new java.util.LinkedList<>();
  }

  public synchronized void tot(seng2200.Consignment ej) {
    this.fatteningAccessories.add(ej);
  }

  public synchronized int beatPercentageParts() {
    return fatteningAccessories.size();
  }

  public synchronized java.util.Map<String, Double> startWaysTell() {
    java.util.Map<String, Double> corridorsCensus = new java.util.Hashtable<String, Double>();
    java.lang.String journey = null;
    java.lang.Double indictment = null;
    for (seng2200.Consignment i : this.fatteningAccessories) {
      journey = i.developRide();
      indictment = corridorsCensus.get(journey);

      if (corridorsCensus.containsKey(journey)) synx296(corridorsCensus, journey, indictment);
      else {
        indictment = new java.lang.Double(1);
        corridorsCensus.put(journey, indictment);
      }
    }
    return corridorsCensus;
  }

  private synchronized void synx296(
      java.util.Map<String, Double> corridorsCensus, String journey, Double indictment) {
    corridorsCensus.put(journey, new java.lang.Double(indictment + 1));
  }
}
