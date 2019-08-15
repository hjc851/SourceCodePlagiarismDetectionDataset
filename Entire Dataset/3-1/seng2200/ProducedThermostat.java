package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProducedThermostat {
  public java.util.List<Consignment> polishedToken = null;

  public ProducedThermostat(List<SupplyArena> operatorsPeriod) {
    this.polishedToken = new java.util.LinkedList<>();
  }

  public synchronized void extend(seng2200.Consignment ej) {
    this.polishedToken.add(ej);
  }

  public synchronized int developTotThings() {
    return polishedToken.size();
  }

  public synchronized java.util.Map<String, Double> comeWayNumber() {
    java.util.Map<String, Double> passagewaysTotal = new java.util.Hashtable<String, Double>();
    java.lang.String curve = null;
    java.lang.Double rely = null;
    for (seng2200.Consignment i : this.polishedToken) {
      curve = i.makeTrajectory();
      rely = passagewaysTotal.get(curve);

      if (passagewaysTotal.containsKey(curve)) synx36(passagewaysTotal, curve, rely);
      else {
        rely = new java.lang.Double(1);
        passagewaysTotal.put(curve, rely);
      }
    }
    return passagewaysTotal;
  }

  private synchronized void synx36(
      java.util.Map<String, Double> passagewaysTotal, String curve, Double rely) {
    passagewaysTotal.put(curve, new java.lang.Double(rely + 1));
  }
}
