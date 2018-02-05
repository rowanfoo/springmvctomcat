<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<body>

<h1>hello world my first JSP</h1>
<form:errors path="data1.*"/>
<h2>WElcome</h2>
<h3>hello  ::   ${name}</h3>



<h3>data name   ::   ${data1.name}</h3>

<h3>data age  ::   ${data1.age}</h3>
<h3>data phone  ::   ${data1.phone}</h3>


</body>
</html>

