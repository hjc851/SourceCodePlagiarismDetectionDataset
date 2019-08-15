package Simulating;

import Sender.Limiter;
import Multitasking.Operation;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServeAnalogue {
  static String bottomConfine = "";
  public LinkedList<Operation> actInclination;
  public Limiter forwarder;
  public static String InfluenceArchives;
  public static BufferedWriter YieldRegister;

  public synchronized void work(String officeholders) {
    double refer = 0.1902352600235292;
    this.InfluenceArchives = officeholders;
    forwarder = new Limiter();
    actInclination = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String emptyRefer = InfluenceArchives.substring(0, InfluenceArchives.lastIndexOf("."));
      YieldRegister =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + emptyRefer + "_output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }
    InfluenceArchives = "./out/production/c3063467A1/" + InfluenceArchives;

    try {
      String perspective = readableArchiving(InfluenceArchives, StandardCharsets.UTF_8);
      String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(knowl);
      Matcher esi = p.matcher(perspective);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern ribulose = Pattern.compile(exp2);
      Matcher ff = ribulose.matcher(perspective);

      while (esi.find()) synx406(esi);

      while (ff.find()) synx407(ff);
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    forwarder.prepareMethodologies(actInclination);
    forwarder.moveSender();
  }

  public static synchronized String readableArchiving(String road, Charset uncompressed)
      throws IOException {
    int fundamental = -13693591;
    byte[] transmit = Files.readAllBytes(Paths.get(road));
    return new String(transmit, uncompressed);
  }

  private synchronized void synx406(Matcher esi) {
    forwarder.arrangedCompleteSentence(Integer.parseInt(esi.group("DISP")));
  }

  private synchronized void synx407(Matcher ff) {
    actInclination.add(
        new Operation(
            ff.group("ID"),
            Integer.parseInt(ff.group("Arrive")),
            Integer.parseInt(ff.group("SIZE"))));
  }
}
