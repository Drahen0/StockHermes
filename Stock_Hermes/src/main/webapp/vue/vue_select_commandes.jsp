<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="modele.*" %>
<%@ page import="controleur.Commande" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Liste des commandes </h3>
	<table border = "1">
	<tr>
    <td>Id commande</td>
    <td>User Manager</td>
    <td>User Fournisseur</td>
    <td>Date</td>
    <td>Status</td>
</tr>

	<%
		String chaineCommandes = ""; 
		for(Commande uneCommande : lesCommandes){
			chaineCommandes +="<tr>";
			chaineCommandes += "<td>"+uneCommande.getIdCommandeF()+"</td>";
			chaineCommandes += "<td>"+uneCommande.getIdUser()+"</td>";
			chaineCommandes += "<td>"+uneCommande.getIdUser1()+"</td>";
			chaineCommandes += "<td>"+uneCommande.getDateCommandeF()+"</td>";
			chaineCommandes += "<td>"+uneCommande.getStatus()+"</td>";
			chaineCommandes +="</tr>";
		}
		out.print(chaineCommandes);
	%>
	
	</table>
</body>
</html>
