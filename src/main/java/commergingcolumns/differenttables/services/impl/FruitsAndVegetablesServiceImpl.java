package commergingcolumns.differenttables.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.Repo.FruitsAndVegetablesRepo;
import commergingcolumns.differenttables.entity.FruitsAndVegetablesEntity;
import commergingcolumns.differenttables.services.FruitsAndVegetablesService;

@Service

public class FruitsAndVegetablesServiceImpl implements FruitsAndVegetablesService{

	@Autowired
	public FruitsAndVegetablesRepo fvRepo;
	
	@Override
	public List<FruitsAndVegetablesEntity> getFruitsAndVegetablesList() {
		// TODO Auto-generated method stub
		return fvRepo.findAll();
	}

}
