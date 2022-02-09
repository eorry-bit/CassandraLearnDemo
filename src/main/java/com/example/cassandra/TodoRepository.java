package com.example.cassandra;

import com.example.cassandra.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,String> {

}
