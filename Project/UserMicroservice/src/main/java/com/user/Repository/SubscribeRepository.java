package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.ReaderEntity.Subscribe;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {

}
