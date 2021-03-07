

function alphaMatch(alpha)
{ 
    var letters = /^[A-Za-z]+$/;
    
   if(document.getElementById(alpha).value.match(letters))                         /* Alphabet Match */        
    {
       return ;
    }

    else
    {
     	if (document.getElementById(alpha).value === "")
		  {
			     return;
      }
    	else 
      {
        	alert('Use alphabet characters only');
          document.getElementById(alpha).value = "";
          document.getElementById(alpha).focus();
      }
    }
}




function Year(year)
{ 
    var letters = /^(19|20)\d{2}$/;
    

    if(document.getElementById(year).value.match(letters))                          /* Year Range - 1900 to 2099*/                      
    {
       return ;
    }

    else
    {
      if (document.getElementById(year).value === "")
    {
      return;
      
    }
    else
        {
          alert('Invalid Year');
          document.getElementById(year).value = "";
          document.getElementById(year).focus();
        }
    }
}



function Paragraph(para)
{ 
    var letters = /^([\s\.]?[a-zA-Z]+)+$/;
    

    if(document.getElementById(para).value.match(letters))                       /*  Paragraph */                
    {
       return ;
    }

    else
    {
      if (document.getElementById(para).value === "")
      {
      return;
      }
      else
      {
          alert('Wrong Format');
          document.getElementById(para).value = "";
          document.getElementById(para).focus();
      }
    }
}



function Address(address)
{ 
     var letters = /^[#.0-9a-zA-Z\s,-]+$/;
  if(document.getElementById(address).value.match(letters))                          /* Address */
   {
       return ;
   }
   else
   {
      if (document.getElementById(address).value === "")
      {
        return;
      }
      else
      {
        alert('Wrong address format');
        document.getElementById(address).value = "";
        document.getElementById(address).focus();
      }
   }
}



function Phone(num)
{
  var phoneno = /^\d{10}$/;

  if(document.getElementById(num).value.match(phoneno))                                 /* Phone Number */
  {
      return true;
  }

  else
  {
    if(document.getElementById(num).value === "")
    {
        return;
    }
    else  
    {
      alert("Not a valid Phone Number");
      document.getElementById(num).value = "";
      document.getElementById(num).focus();
    }
  }
}



function PinCode(pincode)
{
  var pin = /^[1-9][0-9]{5}$/;;

  if(document.getElementById(pincode).value.match(pin))                                /* Pin code */
  {
      return;
  }

  else
  {
    if (document.getElementById(pincode).value === "")
    {
      return;    
    }
    else
    {
       alert("Not a valid Pin");
       document.getElementById(pincode).value = "";
       document.getElementById(pincode).focus();
    }
  }
}



function DotSpace(dotspace)
{
  var pin = /^([\s\.]?[a-zA-Z]+)+$/;

  if(document.getElementById(dotspace).value.match(pin))                               /* Dots and Spaces */ 
  {
      return;
  }

  else
  {
    if (document.getElementById(dotspace).value === "")
    {
      return;    
    }
    else
    {
       alert("Incorrect format");
       document.getElementById(dotspace).value = "";
       document.getElementById(dotspace).focus();
    }
  }
}



function Marks(marks)
{
 
  if (document.getElementById(marks).value === "")
  {
      return;    
  }

  else if(isNaN(document.getElementById(marks).value))                                          /* Marks */
  {
    alert("Not a Number");
    document.getElementById(marks).value = "";
    document.getElementById(marks).focus();
  }

  else if((document.getElementById(marks).value > 100) ||  (document.getElementById(marks).value <= 0))                               
  {
      alert("Not within the range 1-100");
      document.getElementById(marks).value = "";
      document.getElementById(marks).focus();
  }
}



function dateFunction(dat)                                                                   /* Date Onload Function */
{
  document.getElementById(dat).valueAsDate = new Date();
}