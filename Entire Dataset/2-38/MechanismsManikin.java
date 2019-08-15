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

public class MechanismsManikin {
  private static final String synX2124String = "PAGE";
  private static final double synX2123double = 0.5039990979157882;
  private static final int synX2122int = 0;
  private static final int synX2121int = 30;
  private static final String synX2120String = "Finished reading file: ";
  private static final String synX2119String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2118String = "Process: ";
  private static final int synX2117int = 50;
  private static final String synX2116String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2115String = "./out/production/c3063467A3/";
  private static final String synX2114String = ".";
  private static final int synX2113int = 0;
  private static final String synX2112String = "Unable to generate output file.";
  private static final String synX2111String = "./out/production/c3063467A3/output.txt";
  private static final String synX2110String = "Reading in input file(s)...";
  private static final int synX2109int = -1865724492;
  public static BufferedWriter OutturnLodge = null;
  private Distributors salesperson = null;
  private LinkedList<Proceeding> WakingBibliography = null;
  private LinkedList<Proceeding> EstimationPlaylist = null;
  public static final int narrowerRestrain = 1846027428;

  public synchronized void move(String[] entries) {
    int pinioned;
    pinioned = (synX2109int);
    String[] trash = entries;
    salesperson = (new Distributors());
    EstimationPlaylist = (new LinkedList<>());
    WakingBibliography = (new LinkedList<>());
    System.out.println(synX2110String);

    try {
      OutturnLodge = (Files.newBufferedWriter(Paths.get(synX2111String)));
    } catch (IOException late) {
      System.out.println(synX2112String);
    }

    try {
      for (String documents : trash) {
        String formalitiesTag;
        String ride;
        String representations;
        String namespace;
        Pattern method;
        Matcher aspx;
        Queue<Integer> proposals;
        int ppm;
        formalitiesTag = (documents.substring(synX2113int, documents.lastIndexOf(synX2114String)));
        ride = (synX2115String + documents);
        representations = (understandCharge(ride, StandardCharsets.UTF_8));
        namespace = (synX2116String);
        method = (Pattern.compile(namespace));
        aspx = (method.matcher(representations));
        proposals = (new LinkedList<>());

        while (aspx.find()) synx331(proposals, aspx);

        if (proposals.size() > synX2117int)
          throw new IOException((synX2118String + formalitiesTag + synX2119String));

        System.out.println(synX2120String + documents);
        ppm = (Math.floorDiv(synX2121int, trash.length));
        EstimationPlaylist.add(new Proceeding(formalitiesTag, proposals, ppm));
        WakingBibliography.add(new Proceeding(formalitiesTag, new LinkedList<>(proposals), ppm));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(synX2122int);
    }
    salesperson.placedAutocorrelationSue(EstimationPlaylist);
    salesperson.putTimeProcedure(WakingBibliography);
    salesperson.operateStarter();

    try {
      MechanismsManikin.OutturnLodge.close();
    } catch (IOException eden) {
      System.out.println(eden.toString());
    }
  }

  private static synchronized String understandCharge(String course, Charset encrypting)
      throws IOException {
    double measure;
    measure = (synX2123double);
    byte[] scrambled = Files.readAllBytes(Paths.get(course));
    return new String(scrambled, encrypting);
  }

  private synchronized void synx331(java.util.Queue<Integer> proposals, Matcher aspx) {
    proposals.add(Integer.parseInt(aspx.group(synX2124String)));
  }
}
