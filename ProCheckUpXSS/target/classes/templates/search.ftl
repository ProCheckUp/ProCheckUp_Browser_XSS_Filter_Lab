<#include "/common/header.ftl">

<body>

<#include "/common/nav.ftl">

  <div class="container">

	<#if search??>
		Searched for: ${search}
	</#if>
	<hr>
	
	<form method="GET">
		Search:
		<input type="text" name="search">
		<input type="submit">
	</form>

  </div>
	
	
</div>
</body>
</html>