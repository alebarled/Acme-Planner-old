<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.task.list.label.title" path="title"/>
	<acme:form-moment code="anonymous.task.list.label.executionStart" path="executionStart"/>
	<acme:form-moment code="anonymous.task.list.label.executionEnd" path="executionEnd"/>	
	<acme:form-double code="anonymous.task.list.label.workload" path="workload"/>
	<acme:form-textarea code="anonymous.task.list.label.description" path="description"/>
	<acme:form-url code="anonymous.task.list.label.link" path="link"/>
	<acme:form-return code="anonymous.task.form.button.return"/>
	
</acme:form>
