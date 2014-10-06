<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <f:form method="post" modelAttribute="message">
        <f:label path="sender" title="Sender" />
        <f:input path="sender" />
        <br />
        <f:input path="text" />
        <input type="submit" value="Send">
    </f:form>
    </body>
</html>
