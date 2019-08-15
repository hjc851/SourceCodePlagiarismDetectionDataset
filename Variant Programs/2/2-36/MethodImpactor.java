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

public class MethodImpactor {
  public Exporter coordinator = null;

  public synchronized void outpouring(String[] elected) {
    String[] enter = elected;
    coordinator = (new Exporter());
    AlignmentChecklist = (new LinkedList<>());
    BackListings = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException abel) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : enter) {
        String outgrowthEst = lodge.substring(0, lodge.lastIndexOf("."));
        String journey = "./out/production/c3063467A3/" + lodge;
        String component = reciteSubmitting(journey, UTF_8);
        String pseudocode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern design = Pattern.compile(pseudocode);
        Matcher chooser = design.matcher(component);
        Queue<Integer> pleas = new LinkedList<>();

        while (chooser.find()) {
          pleas.add(Integer.parseInt(chooser.group("PAGE")));
        }

        if (pleas.size() > 50)
          throw new IOException(
              ("Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + lodge);
        int ppm = Math.floorDiv(30, enter.length);
        AlignmentChecklist.add(new Work(outgrowthEst, pleas, ppm));
        BackListings.add(new Work(outgrowthEst, new LinkedList<>(pleas), ppm));
      }
    } catch (Exception voto) {
      out.println(voto.toString());
      exit(0);
    }
    coordinator.markAverageSummons(AlignmentChecklist);
    coordinator.arrangeSynchronizationMethods(BackListings);
    coordinator.scarperCaller();

    try {
      MethodImpactor.PerformanceArchives.close();
    } catch (IOException officio) {
      out.println(officio.toString());
    }
  }

  public LinkedList<Work> AlignmentChecklist = null;

  public static synchronized String reciteSubmitting(String routes, Charset codification)
      throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(routes));
    return new String(transmit, codification);
  }

  public static BufferedWriter PerformanceArchives = null;
  public LinkedList<Work> BackListings = null;
}
