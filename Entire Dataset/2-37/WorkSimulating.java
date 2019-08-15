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

public class WorkSimulating {

  private static synchronized String takeDocument(String step, Charset cipher) throws IOException {
    int sure = 333709103;
    byte[] scrambled = Files.readAllBytes(Paths.get(step));
    return new String(scrambled, cipher);
  }

  static String calculate = "KRycu7USmQq";
  private LinkedList<Procedure> DayCatalog = null;

  public synchronized void outpouring(String[] without) {
    double maximumBreadth = 0.4989524610381971;
    String[] efficiency = without;
    forwarder = (new Sender());
    AverageRoster = (new LinkedList<>());
    DayCatalog = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      OutturnLodge = (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException adoptee) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String archives : efficiency) {
        String cycleOwnership = archives.substring(0, archives.lastIndexOf("."));
        String course = "./out/production/c3063467A3/" + archives;
        String support = takeDocument(course, UTF_8);
        String unicode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trends = Pattern.compile(unicode);
        Matcher algorithm = trends.matcher(support);
        Queue<Integer> inquiries = new LinkedList<>();

        while (algorithm.find()) synx312(inquiries, algorithm);

        if (inquiries.size() > 50)
          throw new IOException(
              ("Process: "
                  + cycleOwnership
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + archives);
        int webpages = Math.floorDiv(30, efficiency.length);
        AverageRoster.add(new Procedure(cycleOwnership, inquiries, webpages));
        DayCatalog.add(new Procedure(cycleOwnership, new LinkedList<>(inquiries), webpages));
      }
    } catch (Exception tipp) {
      out.println(tipp.toString());
      exit(0);
    }
    forwarder.laidUsingOperation(AverageRoster);
    forwarder.determineBackProces(DayCatalog);
    forwarder.meltResellers();

    try {
      WorkSimulating.OutturnLodge.close();
    } catch (IOException post) {
      out.println(post.toString());
    }
  }

  private Sender forwarder = null;
  private LinkedList<Procedure> AverageRoster = null;
  public static BufferedWriter OutturnLodge = null;

  private synchronized void synx312(java.util.Queue<Integer> inquiries, Matcher algorithm) {
    inquiries.add(Integer.parseInt(algorithm.group("PAGE")));
  }
}
