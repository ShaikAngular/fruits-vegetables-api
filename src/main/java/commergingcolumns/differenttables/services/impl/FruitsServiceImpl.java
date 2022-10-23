package commergingcolumns.differenttables.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.Repo.FruitsRepo;
import commergingcolumns.differenttables.entity.FruitsEntity;
import commergingcolumns.differenttables.services.FruitsService;

@Service
public class FruitsServiceImpl implements FruitsService {
	
	@Autowired
	private FruitsRepo vegRepo;
	
	@Override
	public List<FruitsEntity> getFruitsList() {
		    
		    return vegRepo.findAll();
	   }

}
