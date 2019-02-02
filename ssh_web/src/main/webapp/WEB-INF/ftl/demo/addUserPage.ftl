<#assign base="${request.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>主页面</title>
    <script type="text/javascript" src="${base}/medias/js/jquery-1.8.3.js"></script>

    <script>
        function commit() {
            $("#myForm").submit();
        }

    </script>
</head>


<body>

    <form method="post" action="${base}/user/addUser" id="myForm" enctype="multipart/form-data">

        姓名：<input type="text" name="userName"/><BR>
        密码：<input type="text" name="passWord"/><BR>
        机构：<select name="defaultOrganId">
                <#if organList?? && (organList?size>0)>
                    <#list organList as organ>
                        <option value="${organ.id}">${organ.organName}</option>
                    </#list>
                </#if>
             </select><BR>
        文件：<input type="file" name="photo" /><BR>
        <input type="button" value="提交" onclick="commit()"/>

    </form>



</body>

</html>