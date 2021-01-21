package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        //testShowTodoList();
        //testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView =  new TodoListView(todoListService);

        todoListService.addTodoList("Belajar java samapi expert");
        todoListService.addTodoList("Belajar python sampai expert");
        todoListService.addTodoList("Belajar swift sampai expert");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView =  new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();
        todoListView.addTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView =  new TodoListView(todoListService);

        todoListService.addTodoList("Belajar java samapi expert");
        todoListService.addTodoList("Belajar python sampai expert");
        todoListService.addTodoList("Belajar swift sampai expert");

        todoListService.showTodoList();
        todoListView.removeTodoList();
        todoListService.showTodoList();
    }
}
