import java.io.*;
import javax.sound.sampled.*;
import org.apache.commons.io.*;

public class UsingTempFileToPlaySound {
	public static void main (String [] args) {
		try {
			byte[] data = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_0.wav")));
			byte [] data2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_2.wav")));;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(data, 0,data.length);
			File f = File.createTempFile("note1",".wav");
			f.deleteOnExit();
			baos.writeTo(new FileOutputStream(f));
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(f));

			clip.start();
			while (!clip.isRunning())
				Thread.sleep(10);
			while (clip.isRunning())
				Thread.sleep(10);
			clip.close();
			
			
			f.delete();
			f = File.createTempFile("note1",".wav");
			f.deleteOnExit();
			ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
			baos2.write(data2, 0,data.length);
			baos2.writeTo(new FileOutputStream(f));
			
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(f));

			clip.start();
			while (!clip.isRunning())
				Thread.sleep(10);
			while (clip.isRunning())
				Thread.sleep(10);
			clip.close();
		}
		catch (Exception exc)
		{
		}
	}
}