package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {

  public synchronized void incorporate(Particular ej) {
    this.throughFoods.add(ej);
  }

  public synchronized Map<String, Double> drawCorridorsCensus() {
    Map<String, Double> passagewaysTotal = new Hashtable<String, Double>();
    String journey = null;
    Double matter = null;
    for (Particular i : this.throughFoods) {
      journey = i.obtainPathways();
      matter = passagewaysTotal.get(journey);

      if (passagewaysTotal.containsKey(journey)) {
        passagewaysTotal.put(journey, new Double(matter + 1));
      } else {
        matter = new Double(1);
        passagewaysTotal.put(journey, matter);
      }
    }
    return passagewaysTotal;
  }

  public ProcessingState(List<ProducesSpotlight> farmPeriods) {
    this.throughFoods = new LinkedList<>();
  }

  public List<Particular> throughFoods = null;

  public synchronized int comeOverallDetail() {
    return throughFoods.size();
  }
}
