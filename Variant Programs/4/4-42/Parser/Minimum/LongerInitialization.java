package Parser.Minimum;

import Yardmaster.Regulator;
import Synchronization.Timer;
import Synchronization.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongerInitialization extends Timer {
  private class MechanismFootnote implements Comparator<Appendage> {

    public synchronized int compare(Appendage f, Appendage c2) {
      int plLingering = f.findImplementationSmall() - f.drawSpurtingWeek();
      int a1Rest = c2.findImplementationSmall() - c2.drawSpurtingWeek();

      if (plLingering < a1Rest) {
        return -1;
      }

      if (plLingering > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String plannerNominate() {
    return "SRT:";
  }

  public synchronized void addTock() {

    if (rifeSue != null) synx416();

    if (!availableFile.isEmpty() && rifeSue != null) synx417();

    if (this.dblPin && rifeSue == null) synx418();
    else synx419();
  }

  private PriorityQueue<Appendage> availableFile;

  public LongerInitialization() {
    this.comparable = new MechanismFootnote();
    this.availableFile = new PriorityQueue<>(5, comparable);
  }

  private Comparator<Appendage> comparable;

  public synchronized void workElect(Appendage march) {
    availableFile.add(march);
  }

  private synchronized void synx416() {
    rifeSue.fixGoingThing(rifeSue.drawSpurtingWeek() + 1);

    if (rifeSue.drawSpurtingWeek() == rifeSue.findImplementationSmall()) {
      rifeSue.situatedMoveMinutes(this.receiveContemporaryTicktack());
      this.undergoneMethodologies.addLast(rifeSue);
      rifeSue = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx417() {
    int newUnresolved = rifeSue.findImplementationSmall() - rifeSue.drawSpurtingWeek();
    int sightUnresolved =
        availableFile.peek().findImplementationSmall() - availableFile.peek().drawSpurtingWeek();

    if (sightUnresolved < newUnresolved) {
      availableFile.add(rifeSue);
      rifeSue = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx418() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.dblPin = false;
      this.latterSthMinutes = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx419() {

    if (rifeSue == null && !availableFile.isEmpty()) {
      rifeSue = availableFile.poll();
      freightMarch(rifeSue);
      rifeSue.arrangedGoSentence(this.receiveContemporaryTicktack());
    }
  }
}
