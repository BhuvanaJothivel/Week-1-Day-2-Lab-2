$(function() {
  // contact form animations
  $('#contact').click(function() {
    $('#contactForm').fadeToggle();
  })
  $(document).mouseup(function (e) {
    var container = $("#contactForm");

    if (!container.is(e.target) // if the target of the click isn't the container...
        && container.has(e.target).length === 0) // ... nor a descendant of the container
    {
        container.fadeOut();
    }
  });
  
});

$(function() {
	  // contact form animations
	  $('#contact1').click(function() {
	    $('#contactForm1').fadeToggle();
	  })
	  $(document).mouseup(function (e) {
	    var container = $("#contactForm1");

	    if (!container.is(e.target) // if the target of the click isn't the container...
	        && container.has(e.target).length === 0) // ... nor a descendant of the container
	    {
	        container.fadeOut();
	    }
	  });
	  
	});


$(function() {
	  // contact form animations
	  $('#contact2').click(function() {
	    $('#contactForm2').fadeToggle();
	  })
	  $(document).mouseup(function (e) {
	    var container = $("#contactForm2");

	    if (!container.is(e.target) // if the target of the click isn't the container...
	        && container.has(e.target).length === 0) // ... nor a descendant of the container
	    {
	        container.fadeOut();
	    }
	  });
	  
	});


$(function() {
	  // contact form animations
	  $('#contact3').click(function() {
	    $('#contactForm3').fadeToggle();
	  })
	  $(document).mouseup(function (e) {
	    var container = $("#contactForm3");

	    if (!container.is(e.target) // if the target of the click isn't the container...
	        && container.has(e.target).length === 0) // ... nor a descendant of the container
	    {
	        container.fadeOut();
	    }
	  });
	  
	});


