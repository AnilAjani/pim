<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tomcat.apache.org/hello-taglib" prefix="h" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap-grid.css"/>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap-reboot.css" />
    <link rel="stylesheet" type="text/css" href="/CSS/style.css" />
</head>
<body>
<div id="wrapper" class="container-fluid">
    <div class="row">
        <div class="col-sm-3">
            <nav id="sidebar">
                <div id="logo">
                    <a href="index.html">
                        <img  id="image" src="/images/smashgeek.jpg" alt="my logo"/>
                    </a>
                </div>
                <div class="intro">
                    <h2 id="sidebar-title"> Inventory Manager</h2>
                </div>
                <ul>
                    <li><a href="datacables.html">Cables</a></li>
                    <li><a href="car charger.html" >Car Charger</a></li>
                    <li><a Href="#">Wall Charger</a></li>
                </ul>
            </nav>
        </div>
        <div class="col-sm-9">
            <div class="row">
                <div class="col-sm-12">
                    <section id="search" class="align-item-start">
                        <input class="search" type=""/><a id="search_btn" href="" class="btn btn-primary">Search</a>
                        <table class="table-login">
                            <tr>
                                <td><a href="Login.html">Login</a></td>

                            </tr>
                        </table>
                        <img src="" />
                    </section>
                </div>
            </div>
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm-12">
                            <table class="table">
                                <thead>
                                <tr>

                                    <th scope="col">Name</th>
                                    <th scope="col">Version</th>
                                    <th scope="col">SKU</th>
                                    <th scope="col">Brand</th>
                                    <th scope="col">Image</th>
                                </tr>
                                </thead>
                                <tbody>
                                 <c:forEach items="${items}" var="item">

                                <tr>
                                    <th scope="row">${item.name}</th>
                                    <td>${item.version}</td>
                                    <td>${item.SKU}</td>
                                    <td>${item.brand}</td>
                                    <td><img id="product_two" src="/images/car charger.jpg"/></td>
                                </tr>
                                 </c:forEach>
                                <form:form action="/add" modelAttribute= "item">
                                    <form:input path="name" placeholder="Name" cssErrorClass="error" />
                                    <form:errors path="name" errorMessage="Enter a product name" />
                                    <form:input path="version" placeholder="Version" cssErrorClass="error" />
                                    <form:errors path="version" errorMessage="Enter the product version" />
                                    <form:input path="SKU" placeholder="SKU" cssErrorClass="error" />
                                    <form:errors path="SKU" errorMessage="Enter a SKU number" />
                                    <form:input path="brand" placeholder="Brand" cssErrorClass="error" />
                                    <form:errors path="brand" errorMessage="Enter a brand name" />
                                    <input type="submit" value="Add Item">
                                 </form:form>
                                </tbody>

                            </table>

                        </div>
                    </div>

                </div>
            </div>
            </section>
        </div>
    </div>
</div>
</div>




</div>
<script src="./bootstrap/js/bootstrap.js"></script>
<script src="./bootstrap/js/bootstrap.bundle.js"></script>
<script src="./bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

