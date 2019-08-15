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

public class ProceedingPrototype {
  private static final int synX326int = 0;
  private static final int synX325int = 30;
  private static final String synX324String = "Finished reading file: ";
  private static final String synX323String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX322String = "Process: ";
  private static final int synX321int = 50;
  private static final String synX320String = "PAGE";
  private static final String synX319String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX318String = "./out/production/c3063467A3/";
  private static final String synX317String = ".";
  private static final int synX316int = 0;
  private static final String synX315String = "Unable to generate output file.";
  private static final String synX314String = "./out/production/c3063467A3/output.txt";
  private static final String synX313String = "Reading in input file(s)...";
  private static final double synX312double = 0.13888979277050728;
  private static final double synX311double = 0.025287292175400378;

  public static synchronized String scanFolders(String trajectory, Charset uncompressed)
      throws IOException {
    double amount;
    amount = synX311double;
    byte[] keyed = Files.readAllBytes(Paths.get(trajectory));
    return new String(keyed, uncompressed);
  }

  public static double depressLimitation = 0.5906099256317233;

  public synchronized void footrace(String[] details) {
    double pinioned;
    pinioned = synX312double;
    String[] patch = details;
    coordinator = new Shipper();
    HasNumber = new LinkedList<>();
    HourRoster = new LinkedList<>();
    out.println(synX313String);

    try {
      InputInitiate = Files.newBufferedWriter(Paths.get(synX314String));
    } catch (IOException abel) {
      out.println(synX315String);
    }

    try {
      for (String complaint : patch) {
        String cycleOwnership;
        String pathways;
        String participatory;
        String iterator;
        Pattern shape;
        Matcher chooser;
        Queue<Integer> asking;
        int sheets;
        cycleOwnership = complaint.substring(synX316int, complaint.lastIndexOf(synX317String));
        pathways = synX318String + complaint;
        participatory = scanFolders(pathways, UTF_8);
        iterator = synX319String;
        shape = Pattern.compile(iterator);
        chooser = shape.matcher(participatory);
        asking = new LinkedList<>();

        while (chooser.find()) {
          asking.add(Integer.parseInt(chooser.group(synX320String)));
        }

        if (asking.size() > synX321int)
          throw new IOException(synX322String + cycleOwnership + synX323String);

        out.println(synX324String + complaint);
        sheets = Math.floorDiv(synX325int, patch.length);
        HasNumber.add(new Negotiations(cycleOwnership, asking, sheets));
        HourRoster.add(new Negotiations(cycleOwnership, new LinkedList<>(asking), sheets));
      }
    } catch (Exception abbe) {
      out.println(abbe.toString());
      exit(synX326int);
    }
    coordinator.doCartesianTechniques(HasNumber);
    coordinator.adjustHoursProcedures(HourRoster);
    coordinator.passMailer();

    try {
      ProceedingPrototype.InputInitiate.close();
    } catch (IOException officio) {
      out.println(officio.toString());
    }
  }

  public LinkedList<Negotiations> HourRoster = null;
  public static BufferedWriter InputInitiate = null;
  public Shipper coordinator = null;
  public LinkedList<Negotiations> HasNumber = null;
}
