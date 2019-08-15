package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProductivityImmediately {
  private static final int synX1780int = 1;
  private static final int synX1779int = 1;
  private static final double synX1778double = 0.1012723510869099;
  private static final String synX1777String = "GG3v";
  private static final double synX1776double = 0.4572274130433567;
  static int assess = -277336001;
  public java.util.List<Element> cameThings;

  public ProductivityImmediately(List<ManufactureRostrum> farmersBeginnings) {
    this.cameThings = (new java.util.LinkedList<>());
  }

  public synchronized void augment(seng2200.Element ye) {
    double leaping = synX1776double;
    this.cameThings.add(ye);
  }

  public synchronized int findGrossPoint() {
    String highestBandwidth = synX1777String;
    return cameThings.size();
  }

  public synchronized java.util.Map<String, Double> sustainLaneGet() {
    double call = synX1778double;
    java.util.Map<String, Double> lanesIndictment = new java.util.Hashtable<String, Double>();
    java.lang.String course;
    java.lang.Double census;
    for (seng2200.Element i : this.cameThings) {
      course = (i.catchTrail());
      census = (lanesIndictment.get(course));

      if (lanesIndictment.containsKey(course)) synx256(lanesIndictment, course, census);
      else {
        census = (new java.lang.Double(synX1779int));
        lanesIndictment.put(course, census);
      }
    }
    return lanesIndictment;
  }

  private synchronized void synx256(
      java.util.Map<String, Double> lanesIndictment, String course, Double census) {
    lanesIndictment.put(course, new java.lang.Double(census + synX1780int));
  }
}
