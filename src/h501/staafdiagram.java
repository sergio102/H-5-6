package h501;

import java.applet.Applet;
import java.awt.Graphics;

public class staafdiagram extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int valerie = 40;
	int jeroen = 100;
	int hans = 80;
	int breedteScherm;
	int hoogteScherm;
	int margeH;
	int margeV;
	int hoogteYas;
	int maxGewicht = 140;
	int aantalStrepen = 7;
	int breedteStaaf;
	
	
	public void init() {
		breedteScherm = 500;
		hoogteScherm = 400;
		this.setSize(breedteScherm, hoogteScherm);
		margeH = breedteScherm / 10; 
		margeV = hoogteScherm /  10;
		hoogteYas = hoogteScherm - margeH * 2;
		breedteStaaf = margeH;
				
	}
	public void paint(Graphics g) {
		breedteScherm = this.getWidth();
		hoogteScherm = this.getHeight();
		margeH = breedteScherm / 10; 
		margeV = hoogteScherm /  10;
		hoogteYas = hoogteScherm - margeH * 2;
		breedteStaaf = margeH;
		int x = margeH;
		int y = hoogteScherm - margeV;
		int x2 = breedteScherm - margeH;
		int y2 = y;
		g.drawLine(x, y, x2, y2);
		
		//Y AS
		y2 = margeV;
		x2 = x;
		g.drawLine(x, y, x2, y2);
		
		//schaalstreepjes
		int breedteStreep = 5;
		x -=breedteStreep;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		y -= hoogteYas / aantalStrepen;
		g.drawLine(x, y, x + breedteStreep, y);
		
		
		x = margeH * 2;
		y = hoogteScherm - margeV;
		y = (hoogteYas / maxGewicht) * valerie;
		int height = (hoogteYas / maxGewicht) * valerie;
		g.fillRect(x, y, breedteStaaf, height);
		
		
	
		// staaf jeroen
		x += margeH + breedteStaaf;
		y = hoogteScherm - margeV;
		y = (hoogteYas / maxGewicht) * jeroen;
		height = (hoogteYas / maxGewicht) * jeroen;
		g.fillRect(x, y, breedteStaaf, height);	
		
		// staaf hans
		x += margeH + breedteStaaf;
		y = hoogteScherm - margeV;
		y = (hoogteYas / maxGewicht) * hans;
		height = (hoogteYas / maxGewicht) * hans;
		g.fillRect(x, y, breedteStaaf, height);			
		
	}
}