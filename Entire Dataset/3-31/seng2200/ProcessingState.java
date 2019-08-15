package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  private static final int synX2566int = 1;
  private static final int synX2565int = 1;

  ProcessingState(List<FabricationLimelight> needleComponents) {
    this.wrapContents = (new LinkedList<>());
  }

  public synchronized void bring(Articles salaam) {
    this.wrapContents.add(salaam);
  }

  private List<Articles> wrapContents;

  public synchronized int makeAmountArtifacts() {
    return wrapContents.size();
  }

  public synchronized Map<String, Double> comeWayNumber() {
    Map<String, Double> journeysCharge;
    String direction;
    Double enumerate;
    journeysCharge = (new Hashtable<String, Double>());
    for (Articles i : this.wrapContents) {
      direction = (i.takeJourney());
      enumerate = (journeysCharge.get(direction));

      if (journeysCharge.containsKey(direction)) {
        journeysCharge.put(direction, new Double(enumerate + synX2565int));
      } else {
        enumerate = (new Double(synX2566int));
        journeysCharge.put(direction, enumerate);
      }
    }
    return journeysCharge;
  }
}
