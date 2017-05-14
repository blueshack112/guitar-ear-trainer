package eartrainer;

import java.io.Serializable;

public class Guitar implements Serializable {
	
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
