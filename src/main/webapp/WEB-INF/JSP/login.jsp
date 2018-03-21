<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
</head>
<body>
<form action="login">
<input type="text" name="ename">
<select name="dept.did">
<option value="" >--请选择--</option>
<c:forEach items="${dept}" var="dept">
<option value="${dept.did}">${dept.dname}</option>
</c:forEach>
</select>
<input type="submit" value="提交"/>
</form>
<table>
<tr>
<td><input type="checkbox" name="" id="allSelect" class="allSelect" value=""></td>
<td>ID</td>
<td>名字</td>
<td>部门</td>
</tr>
<c:forEach items="${empAll}" var="emp">
<tr>
<td><input type="checkbox" value="${emp.eid }" name="eid"></td> 
<td>${emp.eid}</td>
<td>${emp.ename}</td>
<td>${emp.dept.dname}</td>
</tr>
</c:forEach>
</table>
<button onclick="todelete()">批量删除</button>

<script type="text/javascript">
$("#allSelect").unbind("click");//移除click
//点击全选
$('#allSelect').click(function(){
  if(this.checked){
    $(':checkbox').attr('checked',true);
  }else{
    $(':checkbox').attr('checked',false);
  }
});
function todelete() {
	var op=$(":checked");
	var check="";
	var boo=true;
	for (var i = 0, len =op.length;i<len; i++) {
		if (boo) {
			if (op[i].eid=='allSelect') {
				boo=true;
			}else{
				boo=false;
				check+=op[i].value;
			}
		}else {
			 check += ","+op[i].value; 
		}
	};
	location.href="todelete?check="+check;
	
}
</script>

</body>
</html>