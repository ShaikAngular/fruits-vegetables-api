package commergingcolumns.differenttables.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import commergingcolumns.differenttables.entity.VegetablesEntity;

public interface DifferentTablesRepo extends JpaRepository<VegetablesEntity,Integer>{

}
