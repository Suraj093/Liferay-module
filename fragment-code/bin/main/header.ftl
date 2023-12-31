
Navbar
---------------------------------------------
[#assign 
signURL = themeDisplay.getURLSignIn()
signOut = themeDisplay.getURLSignOut()
isUserLogIn = themeDisplay.isSignedIn() 
/]

<div class="top_header_section">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="header-top">
                            <div class="left">
                                <div class="inf">
                              <p>Mon - Fri 8:00 - 18:00 / Sunday 8:00 - 14:00</p>
                                </div>
                                
                            </div>
                            <div class="right">
                               <div class="inf">
                                    <a href="#">info@drill-solar.com</a>
                                </div>
                            </div>
                        </div>
			</div>
		</div>
	</div>
</div>
<div class="navbar navbar-classic navbar-expand-md navbar-light pb-3 lb-nav">
	<div class="container">
    <a class="navbar-brand" href="#">Energy</a>
	<button aria-controls="navigationCollapse" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler navbar-toggler-right" data-target="#navigationCollapse" data-toggle="liferay-collapse" type="button">
		<span class="navbar-toggler-icon"></span>
	</button>
   <div class="collapse navbar-collapse justify-content-end" id="navigationCollapse">
		<lfr-widget-nav></lfr-widget-nav>
		 
		 [#if isUserLogIn ]
		 <div class="sign-button">
       <a href="${signOut}" class="btn btn-sm btn-primary">Sign Out</a>
   </div>
		 [#else]
		 <div class="sign-button">
       <a href="${signURL}" class="btn btn-sm btn-primary">Sign In</a>
   </div>
		 
		[/#if]
	</div>
	 
	</div>
</div>

CSS
-----------------------------------------
.navbar-brand{
font-size: 2.2rem;
font-weight: bold;
color: green !important;
}
.navbar-light .navbar-nav .nav-link {
    font-size: 1.2rem !important;
}
.lb-nav .portlet{
margin-bottom: 0px;
}
.sign-button{
padding-left: 1rem;
}
.top_header_section{
    display: flex;
    align-items: center;
    justify-content: space-between;
    background: green;
}
.header-top .left {
    display: flex;
    align-items: center;
    gap: 36px;
}
.header-top .left .inf {
    display: flex;
    align-items: center;
    gap: 10px;
}
.header-top .left .inf p {
    color: #fff;
    font-weight: 500;
    font-size: 14px;
	  margin-bottom: 0px;
	  padding-top: 0.5rem;
    padding-bottom: 0.5rem;
    
}
.header-top{
   display: flex;
    justify-content: space-between;
    align-items: center;
}
.header-top .right .inf a{
color:#fff;
	text-decoration: none;
}
.header-top .right .inf a:hover{
color:#fff;
	text-decoration: none;
}
