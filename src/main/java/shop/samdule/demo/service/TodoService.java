package shop.samdule.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import shop.samdule.demo.entity.TodoEntity;
import shop.samdule.demo.mapper.TodoMapper;
import java.util.List;

public class TodoService {

    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTodos() {
        System.out.println("[service] fineAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:" + todos.size());
        return todos;
    }

}
