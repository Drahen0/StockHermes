<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import="modele.*" %>
<%@ page import="controleur.Commande" %>
<%@ page import="commande" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Ajout d'une commande</h3>
	<form method="post">
		<table> 
			<tr> <td> User Manager </td>
				<td> <input type="text" name="iduser" 
		value = '<%= (LaCommande != null)?LaCommande.getIdUser():"" %>'
				></td>
			</tr>
			<tr> <td> User Fournisseur </td>
				<td> <input type="text" name="iduser1"
		value = '<%= (LaCommande != null)?LaCommande.getIdUser1():"" %>'
				></td>
			</tr>
			<tr> <td> Date commande </td>
				<td> <input type="date" name="datecommandef"
		value = '<%= (LaCommande != null)?LaCommande.getDateCommandeF():"" %>'
				></td>
			</tr>
			<tr> <td> Statut </td>
				<td> <input type="text" name="status"
		value = '<%= (LaCommande != null)?LaCommande.getStatus():"" %>'
				></td>
			</tr>
			<tr> <td>  </td>
				<td> <input type="submit" 
				<%= (LaCommande != null)? " name='Modifier' value='Modifier' " :
					" name='Valider' value ='Valider' " %>
				
				>
				</td>
			</tr>
		</table>
	<%= (LaCommande != null)? "<input type='hidden' name='idcommandeF' value='"
		+ LaCommande.getIdCommandeF()+"'>":"" %>
	</form>
</body>
</html>








