package com.dievi.entite;
import java.io.Serializable;
import java.util.List;

/*
le libelle taxe peut se présenter de la manière suivante "0-100"
le taux sera alors 15 et la marge sera 100
Si le libelle est "100-150" le taux pourra être de 30 et la marge 150
parce qu'on vérifie si la marge est supérieur ou egal au montant déposé pour calculer 
le taux à appliquer au depot

*/

public class Taxe implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer codetaxe;
    
    private String libelletaxe;
   
    private double taux;
   
    private int marge;

    public Taxe() {
    }

    public Taxe(Integer codetaxe) {
        this.codetaxe = codetaxe;
    }

    public Taxe(Integer codetaxe, String libelletaxe, double taux, int marge) {
        this.codetaxe = codetaxe;
        this.libelletaxe = libelletaxe;
        this.taux = taux;
        this.marge = marge;
    }

    public Taxe(List baka) {
		// TODO Auto-generated constructor stub
    	 this.codetaxe =Integer.parseInt(""+ baka.get(0));
         this.libelletaxe =""+ baka.get(1);
         this.taux = Double.parseDouble(""+baka.get(2));
         this.marge = Integer.parseInt(""+ baka.get(3));
	}

	public Integer getCodetaxe() {
        return codetaxe;
    }

    public void setCodetaxe(Integer codetaxe) {
        this.codetaxe = codetaxe;
    }

    public String getLibelletaxe() {
        return libelletaxe;
    }

    public void setLibelletaxe(String libelletaxe) {
        this.libelletaxe = libelletaxe;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codetaxe != null ? codetaxe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taxe)) {
            return false;
        }
        Taxe other = (Taxe) object;
        if ((this.codetaxe == null && other.codetaxe != null) || (this.codetaxe != null && !this.codetaxe.equals(other.codetaxe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deu.Taxe[ codetaxe=" + codetaxe + " ]";
    }
    
}
