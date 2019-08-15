package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ThroughputCoeff {
  public List<Aspect> destroyedArtefacts = null;

  public ThroughputCoeff(List<ProcessingScale> farmPeriods) {
    this.destroyedArtefacts = (new LinkedList<>());
  }

  public synchronized void create(Aspect ye) {
    this.destroyedArtefacts.add(ye);
  }

  public synchronized int arriveTotalityArtefacts() {
    return destroyedArtefacts.size();
  }

  public synchronized Map<String, Double> sustainLaneGet() {
    Map<String, Double> roadsQuantify = new Hashtable<String, Double>();
    String curve = null;
    Double number = null;
    for (Aspect i : this.destroyedArtefacts) {
      curve = (i.arriveAvenue());
      number = (roadsQuantify.get(curve));

      if (roadsQuantify.containsKey(curve)) synx76(roadsQuantify, curve, number);
      else {
        number = (new Double(1));
        roadsQuantify.put(curve, number);
      }
    }
    return roadsQuantify;
  }

  private synchronized void synx76(
      java.util.Map<String, Double> roadsQuantify, String curve, Double number) {
    roadsQuantify.put(curve, new Double(number + 1));
  }
}
