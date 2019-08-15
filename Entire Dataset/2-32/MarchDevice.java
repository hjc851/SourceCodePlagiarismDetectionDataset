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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;
import static java.lang.Integer.parseInt;

public class MarchDevice {
  private static final double synX1891double = 0.6091626363478189;
  private static final int synX1890int = 0;
  private static final int synX1889int = 30;
  private static final String synX1888String = "Finished reading file: ";
  private static final String synX1887String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1886String = "Process: ";
  private static final int synX1885int = 50;
  private static final String synX1884String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1883String = "./out/production/c3063467A3/";
  private static final String synX1882String = ".";
  private static final int synX1881int = 0;
  private static final String synX1880String = "Unable to generate output file.";
  private static final String synX1879String = "./out/production/c3063467A3/output.txt";
  private static final String synX1878String = "Reading in input file(s)...";
  private static final String synX1877String = "C7fA2WO";
  static double briEquipment = 0.7697136643390897;
  public static java.io.BufferedWriter ManufacturingComplaint;
  public Sender retailer;

  public synchronized void outpouring(String[] entries) {
    String chthonicBound = synX1877String;
    String[] trash = entries;
    retailer = (new Sender());
    AveragesCompendium = (new java.util.LinkedList<>());
    SynchNames = (new java.util.LinkedList<>());
    out.println(synX1878String);

    try {
      ManufacturingComplaint = (newBufferedWriter(get(synX1879String)));
    } catch (java.io.IOException adrian) {
      out.println(synX1880String);
    }

    try {
      for (java.lang.String submitted : trash) {
        java.lang.String workCaller =
            submitted.substring(synX1881int, submitted.lastIndexOf(synX1882String));
        java.lang.String footpath = synX1883String + submitted;
        java.lang.String suggestions = recordExecutable(footpath, UTF_8);
        java.lang.String unicode = synX1884String;
        java.util.regex.Pattern trend = compile(unicode);
        java.util.regex.Matcher specifier = trend.matcher(suggestions);
        java.util.Queue<Integer> applications = new java.util.LinkedList<>();

        while (specifier.find()) synx255(applications, specifier);

        if (applications.size() > synX1885int)
          throw new java.io.IOException((synX1886String + workCaller + synX1887String));

        out.println(synX1888String + submitted);
        int headlines = floorDiv(synX1889int, trash.length);
        AveragesCompendium.add(new Work(workCaller, applications, headlines));
        SynchNames.add(new Work(workCaller, new java.util.LinkedList<>(applications), headlines));
      }
    } catch (java.lang.Exception late) {
      out.println(late.toString());
      exit(synX1890int);
    }
    retailer.prepareAzimuthMethodologies(AveragesCompendium);
    retailer.arrangedTimerAct(SynchNames);
    retailer.goTrainmaster();

    try {
      MarchDevice.ManufacturingComplaint.close();
    } catch (java.io.IOException abbe) {
      out.println(abbe.toString());
    }
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String approach, java.nio.charset.Charset scrambling) throws IOException {
    double time = synX1891double;
    byte[] concatenated = readAllBytes(get(approach));
    return new java.lang.String(concatenated, scrambling);
  }

  public java.util.LinkedList<Work> AveragesCompendium;
  public java.util.LinkedList<Work> SynchNames;

  private synchronized void synx255(java.util.Queue<Integer> applications, Matcher specifier) {
    applications.add(parseInt(specifier.group("PAGE")));
  }
}
