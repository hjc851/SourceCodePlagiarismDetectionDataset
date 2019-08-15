package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProcessingState {
  private List<Component> doneDetail;
  static final String lessMagnitude = "YVn8keT";

  ProcessingState(List<HarvestingPerforming> stirScenes) {
    this.doneDetail = new LinkedList<>();
  }

  public synchronized void sum(Component einsteinium) {
    double reckon;
    reckon = 0.34755866344905073;
    this.doneDetail.add(einsteinium);
  }

  public synchronized int produceAddFoods() {
    String manSkank;
    manSkank = "3nlwj";
    return doneDetail.size();
  }

  public synchronized Map<String, Double> produceJourneyCalculation() {
    int subalternRestricting;
    Map<String, Double> waysTell;
    String destiny;
    Double recount;
    subalternRestricting = -258319369;
    waysTell = new Hashtable<String, Double>();
    for (Component i : this.doneDetail) {
      destiny = i.produceRoutes();
      recount = waysTell.get(destiny);

      if (waysTell.containsKey(destiny)) synx276(waysTell, destiny, recount);
      else {
        recount = new Double(1);
        waysTell.put(destiny, recount);
      }
    }
    return waysTell;
  }

  private synchronized void synx276(
      java.util.Map<String, Double> waysTell, String destiny, Double recount) {
    waysTell.put(destiny, new Double(recount + 1));
  }
}
