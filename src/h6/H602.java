package h6;

import java.awt.*;
import java.applet.*;


public class H602 extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a, b, c;
    double uitkomst, uitkomst2, uitkomst3;
	
	
    public void init() {
        a = 60;
        b = 60;
        c = 60;
        uitkomst = a * 60;
        uitkomst2 = b * 60 * 24;
        uitkomst3 = c * 60 * 24 * 365;
    }

    public void paint(Graphics g) {
        g.drawString("uur: " + uitkomst, 20, 20);
        g.drawString("dag: " + uitkomst2, 20, 40);
        g.drawString("jaar: " + uitkomst3, 20, 60);
    }
}