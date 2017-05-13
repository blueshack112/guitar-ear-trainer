import java.io.*;
import javax.sound.sampled.*;
import org.apache.commons.io.*;

public class CreatingGuitarClass {
	public static void main (String [] args) {
		try {
			byte[] data = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_0.wav")));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(data, 0,data.length);
			baos.writeTo(new FileOutputStream(new File ("bitchTrySomething.wav")));
		}
		catch (Exception exc)
		{
		}
	}
}

interface GuitarSound