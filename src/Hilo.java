
import javax.swing.JLabel;


public class Hilo implements Runnable {

    JLabel seg;
    JLabel seg2;
    int segundos;
    int ss = 0, ss2 = 0;

    public Hilo(JLabel seg, JLabel seg2, int segundos) {
        this.seg = seg;
        this.seg2 = seg2;
        this.segundos = segundos;
    }

    public JLabel getSeg() {
        return seg;
    }

    public void setSeg(JLabel seg) {
        this.seg = seg;
    }

    public JLabel getSeg2() {
        return seg2;
    }

    public void setSeg2(JLabel seg2) {
        this.seg2 = seg2;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public void run() {
        int ver = 0;

        while (ver != segundos) {
            String cc = "", cc2 = "";

            if (ss2 == 59 ) {
                ss2 = 0;
                
                ss++;

                cc = Integer.toString(ss);
                cc2 = Integer.toString(ss2);

                seg.setText(cc2);
                seg2.setText(cc);

                ss2--;
            }

            ss2++;
            cc2 = Integer.toString(ss2);

            seg.setText(cc2);
            

            try {
                Thread.sleep(1000);
                ver++;
            } catch (Exception e) {
            }
        }
    }

}

