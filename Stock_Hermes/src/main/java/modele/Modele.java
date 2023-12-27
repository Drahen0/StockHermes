package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
import controleur.Commande;
import controleur.Manager;
import controleur.StatusCommande;
import controleur.Fournisseur;

public class Modele {
	private static Connexion maConnexion = new Connexion ("localhost", "hermesgourmet","root",""); 
	
	/************ GESTION DES COMMANDES **********/
	public static void insertCommande (Commande uneCommande) {
		String req = "insert into commandefournisseur values (null, '"+uneCommande.getIdUser()
			+"','"+uneCommande.getIdUser1()+"','"+uneCommande.getDateCommandeF()+"','"+uneCommande.getStatus()+"'); ";
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			unStat.execute(req); 
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
	}
	public static ArrayList<Commande> selectAllCommandes(){
		String req = "select * from commandefournisseur;"; 
		ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(req);
			while(desRes.next()) {
				Commande uneCommande= new Commande(
						desRes.getInt("idcommandef"), desRes.getInt("iduser"),
						desRes.getInt("iduser_1"),desRes.getString("datecommandef"),
						StatusCommande.valueOf(desRes.getString("status")));
				lesCommandes.add(uneCommande);
			}
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req + " " + exp);
		}
		return lesCommandes;
	}
	public static void deleteCommande (int idcommandef) {
		String req = "delete from commandefournisseur where idcommandef= "+idcommandef+";";
	try {
		maConnexion.seConnecter();
		Statement unStat = maConnexion.getMaConnexion().createStatement(); 
		unStat.execute(req); 
		unStat.close();
		maConnexion.seDeconnecter();
	}
	catch (SQLException exp) {
		System.out.println("Erreur d'execution : "+ req);
	}
	}
	public static Commande selectWhereCommande(int idcommandef) {
		String req = "select * from commandefournisseur where idcommandef= "+idcommandef+";"; 
		Commande uneCommande = null;
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(req);
			if(desRes.next()) {
				uneCommande= new Commande(
						desRes.getInt("idcommandef"), desRes.getInt("iduser"),
						desRes.getInt("iduser_1"),desRes.getString("datecommandef"),
						StatusCommande.valueOf(desRes.getString("status")));
			}
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
		return uneCommande;
	}
	public static void updateCommande(Commande uneCommande) {
		String req = "update commandefournisseur set iduser= '"+uneCommande.getIdUser()
		+"', iduser_1 = '"+uneCommande.getIdUser1()+"',datecommandef ='"+uneCommande.getDateCommandeF()
		+"',status ='"+uneCommande.getStatus()
		+"' where idcommandef = "+uneCommande.getIdCommandeF()+"; ";
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			unStat.execute(req); 
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
	}
	public static ArrayList<Commande> selectLikeCommandes(String filtre){
		String req = "select * from commandefournisseur where iduser like '%"+filtre+
				"%' or iduser_1 like '%"+filtre+ "%' or datecommandef like '%"+filtre+
				"%' or status like '%"+filtre+"%' ;"; 
		ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(req);
			while(desRes.next()) {
				Commande uneCommande= new Commande(
						desRes.getInt("idcommandef"), desRes.getInt("iduser"),
						desRes.getInt("iduser_1"),desRes.getString("datecommandef"),
						StatusCommande.valueOf(desRes.getString("status")));
				lesCommandes.add(uneCommande);
			}
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
		return lesCommandes;
	}
	
	/*******************$ Manager *****************/
	public static Manager  selectWhereManager (String email, String password) {
		String req = "select * from manager where email= '"+email+"' and password='"+password+"' ; "; 
		Manager unManager = null;
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(req);
			if(desRes.next()) {
				unManager= new Manager(
						desRes.getInt("IDUSER"), desRes.getString("DEPARTEMENT"),
						desRes.getString("REGISTRATION"),desRes.getString("CITYWORK"), 
						desRes.getString("NAME"),desRes.getString("LASTNAME"),
						desRes.getString("EMAIL"),desRes.getString("PASSWORD"), 
						desRes.getString("ADDRESS"),desRes.getInt("POSTAL"),
						desRes.getString("CITY")
						);
			}
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
		return unManager;
	}
	
	/*******************$ Fournisseur *****************/
	public static Fournisseur  selectWhereFournisseur (String email, String password) {
		String req = "select * from fournisseur where email= '"+email+"' and password='"+password+"' ; "; 
		Fournisseur unFournisseur = null;
		try {
			maConnexion.seConnecter();
			Statement unStat = maConnexion.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(req);
			if(desRes.next()) {
				unFournisseur= new Fournisseur(
						desRes.getInt("IDUSER"), desRes.getString("COMPANY_NAME"),
						desRes.getString("PRODUCT_LINE"), 
						desRes.getString("NAME"),desRes.getString("LASTNAME"),
						desRes.getString("EMAIL"),desRes.getString("PASSWORD"), 
						desRes.getString("ADDRESS"),desRes.getInt("POSTAL"),
						desRes.getString("CITY")
						);
			}
			unStat.close();
			maConnexion.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution : "+ req);
		}
		return unFournisseur;
	}
}





