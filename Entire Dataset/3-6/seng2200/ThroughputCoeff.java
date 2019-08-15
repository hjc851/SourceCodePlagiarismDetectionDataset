package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ThroughputCoeff {
  private static final int synX542int = 1;
  private static final int synX541int = 1;
  private List<Subject> terminatedNecessities = null;

  ThroughputCoeff(List<ProduceArrange> goadLevel) {
    this.terminatedNecessities = (new LinkedList<>());
  }

  public synchronized void bestow(Subject einsteinium) {
    this.terminatedNecessities.add(einsteinium);
  }

  public synchronized int beatPercentageParts() {
    return terminatedNecessities.size();
  }

  public synchronized Map<String, Double> generateRoadTabulation() {
    Map<String, Double> linesRecount;
    String destiny;
    Double tally;
    linesRecount = (new Hashtable<String, Double>());
    destiny = (null);
    tally = (null);
    for (Subject i : this.terminatedNecessities) {
      destiny = (i.comeWay());
      tally = (linesRecount.get(destiny));

      if (linesRecount.containsKey(destiny)) synx116(linesRecount, destiny, tally);
      else {
        tally = (new Double(synX541int));
        linesRecount.put(destiny, tally);
      }
    }
    return linesRecount;
  }

  private synchronized void synx116(
      java.util.Map<String, Double> linesRecount, String destiny, Double tally) {
    linesRecount.put(destiny, new Double(tally + synX542int));
  }
}
