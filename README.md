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

