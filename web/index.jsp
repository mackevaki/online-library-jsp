<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql1"%>--%>
<%--<%! int count;%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн библиотека</title>
    <link href="css/main_style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <%if (request.getParameter("session") !=null && request.getParameter("session").equals("0")) {
            session.invalidate();
            request.getSession(true);
        } %>
        <div class="main">
            <div class="content">
                <p class="title"><img src="images/lib.png" width="320" height="217" alt="lib"/>
                </p>
                <p class="title">Онлайн библиотека</p>
                <p class="text">Добро пожаловать в онлайн библиотеку, где вы сможете найти любую книгу на ваш вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>
                <p class="text">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
                <p class="text">По всем вопросам обращайтесь по адресу <a href="mailto:support@testlibrary.com">support@testlibrary.com</a></p>
                <p>&nbsp;</p>
            </div>
            <div class="login_div">
                <p class="title">Для входа введите свои данные:</p>                
                <form name="username" action="pages/main.jsp" method="POST">
                    Имя: <input type="text" name="username" value="" size="20" />
                    <input type="submit" value="Войти" />
                </form>
            </div>
            <div class="footer">
                Юлия Семенова, 2022
            </div>
        </div>
    </body>
</html>
