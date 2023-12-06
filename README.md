# Liferay-module

### Create custom layout and append with the custom theme.

#### Follow the step which mention below.

####theme -> layouttpl -> custom -> custom folder -> place your .ftl file and image file.

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

