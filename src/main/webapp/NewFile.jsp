<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
</head>
<body>
<p class="advertisement">短信验证测试2.0</p>    
   <div id="panelname" style="margin-left: 500px;width: 800px;">    
       <div id="registername"><p class="userregister">用户注册</p></div>    
     <span style="color:#3333ff;">  <form action="register_add.action" onsubmit="return clickregister()">  </span>  
       <div style="margin-bottom:20px">    
           <div>手机号码:</div>    
          <span style="color:#3333ff;"> <input class="easyui-textbox" id="telephonename" name="loginName" data-options="prompt:'请输入手机号',validType:'mobile'" style="width: 300px; height: 30px;">    
           <input class="code" type="button" id="btnSendCode" onclick="sendMessage()" value="点击获取手机验证码" />  </span>  
           <span id="telephonenameTip"></span>    
       </div>  
</body>
</html>