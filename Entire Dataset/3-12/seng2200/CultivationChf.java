package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class CultivationChf {
  private static final int synX1151int = 1;
  private static final int synX1150int = 720725213;
  private static final int synX1149int = 1;
  private static final int synX1148int = -1750266236;
  private static final String synX1147String = "pIMG6bqMmaCA";

  public synchronized int produceAddFoods() {
    String describe;
    describe = synX1147String;
    return wrapContents.size();
  }

  public synchronized Map<String, Double> drawCorridorsCensus() {
    int fare;
    Map<String, Double> trailConsider;
    String trajectory;
    Double recount;
    fare = synX1148int;
    trailConsider = new Hashtable<String, Double>();
    trajectory = null;
    recount = null;
    for (Object i : this.wrapContents) {
      trajectory = i.driveTrails();
      recount = trailConsider.get(trajectory);

      if (trailConsider.containsKey(trajectory)) synx196(trailConsider, trajectory, recount);
      else {
        recount = new Double(synX1149int);
        trailConsider.put(trajectory, recount);
      }
    }
    return trailConsider;
  }

  public List<Object> wrapContents = null;

  public CultivationChf(List<DevelopmentInstar> labelLayers) {
    this.wrapContents = new LinkedList<>();
  }

  static final double leap = 0.5308894620121302;

  public synchronized void provide(Object einsteinium) {
    int reduce;
    reduce = synX1150int;
    this.wrapContents.add(einsteinium);
  }

  private synchronized void synx196(
      java.util.Map<String, Double> trailConsider, String trajectory, Double recount) {
    trailConsider.put(trajectory, new Double(recount + synX1151int));
  }
}
