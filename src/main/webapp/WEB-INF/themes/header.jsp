<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<div id="header">
	<div id="title">
		<h1>
			<a href="${ctx}">QuickStart示例</a><small>--TodoList应用演示</small>

			<div class="btn-group pull-right">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i> <span class="caret"></span>
				</a>

				<ul class="dropdown-menu">

					<li><a href="${ctx}/admin/user">Admin Users</a></li>
					<li class="divider"></li>

					<li><a href="${ctx}/profile">Edit Profile</a></li>
					<li><a href="${ctx}/logout">Logout</a></li>
				</ul>
			</div>

		</h1>
	</div>
</div>