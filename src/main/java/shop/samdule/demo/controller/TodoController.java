package shop.samdule.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // C - INSERT
    @PostMapping("/todos")
    public void insert(@RequestBody TodoEntity todoEntity) {
        System.out.println("[Controller]" + todoEntity.toString());
        todoService.insert(todoEntity);
        System.out.println("INSERT SUCCESSED");

    }

    // U - UPDATE
    @PutMapping("/todos/{id}")
    public void updateById(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        todoEntity.setId(id);
        todoService.updateById(todoEntity);
        System.out.println("UPDATE SUCCESSED");

    }

    // D - DELETE
    @DeleteMapping("/todos/{id}")
    public void deleteById(@PathVariable Integer id) {
        todoService.deleteById(id);
        System.out.println(id + "DELETE SUCCESSED");

    }
}
