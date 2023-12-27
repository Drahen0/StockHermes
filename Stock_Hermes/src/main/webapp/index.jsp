<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="controleur.*" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<center>
    <h1> Gestion des Stock et des commandes </h1>
    <% 
    if(session.getAttribute("email") == null){
        %> <%@ include file="vue/vue_form.jsp" %> <% 
    }
    if (request.getParameter("SeConnecter") != null) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Manager unManager = Controleur.selectWhereManager(email, password);
        Fournisseur unFournisseur = Controleur.selectWhereFournisseur(email, password);
        if (unManager != null) {
            out.print("<br> Bienvenue "+unManager.getLastName()+"<br>");
            session.setAttribute("email", unManager.getEmail());
            session.setAttribute("name", unManager.getLastName());
            response.sendRedirect("index.jsp?page=1");
        } else if (unFournisseur != null) {
            out.print("<br> Bienvenue "+unFournisseur.getLastName()+"<br>");
            session.setAttribute("email", unFournisseur.getEmail());
            session.setAttribute("name", unFournisseur.getLastName());
            response.sendRedirect("index.jsp?page=2");
        } else {
            out.print("<br> Veuillez vérifier vos identifiants.");
        }
    }
    
    String menu = "<a href='index.jsp?page=3'> DECONNEXION</a>"; 
    if (session.getAttribute("email") != null){
        out.print(menu);
    }
    %>
     
     <%!
        int unePage ; 
     %>
     <%
        if (request.getParameter("page")!=null){
            unePage = Integer.parseInt(request.getParameter("page"));
        } else {
            unePage = 1; 
        }
     switch(unePage){
     case 1 : %> <%@ include file="commande.jsp" %> <% break; 
     case 2 : %> <%@ include file="commandeMana.jsp" %> <% break; 
     case 3 : session.invalidate(); 
        //response.sendRedirect("index.jsp"); 
     break;
     }
      //fin du if session 
     %>
    
</center>
</body>
</html>
