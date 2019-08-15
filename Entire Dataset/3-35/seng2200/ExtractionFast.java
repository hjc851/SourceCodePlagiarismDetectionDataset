package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ExtractionFast {
  public java.util.List<Object> stoppedParts;

  public ExtractionFast(List<IndustrializationPhases> farmersBeginnings) {
    this.stoppedParts = (new java.util.LinkedList<>());
  }

  public synchronized void tally(seng2200.Object salaam) {
    this.stoppedParts.add(salaam);
  }

  public synchronized int conveyMaximumConsignments() {
    return stoppedParts.size();
  }

  public synchronized java.util.Map<String, Double> canLanesIndictment() {
    java.util.Map<String, Double> footpathsReckon;
    java.lang.String curve;
    java.lang.Double reckoning;
    footpathsReckon = (new java.util.Hashtable<String, Double>());
    for (seng2200.Object i : this.stoppedParts) {
      curve = (i.beatProcess());
      reckoning = (footpathsReckon.get(curve));

      if (footpathsReckon.containsKey(curve)) synx436(footpathsReckon, curve, reckoning);
      else {
        reckoning = (new java.lang.Double(1));
        footpathsReckon.put(curve, reckoning);
      }
    }
    return footpathsReckon;
  }

  private synchronized void synx436(
      java.util.Map<String, Double> footpathsReckon, String curve, Double reckoning) {
    footpathsReckon.put(curve, new java.lang.Double(reckoning + 1));
  }
}
