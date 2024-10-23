package shop.samdule.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.samdule.demo.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
