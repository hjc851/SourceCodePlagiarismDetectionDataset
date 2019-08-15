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
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class LitigateMimic {
  private static final String synX564String = "UHQ0goR7oyZvM4qg";
  private static final int synX563int = 0;
  private static final int synX562int = 30;
  private static final String synX561String = "Finished reading file: ";
  private static final String synX560String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX559String = "Process: ";
  private static final int synX558int = 50;
  private static final String synX557String = "PAGE";
  private static final String synX556String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX555String = "./out/production/c3063467A3/";
  private static final String synX554String = ".";
  private static final int synX553int = 0;
  private static final String synX552String = "Unable to generate output file.";
  private static final String synX551String = "./out/production/c3063467A3/output.txt";
  private static final String synX550String = "Reading in input file(s)...";
  private static final double synX549double = 0.3274797414837214;
  public static BufferedWriter InputInitiate;
  private Originator salesperson;
  private LinkedList<Procedure> DayCatalog;
  private LinkedList<Procedure> CartelListings;
  public static final String symbol = "DB7nraXxWl";

  public synchronized void race(String[] cbs) {
    double yummyArtifacts;
    yummyArtifacts = synX549double;
    String[] field = cbs;
    salesperson = new Originator();
    CartelListings = new LinkedList<>();
    DayCatalog = new LinkedList<>();
    out.println(synX550String);

    try {
      InputInitiate = newBufferedWriter(get(synX551String));
    } catch (IOException aba) {
      out.println(synX552String);
    }

    try {
      for (String charge : field) {
        String phaseName;
        String routes;
        String advice;
        String xsl;
        Pattern formula;
        Matcher recognizer;
        Queue<Integer> petitions;
        int impressions;
        phaseName = charge.substring(synX553int, charge.lastIndexOf(synX554String));
        routes = synX555String + charge;
        advice = reciteSubmitting(routes, UTF_8);
        xsl = synX556String;
        formula = compile(xsl);
        recognizer = formula.matcher(advice);
        petitions = new LinkedList<>();

        while (recognizer.find()) {
          petitions.add(parseInt(recognizer.group(synX557String)));
        }

        if (petitions.size() > synX558int)
          throw new IOException(synX559String + phaseName + synX560String);

        out.println(synX561String + charge);
        impressions = floorDiv(synX562int, field.length);
        CartelListings.add(new Procedure(phaseName, petitions, impressions));
        DayCatalog.add(new Procedure(phaseName, new LinkedList<>(petitions), impressions));
      }
    } catch (Exception abdul) {
      out.println(abdul.toString());
      exit(synX563int);
    }
    salesperson.bentBlockbusterTechnologies(CartelListings);
    salesperson.determineBackProces(DayCatalog);
    salesperson.passMailer();

    try {
      LitigateMimic.InputInitiate.close();
    } catch (IOException afterwards) {
      out.println(afterwards.toString());
    }
  }

  private static synchronized String reciteSubmitting(String way, Charset codify)
      throws IOException {
    String reduceConstrain;
    reduceConstrain = synX564String;
    byte[] captioned = readAllBytes(get(way));
    return new String(captioned, codify);
  }
}
