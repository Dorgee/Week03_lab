<%-- 
    Document   : viewnote
    Created on : Oct 5, 2020, 6:31:45 PM
    Author     : dorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p><b>Title:</b> ${note.getTitle()}</p>
        <h2>Contents:</h2>
        <p>${note.getContent()}</p>
        <a href="note?edit">Edit</a>
     
    </body>
</html>
