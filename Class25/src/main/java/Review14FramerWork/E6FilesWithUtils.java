package Review14FramerWork;

import Utils.ConfigReader;

import java.io.IOException;

public class E6FilesWithUtils {
    public static void main(String[] args) throws IOException {
        String browser= ConfigReader.read("browser");
        System.out.println(browser);

// see because we wrote the code under utils 'configReader' and just using it method READ, just wrote two lines
    }
}
