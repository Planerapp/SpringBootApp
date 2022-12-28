package com.example.Spring_boot_app.repositories;


import com.example.Spring_boot_app.models.plannerItem;
import org.springframework.data.repository.CrudRepository;

public interface PlannerItemRepository  extends CrudRepository<plannerItem, Long> {  
}

