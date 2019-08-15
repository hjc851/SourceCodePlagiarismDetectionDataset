package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class FilmingCountry {

  public synchronized void create(seng2200.Aspect ye) {
    this.destroyedArtefacts.add(ye);
  }

  public synchronized int letWholeMaterials() {
    return destroyedArtefacts.size();
  }

  public FilmingCountry(List<ProducesSpotlight> goadingLeg) {
    this.destroyedArtefacts = (new java.util.LinkedList<>());
  }

  public synchronized java.util.Map<String, Double> comeWayNumber() {
    java.util.Map<String, Double> trajectoriesEnumeration =
        new java.util.Hashtable<String, Double>();
    java.lang.String progression = null;
    java.lang.Double calculation = null;
    for (seng2200.Aspect i : this.destroyedArtefacts) {
      progression = (i.comeWay());
      calculation = (trajectoriesEnumeration.get(progression));

      if (trajectoriesEnumeration.containsKey(progression))
        synx96(trajectoriesEnumeration, progression, calculation);
      else {
        calculation = (new java.lang.Double(1));
        trajectoriesEnumeration.put(progression, calculation);
      }
    }
    return trajectoriesEnumeration;
  }

  public java.util.List<Aspect> destroyedArtefacts = null;

  private synchronized void synx96(
      java.util.Map<String, Double> trajectoriesEnumeration,
      String progression,
      Double calculation) {
    trajectoriesEnumeration.put(progression, new java.lang.Double(calculation + 1));
  }
}
