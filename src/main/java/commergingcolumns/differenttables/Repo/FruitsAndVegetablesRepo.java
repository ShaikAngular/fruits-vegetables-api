package commergingcolumns.differenttables.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import commergingcolumns.differenttables.entity.FruitsAndVegetablesEntity;

public interface FruitsAndVegetablesRepo extends JpaRepository<FruitsAndVegetablesEntity, Integer>{
//	@Query(nativeQuery=true, value="select * from fruits union select * from vegetables")
//	public FruitsAndVegetablesEntity getFruitsAndVegetablesList();
	
   
}
