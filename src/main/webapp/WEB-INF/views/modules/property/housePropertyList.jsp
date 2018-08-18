<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>房产信息管理管理</title>
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
		<li class="active"><a href="${ctx}/property/houseProperty/">房产信息管理列表</a></li>
		<shiro:hasPermission name="property:houseProperty:edit"><li><a href="${ctx}/property/houseProperty/form">房产信息管理添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="houseProperty" action="${ctx}/property/houseProperty/" method="post" class="breadcrumb form-search">
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
				<th>房产名称</th>
				<th>房产编号</th>
				<th>房产属性</th>
				<th>房产状态</th>
				<th>所在城市</th>
				<th>更新时间</th>
				<shiro:hasPermission name="property:houseProperty:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="houseProperty">
			<tr>
				<td><a href="${ctx}/property/houseProperty/form?id=${houseProperty.id}">
						${houseProperty.fcName}</a>
				</td>
				<td>
						${houseProperty.fcCode}
				</td>
				<td>
						${houseProperty.fcProperty}
				</td>
				<td>
						${houseProperty.fcState}
				</td>
				<td>
						${houseProperty.city}
				</td>
				<td>
					<fmt:formatDate value="${houseProperty.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="property:houseProperty:edit"><td>
    				<a href="${ctx}/property/houseProperty/form?id=${houseProperty.id}">修改</a>
					<a href="${ctx}/property/houseProperty/delete?id=${houseProperty.id}" onclick="return confirmx('确认要删除该房产信息管理吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>