<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/left_menu.jspf" %>

<%-- 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="beans.Author"%>
<%@page import="beans.AuthorList"%>
<%@page import="testconnection.TestConnection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн Библиотека</title>
        <link href="../css/lib_style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <%--<% request.setCharacterEncoding("UTF-8"); %>
        <%="привет"%>
        <h3>
            <%=request.getParameter("username")%>
                    
        </h3>
            <% 
                testconnection.TestConnection tc = new TestConnection();
                tc.check();
%> --%>
        <%--        <div class="container">
            <div class="header">
                <div class="logo">
                    <img src="../images/logo.png" alt="Логотип" name="logo" width="100" height="100"/>
                </div>
                <div class="title">
                    Онлайн библиотека
                </div>                
                <form class="search_form" name="search_form" method="post">
                    <!--<img alt="поиск" src="../images/search.jpg">--> 
                    <input type="text" name="search_String" value="" size="100"/>
                    <input class="search_button" type="submit" value="Поиск" name="search_button" />
                    <select name="search_option">
                        <option>Название</option>
                        <option>Автор</option>
                    </select>
                </form>                
            </div>
            
            <div class="slidebar1">
                <h4>Список авторов:</h4>
                <ul class="nav">
                    <jsp:useBean id="authorList" class="beans.AuthorList" scope="application"/>
                    <c:forEach var="author" items="${authorList.getAuthors()}">
                        <li><a href="#">${author.name}</a></li>
                    </c:forEach>
                    <%--<% AuthorList authorList = new AuthorList();
                    for (Author author : authorList.getAuthors()) {
                    %>
                    <li><a href="#"><%=author.getName()%></a></li>
<%}%>--%>
                    <%--                </ul>
                <p>&nbsp;</p>                
            </div>
                        
            <div class="content">
                <h1>&nbsp;</h1>
                <p>&nbsp;</p>
            </div>
        </div>
    </body>
</html>
--%>
