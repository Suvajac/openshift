<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrator Sastanaka</title>
</head>
<body>
	<h1>Dodaj sastanak</h1>
	<form id="forma" action="Controller?option=dodajSastanak" method="post">
		Naziv: <input type="text" name="naziv" /><br></br>
		Mjesto: <input type="text" name="mjesto" /><br></br>
		Vrijeme: <input type="text" name="vrijeme" /><br></br>
		Vrijeme trajanja: <input type="text" name="vrijemeTrajanja" /><br></br>
		Status: <select form="forma" name="status">
			<option value="javno">Javno</option>
			<option value="privatno">Privatno</option>
		</select><br></br>
		<input type="submit" value="Dodaj" />
	</form>
</body>
</html>