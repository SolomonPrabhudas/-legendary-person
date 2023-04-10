package io.springboot.project1.starter.normalization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NormalizationService 
{
	@Autowired
	private NormalizationRepository normalizationRepository;
	
	//static HashMap<String, String> hashmap = new HashMap<>();
//	String originAddress = "918106701354";
//	String plan = "777";
//	String countryCode = "";
//	String phoneNumber = "";
//	String payment = "prepaid";
	
	public List<Normalization> getAllNumbers()
	{
		List<Normalization> numbers = new ArrayList<>();
		normalizationRepository.findAll()
		.forEach(numbers::add);
		return numbers;
	}
	
	public Optional<Normalization> getNumberByNumber(String number)
	{
		return normalizationRepository.findById(number);
	}
	
	public void addNumber(Normalization Number) // String number, String state, String plan)
	{
		//Setting input data
		
//		Number.setNumber(number);
//		Number.setState(state);
//		Number.setPlan(plan);
		
		//Checking the requirements
		
		if(Number.getNumber().length()==12)
		{
			Number.setState("LOCAL NUMBER");
			//addState(Number.getNumber(), state, result);
		}
		else if(Number.getNumber().length()==10)
		{
			Number.setState("INTERNATIONAL NUMBER");
			//addState(Number.getNumber(), state, result);
		}
		else
		{
			Number.setState("INVALID NUMBER");
			//addState(Number.getNumber(), state, result);
		}
		normalizationRepository.save(Number);
		
		//hashmap.put(Number.getNumber(), Number.getState());
	}
	
	public void updateNumber(String number, Normalization Number) // String state, String plan,
	{
//		Number.setNumber(number);
//		Number.setState(state);
//		Number.setPlan(plan);
		
		normalizationRepository.save(Number);
	}
	
	public void deleteNumber(String number)
	{
		normalizationRepository.deleteById(number);
	}
	
}
