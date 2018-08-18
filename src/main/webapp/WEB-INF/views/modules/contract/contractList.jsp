<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>合同信息管理管理</title>
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
		<li class="active"><a href="${ctx}/contract/contract/">合同信息管理列表</a></li>
		<shiro:hasPermission name="contract:contract:edit"><li><a href="${ctx}/contract/contract/form">合同信息管理添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="contract" action="${ctx}/contract/contract/" method="post" class="breadcrumb form-search">
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
				<th>房产编号</th>
				<th>单据号</th>
				<th>合同类型</th>
				<th>合同编号</th>
				<th>甲方</th>
				<th>乙方</th>
				<th>合同金额</th>
				<th>更新时间</th>
				<shiro:hasPermission name="contract:contract:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="contract">
			<tr>
				<td><a href="${ctx}/contract/contract/form?id=${contract.id}">
						${contract.fcCode}
				</a></td>
				<td>
						${contract.invoicesCode}
				</td>
				<td>
						${contract.contractType}
				</td>
				<td>
						${contract.contractCode}
				</td>
				<td>
						${contract.firstParty}
				</td>
				<td>
						${contract.secondParty}
				</td>
				<td>
						${contract.contractMoney}
				</td>
				<td>
					<fmt:formatDate value="${contract.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="contract:contract:edit"><td>
    				<a href="${ctx}/contract/contract/form?id=${contract.id}">修改</a>
					<a href="${ctx}/contract/contract/delete?id=${contract.id}" onclick="return confirmx('确认要删除该合同信息管理吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>