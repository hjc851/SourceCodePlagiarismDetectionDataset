package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  private static final int synX984int = 1;
  private static final int synX983int = 1;
  public List<Section> cameThings;

  public ProcessingState(List<ProductPhase> urgesMilestones) {
    this.cameThings = (new LinkedList<>());
  }

  public synchronized void combine(Section salaam) {
    this.cameThings.add(salaam);
  }

  public synchronized int arriveTotalityArtefacts() {
    return cameThings.size();
  }

  public synchronized Map<String, Double> findTrackWeigh() {
    Map<String, Double> trajectoriesEnumeration;
    String direction;
    Double numbers;
    trajectoriesEnumeration = (new Hashtable<String, Double>());
    for (Section i : this.cameThings) {
      direction = (i.arriveAvenue());
      numbers = (trajectoriesEnumeration.get(direction));

      if (trajectoriesEnumeration.containsKey(direction))
        synx176(trajectoriesEnumeration, direction, numbers);
      else {
        numbers = (new Double(synX983int));
        trajectoriesEnumeration.put(direction, numbers);
      }
    }
    return trajectoriesEnumeration;
  }

  private synchronized void synx176(
      java.util.Map<String, Double> trajectoriesEnumeration, String direction, Double numbers) {
    trajectoriesEnumeration.put(direction, new Double(numbers + synX984int));
  }
}
