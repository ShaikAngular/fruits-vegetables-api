package commergingcolumns.differenttables.services;

import java.util.List;

import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.entity.VegetablesEntity;

@Service
public interface VegetablesService {
	public List<VegetablesEntity> getVegetablesList();

}
