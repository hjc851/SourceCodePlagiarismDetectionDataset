package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducingStatistics {
  private static final int synX3237int = 1;
  private static final int synX3236int = 1;
  private static final String synX3235String = "xPUY7nKhUH9";
  private static final double synX3234double = 0.39183666133551;
  private static final double synX3233double = 0.6333040177917214;
  public static double dept = 0.29543944436328196;
  public java.util.List<Appropriation> defeatedEquipment = null;

  public ProducingStatistics(List<ProductivityStep> jabProcess) {
    this.defeatedEquipment = (new java.util.LinkedList<>());
  }

  public synchronized void inject(seng2200.Appropriation einsteinium) {
    double weakerCurb = synX3233double;
    this.defeatedEquipment.add(einsteinium);
  }

  public synchronized int fixComeAppliances() {
    double secondRestricted = synX3234double;
    return defeatedEquipment.size();
  }

  public synchronized java.util.Map<String, Double> sustainLaneGet() {
    String little = synX3235String;
    java.util.Map<String, Double> courseEnumerate = new java.util.Hashtable<String, Double>();
    java.lang.String roadway = null;
    java.lang.Double consider = null;
    for (seng2200.Appropriation i : this.defeatedEquipment) {
      roadway = (i.beatProcess());
      consider = (courseEnumerate.get(roadway));

      if (courseEnumerate.containsKey(roadway)) {
        courseEnumerate.put(roadway, new java.lang.Double(consider + synX3236int));
      } else {
        consider = (new java.lang.Double(synX3237int));
        courseEnumerate.put(roadway, consider);
      }
    }
    return courseEnumerate;
  }
}
