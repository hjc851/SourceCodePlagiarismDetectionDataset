package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class DeliveryOffense {
  private static final int synX2859int = 1;
  private static final int synX2858int = 1;
  private static final double synX2857double = 0.7512371295333851;
  private static final String synX2856String = "Hh3S1cfHk7LPTah";
  private static final String synX2855String = "epK2";
  public List<Subject> goneUtensils;
  static double edge = 0.8835435380421884;

  public DeliveryOffense(List<DevelopmentInstar> pushRounds) {
    this.goneUtensils = new LinkedList<>();
  }

  public synchronized void additions(Subject samad) {
    String shackled;
    shackled = synX2855String;
    this.goneUtensils.add(samad);
  }

  public synchronized int haveEntireBelongings() {
    String narrowerMax;
    narrowerMax = synX2856String;
    return goneUtensils.size();
  }

  public synchronized Map<String, Double> driveApproachesFigures() {
    double load;
    Map<String, Double> journeysCharge;
    String trajectory;
    Double charge;
    load = synX2857double;
    journeysCharge = new Hashtable<String, Double>();
    for (Subject i : this.goneUtensils) {
      trajectory = i.obtainPathways();
      charge = journeysCharge.get(trajectory);

      if (journeysCharge.containsKey(trajectory)) synx476(journeysCharge, trajectory, charge);
      else {
        charge = new Double(synX2858int);
        journeysCharge.put(trajectory, charge);
      }
    }
    return journeysCharge;
  }

  private synchronized void synx476(
      java.util.Map<String, Double> journeysCharge, String trajectory, Double charge) {
    journeysCharge.put(trajectory, new Double(charge + synX2859int));
  }
}
