package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducersQuick {
  public java.util.List<Issue> dressedBelongings = null;

  public synchronized java.util.Map<String, Double> haveFootpathsReckon() {
    java.util.Map<String, Double> roadwaysRely = new java.util.Hashtable<String, Double>();
    java.lang.String way = null;
    java.lang.Double calculate = null;
    for (seng2200.Issue i : this.dressedBelongings) {
      way = i.comeWay();
      calculate = roadwaysRely.get(way);

      if (roadwaysRely.containsKey(way)) {
        roadwaysRely.put(way, new java.lang.Double(calculate + 1));
      } else {
        calculate = new java.lang.Double(1);
        roadwaysRely.put(way, calculate);
      }
    }
    return roadwaysRely;
  }

  public synchronized int produceAddFoods() {
    return dressedBelongings.size();
  }

  public synchronized void inject(seng2200.Issue cma) {
    this.dressedBelongings.add(cma);
  }

  public ProducersQuick(List<PlantTheater> productivityVenues) {
    this.dressedBelongings = new java.util.LinkedList<>();
  }
}
