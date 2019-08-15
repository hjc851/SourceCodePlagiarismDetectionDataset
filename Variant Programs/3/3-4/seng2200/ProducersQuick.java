package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducersQuick {
  private static final int synX418int = 1;
  private static final int synX417int = 1;

  public synchronized void bring(seng2200.Artifact einsteinium) {
    this.graduatedConsignments.add(einsteinium);
  }

  public synchronized int sustainEstimatedContents() {
    return graduatedConsignments.size();
  }

  ProducersQuick(List<ExtractionMoment> urgesMilestones) {
    this.graduatedConsignments = (new java.util.LinkedList<>());
  }

  private java.util.List<Artifact> graduatedConsignments;

  public synchronized java.util.Map<String, Double> generateRoadTabulation() {
    java.util.Map<String, Double> journeysCharge;
    java.lang.String pattern;
    java.lang.Double recount;
    journeysCharge = (new java.util.Hashtable<String, Double>());
    for (seng2200.Artifact i : this.graduatedConsignments) {
      pattern = (i.makeTrajectory());
      recount = (journeysCharge.get(pattern));

      if (journeysCharge.containsKey(pattern)) {
        journeysCharge.put(pattern, new java.lang.Double(recount + synX417int));
      } else {
        recount = (new java.lang.Double(synX418int));
        journeysCharge.put(pattern, recount);
      }
    }
    return journeysCharge;
  }
}
