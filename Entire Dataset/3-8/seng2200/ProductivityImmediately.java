package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProductivityImmediately {
  private static final int synX667int = 1;

  public synchronized int developTotThings() {
    return upPieces.size();
  }

  public synchronized void provide(seng2200.Artifact einsteinium) {
    this.upPieces.add(einsteinium);
  }

  public synchronized java.util.Map<String, Double> findTrackWeigh() {
    java.util.Map<String, Double> journeyCalculation;
    java.lang.String way;
    java.lang.Double weigh;
    journeyCalculation = (new java.util.Hashtable<String, Double>());
    way = (null);
    weigh = (null);
    for (seng2200.Artifact i : this.upPieces) {
      way = (i.obtainPathways());
      weigh = (journeyCalculation.get(way));

      if (journeyCalculation.containsKey(way)) synx156(journeyCalculation, way, weigh);
      else {
        weigh = (new java.lang.Double(synX667int));
        journeyCalculation.put(way, weigh);
      }
    }
    return journeyCalculation;
  }

  public java.util.List<Artifact> upPieces = null;

  public ProductivityImmediately(List<OutputLevel> stabDegree) {
    this.upPieces = (new java.util.LinkedList<>());
  }

  private synchronized void synx156(
      java.util.Map<String, Double> journeyCalculation, String way, Double weigh) {
    journeyCalculation.put(way, new java.lang.Double(weigh + 1));
  }
}
