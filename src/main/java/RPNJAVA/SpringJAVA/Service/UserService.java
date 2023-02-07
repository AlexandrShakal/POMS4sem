package RPNJAVA.SpringJAVA.Service;

import RPNJAVA.SpringJAVA.model.User;
import RPNJAVA.SpringJAVA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public User findById(long id){
        return UserRepository.getReferenceById(id);

    }

    public List<User> findAll(){
        return UserRepository.findAll();
    }

    public User saveUser(User user){
        return UserRepository.save(user);
    }

    public void deleteById(Long id){
        UserRepository.deleteById(id);
    }

}
