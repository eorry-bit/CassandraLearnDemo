package com.example.cassandra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Table("todolist")
public class Todo {

    @PrimaryKey
    @Id
    private String id;
    private List<String> tasks;

}
