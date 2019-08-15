package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class DevelopmentStatehood {
  private static final int synX1421int = 1;
  private static final int synX1420int = 1;
  public java.util.List<Tidbit> graduatedConsignments;

  public DevelopmentStatehood(List<FilmingPlace> orientedTimes) {
    this.graduatedConsignments = (new java.util.LinkedList<>());
  }

  public synchronized void summate(seng2200.Tidbit ye) {
    this.graduatedConsignments.add(ye);
  }

  public synchronized int becomeSummatePurchases() {
    return graduatedConsignments.size();
  }

  public synchronized java.util.Map<String, Double> catchTrailsNumeration() {
    java.util.Map<String, Double> corridorsCensus = new java.util.Hashtable<String, Double>();
    java.lang.String direction;
    java.lang.Double matter;
    for (seng2200.Tidbit i : this.graduatedConsignments) {
      direction = (i.catchTrail());
      matter = (corridorsCensus.get(direction));

      if (corridorsCensus.containsKey(direction)) {
        corridorsCensus.put(direction, new java.lang.Double(matter + synX1420int));
      } else {
        matter = (new java.lang.Double(synX1421int));
        corridorsCensus.put(direction, matter);
      }
    }
    return corridorsCensus;
  }
}
