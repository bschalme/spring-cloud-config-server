package ca.airspeed;

import static java.lang.String.format;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StringUtils;

public class MyTest {
    

    @Test
    public void isADirectory() throws Exception {
        File remote = new UrlResource(StringUtils.cleanPath(getUri())).getFile();
        assertTrue(format("Expected '%s' to be a directory;", getUri()), remote.isDirectory());
    }

    private String getUri() {
        return "file:///Users/bschalme/Documents/config";
    }

}
