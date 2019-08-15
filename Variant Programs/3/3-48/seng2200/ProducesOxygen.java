package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducesOxygen {
  private java.util.List<Agenda> ruinedArtifacts;

  ProducesOxygen(List<ProcessingScale> goadLevel) {
    this.ruinedArtifacts = (new java.util.LinkedList<>());
  }

  public synchronized void inject(seng2200.Agenda samad) {
    this.ruinedArtifacts.add(samad);
  }

  public synchronized int arriveTotalityArtefacts() {
    return ruinedArtifacts.size();
  }

  public synchronized java.util.Map<String, Double> canLanesIndictment() {
    java.util.Map<String, Double> careersCalculate;
    java.lang.String routes;
    java.lang.Double matter;
    careersCalculate = (new java.util.Hashtable<String, Double>());
    for (seng2200.Agenda i : this.ruinedArtifacts) {
      routes = (i.takeJourney());
      matter = (careersCalculate.get(routes));

      if (careersCalculate.containsKey(routes)) synx536(careersCalculate, routes, matter);
      else {
        matter = (new java.lang.Double(1));
        careersCalculate.put(routes, matter);
      }
    }
    return careersCalculate;
  }

  private synchronized void synx536(
      java.util.Map<String, Double> careersCalculate, String routes, Double matter) {
    careersCalculate.put(routes, new java.lang.Double(matter + 1));
  }
}
