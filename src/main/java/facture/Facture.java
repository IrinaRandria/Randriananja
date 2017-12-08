package facture;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facture {
    
    private int numero;
    private Date emission;
    private Client destinataire;
    

    public Facture(Client destinataire, Date emission, int numero) {
        this.destinataire = destinataire;
        this.emission = emission;
        this.numero = numero;     
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
         return numero;}

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
         return emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
         return destinataire;
    }

    List<LigneFacture> ligne = new ArrayList<>();
    
    public void ajouteLigne(Article a, int nombre, float remise) {
         LigneFacture l = new LigneFacture(nombre,this,a,remise);
         ligne.add(l);
   }
    
   public float montantTTC(float tauxTVA) {
         float montantTtc = 0;
         for(LigneFacture o : ligne){
         montantTtc +=  o.montantLigne();  
         }
         return montantTtc + montantTtc * tauxTVA;
   }
   
   public void print(PrintStream out, float tva) {
         System.out.print("tva :" + tva);
   }
   
}
