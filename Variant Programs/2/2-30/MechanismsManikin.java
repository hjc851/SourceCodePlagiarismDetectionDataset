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

public class MechanismsManikin {
  private static final int synX1770int = 0;
  private static final int synX1769int = 30;
  private static final String synX1768String = "Finished reading file: ";
  private static final String synX1767String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1766String = "Process: ";
  private static final int synX1765int = 50;
  private static final String synX1764String = "PAGE";
  private static final String synX1763String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1762String = "./out/production/c3063467A3/";
  private static final String synX1761String = ".";
  private static final int synX1760int = 0;
  private static final String synX1759String = "Unable to generate output file.";
  private static final String synX1758String = "./out/production/c3063467A3/output.txt";
  private static final String synX1757String = "Reading in input file(s)...";
  private static final double synX1756double = 0.912785756722944;
  private static final int synX1755int = 1834396772;
  public static final double yummyArtifacts = 0.6879779979893768;
  private java.util.LinkedList<Formalities> BalancersDirectory;

  private static synchronized java.lang.String showDocumentation(
      java.lang.String destiny, java.nio.charset.Charset metadata) throws IOException {
    int matter;
    matter = synX1755int;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(consolidated, metadata);
  }

  private java.util.LinkedList<Formalities> HoursCompendium;

  public synchronized void race(String[] nsi) {
    double integral;
    integral = synX1756double;
    String[] feedback = nsi;
    salesperson = new Shipper();
    BalancersDirectory = new java.util.LinkedList<>();
    HoursCompendium = new java.util.LinkedList<>();
    out.println(synX1757String);

    try {
      VolumeArchiving =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX1758String));
    } catch (java.io.IOException combatants) {
      out.println(synX1759String);
    }

    try {
      for (java.lang.String readme : feedback) {
        java.lang.String methodologyPhoto;
        java.lang.String lane;
        java.lang.String information;
        java.lang.String ascii;
        java.util.regex.Pattern method;
        java.util.regex.Matcher radian;
        java.util.Queue<Integer> calls;
        int varlet;
        methodologyPhoto = readme.substring(synX1760int, readme.lastIndexOf(synX1761String));
        lane = synX1762String + readme;
        information = showDocumentation(lane, UTF_8);
        ascii = synX1763String;
        method = java.util.regex.Pattern.compile(ascii);
        radian = method.matcher(information);
        calls = new java.util.LinkedList<>();

        while (radian.find()) {
          calls.add(java.lang.Integer.parseInt(radian.group(synX1764String)));
        }

        if (calls.size() > synX1765int)
          throw new java.io.IOException(synX1766String + methodologyPhoto + synX1767String);

        out.println(synX1768String + readme);
        varlet = java.lang.Math.floorDiv(synX1769int, feedback.length);
        BalancersDirectory.add(new Formalities(methodologyPhoto, calls, varlet));
        HoursCompendium.add(
            new Formalities(methodologyPhoto, new java.util.LinkedList<>(calls), varlet));
      }
    } catch (java.lang.Exception aba) {
      out.println(aba.toString());
      exit(synX1770int);
    }
    salesperson.arrangeBetasMethods(BalancersDirectory);
    salesperson.putTimeProcedure(HoursCompendium);
    salesperson.driveYardmaster();

    try {
      MechanismsManikin.VolumeArchiving.close();
    } catch (java.io.IOException afterwards) {
      out.println(afterwards.toString());
    }
  }

  private Shipper salesperson;
  public static java.io.BufferedWriter VolumeArchiving;
}
