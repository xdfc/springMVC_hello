<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2021-05-11
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#txtName").blur(function(){
                $.post("ajax",{'name':$("#txtName").val()},function(data){
                    alert(data);
                });
            });
        });
    </script>
</head>
<body>
<h3>这是一个ajax测试</h3>
用户名:<input type="text" id="txtName">
</body>
</html>
