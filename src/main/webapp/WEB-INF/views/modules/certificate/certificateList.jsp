<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>产证信息管理管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/certificate/certificate/">产证信息管理列表</a></li>
		<shiro:hasPermission name="certificate:certificate:edit"><li><a href="${ctx}/certificate/certificate/form">产证信息管理添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="certificate" action="${ctx}/certificate/certificate/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>产证编号</th>
				<th>产证名称</th>
				<th>产证期限</th>
				<th>发证日期</th>
				<th>办理情况</th>
				<th>房产编号</th>
				<th>房产状态</th>
				<th>更新时间</th>
				<shiro:hasPermission name="certificate:certificate:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="certificate">
			<tr>
				<td><a href="${ctx}/certificate/certificate/form?id=${certificate.id}">
						${certificate.certificateCode}
				</a></td>
				<td>
						${certificate.certificateName}
				</td>
				<td>
					<fmt:formatDate value="${certificate.certificateTerm}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					<fmt:formatDate value="${certificate.certificateDate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
						${certificate.handleSituation}
				</td>
				<td>
						${certificate.fcCode}
				</td>
				<td>
						${certificate.fcState}
				</td>
				<td>
					<fmt:formatDate value="${certificate.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="certificate:certificate:edit"><td>
    				<a href="${ctx}/certificate/certificate/form?id=${certificate.id}">修改</a>
					<a href="${ctx}/certificate/certificate/delete?id=${certificate.id}" onclick="return confirmx('确认要删除该产证信息管理吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>