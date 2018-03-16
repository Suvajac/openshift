<%@page import="net.etfbl.model.Sastanak"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="korisnikBean" type="net.etfbl.beans.KorisnikBean" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrator Sastanaka</title>
</head>
<body>
	<h1><%=korisnikBean.getKorisnik().getIme() %>  <%=korisnikBean.getKorisnik().getPrezime() %></h1>
	<h3>Broj sastanaka = <%= korisnikBean.mojiSastanci().size() %></h3>
	<a href="Controller?option=pregled">Pregled</a>
	<a href="Controller?option=dodaj">Dodaj</a>
	<a href="Controller?option=ostali">Ostali</a>
	<a href="Controller?option=logout">Logout</a>
	<hr></hr>
</body>
</html>