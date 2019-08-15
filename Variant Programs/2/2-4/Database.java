import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Database {

  public synchronized int takeTopicalMark() {
    return afootDials;
  }

  public synchronized double takeMeanSitPeriod() {
    return (double) this.ratioLeaveChance / this.realizedWork.size();
  }

  public abstract void weapMark();

  public abstract void ingoingProcedure(Outgrowth work);

  public synchronized void situatedPresentlyMarch(int contemporaryTicktack) {
    this.afootDials = contemporaryTicktack;
  }

  public synchronized void editionAnnouncement(String renewalTactic) {

    try {
      String position;
      String usb;
      String separator;
      Collections.sort(realizedWork);
      ServeAnalogue.ExportationPapers.write("\n");
      out.println();
      position = renewalTactic + " - Fixed";
      ServeAnalogue.ExportationPapers.write(position + "\n");
      out.println(position);
      usb =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ServeAnalogue.ExportationPapers.write(usb + "\n");
      out.println(usb);
      for (Outgrowth vig : realizedWork) synx21(vig);
      ServeAnalogue.ExportationPapers.write("\n");
      out.println();
      separator = new String(new char[50]).replace("\0", "-");
      ServeAnalogue.ExportationPapers.write(separator + "\n");
      out.println(separator);
    } catch (IOException abbe) {
      out.println("Unable to write to file.");
    }
  }

  public synchronized void bsiDepart() {}

  public int workingClip = 0;
  public static final int ClipQuantity = 3;

  public synchronized void commencesController(String transposition) {
    this.isMoving = true;

    if ("LRU" == transposition) {
      this.alternativeWay = new Bcs();
    } else if ("CLOCK" == transposition) {
    }

    this.bsiDepart();
  }

  public Outgrowth flowProcedures = null;

  public Database() {
    this.isMoving = false;
    this.workingClip = 0;
    this.pendingMonth = 0;
    this.ratioLeaveChance = 0;
    this.overallDownturnMinutes = 0;
    this.afootDials = -1;
    this.realizedWork = new LinkedList<>();
  }

  public synchronized int fetchAttainedProcesVastness() {

    if (realizedWork.isEmpty()) {
      return 0;
    } else {
      return realizedWork.size();
    }
  }

  public int afootDials = 0;
  public boolean isMoving = false;
  public int ratioLeaveChance = 0;
  public int pendingMonth = 0;

  public synchronized double takeMeanUpturnPeriod() {
    return (double) this.overallDownturnMinutes / this.realizedWork.size();
  }

  public int overallDownturnMinutes = 0;

  public abstract Outgrowth quickAppendage();

  public synchronized void checkWorkflow(String alternate) {
    this.isMoving = false;
    this.editionAnnouncement(alternate);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public LinkedList<Outgrowth> realizedWork = null;
  public AlternatePolicy alternativeWay = null;

  private synchronized void synx21(Outgrowth vig) {
    String mechanismsTabu;
    mechanismsTabu =
        String.format(
            "%-7d%-16s%-19d%-11d%-10s",
            vig.sustainSelf(),
            vig.produceMake(),
            vig.findGoSentence(),
            vig.takeBreak().size(),
            vig.takeBreakCycles());
    ServeAnalogue.ExportationPapers.write(mechanismsTabu + "\n");
    out.println(mechanismsTabu);
  }
}
