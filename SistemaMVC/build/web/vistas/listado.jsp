<%--
    Document   : listado
    Created on : 10-12-2020, 08:35:50 AM
    Author     : ale_a
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuarios"%>
<%@page import="modelo.UsuariosDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
    </head>
    <body>
        <h1>Listado de Usurios</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Correo</th>
                    <th>Clave</th>
                    <th>Tipo</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>

                <%
                    UsuariosDao user = new UsuariosDao();
                    ArrayList<Usuarios> listado = user.getListadoUsuarios();

                    for (Usuarios usuario : listado) {


                %>
                <tr>
                    <td><%= usuario.getCodigo()%> </td>
                    <td><%= usuario.getNombres()%> </td>
                    <td><%= usuario.getApellidos()%> </td>
                    <td><%= usuario.getCorreos()%> </td>
                    <td><%= usuario.getClave()%> </td>
                    <td><%= usuario.getTipo()%> </td>
                    <td><%= usuario.getEstado()%> </td>
                </tr>
                <%  }
                %>
            </tbody>
        </table>

    </body>
</html>
