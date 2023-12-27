package controleur;

import java.util.ArrayList;

import modele.Modele;

public class Controleur {
	/******** Gestion des commande ********/
	public static void insertCommande (Commande uneCommande) {
		Modele.insertCommande(uneCommande);
	}
	public static ArrayList<Commande> selectAllCommandes () {
		return Modele.selectAllCommandes();
	}
	public static ArrayList<Commande> selectLikeCommandes (String filtre) {
		return Modele.selectLikeCommandes(filtre); 
	}
	public static void deleteCommande (int idCommande) {
		Modele.deleteCommande(idCommande);
	}
	public static void updateCommande (Commande uneCommande) {
		Modele.updateCommande(uneCommande);
	}
	public static Commande selectWhereCommande(int idCommande) {
		return Modele.selectWhereCommande(idCommande);
	}
	
	public static Manager selectWhereManager (String email, String mdp) {
		return Modele.selectWhereManager (email, mdp);
	}
	public static Fournisseur selectWhereFournisseur (String email, String mdp) {
		return Modele.selectWhereFournisseur (email, mdp);
	}
}
