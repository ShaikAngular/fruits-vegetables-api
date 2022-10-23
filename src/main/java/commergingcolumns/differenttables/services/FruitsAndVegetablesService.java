package commergingcolumns.differenttables.services;

import java.util.List;

import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.entity.FruitsAndVegetablesEntity;

@Service
public interface FruitsAndVegetablesService {
	
	public List<FruitsAndVegetablesEntity> getFruitsAndVegetablesList();

}
