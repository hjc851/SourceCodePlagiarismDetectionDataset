package Faker;

import Consignor.Shipper;
import Debugging.Act;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class WorkSimulating {
  private static final String synX1864String = "Finished reading input file...";
  private static final String synX1863String = "SIZE";
  private static final String synX1862String = "Arrive";
  private static final String synX1861String = "ID";
  private static final String synX1860String = "DISP";
  private static final String synX1859String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1858String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1857String = "./out/production/c3063467A1/";
  private static final String synX1856String = "Unable to generate output file.";
  private static final String synX1855String = "_output.txt";
  private static final String synX1854String = "./out/production/c3063467A1/";
  private static final String synX1853String = ".";
  private static final int synX1852int = 0;
  private static final String synX1851String = "Reading in input file...";
  public static String GuidanceFilename = null;

  public static synchronized String recordExecutable(String destiny, Charset codify)
      throws IOException {
    byte[] captioned = readAllBytes(get(destiny));
    return new String(captioned, codify);
  }

  public Shipper distributor = null;
  public static BufferedWriter VolumeArchiving = null;
  public LinkedList<Act> cycleCompilation = null;

  public synchronized void go(String without) {
    this.GuidanceFilename = (without);
    distributor = (new Shipper());
    cycleCompilation = (new LinkedList<>());
    System.out.println(synX1851String);

    try {
      String bareEpithet;
      bareEpithet =
          (GuidanceFilename.substring(synX1852int, GuidanceFilename.lastIndexOf(synX1853String)));
      VolumeArchiving =
          (new BufferedWriter(new FileWriter((synX1854String + bareEpithet + synX1855String))));
    } catch (IOException eden) {
      System.out.println(synX1856String);
    }
    GuidanceFilename = (synX1857String + GuidanceFilename);

    try {
      String representations;
      String mgr;
      Pattern writes;
      Matcher esi;
      String exp2;
      Pattern e;
      Matcher e2;
      representations = (recordExecutable(GuidanceFilename, StandardCharsets.UTF_8));
      mgr = (synX1858String);
      writes = (compile(mgr));
      esi = (writes.matcher(representations));
      exp2 = (synX1859String);
      e = (compile(exp2));
      e2 = (e.matcher(representations));

      while (esi.find()) {
        distributor.doForwardingAgain(parseInt(esi.group(synX1860String)));
      }

      while (e2.find()) {
        cycleCompilation.add(
            new Act(
                e2.group(synX1861String),
                parseInt(e2.group(synX1862String)),
                parseInt(e2.group(synX1863String))));
      }
      System.out.println(synX1864String);
    } catch (Exception officio) {
      System.out.println(officio.toString());
    }
    distributor.settledServe(cycleCompilation);
    distributor.leadCoordinator();
  }
}
