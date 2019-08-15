package Multitasking.Grr;

import Programmer.Database;
import Programmer.Work;

public class GrrProcedure extends Programmer.Work {

  public synchronized void fixThingLibido(int againGiant) {
    this.nowLevel = (againGiant);
  }

  public synchronized int comeClipQuantity() {
    return nowLevel;
  }

  public GrrProcedure(Work p) {
    super(p);
    this.nowLevel = (Programmer.NowLevel);
  }

  public int nowLevel;
}
