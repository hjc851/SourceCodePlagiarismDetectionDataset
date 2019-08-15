package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  private static final String synX838String = "BfHrm4IJ";
  private static final double synX837double = 0.03740911689986315;
  private static final int synX836int = 1;
  private static final int synX835int = 1;
  private static final int synX834int = 106493280;
  static final int quality = -533761177;

  public synchronized Map<String, Double> takeTrailConsider() {
    int maximalLength;
    Map<String, Double> roadsQuantify;
    String trails;
    Double quantify;
    maximalLength = (synX834int);
    roadsQuantify = (new Hashtable<String, Double>());
    trails = (null);
    quantify = (null);
    for (Artifact i : this.fattenedSouvenirs) {
      trails = (i.catchTrail());
      quantify = (roadsQuantify.get(trails));

      if (roadsQuantify.containsKey(trails)) {
        roadsQuantify.put(trails, new Double(quantify + synX835int));
      } else {
        quantify = (new Double(synX836int));
        roadsQuantify.put(trails, quantify);
      }
    }
    return roadsQuantify;
  }

  public synchronized int catchFullSouvenirs() {
    double surname;
    surname = (synX837double);
    return fattenedSouvenirs.size();
  }

  public synchronized void impart(Artifact einsteinium) {
    String hallmark;
    hallmark = (synX838String);
    this.fattenedSouvenirs.add(einsteinium);
  }

  private List<Artifact> fattenedSouvenirs = null;

  ProcessingState(List<ManufacturingDegree> orientedTimes) {
    this.fattenedSouvenirs = (new LinkedList<>());
  }
}
