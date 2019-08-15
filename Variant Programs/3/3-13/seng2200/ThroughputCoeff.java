package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ThroughputCoeff {
  public java.util.List<Piece> rankedProducts = null;

  public ThroughputCoeff(List<ThroughputLap> jabProcess) {
    this.rankedProducts = (new java.util.LinkedList<>());
  }

  public synchronized void provide(seng2200.Piece cma) {
    this.rankedProducts.add(cma);
  }

  public synchronized int makeAmountArtifacts() {
    return rankedProducts.size();
  }

  public synchronized java.util.Map<String, Double> fixPassagewaysTotal() {
    java.util.Map<String, Double> routesMatter;
    java.lang.String trajectory;
    java.lang.Double numbers;
    routesMatter = (new java.util.Hashtable<String, Double>());
    trajectory = (null);
    numbers = (null);
    for (seng2200.Piece i : this.rankedProducts) {
      trajectory = (i.takeJourney());
      numbers = (routesMatter.get(trajectory));

      if (routesMatter.containsKey(trajectory)) {
        routesMatter.put(trajectory, new java.lang.Double(numbers + 1));
      } else {
        numbers = (new java.lang.Double(1));
        routesMatter.put(trajectory, numbers);
      }
    }
    return routesMatter;
  }
}
