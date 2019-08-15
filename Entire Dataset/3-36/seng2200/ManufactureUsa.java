package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ManufactureUsa {

  ManufactureUsa(List<CultivationScene> productivityVenues) {
    this.polishedToken = (new java.util.LinkedList<>());
  }

  public synchronized void combine(seng2200.Consignment ej) {
    this.polishedToken.add(ej);
  }

  public synchronized int receiveNumberGoods() {
    return polishedToken.size();
  }

  private java.util.List<Consignment> polishedToken;

  public synchronized java.util.Map<String, Double> obtainRoutesMatter() {
    java.util.Map<String, Double> footpathsReckon = new java.util.Hashtable<String, Double>();
    java.lang.String trail;
    java.lang.Double figure;
    for (seng2200.Consignment i : this.polishedToken) {
      trail = (i.receivePathway());
      figure = (footpathsReckon.get(trail));

      if (footpathsReckon.containsKey(trail)) synx456(footpathsReckon, trail, figure);
      else {
        figure = (new java.lang.Double(1));
        footpathsReckon.put(trail, figure);
      }
    }
    return footpathsReckon;
  }

  private synchronized void synx456(
      java.util.Map<String, Double> footpathsReckon, String trail, Double figure) {
    footpathsReckon.put(trail, new java.lang.Double(figure + 1));
  }
}
