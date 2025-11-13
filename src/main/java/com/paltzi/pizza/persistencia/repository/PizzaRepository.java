package com.paltzi.pizza.persistencia.repository;

import com.paltzi.pizza.persistencia.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository
        extends ListCrudRepository<PizzaEntity,Integer> {
}
