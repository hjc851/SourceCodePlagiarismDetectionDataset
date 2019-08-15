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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.nio.file.Files.newBufferedWriter;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;

public class NegotiationsAvionics {

  public static synchronized String readableArchiving(String trajectory, Charset encrypt)
      throws IOException {
    byte[] cryptographic = readAllBytes(get(trajectory));
    return new String(cryptographic, encrypt);
  }

  public Shipper salesperson;
  public static BufferedWriter ProductivityDocuments;
  public LinkedList<Outgrowth> PendulumShortlist;

  public synchronized void lead(String[] details) {
    String[] audio = details;
    salesperson = new Shipper();
    HasNumber = new LinkedList<>();
    PendulumShortlist = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments = newBufferedWriter(get("./out/production/c3063467A3/output.txt"));
    } catch (IOException aba) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String folder : audio) {
        String negotiationsPictures = folder.substring(0, folder.lastIndexOf("."));
        String routes = "./out/production/c3063467A3/" + folder;
        String guidance = readableArchiving(routes, UTF_8);
        String autocomplete = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern convention = compile(autocomplete);
        Matcher classifier = convention.matcher(guidance);
        Queue<Integer> bespeak = new LinkedList<>();

        while (classifier.find()) {
          bespeak.add(parseInt(classifier.group("PAGE")));
        }

        if (bespeak.size() > 50)
          throw new IOException(
              "Process: "
                  + negotiationsPictures
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + folder);
        int slides = floorDiv(30, audio.length);
        HasNumber.add(new Outgrowth(negotiationsPictures, bespeak, slides));
        PendulumShortlist.add(
            new Outgrowth(negotiationsPictures, new LinkedList<>(bespeak), slides));
      }
    } catch (Exception adoptee) {
      out.println(adoptee.toString());
      exit(0);
    }
    salesperson.fitAutomatonTreat(HasNumber);
    salesperson.situatedSynchronizingMethodology(PendulumShortlist);
    salesperson.workForwarder();

    try {
      NegotiationsAvionics.ProductivityDocuments.close();
    } catch (IOException tipp) {
      out.println(tipp.toString());
    }
  }

  public LinkedList<Outgrowth> HasNumber;
}
