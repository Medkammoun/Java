<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- Change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- Change to match your file/naming structure -->
</head>
<body>
   <div class="container">
   <h1 class="mt-4">Update Book 📖</h1>
   <hr />
   <!-- Form to create a Book -->
   <form:form action="/books/${book.id}/edit" method="post" modelAttribute="book">
       <form:errors class="text-danger" path="*"/>
       <input type="hidden" name="_method" value="put">
       
       <div class="mb-3">
           <label for="title" class="form-label">Title</label>
           <form:input path="title" cssClass="form-control" />
       </div>
       
       <div class="mb-3">
           <label for="author" class="form-label">Author</label>
           <form:textarea path="author" id="author" class="form-control"></form:textarea>
       </div>
       
       <div class="mb-3">
           <label for="thoughts" class="form-label">My thoughts</label>
           <form:textarea path="thoughts" id="thoughts" class="form-control"></form:textarea>
       </div>

       <button type="submit" class="btn btn-primary">Submit</button>
   </form:form>
   </div>
</body>
</html>
