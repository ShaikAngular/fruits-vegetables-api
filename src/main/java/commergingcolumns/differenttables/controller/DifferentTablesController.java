package commergingcolumns.differenttables.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import commergingcolumns.differenttables.entity.FruitsAndVegetablesEntity;
import commergingcolumns.differenttables.entity.FruitsEntity;
import commergingcolumns.differenttables.entity.VegetablesEntity;
import commergingcolumns.differenttables.services.FruitsAndVegetablesService;
import commergingcolumns.differenttables.services.FruitsService;
import commergingcolumns.differenttables.services.VegetablesService;

@RestController
public class DifferentTablesController {
	
	@Autowired
	private VegetablesService vegService;
	

	@Autowired
	private FruitsService frService;
	
	@Autowired
	private FruitsAndVegetablesService fvService;
	
	@GetMapping("/vegetables")
	public List<VegetablesEntity> getAllVegetables() {
		return vegService.getVegetablesList();
	}
	
	@GetMapping("/fruits")
	public List<FruitsEntity> getAllFruits() {
		return frService.getFruitsList();
	}
	
	@GetMapping("/fruits-vegetables")
	public  List<FruitsAndVegetablesEntity> getAll() {
		final List<FruitsAndVegetablesEntity> res =new ArrayList<>();
//		res.add((FruitsAndVegetablesEntity) vegService.getVegetablesList());
//		res.add((FruitsAndVegetablesEntity) frService.getFruitsList());
		res.add((FruitsAndVegetablesEntity) fvService.getFruitsAndVegetablesList());
		
		// return fvService.getFruitsAndVegetablesList();
		return res;
	}
	
	@GetMapping("/dummy")
	public List getA() {
		List ltr= new ArrayList();
		ltr.add(1);
		ltr.add(5);
		List<FruitsEntity> fr = frService.getFruitsList();
		ltr.add(fr);
		List<VegetablesEntity> fv = vegService.getVegetablesList();
		ltr.add(fv);
		return  ltr;
	}
	
	@GetMapping("/fv")
	public List getFVList() {
		List FVList = Stream.concat(frService.getFruitsList().stream(), vegService.getVegetablesList().stream()).collect(Collectors.toList());
		return FVList;
	}

}
