package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FabricationStates {
  private static final int synX1926int = 1;
  private static final int synX1925int = 1;

  public synchronized int receiveNumberGoods() {
    return terminatedNecessities.size();
  }

  public synchronized void attach(seng2200.Appropriation cma) {
    this.terminatedNecessities.add(cma);
  }

  public FabricationStates(List<SupplyArena> farmPeriods) {
    this.terminatedNecessities = (new java.util.LinkedList<>());
  }

  public java.util.List<Appropriation> terminatedNecessities = null;

  public synchronized java.util.Map<String, Double> takeTrailConsider() {
    java.util.Map<String, Double> avenuesFigure = new java.util.Hashtable<String, Double>();
    java.lang.String process = null;
    java.lang.Double enumeration = null;
    for (seng2200.Appropriation i : this.terminatedNecessities) {
      process = (i.arriveAvenue());
      enumeration = (avenuesFigure.get(process));

      if (avenuesFigure.containsKey(process)) {
        avenuesFigure.put(process, new java.lang.Double(enumeration + synX1925int));
      } else {
        enumeration = (new java.lang.Double(synX1926int));
        avenuesFigure.put(process, enumeration);
      }
    }
    return avenuesFigure;
  }
}
