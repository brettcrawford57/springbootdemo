package com.codeup.catdemo.repos;

import com.codeup.catdemo.models.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface catDao extends JpaRepository<Cat, Long>{

    List<Cat> findAllByCatType(String catType);

}
