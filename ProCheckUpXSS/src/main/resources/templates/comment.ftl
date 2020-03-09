<#include "/common/header.ftl">

<body>

<#include "/common/nav.ftl">

<div class="container">
	<h1>Comments</h1>
	

		<#list comment as comment>
    		<b>User:</b> ${comment.name}<br>
			<b>Comment:</b> ${comment.message}<br>
		<#else>
			No Comments Available.
		</#list>

	
	<hr>
	
	<form method="post">
		
		Name:
		<input type="text" name="name"><br>
		Comment:
		<input type="text" name="message"><br>
		<input type="submit">
	</form>
	</div>
</body>
</html>