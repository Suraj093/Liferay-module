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

### Create custom widget template and get structure value in widget template

```
<#if entries?has_content>
	<div class="row">
	<#list entries as curEntry>
		<#assign assetRenderer = curEntry.getAssetRenderer() />
		<#assign className = assetRenderer.getClassName() />
		<#if className == "com.liferay.journal.model.JournalArticle">
			<#assign docXml=saxReaderUtil.read(assetRenderer.getArticle().getContent()) />
			<#assign short_description=docXml.valueOf("//dynamic-element[@field-reference='shortDescription']/dynamic-content/text()") />
			<#assign imagePath = docXml.valueOf("//dynamic-element[@field-reference='newsImage']/dynamic-content/text()") />
			<#assign imagePathObj = jsonFactoryUtil.createJSONObject(imagePath) />
			 <#assign viewDetailURL = "fullview?assetEntry="+entry.getEntryId()  />
	        <div class="col-md-4">	
	          <div class="card">
							${imagePathObj.url}
               <img src="${imagePathObj.url}" class="card-img-top" alt="${imagePathObj.alt}">
                 <div class="card-body">
									 <#if title?has_content>
										 <h2>${title}</h2>
										</#if>
                    <#if short_description?has_content>
                      <p class="card-text">${short_description}</p>
										</#if>
									 <#assign fullContentUrl = "web/guest/article-details-view?assetEntry="+entry.getEntryId() />
                       <a href="${fullContentUrl}" class="btn btn-primary">Read More</a>
                 </div>
            </div>
			    </div>	
		 </#if>
	</#list>
		</div>
</#if>

----------------------------------------------------------------------------------------

Full Details content code :- 

<#assign assetEntryQuery = request.getParameter("assetEntry")?eval />

<#assign assetEntryLocalServiceUtil = staticUtil['com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil'] />

<#assign entry=assetEntryLocalServiceUtil.fetchAssetEntry(assetEntryQuery) />
<#assign entryTitle = htmlUtil.escape(entry.getTitle(locale)) />
<#assign docXml=saxReaderUtil.read(entry.getAssetRenderer().getArticle().getContent()) />
<#assign Title=docXml.valueOf("//dynamic-element[@field-reference='title']/dynamic-content/text()") />
<#assign Description=docXml.valueOf("//dynamic-element[@field-reference='description']/dynamic-content/text()") />
```
### Include a service in custom theme

```
<#if serviceLocator??>
	<#assign assetCategoryService = serviceLocator.findService("com.liferay.asset.kernel.service.AssetCategoryService")
	childCategories = assetCategoryService.getChildCategories(category.getCategoryId()) />
	<@displayCategories categories=childCategories />
</#if>
```

### Simple fragment and its configuration example

```
[#if configuration.type == "action"]
	<button class="btn btn-${configuration.buttonSize} btn-${configuration.buttonType}" data-lfr-editable-id="action" data-lfr-editable-type="action">
		Go Somewhere
	</button>

	[#else]
		<div class="component-button text-break">
			<a class="btn btn-${configuration.buttonSize} btn-${configuration.buttonType}" data-lfr-editable-id="link" data-lfr-editable-type="link" href="" id="fragment-${fragmentEntryLinkNamespace}-link">
				Go Somewhere
			</a>
		</div>
[/#if]
------------------------------------------------------------------------

{
	"fieldSets": [
		{
			"fields": [
				{
					"dataType": "string",
					"defaultValue": "link",
					"label": "type",
					"name": "type",
					"type": "select",
					"typeOptions": {
						"validValues": [
							{
								"value": "link"
							},
							{
								"value": "action"
							}
						]
					}
				},
				{
					"dataType": "string",
					"defaultValue": "primary",
					"label": "style",
					"name": "buttonType",
					"type": "select",
					"typeOptions": {
						"validValues": [
							{
								"value": "primary"
							},
							{
								"value": "secondary"
							},
							{
								"value": "link"
							},
							{
								"value": "outline-primary"
							},
							{
								"value": "outline-secondary"
							}
						]
					}
				},
				{
					"dataType": "string",
					"defaultValue": "nm",
					"label": "size",
					"name": "buttonSize",
					"type": "select",
					"typeOptions": {
						"validValues": [
							{
								"label": "small",
								"value": "sm"
							},
							{
								"label": "normal",
								"value": "nm"
							},
							{
								"label": "large",
								"value": "lg"
							}
						]
					}
				}
			],
			"label": "button-options"
		}
	]
}
```
