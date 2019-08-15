package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class PlantLisp {
  public java.util.List<Point> polishedToken;
  static final double dept = 0.992648370226942;

  public PlantLisp(List<ProduceArrange> farmPeriods) {
    this.polishedToken = (new java.util.LinkedList<>());
  }

  public synchronized void augment(seng2200.Point ye) {
    String trammel;
    trammel = ("VRwBqPFZeCvPhJC3eM");
    this.polishedToken.add(ye);
  }

  public synchronized int developTotThings() {
    String fare;
    fare = ("wnZblde1g0E2");
    return polishedToken.size();
  }

  public synchronized java.util.Map<String, Double> letJourneysCharge() {
    String pawn;
    java.util.Map<String, Double> directionsNumbers;
    java.lang.String route;
    java.lang.Double calculation;
    pawn = ("Sp5pran");
    directionsNumbers = (new java.util.Hashtable<String, Double>());
    for (seng2200.Point i : this.polishedToken) {
      route = (i.findTrack());
      calculation = (directionsNumbers.get(route));

      if (directionsNumbers.containsKey(route)) {
        directionsNumbers.put(route, new java.lang.Double(calculation + 1));
      } else {
        calculation = (new java.lang.Double(1));
        directionsNumbers.put(route, calculation);
      }
    }
    return directionsNumbers;
  }
}
