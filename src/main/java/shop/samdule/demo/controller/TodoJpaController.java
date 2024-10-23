package shop.samdule.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.samdule.demo.entity.TodoEntity;
import shop.samdule.demo.service.TodoService;
import java.util.List;

@RestController
@RequestMapping("/jpatodos")
public class TodoJpaController {

    private final TodoJpaService todojpaService;

    @Autowired
    public TodoJpaController(TodoJpaService todojpaService) {
        this.todojpaService = todojpaService;
    }

    @GetMapping
    public List<TodoEntity> list() {
        return todojpaService.getAllTodos();
    }

    @GetMapping("/id")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity r = todojpaService.getTodoById(id);
        return r;
    }

    // C - INSERT
    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todoEntity) {
        return todojpaService.createTodo(todoEntity);
    }

    // U - UPDATE
    @PutMapping("/{id}")
    public void updateTodo(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        todojpaService.updateTodoById(id, todoEntity);

    }

    // D - DELETE
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Integer id) {
        todojpaService.deleteTodoById(id);
    }
}
