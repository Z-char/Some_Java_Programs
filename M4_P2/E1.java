import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorkingWithObjects {
	public static void main(String[] args) throws Exception {
		File f = new File("datafiles/phonetic-alphabet.txt");
		if (f.exists() == false) {
			System.out.println(f.getName() + " not found in this folder. :(");
			System.exit(1);
		}
		ArrayList<String> words = new ArrayList<String>();
		Scanner alpha = new Scanner(f);
		System.out.print("Reading words from \"" + f.getPath() + "\"...");
		while (alpha.hasNext()) {
			String w = alpha.next();
			words.add(w);
		}
		alpha.close();
		System.out.print("done.\n\t");
		Random rng = new Random();
		rng.setSeed(114514);
		// that's fake random number, there are some true(?) random numbers using hardware.
		for (int i = 0; i < 3; ++i) {
			int i = rng.nextInt(words.size());
			String s = words.get(i);
			System.out.print(s.toLowerCase() + " ");
		}
		System.out.println();
	}
}