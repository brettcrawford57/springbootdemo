package com.codeup.catdemo.repos;

import com.codeup.catdemo.models.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface catDao extends JpaRepository<Cat, Long>{

    Cat findAllByCatType(String catType);
}
