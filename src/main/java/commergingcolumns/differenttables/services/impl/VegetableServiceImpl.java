package commergingcolumns.differenttables.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.Repo.VegetablesRepo;
import commergingcolumns.differenttables.entity.VegetablesEntity;
import commergingcolumns.differenttables.services.VegetablesService;

@Service
public class VegetableServiceImpl implements VegetablesService {
	
	@Autowired
	private VegetablesRepo vegRepo;
	
	@Override
	public List<VegetablesEntity> getVegetablesList() {
		    
		    return vegRepo.findAll();
	   }

}
