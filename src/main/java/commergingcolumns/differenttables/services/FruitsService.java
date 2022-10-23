package commergingcolumns.differenttables.services;

import java.util.List;

import org.springframework.stereotype.Service;

import commergingcolumns.differenttables.entity.FruitsEntity;

@Service
public interface FruitsService {
	public List<FruitsEntity> getFruitsList();

}
