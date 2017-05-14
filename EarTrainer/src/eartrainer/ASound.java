package eartrainer;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;

public class ASound implements Serializable{
	private byte [] sound;
	public ASound (String a) throws Exception{
		sound = IOUtils.toByteArray(new FileInputStream(new File(a)));
	}
	public byte [] getByteArray() {
		return sound;
	}    
}
