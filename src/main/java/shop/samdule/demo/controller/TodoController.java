package shop.samdule.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import shop.samdule.demo.entity.TodoEntity;
import shop.samdule.demo.service.TodoService;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todos")
    public List<TodoEntity> list() {
        System.out.println("[Controller]");
        java.util.List<TodoEntity> r = todoService.getTodos();
        return r;
    }

    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity r = todoService.findById(id);
        return r;
    }
}
