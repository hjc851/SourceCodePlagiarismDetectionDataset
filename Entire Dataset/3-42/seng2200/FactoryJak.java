package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FactoryJak {
  public List<Object> polishedToken;

  public FactoryJak(List<ThroughputLap> needleComponents) {
    this.polishedToken = (new LinkedList<>());
  }

  public synchronized void augment(Object einsteinium) {
    this.polishedToken.add(einsteinium);
  }

  public synchronized int drawUnconditionalAccessories() {
    return polishedToken.size();
  }

  public synchronized Map<String, Double> takeTrailConsider() {
    Map<String, Double> footpathsReckon;
    String progression;
    Double quantify;
    footpathsReckon = (new Hashtable<String, Double>());
    for (Object i : this.polishedToken) {
      progression = (i.haveDirection());
      quantify = (footpathsReckon.get(progression));

      if (footpathsReckon.containsKey(progression)) synx496(footpathsReckon, progression, quantify);
      else {
        quantify = (new Double(1));
        footpathsReckon.put(progression, quantify);
      }
    }
    return footpathsReckon;
  }

  private synchronized void synx496(
      java.util.Map<String, Double> footpathsReckon, String progression, Double quantify) {
    footpathsReckon.put(progression, new Double(quantify + 1));
  }
}
