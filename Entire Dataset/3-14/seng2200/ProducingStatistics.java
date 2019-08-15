package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducingStatistics {
  private static final int synX1297int = 1;
  private static final int synX1296int = 1;
  public List<Point> polishedToken;

  public ProducingStatistics(List<ManufactureRostrum> goadingLeg) {
    this.polishedToken = new LinkedList<>();
  }

  public synchronized void contribute(Point samad) {
    this.polishedToken.add(samad);
  }

  public synchronized int generateAbsoluteNecessities() {
    return polishedToken.size();
  }

  public synchronized Map<String, Double> sustainLaneGet() {
    Map<String, Double> roadsQuantify;
    String trajectory;
    Double number;
    roadsQuantify = new Hashtable<String, Double>();
    for (Point i : this.polishedToken) {
      trajectory = i.makeTrajectory();
      number = roadsQuantify.get(trajectory);

      if (roadsQuantify.containsKey(trajectory)) synx216(roadsQuantify, trajectory, number);
      else {
        number = new Double(synX1296int);
        roadsQuantify.put(trajectory, number);
      }
    }
    return roadsQuantify;
  }

  private synchronized void synx216(
      java.util.Map<String, Double> roadsQuantify, String trajectory, Double number) {
    roadsQuantify.put(trajectory, new Double(number + synX1297int));
  }
}
