package com.caller2;

import com.service.TutorialService;
import com.violated.exception.ViolationException;

public class Caller2 {
private TutorialService service;

	// Bean properties
    public TutorialService getService() {
        return service;
    }

    public void setService(TutorialService service) {
        this.service = service;
    }
    public void init() {
    	
    try{
        System.out.println("OSGi client started.");
        if (service != null) {
          //  System.out.println("Calling sayHello()");
        //    service.sayHello("Nice");  // Invoke the OSGi service!
          // System.out.println("getting total");
            service.sum(10);
            service.age();
         // service.sayHello("Nice");
          service.sum(2);
       service.age();
     //  service.sum(2);
        }
    }
    catch(ViolationException e)
    {
    	System.err.println(e.getMessage());
    }
    }
}

