package victor.users;

import com.techprimers.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users =  new HashMap<>();

    @PostConstruct
    public void initialize(){
        User peter =  new User();
        peter.setName("Peter");
        peter.setEmpId(1111);
        peter.setSalary(12000);

        User sam =  new User();
        sam.setName("Sam");
        sam.setEmpId(1212);
        sam.setSalary(12000);


        User ryan =  new User();
        ryan.setName("Ryan");
        ryan.setEmpId(1313);
        ryan.setSalary(12000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);

    }

    public User getUsers(String name){

        return users.get(name);
    }
}
