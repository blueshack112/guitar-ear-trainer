import java.io.*;
import javax.sound.sampled.*;

public class TestStartingAudio {
	public static void main (String [] args) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_0.wav")));
			clip.start();
			while (!clip.isRunning())
				Thread.sleep(10);
			while (clip.isRunning())
				Thread.sleep(10);
			clip.close();
		}
		catch (Exception exc)
		{
			exc.printStackTrace(System.out);
		}
	}
}