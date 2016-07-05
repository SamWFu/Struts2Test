<%--
  Created by IntelliJ IDEA.
  User: fusw
  Date: 16/5/29
  Time: 上午11:23
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: fusw
  Date: 16/5/29
  Time: 上午11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>Hello World</title>
</head>
<body>
<h3>Struts2登录</h3><hr/>
<form action="${pageContext.request.contextPath}/login.action" method="post">
  <table border="1" width="500px">
    <tr>
      <td>用户名</td>
      <td><input type="text" name="loginname"/></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="pwd"/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="登录"/></td>
    </tr>
  </table>
</form>
</body>
</html>