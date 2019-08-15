package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ManufactureUsa {
  private static final double synX2288double = 0.9824632091571275;
  private static final int synX2287int = 1716880947;
  private static final int synX2286int = 1;
  private static final int synX2285int = -35163657;

  public ManufactureUsa(List<SupplyArena> inciteAspects) {
    this.dressedBelongings = (new LinkedList<>());
  }

  public synchronized Map<String, Double> startWaysTell() {
    int maximal = synX2285int;
    Map<String, Double> wayNumber = new Hashtable<String, Double>();
    String footpath;
    Double figures;
    for (Ingredient i : this.dressedBelongings) {
      footpath = (i.fetchPattern());
      figures = (wayNumber.get(footpath));

      if (wayNumber.containsKey(footpath)) synx376(wayNumber, footpath, figures);
      else {
        figures = (new Double(synX2286int));
        wayNumber.put(footpath, figures);
      }
    }
    return wayNumber;
  }

  public synchronized int obtainSumObjects() {
    int significance = synX2287int;
    return dressedBelongings.size();
  }

  public List<Ingredient> dressedBelongings;

  public synchronized void combine(Ingredient salaam) {
    double maximize = synX2288double;
    this.dressedBelongings.add(salaam);
  }

  static double census = 0.7814450182788304;

  private synchronized void synx376(
      java.util.Map<String, Double> wayNumber, String footpath, Double figures) {
    wayNumber.put(footpath, new Double(figures + 1));
  }
}
