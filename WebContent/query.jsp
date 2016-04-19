<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="java.util.*" %>
<html>
<head>
</head>

<body>
<% List<String> list=new ArrayList<String>();
list.add("LegalBG");
list.add("AdminBG");
list.add("CreateReason");
list.add("ISDescription");
list.add("ISLegalDescription");
list.add("ISEnvironment");
list.add("ProcessType");
list.add("Processor");
list.add("ReceiveDate");
list.add("ProcessDate");
list.add("SendDate");
list.add("DraftDate");
list.add("ExaminedDate");
list.add("SignDate");
list.add("ProcessView");
list.add("Drafter");
list.add("ProcessView");
list.add("Examiner");
list.add("ArchivedID");
request.setAttribute("list",list);
%>
<h2>query</h2>
<s:form action="QueryAction" >
  <s:select name="choose" label="choose what you want to search" list="%{#request.list}"/>
  <s:textfield name="chooseOption" label="chooseOption" value="" />
  <s:submit />
</s:form>

<h2>result</h2>

<s:if test="cimList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>ArchivedID</th>
		<th>LegalBG</th>
		<th>AdminBG</th>
		<th>CreateReason</th>
		<th>ISDescription</th>
		<th>ISLegalDescription</th>
		<th>ISEnvironment</th>
		<th>ProcessType</th>
		<th>Processor</th>
		<th>ReceiveDate</th>
		<th>ProcessDate</th>
		<th>SendDate</th>
		<th>ProcessView</th>
		<th>Drafter</th>
		<th>DraftDate</th>
		<th>Examiner</th>
		<th>ExaminedDate</th>
		<th>SignDate</th>
	</tr>
	<s:iterator value="cimList">
		<tr>
			<td><s:property value="ArchivedID" /></td>
			<td><s:property value="LegalBG" /></td>
			<td><s:property value="AdminBG" /></td>
			<td><s:property value="CreateReason" /></td>
			<td><s:property value="ISDescription" /></td>
			<td><s:property value="ISLegalDescription" /></td>
			<td><s:property value="ISEnvironment" /></td>
			<td><s:property value="ProcessType" /></td>
			<td><s:property value="Processor" /></td>
			<td><s:property value="ReceiveDate" /></td>
			<td><s:property value="ProcessDate" /></td>
			<td><s:property value="SendDate" /></td>
			<td><s:property value="ProcessView" /></td>
			<td><s:property value="Drafter" /></td>
			<td><s:property value="DraftDate" /></td>
			<td><s:property value="Examiner" /></td>
			<td><s:property value="ExaminedDate" /></td>
			<td><s:property value="SignDate" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>

</body>
</html>