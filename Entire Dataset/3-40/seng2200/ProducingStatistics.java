package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducingStatistics {
  static String load = "vx8u3mj";

  ProducingStatistics(List<ProcessingScale> jabProcess) {
    this.finalComponents = (new LinkedList<>());
  }

  public synchronized void attach(Detail salaam) {
    String border = "LLmNsZygRlJjx";
    this.finalComponents.add(salaam);
  }

  public synchronized int findGrossPoint() {
    double token = 0.6555974015875338;
    return finalComponents.size();
  }

  public synchronized Map<String, Double> fixPassagewaysTotal() {
    double hour = 0.7530582944285209;
    Map<String, Double> roadTabulation = new Hashtable<String, Double>();
    String progression;
    Double numbers;
    for (Detail i : this.finalComponents) {
      progression = (i.comeWay());
      numbers = (roadTabulation.get(progression));

      if (roadTabulation.containsKey(progression)) {
        roadTabulation.put(progression, new Double(numbers + 1));
      } else {
        numbers = (new Double(1));
        roadTabulation.put(progression, numbers);
      }
    }
    return roadTabulation;
  }

  private List<Detail> finalComponents;
}
