package com.basictodo.springboot.FirstSpringWebApp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	private TodoService todoService;

	@RequestMapping("List-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		model.addAttribute("todos",todos);

		return"listTodos";
	}

	
}
