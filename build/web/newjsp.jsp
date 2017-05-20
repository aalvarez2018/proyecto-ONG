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
    <center>
        <form method="post" action="ServletUsuario" >
            <p>Escribe tus datos</p>
            <p><input name="name" id="name" type="text" placeholder="Nombre completo" ></p>
            <p><input name="email" id="email" type="email"placeholder="Correo electrónico" ></p>
            <p><input name="id" id="id" type="text" placeholder="Documento de identidad"></p>
            <p><input name="profesion" id="profesion" type="text" placeholder="Profesión"></p>
          <input type="submit" value="Enviar datos">
          <button><a href="index.jsp">Volver</a></button>
        </form>
        </center>
    </body>
</html>
