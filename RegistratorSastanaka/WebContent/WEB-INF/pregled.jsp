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
	<h1>Sastanci</h1>
	<div id="sastanci">
		<%for(Sastanak s : korisnikBean.mojiSastanci()){ %>
			Naziv: <%=s.getNaziv() %>
			Mjesto: <%=s.getMjesto() %>
			Vrijeme: <%=s.getVrijemePocetka() %>
			Vrijeme trajanja: <%=s.getVrijemeTrajanja() %>
			Status: <%=s.getStatus() %>
			<hr></hr>
		<%} %>
	</div>
</body>
</html>