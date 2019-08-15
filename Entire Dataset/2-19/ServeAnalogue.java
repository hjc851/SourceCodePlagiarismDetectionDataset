import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ServeAnalogue {
  private static final int synX1241int = 0;
  private static final int synX1240int = 30;
  private static final String synX1239String = "Finished reading file: ";
  private static final String synX1238String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1237String = "Process: ";
  private static final int synX1236int = 50;
  private static final String synX1235String = "PAGE";
  private static final String synX1234String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1233String = "./out/production/c3063467A3/";
  private static final String synX1232String = ".";
  private static final int synX1231int = 0;
  private static final String synX1230String = "Unable to generate output file.";
  private static final String synX1229String = "./out/production/c3063467A3/output.txt";
  private static final String synX1228String = "Reading in input file(s)...";
  private static final int synX1227int = -518821657;
  private static final String synX1226String = "";
  public java.util.LinkedList<Work> DayCatalog;
  public Exporter trainmaster;
  public java.util.LinkedList<Work> AverageRoster;
  public static java.io.BufferedWriter PowerApplication;
  static final int upperSkank = -436645126;

  public static synchronized java.lang.String scanFolders(
      java.lang.String track, java.nio.charset.Charset keying) throws IOException {
    String maximumBreadth;
    maximumBreadth = synX1226String;
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(demodulated, keying);
  }

  public synchronized void extend(String[] proponents) {
    int upwardMaximum;
    upwardMaximum = synX1227int;
    String[] assistance = proponents;
    trainmaster = new Exporter();
    AverageRoster = new java.util.LinkedList<>();
    DayCatalog = new java.util.LinkedList<>();
    out.println(synX1228String);

    try {
      PowerApplication =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX1229String));
    } catch (java.io.IOException con) {
      out.println(synX1230String);
    }

    try {
      for (java.lang.String submitted : assistance) {
        java.lang.String proceedingsUser;
        java.lang.String approach;
        java.lang.String influence;
        java.lang.String emacs;
        java.util.regex.Pattern paradigm;
        java.util.regex.Matcher algorithm;
        java.util.Queue<Integer> orders;
        int webpage;
        proceedingsUser = submitted.substring(synX1231int, submitted.lastIndexOf(synX1232String));
        approach = synX1233String + submitted;
        influence = scanFolders(approach, UTF_8);
        emacs = synX1234String;
        paradigm = java.util.regex.Pattern.compile(emacs);
        algorithm = paradigm.matcher(influence);
        orders = new java.util.LinkedList<>();

        while (algorithm.find()) {
          orders.add(java.lang.Integer.parseInt(algorithm.group(synX1235String)));
        }

        if (orders.size() > synX1236int)
          throw new java.io.IOException(synX1237String + proceedingsUser + synX1238String);

        out.println(synX1239String + submitted);
        webpage = java.lang.Math.floorDiv(synX1240int, assistance.length);
        AverageRoster.add(new Work(proceedingsUser, orders, webpage));
        DayCatalog.add(new Work(proceedingsUser, new java.util.LinkedList<>(orders), webpage));
      }
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
      exit(synX1241int);
    }
    trainmaster.arrangedFifoAct(AverageRoster);
    trainmaster.laidStopwatchOperation(DayCatalog);
    trainmaster.workForwarder();

    try {
      ServeAnalogue.PowerApplication.close();
    } catch (java.io.IOException admittedly) {
      out.println(admittedly.toString());
    }
  }
}
