package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FabricationStates {
  private static final int synX285int = 1;

  public synchronized int haveEntireBelongings() {
    return terminatedNecessities.size();
  }

  public synchronized void additions(seng2200.Goods einsteinium) {
    this.terminatedNecessities.add(einsteinium);
  }

  public synchronized java.util.Map<String, Double> makeTrajectoriesEnumeration() {
    java.util.Map<String, Double> footpathsReckon;
    java.lang.String progression;
    java.lang.Double consider;
    footpathsReckon = new java.util.Hashtable<String, Double>();
    progression = null;
    consider = null;
    for (seng2200.Goods i : this.terminatedNecessities) {
      progression = i.bringCourse();
      consider = footpathsReckon.get(progression);

      if (footpathsReckon.containsKey(progression)) synx56(footpathsReckon, progression, consider);
      else {
        consider = new java.lang.Double(synX285int);
        footpathsReckon.put(progression, consider);
      }
    }
    return footpathsReckon;
  }

  public java.util.List<Goods> terminatedNecessities = null;

  public FabricationStates(List<FabricationLimelight> operatorsPeriod) {
    this.terminatedNecessities = new java.util.LinkedList<>();
  }

  private synchronized void synx56(
      java.util.Map<String, Double> footpathsReckon, String progression, Double consider) {
    footpathsReckon.put(progression, new java.lang.Double(consider + 1));
  }
}
