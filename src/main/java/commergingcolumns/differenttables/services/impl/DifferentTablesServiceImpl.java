package commergingcolumns.differenttables.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.Repo.DifferentTablesRepo;
import commergingcolumns.differenttables.entity.VegetablesEntity;
import commergingcolumns.differenttables.services.DifferentTablesService;


@Service
public class DifferentTablesServiceImpl implements DifferentTablesService {
	
	@Autowired
	private DifferentTablesRepo repo;
	
	@Override
   public List<VegetablesEntity> getVegetablesList() {
	    
	    return repo.findAll();
   }
}