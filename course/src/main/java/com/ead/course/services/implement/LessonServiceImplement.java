package com.ead.course.services.implement;

import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImplement implements LessonService {

    @Autowired
    LessonRepository lessonRepository;
}
