import java.io.*;
import javax.sound.sampled.*;

public class TryingToCreateArray {
	public static void main (String [] args) {
		File [][] f = new File [5][13];
		
		f[0][0] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_0.wav");
		f[0][1] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_1.wav");
		f[0][2] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_2.wav");
		f[0][3] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_3.wav");
		f[0][4] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_4.wav");
		f[0][5] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_5.wav");
		f[0][6] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_6.wav");
		f[0][7] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_7.wav");
		f[0][8] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_8.wav");
		f[0][9] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_9.wav");
		f[0][10] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_10.wav");
		f[0][11] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_11.wav");
		f[0][12] = new File ("C:\\HAA\\Ear trainer\\Sound\\1StringE\\String_E_fret_12.wav");
		
		f[1][0] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_0.wav");
		f[1][1] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_1.wav");
		f[1][2] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_2.wav");
		f[1][3] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_3.wav");
		f[1][4] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_4.wav");
		f[1][5] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_5.wav");
		f[1][6] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_6.wav");
		f[1][7] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_7.wav");
		f[1][8] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_8.wav");
		f[1][9] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_9.wav");
		f[1][10] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_10.wav");
		f[1][11] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_11.wav");
		f[1][12] = new File ("C:\\HAA\\Ear trainer\\Sound\\2StringA\\String_A_fret_12.wav");
		
		f[2][0] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_0.wav");
		f[2][1] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_1.wav");
		f[2][2] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_2.wav");
		f[2][3] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_3.wav");
		f[2][4] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_4.wav");
		f[2][5] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_5.wav");
		f[2][6] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_6.wav");
		f[2][7] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_7.wav");
		f[2][8] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_8.wav");
		f[2][9] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_9.wav");
		f[2][10] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_10.wav");
		f[2][11] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_11.wav");
		f[2][12] = new File ("C:\\HAA\\Ear trainer\\Sound\\3StringD\\String_D_fret_12.wav");
		
		f[3][0] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_0.wav");
		f[3][1] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_1.wav");
		f[3][2] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_2.wav");
		f[3][3] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_3.wav");
		f[3][4] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_4.wav");
		f[3][5] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_5.wav");
		f[3][6] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_6.wav");
		f[3][7] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_7.wav");
		f[3][8] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_8.wav");
		f[3][9] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_9.wav");
		f[3][10] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_10.wav");
		f[3][11] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_11.wav");
		f[3][12] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringG\\String_G_fret_12.wav");
		
		f[4][0] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_0.wav");
		f[4][1] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_1.wav");
		f[4][2] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_2.wav");
		f[4][3] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_3.wav");
		f[4][4] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_4.wav");
		f[4][5] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_5.wav");
		f[4][6] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_6.wav");
		f[4][7] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_7.wav");
		f[4][8] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_8.wav");
		f[4][9] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_9.wav");
		f[4][10] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_10.wav");
		f[4][11] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_11.wav");
		f[4][12] = new File ("C:\\HAA\\Ear trainer\\Sound\\4StringB\\String_B_fret_12.wav");
		
		int string = 0;
		int fret = 0;
		
		try {
			Clip clip1 = AudioSystem.getClip();
			Clip clip2 = AudioSystem.getClip();
			clip1.open(AudioSystem.getAudioInputStream(f[string][fret]));
			clip1.start();
			System.out.println("1 is running");
			while (!clip1.isRunning())
				Thread.sleep(10);
			while (clip1.isRunning())
				Thread.sleep(10);
			clip1.close();
			
			Thread.sleep(800);

			clip2.open(AudioSystem.getAudioInputStream(f[string+1][fret]));
			clip2.start();
			System.out.println("2 is running");
			while (!clip2.isRunning())
				Thread.sleep(10);
			while (clip2.isRunning())
				Thread.sleep(10);
			clip2.close();
		}
		catch (Exception exc)
		{
			exc.printStackTrace(System.out);
		}
	}
}