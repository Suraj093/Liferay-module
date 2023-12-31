Banner Section
--------------------------------------


<section class="banner-section">
<div class="banner-content">
	<h1 data-lfr-editable-id="01-banner-title" data-lfr-editable-type="text">
		Our mission is to make
solar energy accessible
	</h1>
	<p data-lfr-editable-id="01-banner-content" data-lfr-editable-type="text">
		we are passionate about transforming the way we power our world. As a leading provider of renewable energy solutions, we are committed to driving the transition to a cleaner, more sustainable future.
	</p>
	<a data-lfr-editable-id="01-button-link" data-lfr-editable-type="link"  href="#" class="btn btn-lg btn-primary">Read More</a>
	</div>
</section>

CSS
------------------------------------------

.banner-section{
	  background-image:url([resources:banner-image.jpg]);
	  background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    height: 500px;
	  display: flex;
    justify-content: center;
    align-items: center;
}
.banner-content{
    background: transparent;
    border-radius: 8px;
	padding: 2rem;
}
.banner-content h1{
font-size: 5rem;
	color: #fff;
	text-transform: capitalize;
}
.banner-content p{
font-size: 1.5rem;
	color: #fff;
}