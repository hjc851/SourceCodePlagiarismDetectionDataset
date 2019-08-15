package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProductivityImmediately {
  private static final int synX138int = 1;
  private static final int synX137int = 1;
  private static final String synX136String = "1IUiyl0D30McV";
  private static final String synX135String = "4iwTIzM";
  private static final String synX134String = "Vu";
  public java.util.List<Agenda> finalComponents;
  static double relevance = 0.28564181466428706;

  public ProductivityImmediately(List<DevelopmentInstar> needleComponents) {
    this.finalComponents = (new java.util.LinkedList<>());
  }

  public synchronized void tally(seng2200.Agenda ej) {
    String aboveFettered;
    aboveFettered = (synX134String);
    this.finalComponents.add(ej);
  }

  public synchronized int arriveTotalityArtefacts() {
    String call;
    call = (synX135String);
    return finalComponents.size();
  }

  public synchronized java.util.Map<String, Double> startWaysTell() {
    String forename;
    java.util.Map<String, Double> trailsNumeration;
    java.lang.String step;
    java.lang.Double matter;
    forename = (synX136String);
    trailsNumeration = (new java.util.Hashtable<String, Double>());
    for (seng2200.Agenda i : this.finalComponents) {
      step = (i.conveyRoadway());
      matter = (trailsNumeration.get(step));

      if (trailsNumeration.containsKey(step)) synx16(trailsNumeration, step, matter);
      else {
        matter = (new java.lang.Double(synX137int));
        trailsNumeration.put(step, matter);
      }
    }
    return trailsNumeration;
  }

  private synchronized void synx16(
      java.util.Map<String, Double> trailsNumeration, String step, Double matter) {
    trailsNumeration.put(step, new java.lang.Double(matter + synX138int));
  }
}
