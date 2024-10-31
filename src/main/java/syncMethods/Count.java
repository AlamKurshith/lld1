package syncMethods;

import javax.swing.plaf.synth.SynthButtonUI;

public class Count {

    public int val = 0;

    public synchronized void incrementValue(int i){
        val = val + i;
    }

    public int getVal(){
        return val;
    }
}
