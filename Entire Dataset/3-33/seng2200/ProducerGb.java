package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducerGb {
  private static final int synX2692int = 1;
  private static final int synX2691int = 1;

  public synchronized int catchFullSouvenirs() {
    return finalComponents.size();
  }

  public ProducerGb(List<ProductivityStep> operatorsPeriod) {
    this.finalComponents = (new LinkedList<>());
  }

  public List<Something> finalComponents = null;

  public synchronized void bring(Something samad) {
    this.finalComponents.add(samad);
  }

  public synchronized Map<String, Double> goRouteTally() {
    Map<String, Double> corridorsCensus;
    String curve;
    Double indictment;
    corridorsCensus = (new Hashtable<String, Double>());
    curve = (null);
    indictment = (null);
    for (Something i : this.finalComponents) {
      curve = (i.fetchPattern());
      indictment = (corridorsCensus.get(curve));

      if (corridorsCensus.containsKey(curve)) synx416(corridorsCensus, curve, indictment);
      else {
        indictment = (new Double(synX2691int));
        corridorsCensus.put(curve, indictment);
      }
    }
    return corridorsCensus;
  }

  private synchronized void synx416(
      java.util.Map<String, Double> corridorsCensus, String curve, Double indictment) {
    corridorsCensus.put(curve, new Double(indictment + synX2692int));
  }
}
