<%@ include file="/init.jsp"%>

<h1>Clay Web Module Components</h1>

<clay:alert displayType="danger" message="This is an error message."
	title="Error" />

<clay:alert displayType="success" message="This is success message"
	title="Success" />

<clay:alert displayType="info" message="This is info message"
	title="Info" />

<clay:alert displayType="warning" title="Bad Warning"
	message="This is warning message" />

<clay:alert displayType="success" message="This is success message"
	title="Form Save Successfully" />

<h1>Second Part</h1>

<clay:stripe displayType="danger"
	message="This is danger stripe message" title="Error" />

<clay:stripe displayType="success"
	message="This is stripe success message" title="Success" />
	
	<clay:stripe displayType="info"
	message="This is stripe info message" title="Info"/>
	
	<clay:stripe displayType="warning"
	message="This is warning message" title="Warning" />
	
	<h1>Clay Badge</h1>
	<br />
	
	<clay:badge 
	label="100"
	displayType="success"
	/><span>Success</span>
	
	<clay:badge 
	label="100"
	displayType="danger"
	/><span>Danger</span>
	<clay:badge 
	label="100"
	displayType="info"
	/><span>Info</span>
	<clay:badge 
	label="100"
	displayType="warning"
	/><span>Warning</span>
	
	<h1>Button</h1>
	
	<clay:button label="Primary"
	/>
	
	<clay:button label="Secondary" 
	 displayType="secondary"
	/>
	<clay:button 
	 displayType="secondary"
	 icon="wiki"
	 ariaLabel="Wiki"
	 href="https://www.w3schools.com/"
	/>