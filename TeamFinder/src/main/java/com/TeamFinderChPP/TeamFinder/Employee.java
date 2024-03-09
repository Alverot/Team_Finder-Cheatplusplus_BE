package com.TeamFinderChPP.TeamFinder;

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
    private String Text;

    public Employee(String text) {
        Text = text;

    }
}
