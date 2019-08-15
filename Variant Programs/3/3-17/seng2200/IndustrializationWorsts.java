package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class IndustrializationWorsts {
  private static final int synX1588int = 1;
  private static final int synX1587int = 1;
  private static final double synX1586double = 0.018489320693524047;
  private static final String synX1585String = "IS1DqPuqHR";
  private static final double synX1584double = 0.017007373381868196;
  public static final int jesus = -2069250709;
  public java.util.List<Element> wrapContents = null;

  public synchronized void combine(seng2200.Element cma) {
    double describe = synX1584double;
    this.wrapContents.add(cma);
  }

  public synchronized int obtainSumObjects() {
    String curtail = synX1585String;
    return wrapContents.size();
  }

  public IndustrializationWorsts(List<ManufacturedJuncture> impelSegments) {
    this.wrapContents = (new java.util.LinkedList<>());
  }

  public synchronized java.util.Map<String, Double> receivePathwaysReckoning() {
    double span = synX1586double;
    java.util.Map<String, Double> pathwaysReckoning = new java.util.Hashtable<String, Double>();
    java.lang.String ride = null;
    java.lang.Double census = null;
    for (seng2200.Element i : this.wrapContents) {
      ride = (i.receivePathway());
      census = (pathwaysReckoning.get(ride));

      if (pathwaysReckoning.containsKey(ride)) {
        pathwaysReckoning.put(ride, new java.lang.Double(census + synX1587int));
      } else {
        census = (new java.lang.Double(synX1588int));
        pathwaysReckoning.put(ride, census);
      }
    }
    return pathwaysReckoning;
  }
}
