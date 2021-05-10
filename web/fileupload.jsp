<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2021-05-10
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>
    <form action="/upload" method="post" enctype="multipart/form-data">
        file:<input type="file" name="file"/><input type="submit" value="上传">
    </form>
</body>
</html>
