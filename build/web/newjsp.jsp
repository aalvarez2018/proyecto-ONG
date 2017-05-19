<%-- 
    Document   : newjsp
    Created on : 19/05/2017, 12:06:46 PM
    Author     : ?
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="ServletUsuario" >
          <input name="name" id="name" type="text" placeholder="Nombre completo" >
          <input name="email" id="email" type="email"placeholder="Correo electrónico" >
          <input name="id" id="id" type="text" placeholder="Documento de identidad">
          <input name="profesion" id="profesion" type="text" placeholder="Profesión">
          <input type="submit" value="Enviar datos">
        </form>
    </body>
</html>
