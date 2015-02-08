package de.bschandera.gut;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static de.bschandera.gut.Main.GUT;

public class Init {

    private static final String LOG = "/log";

    public boolean init() {
        try {
            FileUtils.touch(new File(GUT + LOG));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
