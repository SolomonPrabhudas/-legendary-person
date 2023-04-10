package io.springboot.project1.starter.normalization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface NormalizationRepository extends JpaRepository<Normalization, String> 
{
//	 @Transactional
//	    @Modifying
//	    @Query("UPDATE Normalization n SET n.state = :state WHERE n.number = :number")
//	    void updateStateValue(@Param("id") String number, @Param("stateValue") String state);
//	//public void updateStateValue(String number, String State);
}
