<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>


<s:if test="cimList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>ArchivedID</th>
		<th>Examiner</th>
		<th>Drafter</th>
	</tr>
	<s:iterator value="cimList">
		<tr>
			<td><s:property value="ArchivedID" /></td>
			<td><s:property value="Examiner" /></td>
			<td><s:property value="Drafter" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>

</body>
</html>