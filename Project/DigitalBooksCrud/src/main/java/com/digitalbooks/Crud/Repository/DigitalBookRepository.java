package com.digitalbooks.Crud.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.Crud.Entity.DigitalBook;

@Repository
public interface DigitalBookRepository extends JpaRepository<DigitalBook, Integer> {

	// List<Integer> findByUserId(Integer id);

}
