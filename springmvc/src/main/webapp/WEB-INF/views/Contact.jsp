<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
  <div class="container mt-5"  align="center">
  <h3 class="text-center">Registration form</h3>
  <header>${Header }</header>
  <p>${Desc }</p>
  
    <form action="processform" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    
    <input type="email"
     class="form-control"
      id="exampleInputEmail1" 
      aria-describedby="emailHelp" 
      placeholder="Enter email"
      name="email">
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text"
     class="form-control"
      id="Username" 
      aria-describedby="emailHelp" 
      placeholder="Username"
      name="username">
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Password</label>
    <input type="password" 
    class="form-control"
     id="password" 
     aria-describedby="emailHelp" 
     placeholder="enter your password"
     name="password">
  </div>
  
  <div class="form-group">
    <button type="submit" class="btn btn-primary">sign up</button>
  </div>
  </form>
  </div>

   </body>
</html>