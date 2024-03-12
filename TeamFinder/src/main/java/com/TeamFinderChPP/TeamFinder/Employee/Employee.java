package com.TeamFinderChPP.TeamFinder.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private ObjectId id;
    private String email;
    private String password;
    private String name;
    //private Organization organization;

    public Employee(String email, String password, String name)
    {
        this.email=email;
        this.password=password;
        this.name=name;
    }
}
