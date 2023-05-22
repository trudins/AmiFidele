package com.dievi.entite;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class Depot implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codetransac;
   
    private String mtcn;
    
    private double montant;
   
    private String devise;
   
    private Date jourheure;
    
    private String nombenef;
    
    private String postnombenef;
    
    private String prenombenef;
   
    private String adressebenef;
   
    private String telbenef;
   
    private String ville;
   
    private double montantretrait;
   
    private String mukolo;
    
    private boolean annulle;
   
    private Taxe codetaxe;
   
    private Utilisateur codeutil;
   
    private Typecarte typecarte;
   
    private Client codeclient;

    public Depot() {
    }

    public Depot(Integer codetransac) {
        this.codetransac = codetransac;
    }

    public Depot(Integer codetransac, String mtcn, double montant, String devise, Date jourheure, String nombenef, String postnombenef, String adressebenef, String ville, double montantretrait, String mukolo, boolean annulle) {
        this.codetransac = codetransac;
        this.mtcn = mtcn;
        this.montant = montant;
        this.devise = devise;
        this.jourheure = jourheure;
        this.nombenef = nombenef;
        this.postnombenef = postnombenef;
        this.adressebenef = adressebenef;
        this.ville = ville;
        this.montantretrait = montantretrait;
        this.mukolo = mukolo;
        this.annulle = annulle;
    }
    public Depot( String mtcn, double montant, String devise, Date jourheure, String nombenef, String postnombenef, String adressebenef, String ville, double montantretrait, String mukolo, boolean annulle) {
        this.mtcn = mtcn;
        this.montant = montant;
        this.devise = devise;
        this.jourheure = jourheure;
        this.nombenef = nombenef;
        this.postnombenef = postnombenef;
        this.adressebenef = adressebenef;
        this.ville = ville;
        this.montantretrait = montantretrait;
        this.mukolo = mukolo;
        this.annulle = annulle;
    }

    public Integer getCodetransac() {
        return codetransac;
    }

    public void setCodetransac(Integer codetransac) {
        this.codetransac = codetransac;
    }

    public String getMtcn() {
        return mtcn;
    }

    public void setMtcn(String mtcn) {
        this.mtcn = mtcn;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Date getJourheure() {
        return jourheure;
    }

    public void setJourheure(Date jourheure) {
        this.jourheure = jourheure;
    }

    public String getNombenef() {
        return nombenef;
    }

    public void setNombenef(String nombenef) {
        this.nombenef = nombenef;
    }

    public String getPostnombenef() {
        return postnombenef;
    }

    public void setPostnombenef(String postnombenef) {
        this.postnombenef = postnombenef;
    }

    public String getPrenombenef() {
        return prenombenef;
    }

    public void setPrenombenef(String prenombenef) {
        this.prenombenef = prenombenef;
    }

    public String getAdressebenef() {
        return adressebenef;
    }

    public void setAdressebenef(String adressebenef) {
        this.adressebenef = adressebenef;
    }

    public String getTelbenef() {
        return telbenef;
    }

    public void setTelbenef(String telbenef) {
        this.telbenef = telbenef;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getMontantretrait() {
        return montantretrait;
    }

    public void setMontantretrait(double montantretrait) {
        this.montantretrait = montantretrait;
    }

    public String getMukolo() {
        return mukolo;
    }

    public void setMukolo(String mukolo) {
        this.mukolo = mukolo;
    }

    public boolean getAnnulle() {
        return annulle;
    }

    public void setAnnulle(boolean annulle) {
        this.annulle = annulle;
    }

    public Taxe getCodetaxe() {
        return codetaxe;
    }

    public void setCodetaxe(Taxe codetaxe) {
        this.codetaxe = codetaxe;
    }

    public Utilisateur getCodeutil() {
        return codeutil;
    }

    public void setCodeutil(Utilisateur codeutil) {
        this.codeutil = codeutil;
    }

    public Typecarte getTypecarte() {
        return typecarte;
    }

    public void setTypecarte(Typecarte typecarte) {
        this.typecarte = typecarte;
    }

    public Client getCodeclient() {
        return codeclient;
    }

    public void setCodeclient(Client codeclient) {
        this.codeclient = codeclient;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
     public String creerMtcn() {
	// TODO Auto-generated method stub//provisoire
		System.out.println("creerMtcn ");
	 Random randomGenerator = new Random();
	 String retour="";
	 for(int i=0;i<10;i++)
		{
		 int r = randomGenerator.nextInt(10);
		 retour+=r;
		}
	 System.out.println("on a creer Mtcn "+retour);
         this.setMtcn(retour);
	return retour;
}

    ////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codetransac != null ? codetransac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depot)) {
            return false;
        }
        Depot other = (Depot) object;
        if ((this.codetransac == null && other.codetransac != null) || (this.codetransac != null && !this.codetransac.equals(other.codetransac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joli.Depot[ codetransac=" + codetransac + " ]";
    }

    public double getMontantARetirer(Taxe tax) {
        double montantARetirer=0.00;
        System.out.println("taxe.getMarge() "+tax.getMarge()+"_montant_"+montant);
		if(tax.getMarge()>=this.getMontant()){
			montantARetirer=montant-(montant*tax.getTaux()/100);
			this.setCodetaxe(tax);
			this.setMontantretrait(montantARetirer);
			System.out.println("montant a retirer "+montantARetirer);
                        
						
		}
        
        
        return montantARetirer;
       
    }

	/*public Taxe getTaxeToImpose(double impot) {
		// TODO Auto-generated method stub
		double montantARetirer=0.00;
		montantARetirer=montant-(montant*impot/100);
		//this.setCodetaxe(tax);
		this.setMontantretrait(montantARetirer);
		System.out.println("montant a retirer "+montantARetirer);
		 return montantARetirer;
	}*/
    
}
