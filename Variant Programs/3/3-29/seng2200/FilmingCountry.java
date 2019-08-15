package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FilmingCountry {
  private static final int synX2438int = 1;
  private static final int synX2437int = 1;
  public List<Consignment> rankedProducts;

  public FilmingCountry(List<ProcessingScale> nudgePhase) {
    this.rankedProducts = (new LinkedList<>());
  }

  public synchronized void combine(Consignment cma) {
    this.rankedProducts.add(cma);
  }

  public synchronized int findGrossPoint() {
    return rankedProducts.size();
  }

  public synchronized Map<String, Double> becomeAvenuesFigure() {
    Map<String, Double> footpathsReckon;
    String road;
    Double census;
    footpathsReckon = (new Hashtable<String, Double>());
    for (Consignment i : this.rankedProducts) {
      road = (i.becomeDestiny());
      census = (footpathsReckon.get(road));

      if (footpathsReckon.containsKey(road)) synx396(footpathsReckon, road, census);
      else {
        census = (new Double(synX2437int));
        footpathsReckon.put(road, census);
      }
    }
    return footpathsReckon;
  }

  private synchronized void synx396(
      java.util.Map<String, Double> footpathsReckon, String road, Double census) {
    footpathsReckon.put(road, new Double(census + synX2438int));
  }
}
