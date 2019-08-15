package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProduceAsap {

  public ProduceAsap(List<OutputLevel> urgingStagecoach) {
    this.fatteningAccessories = new LinkedList<>();
  }

  public synchronized Map<String, Double> haveFootpathsReckon() {
    Map<String, Double> avenuesFigure = new Hashtable<String, Double>();
    String process;
    Double enumeration;
    for (Tidbit i : this.fatteningAccessories) {
      process = i.goRoute();
      enumeration = avenuesFigure.get(process);

      if (avenuesFigure.containsKey(process)) {
        avenuesFigure.put(process, new Double(enumeration + 1));
      } else {
        enumeration = new Double(1);
        avenuesFigure.put(process, enumeration);
      }
    }
    return avenuesFigure;
  }

  public synchronized void tot(Tidbit samad) {
    this.fatteningAccessories.add(samad);
  }

  public List<Tidbit> fatteningAccessories;

  public synchronized int canUnconditionedComponents() {
    return fatteningAccessories.size();
  }
}
