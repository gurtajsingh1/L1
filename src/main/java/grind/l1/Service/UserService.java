package grind.l1.Service;

import grind.l1.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

private final List<User> users = new ArrayList<>();


public User CreateStudent( User user){
    users.add(user);
    return user;
}

    public List<User> GetAllStudent(){
        return users;
    }

    public User GetStudentById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
return null;
    }

    public User UpdateStudent(int id ,  User updatedUser){
for(User user : users){
if(user.getId() == id){
    user.setName(updatedUser.getName());
    user.setEmail(updatedUser.getEmail());
    user.setBranch(updatedUser.getBranch());
    user.setSemester(updatedUser.getSemester());

    return user;
}
}
return null;
    }


//    public User DeleteStudent( int id){
//    for(User user : users){
//        if(user.getId() == id){
//            users.remove(user);
//        }
//    }
//    return null;
//    }

public void DeleteStudent(int id) {
    users.removeIf(user -> user.getId() == id);
}
}
