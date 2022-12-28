package com.example.Spring_boot_app.config;

import com.example.Spring_boot_app.models.plannerItem;
import com.example.Spring_boot_app.repositories.PlannerItemRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class plannerItemDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(plannerItemDataLoader.class);

    @Autowired
    PlannerItemRepository plannerItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (plannerItemRepository.count() == 0) {
            plannerItem plannerItem1 = new plannerItem();
            plannerItem plannerItem2 = new plannerItem();

            plannerItemRepository.save(plannerItem1);
            plannerItemRepository.save(plannerItem2); 
        }

        logger.info("Number of TodoItems: {}", plannerItemRepository.count());
    }
    
}
