function validateForm() 
{
	
    var x = document.forms["myForm"]["firstname"];
	var y = document.forms["myForm"]["lastname"];
	var z = document.forms["myForm"]["pwd"];
	var a = document.forms["myForm"]["cpwd"];
	var b = document.forms["myForm"]["sexm"];
	var c = document.forms["myForm"]["sexf"];
	var d = document.forms["myForm"]["E-mailid"];
	var e = document.forms["myForm"]["vehicle1"];
	var f = document.forms["myForm"]["vehicle2"];
	var g = document.forms["myForm"]["vehicle3"];
	
	
	var flag = 0;
	
	if ( (x.value==null || x.value=="") && (y.value==null || y.value=="") && (z.value==null || z.value=="") && (a.value==null || a.value=="") 
		&& (b.value==null || b.value=="") && (c.value==null || c.value=="") && (d.value==null || d.value=="") && (e.value==null || e.value=="") 
		&& (f.value==null || f.value=="") && (g.value==null || g.value=="") ) 
		{
			alert("All enteries must be filled to be a sinner...");
			flag = 1;
		}
	
	if(x.value==null || x.value=="")
		{	
			x.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(y.value==null || y.value=="")
		{
			y.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(z.value==null || z.value=="")
		{
			z.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(a.value==null || a.value=="")
		{
			a.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(b.value==null || b.value=="")
		{
			b.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(c.value==null || c.value=="")
		{
			c.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(d.value==null || d.value=="")
		{
			d.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(e.value==null || e.value=="")
		{
			e.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
	
	if(f.value==null || f.value=="")
		{
			f.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}	
	
	if(g.value==null || g.value=="")
		{
			g.parentNode.parentNode.lastElementChild.innerHTML = "dsfsdfdfsb";
			flag = 1;
		}
		
	
	if (flag = 1)
		{
			return false;
		}
	else
		{
			return true;
		}

}
			
	
