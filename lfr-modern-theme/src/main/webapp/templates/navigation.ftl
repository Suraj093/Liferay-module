<#if has_navigation && is_setup_complete>
<div class="navbar navbar-classic navbar-expand-md navbar-light pb-3">
	<button aria-controls="navigationCollapse" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler navbar-toggler-right" data-target="#navigationCollapse" data-toggle="liferay-collapse" type="button">
		<span class="navbar-toggler-icon"></span>
	</button>
   <div class="collapse navbar-collapse" id="navigationCollapse">
		<@liferay.navigation_menu />
	</div>
</div>
</#if>