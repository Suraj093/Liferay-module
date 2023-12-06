# Liferay-module

### Create custom layout and append with the custom theme.

#### Follow the step which mention below.

theme folder -> layouttpl -> custom -> custom layout folder -> place your .ftl file and image file.

The below code is going to update in WEB-INF under theme.

```
          <layout-templates>
	           <custom>
			<layout-template id="home-layout" name="home-layout">
				<template-path>/layouttpl/custom/layout_template/home-layout.ftl</template-path>
				<thumbnail-path>/layouttpl/custom/layout_template/home-layout.png</thumbnail-path>
			</layout-template>
	          </custom>
           </layout-templates>
```

### To include external CSS and JS file in liferay theme, we use this

```
        <@liferay.css file_name="${css_folder}/all.css"/>
	
	<@liferay.js file_name="${javascript_folder}/mymain.js" />
	
	<#include "${full_templates_path}/top-navbar.ftl" />
```
