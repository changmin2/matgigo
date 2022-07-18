package matgigo.demo.Service;

import matgigo.demo.Domain.Test;
import matgigo.demo.Repository.KeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestService {

    @Autowired
    KeeperRepository keeperRepository;

    @Transactional
    public void Test(String name,int age){
        Test test = new Test();
        test.setName(name);
        test.setAge(age);
        keeperRepository.save(test);
    }
}
