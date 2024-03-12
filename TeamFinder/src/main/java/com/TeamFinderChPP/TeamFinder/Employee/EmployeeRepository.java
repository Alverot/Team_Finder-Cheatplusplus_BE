package com.TeamFinderChPP.TeamFinder.Employee;

import com.TeamFinderChPP.TeamFinder.Employee.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {
}
