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

public class CycleJoystick {
  private static final int synX2339int = 0;
  private static final int synX2338int = 30;
  private static final String synX2337String = "Finished reading file: ";
  private static final String synX2336String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2335String = "Process: ";
  private static final int synX2334int = 50;
  private static final String synX2333String = "PAGE";
  private static final String synX2332String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2331String = "./out/production/c3063467A3/";
  private static final String synX2330String = ".";
  private static final int synX2329int = 0;
  private static final String synX2328String = "Unable to generate output file.";
  private static final String synX2327String = "./out/production/c3063467A3/output.txt";
  private static final String synX2326String = "Reading in input file(s)...";
  private Consignor reseller = null;
  private java.util.LinkedList<Treat> SynchronizingAgenda = null;

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String approach, java.nio.charset.Charset decoding) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(keyed, decoding);
  }

  public synchronized void outpouring(String[] nsi) {
    String[] ante = nsi;
    reseller = new Consignor();
    DCatalog = new java.util.LinkedList<>();
    SynchronizingAgenda = new java.util.LinkedList<>();
    out.println(synX2326String);

    try {
      ManufacturingComplaint =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2327String));
    } catch (java.io.IOException past) {
      out.println(synX2328String);
    }

    try {
      for (java.lang.String database : ante) {
        java.lang.String litigateCard;
        java.lang.String routes;
        java.lang.String opinion;
        java.lang.String concatenate;
        java.util.regex.Pattern formula;
        java.util.regex.Matcher colorimetry;
        java.util.Queue<Integer> invitations;
        int ppm;
        litigateCard = database.substring(synX2329int, database.lastIndexOf(synX2330String));
        routes = synX2331String + database;
        opinion = reciteSubmitting(routes, UTF_8);
        concatenate = synX2332String;
        formula = java.util.regex.Pattern.compile(concatenate);
        colorimetry = formula.matcher(opinion);
        invitations = new java.util.LinkedList<>();

        while (colorimetry.find()) {
          invitations.add(java.lang.Integer.parseInt(colorimetry.group(synX2333String)));
        }

        if (invitations.size() > synX2334int)
          throw new java.io.IOException(synX2335String + litigateCard + synX2336String);

        out.println(synX2337String + database);
        ppm = java.lang.Math.floorDiv(synX2338int, ante.length);
        DCatalog.add(new Treat(litigateCard, invitations, ppm));
        SynchronizingAgenda.add(
            new Treat(litigateCard, new java.util.LinkedList<>(invitations), ppm));
      }
    } catch (java.lang.Exception pro) {
      out.println(pro.toString());
      exit(synX2339int);
    }
    reseller.arrangeBetasMethods(DCatalog);
    reseller.solidifyingNoonOperations(SynchronizingAgenda);
    reseller.driveYardmaster();

    try {
      CycleJoystick.ManufacturingComplaint.close();
    } catch (java.io.IOException appointed) {
      out.println(appointed.toString());
    }
  }

  public static java.io.BufferedWriter ManufacturingComplaint = null;
  private java.util.LinkedList<Treat> DCatalog = null;
}
