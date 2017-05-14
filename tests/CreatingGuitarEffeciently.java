import java.io.*;
import javax.sound.sampled.*;
import org.apache.commons.io.*;

public class CreatingGuitarEffeciently {
	public static void main (String [] args) throws Exception {
		Guitar g1 = new Guitar();
		byte [] data = g1.getByteArray(2,3);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(data, 0,data.length);
		out.writeTo(new FileOutputStream(new File ("try.wav")));
		out.close();
		
	}
}

class ASound {
	byte [] sound;
	public ASound (String a) throws Exception{
		sound = IOUtils.toByteArray(new FileInputStream(new File(a)));
	}
	public byte [] getByteArray() {
		return sound;
	}
}
class Guitar implements Serializable {
	
	private ASound [][] guitarSounds; 
	
	public Guitar () throws Exception {
		guitarSounds = new ASound [5][13];
		for (int i=0; i<=4; i++) {
			for (int j=0; j<=12; j++) {
				guitarSounds[i][j] = new ASound("C:\\HAA\\Ear trainer\\Sound\\"+i+"\\String_"+((i==0)?"E":(i==1)?"A":(i==2)?"D":(i==3)?"G":"B")+"_fret_"+j+".wav");
			}
		}
		
	}
	
	public byte [] getByteArray (int string, int fret) {
		return guitarSounds[string-1][fret].getByteArray();
	}
	
}