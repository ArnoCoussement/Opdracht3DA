package main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private RatingDB ratings;
	
	public Controller(){
		this.ratings = new RatingDB();
	}
	
	
	@RequestMapping(value = "/{zipcode}",  method = RequestMethod.GET)
	@ResponseBody
    public Rating getRating(@PathVariable("zipcode") int zipcode){
    	return this.ratings.getRating(zipcode);
    }

}
