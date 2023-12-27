<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Gestion des commandes </h2>
	<%!
		String action = "";
		int idcommandef = 0;
	%>
	<%
		Commande LaCommande = null;
		if (request.getParameter("action") != null && request.getParameter("idcommandef") != null) {
			action = request.getParameter("action");
			idcommandef = Integer.parseInt(request.getParameter("idcommandef"));

			switch (action) {
			//case "sup": Controleur.deleteCommande(idcommandef); break;
			//case "edit": LaCommande = Controleur.selectWhereCommande(idcommandef); break;
			}
		}
	%>

	<%@ include file="vue/vue_insert_commande.jsp" %>
	<%
	if (request.getParameter("Valider") != null) {
		int idUser = Integer.parseInt(request.getParameter("iduser"));
		int idUser1 = Integer.parseInt(request.getParameter("iduser1"));
		String dateCommandeF = request.getParameter("datecommandef");
		StatusCommande status = StatusCommande.valueOf(request.getParameter("status")); // Modification ici

		Commande uneCommande = new Commande(idUser, idUser1, dateCommandeF, status);
		Controleur.insertCommande(uneCommande);
		out.print("<br> Insertion réussie dans la base ");
	}

	if (request.getParameter("Modifier") != null) {
		int idUser = Integer.parseInt(request.getParameter("iduser"));
		int idUser1 = Integer.parseInt(request.getParameter("iduser1"));
		String dateCommandeF = request.getParameter("datecommandef");
		StatusCommande status = StatusCommande.valueOf(request.getParameter("status")); // Modification ici
		int idcommandef = Integer.parseInt(request.getParameter("idcommandef"));

		Commande uneCommande = new Commande(idcommandef, idUser, idUser1, dateCommandeF, status);
		Controleur.updateCommande(uneCommande);
		response.sendRedirect("index.jsp?page=1");
	}
	ArrayList<Commande> lesCommandes = Controleur.selectAllCommandes();
	%>

	<%@ include file="vue/vue_select_commandes.jsp" %>

</body>

</html>