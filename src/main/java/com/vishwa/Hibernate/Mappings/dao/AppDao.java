package com.vishwa.Hibernate.Mappings.dao;

import com.vishwa.Hibernate.Mappings.entity.Instructor;
import com.vishwa.Hibernate.Mappings.entity.InstructorDetail;

import java.util.List;

public interface AppDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);
}
