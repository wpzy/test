<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>regist</h1>

<s:form action="addAdminAction" >
  <s:textfield name="username" label="username" value="" />
  <s:textarea name="password" label="password" value="" cols="50" rows="5" />
  <s:submit />
</s:form>

<h2>All admin</h2>

<s:if test="AdminList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Admin Id</th>
		<th>username</th>
		<th>password</th>
	</tr>
	<s:iterator value="AdminList">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="username" /></td>
			<td><s:property value="password" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>

</body>
</html>