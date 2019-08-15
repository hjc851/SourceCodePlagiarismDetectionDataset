package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ExtractionFast {

  public synchronized void expand(Subject einsteinium) {
    this.ruinedArtifacts.add(einsteinium);
  }

  public synchronized int drawUnconditionalAccessories() {
    return ruinedArtifacts.size();
  }

  ExtractionFast(List<ManufacturingDegree> stabDegree) {
    this.ruinedArtifacts = (new LinkedList<>());
  }

  private List<Subject> ruinedArtifacts;

  public synchronized Map<String, Double> goRouteTally() {
    Map<String, Double> corridorsCensus;
    String track;
    Double tell;
    corridorsCensus = (new Hashtable<String, Double>());
    for (Subject i : this.ruinedArtifacts) {
      track = (i.letApproach());
      tell = (corridorsCensus.get(track));

      if (corridorsCensus.containsKey(track)) {
        corridorsCensus.put(track, new Double(tell + 1));
      } else {
        tell = (new Double(1));
        corridorsCensus.put(track, tell);
      }
    }
    return corridorsCensus;
  }
}
