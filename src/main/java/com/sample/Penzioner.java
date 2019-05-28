package com.sample;

public class Penzioner {
	
	private int godineStarosti;
	private int godineStaza;
	private String pol;
	private boolean imaInvaliditet;
	
	//postavljeno na pocetku na 0 da bi se znalo da nije nijedna konkretna vrednost
	private int starosnaGranica = 0;
	private String tipPenzije;
	private double procenatPenzije;
	
	public int getGodineStarosti() {
		return godineStarosti;
	}
	
	public void setGodineStarosti(int godineStarosti) {
		this.godineStarosti = godineStarosti;
	}
	
	public int getGodineStaza() {
		return godineStaza;
	}
	
	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
	
	public String getPol() {
		return pol;
	}
	
	public void setPol(String pol) {
		this.pol = pol;
	}
	
	public boolean isImaInvaliditet() {
		return imaInvaliditet;
	}
	
	public void setImaInvaliditet(boolean imaInvaliditet) {
		this.imaInvaliditet = imaInvaliditet;
	}
	
	public int getStarosnaGranica() {
		return starosnaGranica;
	}
	
	public void setStarosnaGranica(int starosnaGranica) {
		this.starosnaGranica = starosnaGranica;
	}
	
	public String getTipPenzije() {
		return tipPenzije;
	}
	
	public void setTipPenzije(String tipPenzije) {
		this.tipPenzije = tipPenzije;
	}
	
	public double getProcenatPenzije() {
		return procenatPenzije;
	}
	
	public void setProcenatPenzije(double procenatPenzije) {
		this.procenatPenzije = procenatPenzije;
	}

	@Override
	public String toString() {
		return "Penzioner [godineStarosti=" + godineStarosti + ", godineStaza=" + godineStaza + ", pol=" + pol
				+ ", imaInvaliditet=" + imaInvaliditet + ", starosnaGranica=" + starosnaGranica + ", tipPenzije="
				+ tipPenzije + ", procenatPenzije=" + procenatPenzije + "]";
	}

}
