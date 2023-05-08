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
        Tutorial tutorial = new Tutorial("Data Science","Learn Data Science With Python",true);

        tutorialRepository.save(tutorial);
    }

    @Test
    void deleteTutorial(){
        tutorialRepository.deleteById(4l);
    }

    @Test
    void getAllTutorials(){
        List<Tutorial> tutorials = new ArrayList<Tutorial>();
        tutorials = tutorialRepository.findAll();

        assertNotNull(tutorials);
    }


}