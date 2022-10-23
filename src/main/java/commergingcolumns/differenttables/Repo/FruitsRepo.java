package commergingcolumns.differenttables.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import commergingcolumns.differenttables.entity.FruitsEntity;

public interface FruitsRepo extends JpaRepository<FruitsEntity, Integer> {

}
