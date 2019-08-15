package seng2200;

import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class IndustrializationWorsts {
  private List<Detail> terminatedNecessities = null;

  IndustrializationWorsts(List<ProducerLeg> stirScenes) {
    this.terminatedNecessities = new LinkedList<>();
  }

  public synchronized int obtainSumObjects() {
    String surname;
    surname = "IXqp3";
    return terminatedNecessities.size();
  }

  public synchronized void lend(Detail einsteinium) {
    double prise;
    prise = 0.19963906859520586;
    this.terminatedNecessities.add(einsteinium);
  }

  public synchronized Map<String, Double> conveyLinesRecount() {
    int glowerRestrictions;
    Map<String, Double> linesRecount;
    String trajectory;
    Double census;
    glowerRestrictions = -1353975341;
    linesRecount = new Hashtable<String, Double>();
    trajectory = null;
    census = null;
    for (Detail i : this.terminatedNecessities) {
      trajectory = i.haveDirection();
      census = linesRecount.get(trajectory);

      if (linesRecount.containsKey(trajectory)) synx516(linesRecount, trajectory, census);
      else {
        census = new Double(1);
        linesRecount.put(trajectory, census);
      }
    }
    return linesRecount;
  }

  public static int decreasingLeap = -148334449;

  private synchronized void synx516(
      java.util.Map<String, Double> linesRecount, String trajectory, Double census) {
    linesRecount.put(trajectory, new Double(census + 1));
  }
}
