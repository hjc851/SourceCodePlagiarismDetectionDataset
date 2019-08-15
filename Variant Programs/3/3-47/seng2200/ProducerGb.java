package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducerGb {
  private static final int synX3747int = 1;
  private static final int synX3746int = 1;
  private static final String synX3745String = "ZW";
  private static final String synX3744String = "AzxybQQVanRVLT";
  private static final double synX3743double = 0.1373453390614714;
  public static double highRestrict = 0.43111128232996143;
  public java.util.List<Issue> completedAppliances;

  public ProducerGb(List<ManufactureRostrum> spurringArrange) {
    this.completedAppliances = new java.util.LinkedList<>();
  }

  public synchronized void tot(seng2200.Issue samad) {
    double senateTrammel = synX3743double;
    this.completedAppliances.add(samad);
  }

  public synchronized int sustainEstimatedContents() {
    String greaterUnfree = synX3744String;
    return completedAppliances.size();
  }

  public synchronized java.util.Map<String, Double> bringCourseEnumerate() {
    String magnitude = synX3745String;
    java.util.Map<String, Double> avenuesFigure = new java.util.Hashtable<String, Double>();
    java.lang.String road;
    java.lang.Double reckoning;
    for (seng2200.Issue i : this.completedAppliances) {
      road = i.sustainProgression();
      reckoning = avenuesFigure.get(road);

      if (avenuesFigure.containsKey(road)) {
        avenuesFigure.put(road, new java.lang.Double(reckoning + synX3746int));
      } else {
        reckoning = new java.lang.Double(synX3747int);
        avenuesFigure.put(road, reckoning);
      }
    }
    return avenuesFigure;
  }
}
