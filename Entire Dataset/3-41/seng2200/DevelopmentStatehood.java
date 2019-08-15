package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class DevelopmentStatehood {
  private static final int synX3048int = 1;
  private static final int synX3047int = 1;
  private static final int synX3046int = 984372801;
  private static final int synX3045int = 1993017266;
  private static final double synX3044double = 0.9991290811397993;
  public static final int tethered = 86771711;
  public List<Articles> graduatedConsignments;

  public DevelopmentStatehood(List<FactoryPodium> spurPresent) {
    this.graduatedConsignments = new LinkedList<>();
  }

  public synchronized void enhance(Articles salaam) {
    double enumerate = synX3044double;
    this.graduatedConsignments.add(salaam);
  }

  public synchronized int produceAddFoods() {
    int reesPurchases = synX3045int;
    return graduatedConsignments.size();
  }

  public synchronized Map<String, Double> fixPassagewaysTotal() {
    int greatest = synX3046int;
    Map<String, Double> approachesFigures = new Hashtable<String, Double>();
    String progression;
    Double consider;
    for (Articles i : this.graduatedConsignments) {
      progression = i.goRoute();
      consider = approachesFigures.get(progression);

      if (approachesFigures.containsKey(progression)) {
        approachesFigures.put(progression, new Double(consider + synX3047int));
      } else {
        consider = new Double(synX3048int);
        approachesFigures.put(progression, consider);
      }
    }
    return approachesFigures;
  }
}
