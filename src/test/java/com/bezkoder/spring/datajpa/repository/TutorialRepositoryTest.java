package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Tutorial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TutorialRepositoryTest {

    @Autowired
    TutorialRepository tutorialRepository;
    @Test
    void findByPublished() {
        List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

        assertNotNull(tutorials);
    }

    @Test
    void addTutorial(){
        Tutorial tutorial = new Tutorial("Junit","Learn Unit Testing With Java",true);

        tutorialRepository.save(tutorial);
    }



    @Test
    void getAllTutorials(){
        List<Tutorial> tutorials = new ArrayList<Tutorial>();
        tutorials = tutorialRepository.findAll();

        assertNotNull(tutorials);
    }


}