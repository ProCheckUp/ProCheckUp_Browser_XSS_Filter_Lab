<#include "/common/header.ftl">

<body onload="dom_xss()">
<#include "/common/nav.ftl">
	
<div class="container">
	<h2>IE + Edge</h2>
	<p id="user"></p>
	

	<h2>Chrome + Firefox</h2>
	<p id="user2"></p>
	

</div>	
<script>

function dom_xss(){
	var name = location.hash;
	
	// IE+EDGE
	document.getElementById("user").innerHTML = "Hello " + name;
	
	// FF + Chrome
	document.getElementById("user2").innerHTML = "Hello " + decodeURIComponent(name);
	
	}

</script>


</body>
</html>