import java.io.*;
import javax.sound.sampled.*;
import org.apache.commons.io.*;

public class CreatingGuitar {
	public static void main (String [] args) throws Exception {
		Guitar g1 = new Guitar();
		byte [] date = g1.E0;
		
	}
}


class Guitar implements Serializable {
	
	public byte [] E0;
	private byte [] E1;
	private byte [] E2;
	private byte [] E3;
	private byte [] E4;
	private byte [] E5;
	private byte [] E6;
	private byte [] E7;
	private byte [] E8;
	private byte [] E9;
	private byte [] E10;
	private byte [] E11;
	private byte [] E12;
	
	
	private byte [] A0;
	private byte [] A1;
	private byte [] A2;
	private byte [] A3;
	private byte [] A4;
	private byte [] A5;
	private byte [] A6;
	private byte [] A7;
	private byte [] A8;
	private byte [] A9;
	private byte [] A10;
	private byte [] A11;
	private byte [] A12;
	
	private byte [] D0;
	private byte [] D1;
	private byte [] D2;
	private byte [] D3;
	private byte [] D4;
	private byte [] D5;
	private byte [] D6;
	private byte [] D7;
	private byte [] D8;
	private byte [] D9;
	private byte [] D10;
	private byte [] D11;
	private byte [] D12;
	
	private byte [] G0;
	private byte [] G1;
	private byte [] G2;
	private byte [] G3;
	private byte [] G4;
	private byte [] G5;
	private byte [] G6;
	private byte [] G7;
	private byte [] G8;
	private byte [] G9;
	private byte [] G10;
	private byte [] G11;
	private byte [] G12;
	
	private byte [] B0;
	private byte [] B1;
	private byte [] B2;
	private byte [] B3;
	private byte [] B4;
	private byte [] B5;
	private byte [] B6;
	private byte [] B7;
	private byte [] B8;
	private byte [] B9;
	private byte [] B10;
	private byte [] B11;
	private byte [] B12;
	
	public Guitar () throws Exception {
	 E0 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_0.wav")));
	 E1 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_1.wav")));
	 E2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_2.wav")));
	 E3 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_3.wav")));
	 E4 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_4.wav")));
	 E5 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_5.wav")));
	 E6 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_6.wav")));
	 E7 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_7.wav")));
	 E8 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_8.wav")));
	 E9 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_9.wav")));
	 E10 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_10.wav")));
	 E11 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_11.wav")));
	 E12 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\0\\String_E_fret_12.wav")));
	
	
	 A0 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_0.wav")));
	 A1 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_1.wav")));
	 A2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_2.wav")));
	 A3 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_3.wav")));
	 A4 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_4.wav")));
	 A5 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_5.wav")));
	 A6 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_6.wav")));
	 A7 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_7.wav")));
	 A8 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_8.wav")));
	 A9 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_9.wav")));
	 A10 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_10.wav")));
	 A11 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_11.wav")));
	 A12 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\1\\String_A_fret_12.wav")));
	
	 D0 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_0.wav")));
	 D1 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_1.wav")));
	 D2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_2.wav")));
	 D3 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_3.wav")));
	 D4 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_4.wav")));
	 D5 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_5.wav")));
	 D6 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_6.wav")));
	 D7 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_7.wav")));
	 D8 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_8.wav")));
	 D9 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_9.wav")));
	 D10 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_10.wav")));
	 D11 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_11.wav")));
	 D12 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\2\\String_D_fret_12.wav")));
	
	 G0 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_0.wav")));
	 G1 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_1.wav")));
	 G2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_2.wav")));
	 G3 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_3.wav")));
	 G4 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_4.wav")));
	 G5 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_5.wav")));
	 G6 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_6.wav")));
	 G7 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_7.wav")));
	 G8 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_8.wav")));
	 G9 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_9.wav")));
	 G10 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_10.wav")));
	 G11 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_11.wav")));
	 G12 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\3\\String_G_fret_12.wav")));
	
	 B0 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_0.wav")));
	 B1 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_1.wav")));
	 B2 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_2.wav")));
	 B3 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_3.wav")));
	 B4 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_4.wav")));
	 B5 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_5.wav")));
	 B6 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_6.wav")));
	 B7 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_7.wav")));
	 B8 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_8.wav")));
	 B9 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_9.wav")));
	 B10 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_10.wav")));
	 B11 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_11.wav")));
	 B12 = IOUtils.toByteArray(new FileInputStream(new File("C:\\HAA\\Ear trainer\\Sound\\4\\String_B_fret_12.wav")));
	
	}
	
}