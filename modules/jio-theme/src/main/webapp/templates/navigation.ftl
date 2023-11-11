<div class="custom-navigation">
<nav class="${nav_css_class} navbar navbar-expand-lg navbar-light bg-light" id="navigation" role="navigation">
 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
   <div class="collapse navbar-collapse" id="navbarSupportedContent">
	<ul class="navbar-nav mr-auto">
		<#list nav_items as nav_item>
			<#assign
				nav_item_attr_has_popup = ""
				nav_item_css_class = ""
				nav_item_layout = nav_item.getLayout()
			/>

			<#if nav_item.isSelected()>
				<#assign
					nav_item_attr_has_popup = "aria-haspopup='true'"
					nav_item_css_class = "selected"
				/>
			</#if>
			
			<#if !nav_item.hasChildren()>
				<li class="${nav_item_css_class} nav-item" id="layout_${nav_item.getLayoutId()}" role="presentation">
				<a class="nav-link" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()}>
					   ${nav_item.getName()}
				</a>
			<#else>
				<li class="${nav_item_css_class} nav-item dropdown custom-dropdown" id="layout_${nav_item.getLayoutId()}" role="presentation">
				<a class="dropdown-toggle nav-link" role="button" data-toggle="dropdown" aria-expanded="false" ${nav_item_attr_has_popup} href="javascript:void(0)" ${nav_item.getTarget()}>
					   ${nav_item.getName()}
				</a>
			</#if>
			
			<#if nav_item.hasChildren()>
			 <#assign
					nav_dropdown_menu = "w-100 mt-0 p-3 dropdown-menu-custom"
				/>
			</#if>
			
           <#if nav_item.hasChildren()>
			<div class="dropdown-menu ${nav_dropdown_menu}">
				<div class="row mx-0">
					<#list nav_item.getChildren() as nav_child>
					     <#if nav_child.hasChildren()>
						  <div class="col-lg-3">
							<div class="list-group list-group-flush">
			                    <p class="mb-0 list-group-item font-weight-bold p-1">
			                       ${nav_child.getName()}
			                    </p>
			                    <#if nav_child.hasChildren()>
				                    <#list nav_child.getChildren() as sub_nav_child>
				                      <a href="${sub_nav_child.getURL()}" ${sub_nav_child.getTarget()} class="list-group-item list-group-item-action p-1 border-0">${sub_nav_child.getName()}</a>
				                    </#list>
			                    </#if>
			                </div>
	                    </div>
	                    <#else>
	                      <a class="list-inline-item pr-4" href="${nav_child.getURL()}">${nav_child.getName()}</a>
	                    </#if>  
                    </#list>
				</div>
			</div>	
		</#if>
	</li>
</#list>
	</ul>
	</div>
</nav>
</div>