package h6;

import java.awt.*;
import java.applet.*;


public class H601 extends Applet {
    /**																	
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double a, b, c, d, e,
     uitkomst;
	
	
    public void init() {
        a = 113;
        b = 4;
        c = 4;
        d = 4;
        e = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 50);
        g.drawString("Jeannette: " + uitkomst, 20, 80);
        g.drawString("Sergio: " + uitkomst, 20, 110);
    }
}