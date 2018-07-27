package hello;




import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;



@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
 static	Result result= new Result();
/*
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
      
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }*/
    /*
    
    @RequestMapping(value="/returnjson",method=RequestMethod.POST)
    public String greeting2(@RequestBody JSONObject json) throws Exception, JsonSyntaxException {

    	String name = (String) json.get("nombre");
    	String lastname = (String) json.get("apellidos");
    	UserDTO user = new UserDTO(name, lastname);
    	
    	Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(user);
    }*/
    
    public static Result getResult() {
	return result;
}

	@RequestMapping(value="/returnjson",method=RequestMethod.POST)
    public String login(@RequestBody JSONObject json) throws Exception, JsonSyntaxException {        
          	
    
    	int id = (int) json.get("userId");
    	int option =(int) json.get("optionSelected");
    	
    	
    	System.out.println(String.valueOf(option));
    	Vote vote= new Vote(id,option);
    	
    	
   
    	result.addVoteToResult((int) json.get("optionSelected"));
   

    	;
        Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(result);
        
    }
}
