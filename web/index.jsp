<%--
  Created by IntelliJ IDEA.
  User: WLP
  Date: 2017/8/3
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>信息显示</title>
  </head>
  <body>
  <%
      int pageSize = 5;     //每页行数
      //总行数
      int allRecords =(int) request.getAttribute("records");
      //总页数
      int totalPages = (allRecords%pageSize ==0)?(allRecords/pageSize):(allRecords/pageSize+1);
      int pageIndex = 1;      //当前页
      String paeIndexStr = request.getParameter("pageIndex");
      if (paeIndexStr == null){
          paeIndexStr = "1";
      }
      pageIndex = Integer.parseInt(paeIndexStr);
  %>
  <table style="width: 100%;text-align: center;border: 1px">
    <tr>
      <td>用户ID</td>
      <td>用户名</td>
      <td>性别</td>
      <td>邮箱</td>
      <td>电话</td>
      <td>日期</td>
    </tr>
    <c:if test="${not empty users}">
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.userId}</td>
          <td>${user.userName}</td>
          <td>${user.sex}</td>
          <td>${user.email}</td>
          <td>${user.phone}</td>
          <td>${user.date}</td>
        </tr>
      </c:forEach>
    </c:if>
  </table>
  <table>
    <tr>
      <%
        if (pageIndex > 1){
      %>
      <td><a href="index.jsp?pageIndex=1">首页</a>&nbsp;</td>
      <td>第<%=pageIndex%>页</td>
      <td><a href="index.jsp?pageIndex=<%=pageIndex-1%>">上一页</a></td>
      <%
        }
        if (pageIndex < totalPages){
      %>
      <td><a href="index.jsp?pageIndex=<%=pageIndex+1%>">下一页</a></td>
      <td>第<%=pageIndex%>页</td>
      <td><a href="index.jsp?pageIndex=<%=totalPages%>">末页</a></td>
      <%
        }
      %>
    </tr>

  </table>
  </body>
</html>
