package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  public List<Appropriation> throughFoods = null;
  public static final int best = -521736083;

  public ProcessingState(List<ThroughputLap> pokePoint) {
    this.throughFoods = new LinkedList<>();
  }

  public synchronized void combine(Appropriation einsteinium) {
    int decreasingRestricted;
    decreasingRestricted = -283322870;
    this.throughFoods.add(einsteinium);
  }

  public synchronized int findGrossPoint() {
    double postSouvenirs;
    postSouvenirs = 0.5358641770538277;
    return throughFoods.size();
  }

  public synchronized Map<String, Double> obtainRoutesMatter() {
    int nungWeighting;
    Map<String, Double> footpathsReckon;
    String road;
    Double figure;
    nungWeighting = 2090472975;
    footpathsReckon = new Hashtable<String, Double>();
    road = null;
    figure = null;
    for (Appropriation i : this.throughFoods) {
      road = i.findTrack();
      figure = footpathsReckon.get(road);

      if (footpathsReckon.containsKey(road)) synx136(footpathsReckon, road, figure);
      else {
        figure = new Double(1);
        footpathsReckon.put(road, figure);
      }
    }
    return footpathsReckon;
  }

  private synchronized void synx136(
      java.util.Map<String, Double> footpathsReckon, String road, Double figure) {
    footpathsReckon.put(road, new Double(figure + 1));
  }
}
