package com.cinteo.oneweb.mbusa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Gregor Zurowski
 *
 */
@RestController
public class SimpleRestController {

    @GetMapping("/hello/{name}")
    
    public String hello(@PathVariable(value = "name") String name) {
    	System.out.println("Hellloooooooooooooooooo");
        return String.format("Hello %s!", name);
    }

}
