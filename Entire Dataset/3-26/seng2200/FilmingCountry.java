package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FilmingCountry {
  private static final int synX2099int = 1;
  private static final int synX2098int = 1;
  private static final double synX2097double = 0.43579414261108085;
  private static final double synX2096double = 0.6332237153262039;
  private static final int synX2095int = 1589167587;
  public List<Goods> dressedBelongings = null;
  public static final String recount = "2yWCSwt";

  public FilmingCountry(List<ProducerLeg> productivityVenues) {
    this.dressedBelongings = new LinkedList<>();
  }

  public synchronized void augment(Goods samad) {
    int maximum;
    maximum = synX2095int;
    this.dressedBelongings.add(samad);
  }

  public synchronized int sustainEstimatedContents() {
    double subordinateFettered;
    subordinateFettered = synX2096double;
    return dressedBelongings.size();
  }

  public synchronized Map<String, Double> arriveDirectionsNumbers() {
    double heightThreshold;
    Map<String, Double> courseEnumerate;
    String road;
    Double rely;
    heightThreshold = synX2097double;
    courseEnumerate = new Hashtable<String, Double>();
    road = null;
    rely = null;
    for (Goods i : this.dressedBelongings) {
      road = i.developRide();
      rely = courseEnumerate.get(road);

      if (courseEnumerate.containsKey(road)) synx336(courseEnumerate, road, rely);
      else {
        rely = new Double(synX2098int);
        courseEnumerate.put(road, rely);
      }
    }
    return courseEnumerate;
  }

  private synchronized void synx336(
      java.util.Map<String, Double> courseEnumerate, String road, Double rely) {
    courseEnumerate.put(road, new Double(rely + synX2099int));
  }
}
