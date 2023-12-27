package controleur;


public class Commande {
    private int idCommandeF;
    private int idUser;
    private int idUser1;
    private String dateCommandeF;
    private StatusCommande status;

    public Commande(int idCommandeF, int idUser, int idUser1, String dateCommandeF, StatusCommande status) {
        super();
        this.idCommandeF = idCommandeF;
        this.idUser = idUser;
        this.idUser1 = idUser1;
        this.dateCommandeF = dateCommandeF;
        this.status = status;
    }

    public Commande(int idUser, int idUser1, String dateCommandeF, StatusCommande status) {
        super();
        this.idCommandeF = 0;
        this.idUser = idUser;
        this.idUser1 = idUser1;
        this.dateCommandeF = dateCommandeF;
        this.status = status;
    }

    public int getIdCommandeF() {
        return idCommandeF;
    }

    public void setIdCommandeF(int idCommandeF) {
        this.idCommandeF = idCommandeF;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUser1() {
        return idUser1;
    }

    public void setIdUser1(int idUser1) {
        this.idUser1 = idUser1;
    }

    public String getDateCommandeF() {
        return dateCommandeF;
    }

    public void setDateCommandeF(String dateCommandeF) {
        this.dateCommandeF = dateCommandeF;
    }

    public StatusCommande getStatus() {
        return status;
    }

    public void setStatus(StatusCommande status) {
        this.status = status;
    }
}

