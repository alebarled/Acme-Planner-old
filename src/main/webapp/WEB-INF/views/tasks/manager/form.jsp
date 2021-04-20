<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="manager.task.list.label.title" path="title"/>
	<acme:form-moment code="manager.task.list.label.executionStart" path="executionStart"/>
	<acme:form-moment code="manager.task.list.label.executionEnd" path="executionEnd"/>	
	<acme:form-double code="manager.task.list.label.workload" path="workload"/>
	<acme:form-textarea code="manager.task.list.label.description" path="description"/>
	<acme:form-url code="manager.task.list.label.link" path="link"/>

</acme:form>