
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
      <a class="navbar-brand" href="/">
        <img src="images/pcu_2.jpg" alt="">
	  </a>
	  <div class="btn-group justify-content-end">
	  <div class="dropdown" id="spacing">
		<button class="btn btn-secondary btn-sm dropdown-toggle" type="button" id="lab" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		  Labs
		</button>
		<div class="dropdown-menu" aria-labelledby="lab">
			<h6 class="dropdown-header">Server-Side</h6>
			<div class="dropdown-divider"></div>
			<a class="dropdown-item" href="xss_one">Reflected</a>
			<a class="dropdown-item" href="xss_two">Stored</a>
			<div class="dropdown-divider"></div>
			<h6 class="dropdown-header">Client-Side</h6>
			<div class="dropdown-divider"></div>
  			<a class="dropdown-item" href="xss_three">Reflected</a>
  			<a class="dropdown-item" href="xss_four">Stored</a>
  			<div class="dropdown-divider"></div>
  			<h6 class="dropdown-header">Extra</h6>
			<div class="dropdown-divider"></div>
  			<a class="dropdown-item" href="multiple_param">Reflected (multi)</a>
  			
		</div>
	  </div>
	  <div class="dropdown">
		<button class="btn btn-info btn-sm dropdown-toggle" type="button" id="test" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			XSS Config
		  </button>
		  <div class="dropdown-menu" aria-labelledby="test">
		  	<#if level==0>
			<a class="dropdown-item active" href="level/0">Disabled</a>
			<#else>
			<a class="dropdown-item" href="level/0">Disabled</a>
			</#if>
			
			<#if level==1>
			<a class="dropdown-item active" href="level/1">Filter</a>
			<#else>
			<a class="dropdown-item" href="level/1">Filter</a>
			</#if>
			
			<#if level==2>
			<a class="dropdown-item active" href="level/2">Block</a>
			<#else>
			<a class="dropdown-item" href="level/2">Block</a>
			</#if>
		  </div>
	  </div>
	</div>
	</div>
	<hr>
  </nav>


  