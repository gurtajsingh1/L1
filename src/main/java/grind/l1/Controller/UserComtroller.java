package grind.l1.Controller;

import grind.l1.Model.User;
import grind.l1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserComtroller {

    /// added field injection
    /// used the service class now the methods will change

    @Autowired
    private UserService userService;

    ///constructor injection
//    public UserComtroller(UserService userService) {
//        this.userService  = userService;
//    }

    //// after the service update
    ///

    @PostMapping
    public User CreateStudent(@RequestBody User user){
        return userService.CreateStudent(user);
    }


    @GetMapping
    public List<User> GetAllStudent(){
        return userService.GetAllStudent();
    }

    @GetMapping("/{id}")
    public User GetStudentById(@PathVariable int id){
        return userService.GetStudentById(id);
    }

@PutMapping("/{id}")
public User UpdateStudent(@PathVariable int id, @RequestBody User user){
        return userService.UpdateStudent(id , user);
}

@DeleteMapping("/{id}")
    public User DeleteStudent(@PathVariable int id){}

}
