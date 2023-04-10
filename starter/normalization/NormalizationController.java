package io.springboot.project1.starter.normalization;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalizationController 
{
	@Autowired
	private NormalizationService normalizationService;
	
	@RequestMapping("/getall")
	public List<Normalization> getAllNumbers()
	{
		return normalizationService.getAllNumbers();
	}
	
	@RequestMapping("/getone/{number}")
	public Optional<Normalization> getNumberByNumber(@PathVariable String number)//, @PathVariable String state)
	{
		return normalizationService.getNumberByNumber(number);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/add") // /{number}/{state}/{plan}")
	public void addNumber(@RequestBody Normalization Number) // @RequestParam("number") String number) // @RequestParam("state") String state, @RequestParam("plan") String plan)
	{
		normalizationService.addNumber(Number); // number); //, state, plan
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{number}") // /{number}/{state}/{plan}")
	public void updateNumber(@PathVariable String number, @RequestBody Normalization Number) //@RequestParam("state") String state, @RequestParam("plan") String plan)
	{
		normalizationService.updateNumber(number, Number); // state, plan,
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{number}")
	public void deleteNumber(@PathVariable String number)
	{
		normalizationService.deleteNumber(number);
	}
}
