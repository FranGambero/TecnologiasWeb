<%-- 
    Document   : indexTwitter
    Created on : 03-may-2018, 11:27:50
    Author     : Takox
--%>

<%@page import="twitter.entity.Usuario"%>
<%
    Usuario usuario = (Usuario)request.getAttribute("usuario");
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>indexUsuario</title>
    </head>
    <body>
        <h1>Bienvenido usuario <%= usuario.getNombre() %></h1>
        <hr>
        
        <table>
            <tbody>
                <tr>
                    <td>Nombre</td>
                    <td>Biografía</td>
                    <td>Fecha inscripción</td>
                    <td>URL</td>
                    <td>Likes</td>
                    <td>Seguidores</td>
                    <td>Seguidos</td>
                    <td>País</td>
                </tr>
                <tr>
                    <td><%= usuario.getNombre() %></td>
                    <td><%= usuario.getDescripcion() %></td>
                    <td><%= usuario.getFecha() %></td>
                    <td><%= usuario.getUrl()  %></td>
                    <td><%= usuario.getTuitCollection().size() %></td>
                    <td><%= usuario.getUsuarioCollection().size() %></td>
                    <td><%= usuario.getUsuarioCollection1().size() %></td>
                    <td><%= usuario.getPais().getPaisIsoCode() %></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
