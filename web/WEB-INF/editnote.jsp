<%-- 
    Document   : editnote
    Created on : Oct 5, 2020, 6:31:32 PM
    Author     : dorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note keeper</title>
    </head>
    <body>
        <form method="post" action="note">
        <h1>Simple Note keeper</h1>
        <h2>Edit Note</h2>
        <label> Title
      <input type="text" name="title" value="${note.getTitle()}" >
        </label>
      <br>
      Contents: <textarea rows="4" cols="50" name="content" value="">${note.getContent()}</textarea>    
      <br>
      <input type="submit" name = "save">
        </form>
    </body>
</html>
